package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionCGActivity extends Activity {

    @BindView(R.id.activity_section_cg)
    RelativeLayout activitySectionCg;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02cg001)
    RadioGroup mp02cg001;
    @BindView(R.id.mp02cg00101)
    RadioButton mp02cg00101;
    @BindView(R.id.mp02cg00102)
    RadioButton mp02cg00102;
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
    @BindView(R.id.mp02cg00301)
    EditText mp02cg00301;
    @BindView(R.id.mp02cg00302)
    EditText mp02cg00302;
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
    @BindView(R.id.mp02cg00488)
    RadioButton mp02cg00488;
    @BindView(R.id.mp02cg00488x)
    EditText mp02cg00488x;
    @BindView(R.id.mp02cg005)
    RadioGroup mp02cg005;
    @BindView(R.id.mp02cg00501)
    RadioButton mp02cg00501;
    @BindView(R.id.mp02cg00502)
    RadioButton mp02cg00502;
    @BindView(R.id.mp02cg00503)
    RadioButton mp02cg00503;
    @BindView(R.id.mp02cg00504)
    RadioButton mp02cg00504;
    @BindView(R.id.mp02cg00599)
    RadioButton mp02cg00599;
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
    @BindView(R.id.mp02cg00605)
    RadioButton mp02cg00605;
    @BindView(R.id.mp02cg00701)
    EditText mp02cg00701;
    @BindView(R.id.mp02cg00702)
    EditText mp02cg00702;
    @BindView(R.id.mp02cg008)
    RadioGroup mp02cg008;
    @BindView(R.id.mp02cg00801)
    RadioButton mp02cg00801;
    @BindView(R.id.mp02cg00802)
    RadioButton mp02cg00802;
    @BindView(R.id.mp02cg00803)
    RadioButton mp02cg00803;
    @BindView(R.id.mp02cg00804)
    RadioButton mp02cg00804;
    @BindView(R.id.mp02cg00888)
    RadioButton mp02cg00888;
    @BindView(R.id.mp02cg00888x)
    EditText mp02cg00888x;
    @BindView(R.id.mp02cg009)
    RadioGroup mp02cg009;
    @BindView(R.id.mp02cg00901)
    RadioButton mp02cg00901;
    @BindView(R.id.mp02cg00902)
    RadioButton mp02cg00902;
    @BindView(R.id.mp02cg010)
    RadioGroup mp02cg010;
    @BindView(R.id.mp02cg01001)
    RadioButton mp02cg01001;
    @BindView(R.id.mp02cg01002)
    RadioButton mp02cg01002;
    @BindView(R.id.mp02cg01003)
    RadioButton mp02cg01003;
    @BindView(R.id.mp02cg01004)
    RadioButton mp02cg01004;
    @BindView(R.id.mp02cg01005)
    RadioButton mp02cg01005;
    @BindView(R.id.mp02cg01101)
    EditText mp02cg01101;
    @BindView(R.id.mp02cg01102)
    EditText mp02cg01102;
    @BindView(R.id.mp02cg012)
    RadioGroup mp02cg012;
    @BindView(R.id.mp02cg01201)
    RadioButton mp02cg01201;
    @BindView(R.id.mp02cg01202)
    RadioButton mp02cg01202;
    @BindView(R.id.mp02cg01203)
    RadioButton mp02cg01203;
    @BindView(R.id.mp02cg01204)
    RadioButton mp02cg01204;
    @BindView(R.id.mp02cg01288)
    RadioButton mp02cg01288;
    @BindView(R.id.mp02cg01288x)
    EditText mp02cg01288x;
    @BindView(R.id.mp02cg013)
    RadioGroup mp02cg013;
    @BindView(R.id.mp02cg01301)
    RadioButton mp02cg01301;
    @BindView(R.id.mp02cg01302)
    RadioButton mp02cg01302;
    @BindView(R.id.mp02cg01303)
    RadioButton mp02cg01303;
    @BindView(R.id.mp02cg01304)
    RadioButton mp02cg01304;
    @BindView(R.id.mp02cg01399)
    RadioButton mp02cg01399;
    @BindView(R.id.mp02cg014)
    RadioGroup mp02cg014;
    @BindView(R.id.mp02cg01401)
    RadioButton mp02cg01401;
    @BindView(R.id.mp02cg01402)
    RadioButton mp02cg01402;
    @BindView(R.id.mp02cg01403)
    RadioButton mp02cg01403;
    @BindView(R.id.mp02cg01404)
    RadioButton mp02cg01404;
    @BindView(R.id.mp02cg01405)
    RadioButton mp02cg01405;
    @BindView(R.id.mp02cg01501)
    EditText mp02cg01501;
    @BindView(R.id.mp02cg01502)
    EditText mp02cg01502;
    @BindView(R.id.mp02cg016)
    RadioGroup mp02cg016;
    @BindView(R.id.mp02cg01601)
    RadioButton mp02cg01601;
    @BindView(R.id.mp02cg01602)
    RadioButton mp02cg01602;
    @BindView(R.id.mp02cg01603)
    RadioButton mp02cg01603;
    @BindView(R.id.mp02cg01604)
    RadioButton mp02cg01604;
    @BindView(R.id.mp02cg01688)
    RadioButton mp02cg01688;
    @BindView(R.id.mp02cg01688x)
    EditText mp02cg01688x;

    @BindView(R.id.fldGrpmp02cg002)
    LinearLayout fldGrpmp02cg002;
    @BindView(R.id.fldGrpmp02cg006)
    LinearLayout fldGrpmp02cg006;
    @BindView(R.id.fldGrpmp02cg010)
    LinearLayout fldGrpmp02cg010;
    @BindView(R.id.fldGrpmp02cg014)
    LinearLayout fldGrpmp02cg014;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cg);
        ButterKnife.bind(this);

        mp02cg00102.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    fldGrpmp02cg002.setVisibility(View.GONE);
                    mp02cg002.clearCheck();
                    mp02cg00301.setText(null);
                    mp02cg00302.setText(null);
                    mp02cg004.clearCheck();
                    mp02cg00488x.setText(null);
                }else {
                    fldGrpmp02cg002.setVisibility(View.VISIBLE);
                }
            }
        });

        mp02cg00501.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    fldGrpmp02cg006.setVisibility(View.VISIBLE);
                }else {
                    fldGrpmp02cg006.setVisibility(View.GONE);
                    mp02cg006.clearCheck();
                    mp02cg00701.setText(null);
                    mp02cg00702.setText(null);
                    mp02cg008.clearCheck();
                    mp02cg00888x.setText(null);
                }
            }
        });

        mp02cg00901.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    fldGrpmp02cg010.setVisibility(View.VISIBLE);
                }else {
                    fldGrpmp02cg010.setVisibility(View.GONE);
                    mp02cg010.clearCheck();
                    mp02cg01101.setText(null);
                    mp02cg01102.setText(null);
                    mp02cg012.clearCheck();
                    mp02cg01288x.setText(null);
                }
            }
        });

        mp02cg01301.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    fldGrpmp02cg014.setVisibility(View.VISIBLE);
                }else {
                    fldGrpmp02cg014.setVisibility(View.GONE);
                    mp02cg014.clearCheck();
                    mp02cg01501.setText(null);
                    mp02cg01502.setText(null);
                    mp02cg016.clearCheck();
                    mp02cg01688x.setText(null);
                }
            }
        });

//        4
        mp02cg00488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02cg00488x.setVisibility(View.VISIBLE);
                }else {
                    mp02cg00488x.setVisibility(View.GONE);
                    mp02cg00488x.setText(null);
                }
            }
        });

//        8
        mp02cg00888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02cg00888x.setVisibility(View.VISIBLE);
                }else {
                    mp02cg00888x.setVisibility(View.GONE);
                    mp02cg00888x.setText(null);
                }
            }
        });

//        12
        mp02cg01288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02cg01288x.setVisibility(View.VISIBLE);
                }else {
                    mp02cg01288x.setVisibility(View.GONE);
                    mp02cg01288x.setText(null);
                }
            }
        });

//        16
        mp02cg01688.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02cg01688x.setVisibility(View.VISIBLE);
                }else {
                    mp02cg01688x.setVisibility(View.GONE);
                    mp02cg01688x.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Complete Sections", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);

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
                Intent seccha = new Intent(this, SectionCHAActivity.class);
                startActivity(seccha);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

//        int updcount = db.updateSCG();
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

//        1
        if (mp02cg001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02cg001), Toast.LENGTH_SHORT).show();
            mp02cg00102.setError("This data is Required!");
            return false;
        } else {
            mp02cg00102.setError(null);
        }

//        Skip
        if (mp02cg00101.isChecked()) {

//            2
            if (mp02cg002.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02cg002), Toast.LENGTH_SHORT).show();
                mp02cg00205.setError("This data is Required!");
                return false;
            } else {
                mp02cg00205.setError(null);
            }

//            3
            if (mp02cg00301.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02cg003m), Toast.LENGTH_SHORT).show();
                mp02cg00301.setError("This data is Required!");
                return false;
            } else {
                mp02cg00301.setError(null);
            }
            if (Integer.parseInt(mp02cg00301.getText().toString()) < 0 || Integer.parseInt(mp02cg00301.getText().toString()) > 11) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02cg003m), Toast.LENGTH_SHORT).show();
                mp02cg00301.setError("Invalid:Month range 0 - 11");
                return false;
            } else {
                mp02cg00301.setError(null);
            }

            if (mp02cg00302.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02cg003d), Toast.LENGTH_SHORT).show();
                mp02cg00302.setError("This data is Required!");
                return false;
            } else {
                mp02cg00302.setError(null);
            }
            if (Integer.parseInt(mp02cg00302.getText().toString()) < 0 || Integer.parseInt(mp02cg00302.getText().toString()) > 29) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02cg003d), Toast.LENGTH_SHORT).show();
                mp02cg00302.setError("Invalid:Month range 0 - 29");
                return false;
            } else {
                mp02cg00302.setError(null);
            }


//            4
            if (mp02cg004.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02cg004), Toast.LENGTH_SHORT).show();
                mp02cg00488.setError("This data is Required!");
                return false;
            } else {
                mp02cg00488.setError(null);
            }

            if (mp02cg00488.isChecked() && mp02cg00488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02cg004), Toast.LENGTH_SHORT).show();
                mp02cg00488x.setError("This data is Required!");
                return false;
            } else {
                mp02cg00488x.setError(null);
            }
        }

//        5
        if (mp02cg005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02cg005), Toast.LENGTH_SHORT).show();
            mp02cg00599.setError("This data is Required!");
            return false;
        } else {
            mp02cg00599.setError(null);
        }

//        Skip
        if (mp02cg00501.isChecked()) {

//            6
            if (mp02cg006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02cg006), Toast.LENGTH_SHORT).show();
                mp02cg00605.setError("This data is Required!");
                return false;
            } else {
                mp02cg00605.setError(null);
            }

//            7
            if (mp02cg00701.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02cg007m), Toast.LENGTH_SHORT).show();
                mp02cg00701.setError("This data is Required!");
                return false;
            } else {
                mp02cg00701.setError(null);
            }
            if (Integer.parseInt(mp02cg00701.getText().toString()) < 0 || Integer.parseInt(mp02cg00701.getText().toString()) > 11) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02cg007m), Toast.LENGTH_SHORT).show();
                mp02cg00701.setError("Invalid:Month range 0 - 11");
                return false;
            } else {
                mp02cg00701.setError(null);
            }

            if (mp02cg00702.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02cg007d), Toast.LENGTH_SHORT).show();
                mp02cg00702.setError("This data is Required!");
                return false;
            } else {
                mp02cg00702.setError(null);
            }
            if (Integer.parseInt(mp02cg00702.getText().toString()) < 0 || Integer.parseInt(mp02cg00702.getText().toString()) > 29) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02cg007d), Toast.LENGTH_SHORT).show();
                mp02cg00702.setError("Invalid:Month range 0 - 29");
                return false;
            } else {
                mp02cg00702.setError(null);
            }

//            8
            if (mp02cg008.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02cg008), Toast.LENGTH_SHORT).show();
                mp02cg00888.setError("This data is Required!");
                return false;
            } else {
                mp02cg00888.setError(null);
            }

            if (mp02cg00888.isChecked() && mp02cg00888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02cg008), Toast.LENGTH_SHORT).show();
                mp02cg00888x.setError("This data is Required!");
                return false;
            } else {
                mp02cg00888x.setError(null);
            }
        }

//        9
        if (mp02cg009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02cg009), Toast.LENGTH_SHORT).show();
            mp02cg00902.setError("This data is Required!");
            return false;
        } else {
            mp02cg00902.setError(null);
        }

//        Skip
        if (mp02cg00901.isChecked()) {

//            10
            if (mp02cg010.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02cg010), Toast.LENGTH_SHORT).show();
                mp02cg01005.setError("This data is Required!");
                return false;
            } else {
                mp02cg01005.setError(null);
            }

//        11
            if (mp02cg01101.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02cg011m), Toast.LENGTH_SHORT).show();
                mp02cg01101.setError("This data is Required!");
                return false;
            } else {
                mp02cg01101.setError(null);
            }
            if (Integer.parseInt(mp02cg01101.getText().toString()) < 0 || Integer.parseInt(mp02cg01101.getText().toString()) > 11) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02cg011m), Toast.LENGTH_SHORT).show();
                mp02cg01101.setError("Invalid:Month range 0 - 11");
                return false;
            } else {
                mp02cg01101.setError(null);
            }

            if (mp02cg01102.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02cg011d), Toast.LENGTH_SHORT).show();
                mp02cg01102.setError("This data is Required!");
                return false;
            } else {
                mp02cg01102.setError(null);
            }
            if (Integer.parseInt(mp02cg01102.getText().toString()) < 0 || Integer.parseInt(mp02cg01102.getText().toString()) > 29) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02cg011d), Toast.LENGTH_SHORT).show();
                mp02cg01102.setError("Invalid:Month range 0 - 29");
                return false;
            } else {
                mp02cg01102.setError(null);
            }

//            12
            if (mp02cg012.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02cg012), Toast.LENGTH_SHORT).show();
                mp02cg01288.setError("This data is Required!");
                return false;
            } else {
                mp02cg01288.setError(null);
            }

            if (mp02cg01288.isChecked() && mp02cg01288x.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02cg012), Toast.LENGTH_SHORT).show();
                mp02cg01288x.setError("This data is Required!");
                return false;
            } else {
                mp02cg01288x.setError(null);
            }
        }

//        13
        if (mp02cg013.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02cg013), Toast.LENGTH_SHORT).show();
            mp02cg01399.setError("This data is Required!");
            return false;
        } else {
            mp02cg01399.setError(null);
        }

//        Skip
        if (mp02cg01301.isChecked()) {

//            14
            if (mp02cg014.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02cg014), Toast.LENGTH_SHORT).show();
                mp02cg01405.setError("This data is Required!");
                return false;
            } else {
                mp02cg01405.setError(null);
            }

//        15
            if (mp02cg01501.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02cg015m), Toast.LENGTH_SHORT).show();
                mp02cg01501.setError("This data is Required!");
                return false;
            } else {
                mp02cg01501.setError(null);
            }
            if (Integer.parseInt(mp02cg01501.getText().toString()) < 0 || Integer.parseInt(mp02cg01501.getText().toString()) > 11) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02cg015m), Toast.LENGTH_SHORT).show();
                mp02cg01501.setError("Invalid:Month range 0 - 11");
                return false;
            } else {
                mp02cg01501.setError(null);
            }

            if (mp02cg01502.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02cg015d), Toast.LENGTH_SHORT).show();
                mp02cg01502.setError("This data is Required!");
                return false;
            } else {
                mp02cg01502.setError(null);
            }
            if (Integer.parseInt(mp02cg01502.getText().toString()) < 0 || Integer.parseInt(mp02cg01502.getText().toString()) > 29) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02cg015d), Toast.LENGTH_SHORT).show();
                mp02cg01502.setError("Invalid:Month range 0 - 29");
                return false;
            } else {
                mp02cg01502.setError(null);
            }

//            16
            if (mp02cg016.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02cg016), Toast.LENGTH_SHORT).show();
                mp02cg01688.setError("This data is Required!");
                return false;
            } else {
                mp02cg01688.setError(null);
            }

            if (mp02cg01688.isChecked() && mp02cg01688x.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02cg016), Toast.LENGTH_SHORT).show();
                mp02cg01688x.setError("This data is Required!");
                return false;
            } else {
                mp02cg01688x.setError(null);
            }
        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sCG = new JSONObject();

        sCG.put("mp02cg001", mp02cg00101.isChecked() ? "1" : mp02cg00102.isChecked() ? "2" : "0");

        sCG.put("mp02cg002", mp02cg00201.isChecked() ? "1" : mp02cg00202.isChecked() ? "2" : mp02cg00203.isChecked() ? "3"
                : mp02cg00204.isChecked() ? "4" : mp02cg00205.isChecked() ? "5" : "0");

        sCG.put("mp02cg00301", mp02cg00301.getText().toString());
        sCG.put("mp02cg00302", mp02cg00302.getText().toString());

        sCG.put("mp02cg004", mp02cg00401.isChecked() ? "1" : mp02cg00402.isChecked() ? "2" : mp02cg00403.isChecked() ? "3"
                : mp02cg00404.isChecked() ? "4" : mp02cg00488.isChecked() ? "88" : "0");
        sCG.put("mp02cg004", mp02cg00488x.getText().toString());

        sCG.put("mp02cg005", mp02cg00501.isChecked() ? "1" : mp02cg00502.isChecked() ? "2" : mp02cg00503.isChecked() ? "3"
                : mp02cg00504.isChecked() ? "4" : mp02cg00599.isChecked() ? "99" : "0");

        sCG.put("mp02cg006", mp02cg00601.isChecked() ? "1" : mp02cg00602.isChecked() ? "2" : mp02cg00603.isChecked() ? "3"
                : mp02cg00604.isChecked() ? "4" : mp02cg00605.isChecked() ? "5" : "0");

        sCG.put("mp02cg00701", mp02cg00701.getText().toString());
        sCG.put("mp02cg00702", mp02cg00702.getText().toString());

        sCG.put("mp02cg008", mp02cg00801.isChecked() ? "1" : mp02cg00802.isChecked() ? "2" : mp02cg00803.isChecked() ? "3"
                : mp02cg00804.isChecked() ? "4" : mp02cg00888.isChecked() ? "88" : "0");
        sCG.put("mp02cg008", mp02cg00888x.getText().toString());

        sCG.put("mp02cg009", mp02cg00901.isChecked() ? "1" : mp02cg00902.isChecked() ? "2" : "0");

        sCG.put("mp02cg010", mp02cg01001.isChecked() ? "1" : mp02cg01002.isChecked() ? "2" : mp02cg01003.isChecked() ? "3"
                : mp02cg01004.isChecked() ? "4" : mp02cg01005.isChecked() ? "5" : "0");

        sCG.put("mp02cg01101", mp02cg01101.getText().toString());
        sCG.put("mp02cg01102", mp02cg01102.getText().toString());

        sCG.put("mp02cg012", mp02cg01201.isChecked() ? "1" : mp02cg01202.isChecked() ? "2" : mp02cg01203.isChecked() ? "3"
                : mp02cg01204.isChecked() ? "4" : mp02cg01288.isChecked() ? "88" : "0");
        sCG.put("mp02cg012", mp02cg01288x.getText().toString());

        sCG.put("mp02cg013", mp02cg01301.isChecked() ? "1" : mp02cg01302.isChecked() ? "2" : mp02cg01303.isChecked() ? "3"
                : mp02cg01304.isChecked() ? "4" : mp02cg01399.isChecked() ? "99" : "0");

        sCG.put("mp02cg014", mp02cg01401.isChecked() ? "1" : mp02cg01402.isChecked() ? "2" : mp02cg01403.isChecked() ? "3"
                : mp02cg01404.isChecked() ? "4" : mp02cg01405.isChecked() ? "5" : "0");

        sCG.put("mp02cg01501", mp02cg01501.getText().toString());
        sCG.put("mp02cg01502", mp02cg01502.getText().toString());

        sCG.put("mp02cg016", mp02cg01601.isChecked() ? "1" : mp02cg01602.isChecked() ? "2" : mp02cg01603.isChecked() ? "3"
                : mp02cg01604.isChecked() ? "4" : mp02cg01688.isChecked() ? "88" : "0");
        sCG.put("mp02cg016", mp02cg01688x.getText().toString());

        //MPApp.fc.setROW_SCG(String.valueOf(sCG));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

}
