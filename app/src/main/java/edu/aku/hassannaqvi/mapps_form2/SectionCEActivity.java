package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionCEActivity extends Activity {

    @BindView(R.id.activity_section_ce)
    RelativeLayout activitySectionCe;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02ce00101)
    CheckBox mp02ce00101;
    @BindView(R.id.mp02ce00102)
    CheckBox mp02ce00102;
    @BindView(R.id.mp02ce00103)
    CheckBox mp02ce00103;
    @BindView(R.id.mp02ce00104)
    CheckBox mp02ce00104;
    @BindView(R.id.mp02ce00105)
    CheckBox mp02ce00105;
    @BindView(R.id.mp02ce00106)
    CheckBox mp02ce00106;
    @BindView(R.id.mp02ce00188)
    CheckBox mp02ce00188;
    @BindView(R.id.mp02ce00188x)
    EditText mp02ce00188x;
    @BindView(R.id.mp02ce00201)
    CheckBox mp02ce00201;
    @BindView(R.id.mp02ce00202)
    CheckBox mp02ce00202;
    @BindView(R.id.mp02ce00203)
    CheckBox mp02ce00203;
    @BindView(R.id.mp02ce00204)
    CheckBox mp02ce00204;
    @BindView(R.id.mp02ce00205)
    CheckBox mp02ce00205;
    @BindView(R.id.mp02ce00206)
    CheckBox mp02ce00206;
    @BindView(R.id.mp02ce00288)
    CheckBox mp02ce00288;
    @BindView(R.id.mp02ce00288x)
    EditText mp02ce00288x;
    @BindView(R.id.mp02ce00301)
    CheckBox mp02ce00301;
    @BindView(R.id.mp02ce00302)
    CheckBox mp02ce00302;
    @BindView(R.id.mp02ce00303)
    CheckBox mp02ce00303;
    @BindView(R.id.mp02ce00304)
    CheckBox mp02ce00304;
    @BindView(R.id.mp02ce00305)
    CheckBox mp02ce00305;
    @BindView(R.id.mp02ce00306)
    CheckBox mp02ce00306;
    @BindView(R.id.mp02ce00388)
    CheckBox mp02ce00388;
    @BindView(R.id.mp02ce00388x)
    EditText mp02ce00388x;
    @BindView(R.id.mp02ce00401)
    CheckBox mp02ce00401;
    @BindView(R.id.mp02ce00402)
    CheckBox mp02ce00402;
    @BindView(R.id.mp02ce00403)
    CheckBox mp02ce00403;
    @BindView(R.id.mp02ce00404)
    CheckBox mp02ce00404;
    @BindView(R.id.mp02ce00405)
    CheckBox mp02ce00405;
    @BindView(R.id.mp02ce00406)
    CheckBox mp02ce00406;
    @BindView(R.id.mp02ce00488)
    CheckBox mp02ce00488;
    @BindView(R.id.mp02ce00488x)
    EditText mp02ce00488x;
    @BindView(R.id.mp02ce00501)
    CheckBox mp02ce00501;
    @BindView(R.id.mp02ce00502)
    CheckBox mp02ce00502;
    @BindView(R.id.mp02ce00503)
    CheckBox mp02ce00503;
    @BindView(R.id.mp02ce00504)
    CheckBox mp02ce00504;
    @BindView(R.id.mp02ce00505)
    CheckBox mp02ce00505;
    @BindView(R.id.mp02ce00506)
    CheckBox mp02ce00506;
    @BindView(R.id.mp02ce00588)
    CheckBox mp02ce00588;
    @BindView(R.id.mp02ce00588x)
    EditText mp02ce00588x;
    @BindView(R.id.mp02ce00601)
    CheckBox mp02ce00601;
    @BindView(R.id.mp02ce00602)
    CheckBox mp02ce00602;
    @BindView(R.id.mp02ce00603)
    CheckBox mp02ce00603;
    @BindView(R.id.mp02ce00604)
    CheckBox mp02ce00604;
    @BindView(R.id.mp02ce00605)
    CheckBox mp02ce00605;
    @BindView(R.id.mp02ce00606)
    CheckBox mp02ce00606;
    @BindView(R.id.mp02ce00688)
    CheckBox mp02ce00688;
    @BindView(R.id.mp02ce00688x)
    EditText mp02ce00688x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_ce);
        ButterKnife.bind(this);


        mp02ce00188.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ce00188x.setVisibility(View.VISIBLE);
                }else {
                    mp02ce00188x.setVisibility(View.GONE);
                    mp02ce00188x.setText(null);
                }
            }
        });

        mp02ce00288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ce00288x.setVisibility(View.VISIBLE);
                }else {
                    mp02ce00288x.setVisibility(View.GONE);
                    mp02ce00288x.setText(null);
                }
            }
        });

        mp02ce00388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ce00388x.setVisibility(View.VISIBLE);
                }else {
                    mp02ce00388x.setVisibility(View.GONE);
                    mp02ce00388x.setText(null);
                }
            }
        });

        mp02ce00488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ce00488x.setVisibility(View.VISIBLE);
                }else {
                    mp02ce00488x.setVisibility(View.GONE);
                    mp02ce00488x.setText(null);
                }
            }
        });

        mp02ce00588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ce00588x.setVisibility(View.VISIBLE);
                }else {
                    mp02ce00588x.setVisibility(View.GONE);
                    mp02ce00588x.setText(null);
                }
            }
        });

        mp02ce00688.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ce00688x.setVisibility(View.VISIBLE);
                }else {
                    mp02ce00688x.setVisibility(View.GONE);
                    mp02ce00688x.setText(null);
                }
            }
        });
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

                Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
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

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                Intent seccf = new Intent(this, SectionCFActivity.class);
                startActivity(seccf);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sCE = new JSONObject();


        sCE.put("mp02ce00101", mp02ce00101.isChecked() ? "1" : "0");
        sCE.put("mp02ce00102", mp02ce00102.isChecked() ? "2" : "0");
        sCE.put("mp02ce00103", mp02ce00103.isChecked() ? "3" : "0");
        sCE.put("mp02ce00104", mp02ce00104.isChecked() ? "4" : "0");
        sCE.put("mp02ce00105", mp02ce00105.isChecked() ? "5" : "0");
        sCE.put("mp02ce00106", mp02ce00106.isChecked() ? "6" : "0");
        sCE.put("mp02ce00188", mp02ce00188.isChecked() ? "88" : "0");

        sCE.put("mp02ce00201", mp02ce00201.isChecked() ? "1" : "0");
        sCE.put("mp02ce00202", mp02ce00202.isChecked() ? "2" : "0");
        sCE.put("mp02ce00203", mp02ce00203.isChecked() ? "3" : "0");
        sCE.put("mp02ce00204", mp02ce00204.isChecked() ? "4" : "0");
        sCE.put("mp02ce00205", mp02ce00205.isChecked() ? "5" : "0");
        sCE.put("mp02ce00206", mp02ce00206.isChecked() ? "6" : "0");
        sCE.put("mp02ce00288", mp02ce00288.isChecked() ? "88" : "0");

        sCE.put("mp02ce00301", mp02ce00301.isChecked() ? "1" : "0");
        sCE.put("mp02ce00302", mp02ce00302.isChecked() ? "2" : "0");
        sCE.put("mp02ce00303", mp02ce00303.isChecked() ? "3" : "0");
        sCE.put("mp02ce00304", mp02ce00304.isChecked() ? "4" : "0");
        sCE.put("mp02ce00305", mp02ce00305.isChecked() ? "5" : "0");
        sCE.put("mp02ce00306", mp02ce00306.isChecked() ? "6" : "0");
        sCE.put("mp02ce00388", mp02ce00388.isChecked() ? "88" : "0");

        sCE.put("mp02ce00401", mp02ce00401.isChecked() ? "1" : "0");
        sCE.put("mp02ce00402", mp02ce00402.isChecked() ? "2" : "0");
        sCE.put("mp02ce00403", mp02ce00403.isChecked() ? "3" : "0");
        sCE.put("mp02ce00404", mp02ce00404.isChecked() ? "4" : "0");
        sCE.put("mp02ce00405", mp02ce00405.isChecked() ? "5" : "0");
        sCE.put("mp02ce00406", mp02ce00406.isChecked() ? "6" : "0");
        sCE.put("mp02ce00488", mp02ce00488.isChecked() ? "88" : "0");

        sCE.put("mp02ce00501", mp02ce00501.isChecked() ? "1" : "0");
        sCE.put("mp02ce00502", mp02ce00502.isChecked() ? "2" : "0");
        sCE.put("mp02ce00503", mp02ce00503.isChecked() ? "3" : "0");
        sCE.put("mp02ce00504", mp02ce00504.isChecked() ? "4" : "0");
        sCE.put("mp02ce00505", mp02ce00505.isChecked() ? "5" : "0");
        sCE.put("mp02ce00506", mp02ce00506.isChecked() ? "6" : "0");
        sCE.put("mp02ce00588", mp02ce00588.isChecked() ? "88" : "0");

        sCE.put("mp02ce00601", mp02ce00601.isChecked() ? "1" : "0");
        sCE.put("mp02ce00602", mp02ce00602.isChecked() ? "2" : "0");
        sCE.put("mp02ce00603", mp02ce00603.isChecked() ? "3" : "0");
        sCE.put("mp02ce00604", mp02ce00604.isChecked() ? "4" : "0");
        sCE.put("mp02ce00605", mp02ce00605.isChecked() ? "5" : "0");
        sCE.put("mp02ce00606", mp02ce00606.isChecked() ? "6" : "0");
        sCE.put("mp02ce00688", mp02ce00688.isChecked() ? "88" : "0");

        //MPApp.fc.setROW_SCE(String.valueOf(sCE));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

//        int updcount = db.updateSCE();
//
//        if (updcount == 1) {
//            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
//            return true;
//        } else {
//            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
//            return false;
//        }

        return true;

    }

    public boolean ValidateForm() {

//      1
        if (!(mp02ce00101.isChecked() || mp02ce00102.isChecked() || mp02ce00103.isChecked() || mp02ce00104.isChecked()
                || mp02ce00105.isChecked() || mp02ce00106.isChecked() || mp02ce00188.isChecked()
        )) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ce001), Toast.LENGTH_LONG).show();
            mp02ce00188.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            mp02ce00188.setError(null);
        }

        if (mp02ce00188.isChecked() && mp02ce00188x.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02ce001), Toast.LENGTH_SHORT).show();
            mp02ce00188x.setError("This data is Required!");
            return false;
        } else {
            mp02ce00388x.setError(null);
        }

//      2
        if (!(mp02ce00201.isChecked() || mp02ce00202.isChecked() || mp02ce00203.isChecked() || mp02ce00204.isChecked()
                || mp02ce00205.isChecked() || mp02ce00206.isChecked() || mp02ce00288.isChecked()
        )) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ce002), Toast.LENGTH_LONG).show();
            mp02ce00288.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            mp02ce00288.setError(null);
        }

        if (mp02ce00288.isChecked() && mp02ce00288x.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02ce002), Toast.LENGTH_SHORT).show();
            mp02ce00288x.setError("This data is Required!");
            return false;
        } else {
            mp02ce00288x.setError(null);
        }

//      3
        if (!(mp02ce00301.isChecked() || mp02ce00302.isChecked() || mp02ce00303.isChecked() || mp02ce00304.isChecked()
                || mp02ce00305.isChecked() || mp02ce00306.isChecked() || mp02ce00388.isChecked()
        )) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ce003), Toast.LENGTH_LONG).show();
            mp02ce00388.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            mp02ce00388.setError(null);
        }

        if (mp02ce00388.isChecked() && mp02ce00388x.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02ce003), Toast.LENGTH_SHORT).show();
            mp02ce00388x.setError("This data is Required!");
            return false;
        } else {
            mp02ce00388x.setError(null);
        }

//      4
        if (!(mp02ce00401.isChecked() || mp02ce00402.isChecked() || mp02ce00403.isChecked() || mp02ce00404.isChecked()
                || mp02ce00405.isChecked() || mp02ce00406.isChecked() || mp02ce00488.isChecked()
        )) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ce004), Toast.LENGTH_LONG).show();
            mp02ce00488.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            mp02ce00488.setError(null);
        }

        if (mp02ce00488.isChecked() && mp02ce00488x.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02ce004), Toast.LENGTH_SHORT).show();
            mp02ce00488x.setError("This data is Required!");
            return false;
        } else {
            mp02ce00488x.setError(null);
        }

//      5
        if (!(mp02ce00501.isChecked() || mp02ce00502.isChecked() || mp02ce00503.isChecked() || mp02ce00504.isChecked()
                || mp02ce00505.isChecked() || mp02ce00506.isChecked() || mp02ce00588.isChecked()
        )) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ce005), Toast.LENGTH_LONG).show();
            mp02ce00588.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            mp02ce00588.setError(null);
        }

        if (mp02ce00588.isChecked() && mp02ce00588x.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02ce005), Toast.LENGTH_SHORT).show();
            mp02ce00588x.setError("This data is Required!");
            return false;
        } else {
            mp02ce00588x.setError(null);
        }

//      6
        if (!(mp02ce00601.isChecked() || mp02ce00602.isChecked() || mp02ce00603.isChecked() || mp02ce00604.isChecked()
                || mp02ce00605.isChecked() || mp02ce00606.isChecked() || mp02ce00688.isChecked()
        )) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ce006), Toast.LENGTH_LONG).show();
            mp02ce00688.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            mp02ce00688.setError(null);
        }

        if (mp02ce00688.isChecked() && mp02ce00688x.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02ce006), Toast.LENGTH_SHORT).show();
            mp02ce00688x.setError("This data is Required!");
            return false;
        } else {
            mp02ce00688x.setError(null);
        }


        return true;
    }


}
