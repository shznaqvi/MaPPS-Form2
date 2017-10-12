package edu.aku.hassannaqvi.mapps_form2.activities;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form2.AppMain;
import edu.aku.hassannaqvi.mapps_form2.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form2.R;
import edu.aku.hassannaqvi.mapps_form2.contracts.EligiblesContract;
import edu.aku.hassannaqvi.mapps_form2.contracts.LHWsContract;
import edu.aku.hassannaqvi.mapps_form2.otherclasses.EligibleParticipants;

import static edu.aku.hassannaqvi.mapps_form2.R.id.btn_Continue;

public class UpdateFormActivity extends Activity
{

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

    Collection<EligiblesContract> Econtract;

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

            Econtract = db.getEligiblesByHousehold(AppMain.curCluster, LHWs.get(mp02aLHWs.getSelectedItem().toString()), mp02a003.getText().toString());

            mp02Count.setText("Eligible Women found = " + Econtract.size());


            if (Econtract.size() != 0) {

                AppMain.Eparticipant = new ArrayList<>();

                for (EligiblesContract ec : Econtract) {
                    AppMain.Eparticipant.add(new EligibleParticipants(ec.getLUID(), ec.getWomen_name()));
                }

                Toast.makeText(this, "Participant Found", Toast.LENGTH_LONG).show();

                btnContinue.setVisibility(View.VISIBLE);

                flag = true;

            } else {

                btnContinue.setVisibility(View.GONE);

                flag = false;

                Toast.makeText(this, "No Participant Found", Toast.LENGTH_LONG).show();
            }
        } else {
            mp02a003.setError("This data is Required!");
        }


    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }


    @OnClick(btn_Continue)
    void onBtnContinueClick() {
        //TODO implement
    }


}
