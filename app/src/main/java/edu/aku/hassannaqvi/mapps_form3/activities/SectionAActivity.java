package edu.aku.hassannaqvi.mapps_form3.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form3.R;
import edu.aku.hassannaqvi.mapps_form3.contracts.FollowupsContract;
import edu.aku.hassannaqvi.mapps_form3.contracts.FormsContract;
import edu.aku.hassannaqvi.mapps_form3.core.AppMain;
import edu.aku.hassannaqvi.mapps_form3.core.DatabaseHelper;

public class SectionAActivity extends Activity {

    private static final String TAG = SectionAActivity.class.getSimpleName();

    @BindView(R.id.activity_section_a)
    RelativeLayout activitySectionA;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02a001)
    Spinner mp02a001;
    @BindView(R.id.mp02a002)
    EditText mp02a002;
    @BindView(R.id.mp02a003)
    EditText mp02a003;
    @BindView(R.id.mp02a006)
    EditText mp02a006;
    @BindView(R.id.mp02a007)
    EditText mp02a007;
    /*@BindView(R.id.mp02a008)*/
    //EditText mp02a008;
    @BindView(R.id.mp02a013)
    RadioGroup mp02a013;
    @BindView(R.id.mp02a01301)
    RadioButton mp02a01301;
    @BindView(R.id.mp02a01302)
    RadioButton mp02a01302;

    /*@BindView(R.id.mp02aLHWs)
    Spinner mp02aLHWs;*/

    /*@BindView(R.id.fldGrpmp02a007)
    LinearLayout fldGrpmp02a007;*/

/*    @BindView(R.id.fldGrpParticipant)
    LinearLayout fldGrpParticipant;*/

    @BindView(R.id.fldGrpmp01)
    LinearLayout fldGrpmp01;

    @BindView(R.id.btn_Continue)
    Button btn_Continue;
    @BindView(R.id.btn_End)
    Button btn_End;
    @BindView(R.id.checkParticipants)
    Button checkParticipants;

   /* @BindView(R.id.mp02_count)
    TextView mp02_count;*/

    List<String> LHWsName;
    DatabaseHelper db;
    HashMap<String, String> LHWs;
    Boolean flag = false;
    Boolean checked = false;
    Boolean s1 = false;

    Boolean reBack = false;

    int position = 0;

    Collection<FollowupsContract> Econtract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);

        //AppMain.Eparticipant = new ArrayList<>();

        /*if (AppMain.checked) {
            mp02a001.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, AppMain.ParticipantsName));
            fldGrpParticipant.setVisibility(View.VISIBLE);
            fldGrpmp02a007.setVisibility(View.VISIBLE);
            mp02a003.setText(AppMain.hhno);
            mp02a003.setEnabled(false);
            checkParticipants.setEnabled(false);
        } else {

            mp02a003.setText(null);
            mp02a003.setEnabled(true);
            checkParticipants.setEnabled(true);
        }*/

        mp02a003.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                /*AppMain.checked = false;

                if (!AppMain.checked) {
                    fldGrpParticipant.setVisibility(View.GONE);
                    mp02a003.setError("Please check household number first");
                    fldGrpmp02a007.setVisibility(View.GONE);
                    AppMain.ParticipantsMap.clear();
                    AppMain.ParticipantsName.clear();

                } else {
                    AppMain.checked = true;
                    mp02a003.setError(null);
                    //MainApp.hhno = mpl1a001.getText().toString();
                }*/

                fldGrpmp01.setVisibility(View.GONE);

                mp02a002.setText(null);
                mp02a006.setText(null);
                mp02a007.setText(null);
                mp02a013.clearCheck();

            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

        mp02a013.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mp02a01301.isChecked()) {
                    btn_Continue.setVisibility(View.VISIBLE);
                    btn_End.setVisibility(View.GONE);
                } else {
                    btn_Continue.setVisibility(View.GONE);
                    btn_End.setVisibility(View.VISIBLE);
                }
            }
        });

        mp02a001.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

                if (mp02a001.getSelectedItemPosition() != 0) {
                    position = pos;
                    s1 = AppMain.ParticipantsMap.get(mp02a001.getSelectedItem().toString()).getS1().equals("1");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//        Reback checking
        reBack = getIntent().getBooleanExtra("flag_reback", false);

        if (reBack) {

            mp02a003.setText(AppMain.hhno);
            mp02a003.setEnabled(false);
            checkParticipants.setEnabled(false);
            fldGrpmp01.setVisibility(View.VISIBLE);
            btn_Continue.setVisibility(View.VISIBLE);

            mp02a001.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, AppMain.ParticipantsName));

        } else {
            AppMain.ParticipantsName = new ArrayList<>();
            AppMain.ParticipantsMap = new HashMap<>();
            AppMain.Eparticipant = new ArrayList<>();
        }

    }

    @OnClick(R.id.checkParticipants)
    void onCheckParticipantsClick() {

        checked = true;
        AppMain.checked = true;

        db = new DatabaseHelper(this);

        //mp02_count.setVisibility(View.VISIBLE);

        if (!mp02a003.getText().toString().isEmpty()) {

            mp02a003.setError(null);

            Econtract = db.getFollowupsByHousehold(AppMain.curCluster, AppMain.selectedLhw,
                    mp02a003.getText().toString());

            Toast.makeText(this, "Eligible Women found = " + Econtract.size(), Toast.LENGTH_SHORT).show();

            if (Econtract.size() != 0) {
                AppMain.ParticipantsName = new ArrayList<>();
                AppMain.ParticipantsMap = new HashMap<>();
                AppMain.Eparticipant = new ArrayList<>();

                AppMain.ParticipantsName.add("Select Participant..");

                //AppMain.Eparticipant = new ArrayList<>();

                for (FollowupsContract ec : Econtract) {
                    AppMain.ParticipantsName.add(ec.getWomen_name().toUpperCase());
                    AppMain.ParticipantsMap.put(ec.getWomen_name().toUpperCase(), new FollowupsContract(ec));

                    AppMain.Eparticipant.add(new FollowupsContract(ec));
                }

                Toast.makeText(this, "Participant Found", Toast.LENGTH_LONG).show();

//                fldGrpmp02a007.setVisibility(View.VISIBLE);
                AppMain.totalWmCount = Econtract.size();
                fldGrpmp01.setVisibility(View.VISIBLE);
                btn_Continue.setVisibility(View.VISIBLE);

                flag = true;

                mp02a001.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, AppMain.ParticipantsName));

            } else {

                fldGrpmp01.setVisibility(View.GONE);
                /*mp02a007.setText(null);
                mp02a008.setText(null);*/

//                mp02a013.clearCheck();

                flag = false;

                Toast.makeText(this, "No Participant Found", Toast.LENGTH_LONG).show();
            }
        } else {
            mp02a003.setError("This data is Required!");
        }


    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {

                AppMain.ParticipantsName.remove(position);

                finish();
                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("complete", false);
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

//        Intent secba = new Intent(this, ParticipantListActivity.class);
//        startActivity(secba);

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {

                AppMain.ParticipantsName.remove(position);

                finish();
                if (s1) {
                    Intent secba = new Intent(this, SectionBAActivity.class);
                    secba.putExtra("data", AppMain.totalWmCount);
                    startActivity(secba);
                } else {
                    Intent secba = new Intent(this, SectionEActivity.class);
                    startActivity(secba);
                }

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
        Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

        rowId = db.addForm(AppMain.fc);

        AppMain.fc.setID(rowId);

        if (rowId != null) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            AppMain.fc.setUID(
                    (AppMain.fc.getDeviceID() + AppMain.fc.getID()));
            Toast.makeText(this, "Current Form No: " + AppMain.fc.getUID(), Toast.LENGTH_SHORT).show();

            // Update UID of Last Inserted Form
            db.updateFormsUID();

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        AppMain.fc = new FormsContract();

        AppMain.fc.setTagID(sharedPref.getString("tagName", null));
        AppMain.fc.setFormDate((DateFormat.format("dd-MM-yyyy HH:mm", new Date())).toString());
        AppMain.fc.setInterviewer01(AppMain.loginMem[1]);
        AppMain.fc.setInterviewer02(AppMain.loginMem[2]);
        AppMain.fc.setClustercode(AppMain.curCluster);
        AppMain.fc.setHousehold(mp02a003.getText().toString());
        AppMain.fc.setIstatus("2");
        AppMain.fc.setDeviceID(AppMain.deviceId);
        AppMain.fc.setVillageacode(mp02a006.getText().toString());
        AppMain.fc.setApp_version(AppMain.versionName + "." + AppMain.versionCode);
        AppMain.fc.setLhwCode(AppMain.selectedLhw);

        JSONObject sa = new JSONObject();

        if (mp02a001.getSelectedItemPosition() != 0) {
            sa.put("sno", AppMain.ParticipantsMap.get(mp02a001.getSelectedItem()).getSno());
            sa.put("luid", AppMain.ParticipantsMap.get(mp02a001.getSelectedItem()).getLUID());
            sa.put("s1", AppMain.ParticipantsMap.get(mp02a001.getSelectedItem()).getFupdate());
        }

        sa.put("mp03q003", mp02a001.getSelectedItem().toString());
        sa.put("mp03q005", mp02a002.getText().toString());
        sa.put("mp03q006", mp02a007.getText().toString());
        sa.put("mp03q013", mp02a01301.isChecked() ? "1" : mp02a01302.isChecked() ? "2" : "0");

        AppMain.fc.setsA(String.valueOf(sa));

        AppMain.hhno = mp02a003.getText().toString();

        setGPS();

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

        //======================= Q 1 ===============


        //======================= Q 3 ===============

        if (mp02a003.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mp02a003), Toast.LENGTH_SHORT).show();
            mp02a003.setError("This data is Required!");

            Log.i(TAG, "mp02a003: This Data is Required!");
            return false;
        } else {
            mp02a003.setError(null);
        }

        if (flag) {

            if (mp02a001.getSelectedItem().equals("Select Participant..")) {
//        if (mp04a003.getSelectedItem().equals("")) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mp02a001), Toast.LENGTH_SHORT).show();
                ((TextView) mp02a001.getSelectedView()).setText("This Data is Required");
                ((TextView) mp02a001.getSelectedView()).setError("This Data is Required");
                ((TextView) mp02a001.getSelectedView()).setTextColor(Color.RED);

                Log.i(TAG, "mp04a003: This Data is Required!");
                return false;
            } else {
                ((TextView) mp02a001.getSelectedView()).setError(null);
            }


            //======================= Q 2 ===============

            if (mp02a002.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mp02a002), Toast.LENGTH_SHORT).show();
                mp02a002.setError("This data is Required!");

                Log.i(TAG, "mp02a002: This Data is Required!");
                return false;
            } else {
                mp02a002.setError(null);
            }
            //======================= Q 7 ===============

            if (mp02a007.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mp02a007), Toast.LENGTH_SHORT).show();
                mp02a007.setError("This data is Required!");

                Log.i(TAG, "mp02a007: This Data is Required!");
                return false;
            } else {
                mp02a007.setError(null);
            }
            //======================= Q 8 ===============

            /*if (mp02a008.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mp02a008), Toast.LENGTH_SHORT).show();
                mp02a008.setError("This data is Required!");

                Log.i(TAG, "mp02a008: This Data is Required!");
                return false;
            } else {
                mp02a008.setError(null);
            }

*/
            //======================= Q 13 ===============

            if (mp02a013.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mp02a013), Toast.LENGTH_SHORT).show();
                mp02a01302.setError("This data is Required!");

                Log.i(TAG, "mp02a013: This Data is Required!");
                return false;
            } else {
                mp02a01302.setError(null);
            }
        }

        return true;
    }


}
