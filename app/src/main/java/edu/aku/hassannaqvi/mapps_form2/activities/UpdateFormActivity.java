package edu.aku.hassannaqvi.mapps_form2.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form2.AppMain;
import edu.aku.hassannaqvi.mapps_form2.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form2.R;
import edu.aku.hassannaqvi.mapps_form2.contracts.DoneContract;
import edu.aku.hassannaqvi.mapps_form2.contracts.EligiblesContract;
import edu.aku.hassannaqvi.mapps_form2.contracts.FormsContract;
import edu.aku.hassannaqvi.mapps_form2.contracts.LHWsContract;
import edu.aku.hassannaqvi.mapps_form2.otherclasses.EligibleParticipants;

import static edu.aku.hassannaqvi.mapps_form2.R.id.btn_Continue;

public class UpdateFormActivity extends Activity
{
    private static final String TAG = UpdateFormActivity.class.getSimpleName();

    @BindView(R.id.activity_section_a)
    RelativeLayout activitySectionA;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02aLHWs)
    Spinner mp02aLHWs;
    @BindView(R.id.mp02a003)
    EditText mp02a003;
    @BindView(R.id.mp02_count)
    TextView mp02Count;
    @BindView(R.id.btn_Continue)
    Button btnContinue;


    List<String> LHWsName;
    DatabaseHelper db;
    HashMap<String, String> LHWs;
    Boolean flag = false;
    Boolean checked = false;

    Collection<DoneContract> Dcontract;
    Collection<EligiblesContract> Econtract;

    //DoneContract dc = new DoneContract();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_form);
        ButterKnife.bind(this);

        mp02a003.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                checked = false;

                if (!checked) {

                    btnContinue.setVisibility(View.GONE);
                    mp02a003.setError("Please check household number first");

                } else {
                    checked = true;
                    mp02a003.setError(null);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

        db = new DatabaseHelper(this);

        LHWsName = new ArrayList<>();

        LHWs = new HashMap<>();

        Collection<LHWsContract> collectionLHWs = db.getLHWsByCluster(AppMain.curCluster);

        for (LHWsContract lhws : collectionLHWs) {
            LHWsName.add(lhws.getLhwName());
            LHWs.put(lhws.getLhwName(), lhws.getLhwId());
        }
        mp02aLHWs.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, LHWsName));

        mp02aLHWs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                ((TextView) parent.getChildAt(0)).setTextColor(getResources().getColor(R.color.colorPrimary));
                Log.d("Selected LHWs", LHWs.get(mp02aLHWs.getSelectedItem().toString()));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    @OnClick(R.id.checkParticipants)
    void onCheckParticipantsClick() {

        checked = true;

        mp02Count.setVisibility(View.VISIBLE);

        if (!mp02a003.getText().toString().isEmpty()) {

            mp02a003.setError(null);

            Econtract = db.getEligiblesByHousehold(AppMain.curCluster, LHWs.get(mp02aLHWs.getSelectedItem().toString()),
                    mp02a003.getText().toString(), /*True means eligible*/false);
            Dcontract = db.getAllUnDone();



            if (Econtract.size() != 0) {

                AppMain.Eparticipant = new ArrayList<>();

                for (DoneContract dc : Dcontract) {

                    {
                        for (EligiblesContract ec : Econtract) {
                            if (ec.getLUID().equals(dc.getLUID())) {
                                AppMain.Eparticipant.add(new EligibleParticipants(ec.getLUID(), ec.getWomen_name()));
                                AppMain.dc.setUID(dc.getUID());
                            }
                        }
                        mp02Count.setText("Remaining Eligible Women found = " + AppMain.Eparticipant.size());
                    }

                }


                if (AppMain.Eparticipant.size() != 0) {
                    Toast.makeText(this, "Participant Found", Toast.LENGTH_LONG).show();

                    btnContinue.setVisibility(View.VISIBLE);

                    flag = true;
                } else {

                    btnContinue.setVisibility(View.GONE);

                    flag = false;

                    Toast.makeText(this, "No Participant Found", Toast.LENGTH_LONG).show();

                }
            }
        } else {
            mp02a003.setError("This data is Required!");
        }


    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {

                finish();

                if (AppMain.formType.equals("1")) {
                    Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                    Intent endSec = new Intent(this, EndingActivity.class);
                    endSec.putExtra("complete", false);
                    startActivity(endSec);
                } else {
                    Intent endSec = new Intent(this, MainActivity.class);
                    startActivity(endSec);
                }
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    @OnClick(btn_Continue)
    void onBtnContinueClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

//        Intent secba = new Intent(this, ParticipantListActivity.class);
//        startActivity(secba);

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();
                Intent secba = new Intent(this, ParticipantListActivity.class);
//                Intent secba = new Intent(this, ParticipantListActivity.class);
                secba.putExtra("data", Econtract.size());
                startActivity(secba);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private boolean UpdateDB() {


        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        AppMain.fc = new FormsContract();
        //AppMain.dc  = new DoneContract();

        AppMain.fc.setTagID(sharedPref.getString("tagName", null));
        AppMain.fc.setFormDate((DateFormat.format("dd-MM-yyyy HH:mm", new Date())).toString());
        AppMain.fc.setInterviewer01(AppMain.loginMem[1]);
        AppMain.fc.setInterviewer02(AppMain.loginMem[2]);
        AppMain.fc.setClustercode(AppMain.curCluster);
        AppMain.fc.setHousehold(mp02a003.getText().toString());
        AppMain.fc.setIstatus("2");
        AppMain.fc.setDeviceID(AppMain.deviceId);
        AppMain.fc.setApp_version(AppMain.versionName + "." + AppMain.versionCode);
        AppMain.fc.setUID(AppMain.dc.getUID());

        AppMain.fc.setLhwCode(LHWs.get(mp02aLHWs.getSelectedItem().toString()));


        //setGPS();

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public void setGPS() {
        SharedPreferences GPSPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

//        String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

        try {
            String lat = GPSPref.getString("Latitude", "0");
            String lang = GPSPref.getString("Longitude", "0");
            String acc = GPSPref.getString("Accuracy", "0");
            String dt = GPSPref.getString("Time", "0");

            if (lat == "0" && lang == "0") {
                Toast.makeText(this, "Could not obtained GPS points", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();
            }

            String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

            AppMain.fc.setGpsLat(GPSPref.getString("Latitude", "0"));
            AppMain.fc.setGpsLng(GPSPref.getString("Longitude", "0"));
            AppMain.fc.setGpsAcc(GPSPref.getString("Accuracy", "0"));
//            AppMain.fc.setGpsTime(GPSPref.getString(date, "0")); // Timestamp is converted to date above
            AppMain.fc.setGpsTime(date); // Timestamp is converted to date above

            Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Log.e(TAG, "setGPS: " + e.getMessage());
        }

    }

    public boolean ValidateForm() {

        //======================= Q 3 ===============

        if (mp02a003.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mp02a003), Toast.LENGTH_SHORT).show();
            mp02a003.setError("This data is Required!");

            Log.i(TAG, "mp02a003: This Data is Required!");
            return false;
        } else {
            mp02a003.setError(null);
        }


        return true;
    }




}
