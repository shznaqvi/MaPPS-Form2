package edu.aku.hassannaqvi.mapps_form2.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form2.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form2.R;

public class SectionCGActivity extends Activity {

    private static final String TAG = SectionCGActivity.class.getSimpleName();

    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02cg00101)
    EditText mp02cg00101;
    @BindView(R.id.mp02cg00102)
    EditText mp02cg00102;
    @BindView(R.id.mp02cg002)
    RadioGroup mp02cg002;
    @BindView(R.id.mp02cg00201)
    RadioButton mp02cg00201;
    @BindView(R.id.mp02cg00202)
    RadioButton mp02cg00202;
    @BindView(R.id.mp02cg00203)
    RadioButton mp02cg00203;
    @BindView(R.id.mp02cg00204)
    RadioButton mp02cg00204;
    @BindView(R.id.mp02cg00205)
    RadioButton mp02cg00205;
    @BindView(R.id.mp02cg00288)
    RadioButton mp02cg00288;
    @BindView(R.id.mp02cg00288x)
    EditText mp02cg00288x;
    @BindView(R.id.mp02cg003)
    RadioGroup mp02cg003;
    @BindView(R.id.mp02cg00301)
    RadioButton mp02cg00301;
    @BindView(R.id.mp02cg00302)
    RadioButton mp02cg00302;
    @BindView(R.id.mp02cg00303)
    RadioButton mp02cg00303;
    @BindView(R.id.mp02cg00304)
    RadioButton mp02cg00304;
    @BindView(R.id.mp02cg00305)
    RadioButton mp02cg00305;
    @BindView(R.id.mp02cg00306)
    RadioButton mp02cg00306;
    @BindView(R.id.mp02cg00307)
    RadioButton mp02cg00307;
    @BindView(R.id.mp02cg004)
    RadioGroup mp02cg004;
    @BindView(R.id.mp02cg00401)
    RadioButton mp02cg00401;
    @BindView(R.id.mp02cg00402)
    RadioButton mp02cg00402;
    @BindView(R.id.mp02cg00403)
    RadioButton mp02cg00403;
    @BindView(R.id.mp02cg00404)
    RadioButton mp02cg00404;
    @BindView(R.id.mp02cg005)
    RadioGroup mp02cg005;
    @BindView(R.id.mp02cg00501)
    RadioButton mp02cg00501;
    @BindView(R.id.mp02cg00502)
    RadioButton mp02cg00502;
    @BindView(R.id.fldGrpmp02cg006)
    LinearLayout fldGrpmp02cg006;
    @BindView(R.id.mp02cg006)
    RadioGroup mp02cg006;
    @BindView(R.id.mp02cg00601)
    RadioButton mp02cg00601;
    @BindView(R.id.mp02cg00602)
    RadioButton mp02cg00602;
    @BindView(R.id.mp02cg00603)
    RadioButton mp02cg00603;
    @BindView(R.id.mp02cg00604)
    RadioButton mp02cg00604;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_to_lhw);
        ButterKnife.bind(this);

        mp02cg00288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cg00288x.setVisibility(View.VISIBLE);
                } else {
                    mp02cg00288x.setVisibility(View.GONE);
                    mp02cg00288x.setText(null);
                }
            }
        });

        mp02cg005.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mp02cg00501.isChecked()) {
                    fldGrpmp02cg006.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cg006.setVisibility(View.GONE);
                    mp02cg006.clearCheck();
                }
            }
        });
        

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

//        if (ValidateForm()) {
//            try {
//                SaveDraft();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            if (UpdateDB()) {
        finish();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, SectionCActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }

    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            //if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();
                Intent secc = new Intent(this, SectionCHActivity.class);
                startActivity(secc);

            //} else {
            //    Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            //}
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        //int updcount = db.updateCC();

        /*if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();*/
        return false;
        //}

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sCG = new JSONObject();

        sCG.put("mp02cg00101", mp02cg00101.getText().toString());
        sCG.put("mp02cg00102", mp02cg00102.getText().toString());
        sCG.put("mp02cg002", mp02cg00201.isChecked() ? "1" : mp02cg00202.isChecked() ? "2" : mp02cg00203.isChecked() ? "3"
                : mp02cg00204.isChecked() ? "4" : mp02cg00205.isChecked() ? "5" : mp02cg00288.isChecked() ? "88" : "0");
        sCG.put("mp02cg00288x", mp02cg00288x.getText().toString());
        sCG.put("mp02cg003", mp02cg00301.isChecked() ? "1" : mp02cg00302.isChecked() ? "2" : mp02cg00303.isChecked() ? "3"
                : mp02cg00304.isChecked() ? "4" : mp02cg00305.isChecked() ? "5" : mp02cg00306.isChecked() ? "6"
                : mp02cg00307.isChecked() ? "7" : "0");
        sCG.put("mp02cg004", mp02cg00401.isChecked() ? "1" : mp02cg00402.isChecked() ? "2" : mp02cg00403.isChecked() ? "3"
                : mp02cg00404.isChecked() ? "4" : "0");
        sCG.put("mp02cg005", mp02cg00501.isChecked() ? "1" : mp02cg00502.isChecked() ? "2" : "0");
        sCG.put("mp02cg006", mp02cg00601.isChecked() ? "1" : mp02cg00602.isChecked() ? "2" : mp02cg00603.isChecked() ? "3"
                : mp02cg00604.isChecked() ? "4" : "0");


        //AppMain.pc.setsCC(String.valueOf(sCG));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

//        1
        if (mp02cg00101.getText().toString().isEmpty() && mp02cg00102.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cg001), Toast.LENGTH_SHORT).show();
            mp02cg00101.setError("This data is Required!");

            Log.i(TAG, "mp02cg001: This data is Required!");
            return false;
        } else {
            mp02cg00101.setError(null);
        }


        if (Integer.valueOf(mp02cg00101.getText().toString()) < 0 || Integer.valueOf(mp02cg00101.getText().toString()) > 29) {
            Toast.makeText(this, "ERROR(invalid)" + getString(R.string.mp02cg001) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
            mp02cg00101.setError("Range is 0 to 29 days");

            Log.i(TAG, "mp02cg00101: Range is 0 to 29 days");
            return false;
        } else {
            mp02cg00101.setError(null);
        }

        if (Integer.valueOf(mp02cg00101.getText().toString()) < 0 || Integer.valueOf(mp02cg00101.getText().toString()) > 11) {
            Toast.makeText(this, "ERROR(invalid)" + getString(R.string.mp02cg001) + " - " + getString(R.string.month), Toast.LENGTH_SHORT).show();
            mp02cg00102.setError("Range is 0 to 11 months");

            Log.i(TAG, "mp02cg00101: Range is 0 to 11 days");
            return false;
        } else {
            mp02cg00102.setError(null);
        }

        if (mp02cg002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cg002), Toast.LENGTH_SHORT).show();
            mp02cg00288.setError("This data is Required!");

            Log.i(TAG, "mp02cg002: This data is Required!");
            return false;
        } else {
            mp02cg00288.setError(null);
        }

        if (mp02cg00288.isChecked() && mp02cg00288x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cg002) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            mp02cg00288x.setError("This data is Required!");

            Log.i(TAG, "mp02cg00288x: This data is Required!");
            return false;
        } else {
            mp02cg00288x.setError(null);
        }

        if (mp02cg003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cg003), Toast.LENGTH_SHORT).show();
            mp02cg00307.setError("This data is Required!");

            Log.i(TAG, "mp02cg003: This data is Required!");
            return false;
        } else {
            mp02cg00307.setError(null);
        }

        if (mp02cg004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cg004), Toast.LENGTH_SHORT).show();
            mp02cg00404.setError("This data is Required!");

            Log.i(TAG, "mp02cg004: This data is Required!");
            return false;
        } else {
            mp02cg00404.setError(null);
        }

        if (mp02cg005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cg005), Toast.LENGTH_SHORT).show();
            mp02cg00502.setError("This data is Required!");

            Log.i(TAG, "mp02cg005: This data is Required!");
            return false;
        } else {
            mp02cg00502.setError(null);
        }

        if (mp02cg00501.isChecked()) {
            if (mp02cg006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cg006), Toast.LENGTH_SHORT).show();
                mp02cg00604.setError("This data is Required!");

                Log.i(TAG, "mp02cg006: This data is Required!");
                return false;
            } else {
                mp02cg00604.setError(null);
            }
        }


        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}
