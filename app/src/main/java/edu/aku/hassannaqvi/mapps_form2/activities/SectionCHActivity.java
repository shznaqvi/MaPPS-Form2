package edu.aku.hassannaqvi.mapps_form2.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import edu.aku.hassannaqvi.mapps_form2.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form2.R;

public class SectionCHActivity extends Activity {

    private static final String TAG = SectionCHActivity.class.getSimpleName();

    @BindView(R.id.activity_section_ch)
    RelativeLayout activitySectionch;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02ch001)
    RadioGroup mp02ch001;
    @BindView(R.id.mp02ch00101)
    RadioButton mp02ch00101;
    @BindView(R.id.mp02ch00102)
    RadioButton mp02ch00102;
    @BindView(R.id.mp02ch002)
    RadioGroup mp02ch002;
    @BindView(R.id.mp02ch00201)
    RadioButton mp02ch00201;
    @BindView(R.id.mp02ch00202)
    RadioButton mp02ch00202;
    @BindView(R.id.mp02ch00203)
    RadioButton mp02ch00203;
    @BindView(R.id.mp02ch00204)
    RadioButton mp02ch00204;
    @BindView(R.id.mp02ch00205)
    RadioButton mp02ch00205;
    @BindView(R.id.mp02ch00301)
    EditText mp02ch00301;
    @BindView(R.id.mp02ch00302)
    EditText mp02ch00302;
    @BindView(R.id.mp02ch004)
    RadioGroup mp02ch004;
    @BindView(R.id.mp02ch00401)
    RadioButton mp02ch00401;
    @BindView(R.id.mp02ch00402)
    RadioButton mp02ch00402;
    @BindView(R.id.mp02ch00403)
    RadioButton mp02ch00403;
    @BindView(R.id.mp02ch00404)
    RadioButton mp02ch00404;
    @BindView(R.id.mp02ch00488)
    RadioButton mp02ch00488;
    @BindView(R.id.mp02ch00488x)
    EditText mp02ch00488x;
    @BindView(R.id.mp02ch005)
    RadioGroup mp02ch005;
    @BindView(R.id.mp02ch00501)
    RadioButton mp02ch00501;
    @BindView(R.id.mp02ch00502)
    RadioButton mp02ch00502;
    @BindView(R.id.mp02ch00503)
    RadioButton mp02ch00503;
    @BindView(R.id.mp02ch00504)
    RadioButton mp02ch00504;
    @BindView(R.id.mp02ch00599)
    RadioButton mp02ch00599;
    @BindView(R.id.mp02ch006)
    RadioGroup mp02ch006;
    @BindView(R.id.mp02ch00601)
    RadioButton mp02ch00601;
    @BindView(R.id.mp02ch00602)
    RadioButton mp02ch00602;
    @BindView(R.id.mp02ch00603)
    RadioButton mp02ch00603;
    @BindView(R.id.mp02ch00604)
    RadioButton mp02ch00604;
    @BindView(R.id.mp02ch00605)
    RadioButton mp02ch00605;
    @BindView(R.id.mp02ch00701)
    EditText mp02ch00701;
    @BindView(R.id.mp02ch00702)
    EditText mp02ch00702;
    @BindView(R.id.mp02ch008)
    RadioGroup mp02ch008;
    @BindView(R.id.mp02ch00801)
    RadioButton mp02ch00801;
    @BindView(R.id.mp02ch00802)
    RadioButton mp02ch00802;
    @BindView(R.id.mp02ch00803)
    RadioButton mp02ch00803;
    @BindView(R.id.mp02ch00804)
    RadioButton mp02ch00804;
    @BindView(R.id.mp02ch00888)
    RadioButton mp02ch00888;
    @BindView(R.id.mp02ch00888x)
    EditText mp02ch00888x;
    @BindView(R.id.mp02ch009)
    RadioGroup mp02ch009;
    @BindView(R.id.mp02ch00901)
    RadioButton mp02ch00901;
    @BindView(R.id.mp02ch00902)
    RadioButton mp02ch00902;
    @BindView(R.id.mp02ch010)
    RadioGroup mp02ch010;
    @BindView(R.id.mp02ch01001)
    RadioButton mp02ch01001;
    @BindView(R.id.mp02ch01002)
    RadioButton mp02ch01002;
    @BindView(R.id.mp02ch01003)
    RadioButton mp02ch01003;
    @BindView(R.id.mp02ch01004)
    RadioButton mp02ch01004;
    @BindView(R.id.mp02ch01005)
    RadioButton mp02ch01005;
    @BindView(R.id.mp02ch01101)
    EditText mp02ch01101;
    @BindView(R.id.mp02ch01102)
    EditText mp02ch01102;
    @BindView(R.id.mp02ch012)
    RadioGroup mp02ch012;
    @BindView(R.id.mp02ch01201)
    RadioButton mp02ch01201;
    @BindView(R.id.mp02ch01202)
    RadioButton mp02ch01202;
    @BindView(R.id.mp02ch01203)
    RadioButton mp02ch01203;
    @BindView(R.id.mp02ch01204)
    RadioButton mp02ch01204;
    @BindView(R.id.mp02ch01288)
    RadioButton mp02ch01288;
    @BindView(R.id.mp02ch01288x)
    EditText mp02ch01288x;
    @BindView(R.id.mp02ch013)
    RadioGroup mp02ch013;
    @BindView(R.id.mp02ch01301)
    RadioButton mp02ch01301;
    @BindView(R.id.mp02ch01302)
    RadioButton mp02ch01302;
    @BindView(R.id.mp02ch01303)
    RadioButton mp02ch01303;
    @BindView(R.id.mp02ch01304)
    RadioButton mp02ch01304;
    @BindView(R.id.mp02ch01399)
    RadioButton mp02ch01399;
    @BindView(R.id.mp02ch014)
    RadioGroup mp02ch014;
    @BindView(R.id.mp02ch01401)
    RadioButton mp02ch01401;
    @BindView(R.id.mp02ch01402)
    RadioButton mp02ch01402;
    @BindView(R.id.mp02ch01403)
    RadioButton mp02ch01403;
    @BindView(R.id.mp02ch01404)
    RadioButton mp02ch01404;
    @BindView(R.id.mp02ch01405)
    RadioButton mp02ch01405;
    @BindView(R.id.mp02ch01501)
    EditText mp02ch01501;
    @BindView(R.id.mp02ch01502)
    EditText mp02ch01502;
    @BindView(R.id.mp02ch016)
    RadioGroup mp02ch016;
    @BindView(R.id.mp02ch01601)
    RadioButton mp02ch01601;
    @BindView(R.id.mp02ch01602)
    RadioButton mp02ch01602;
    @BindView(R.id.mp02ch01603)
    RadioButton mp02ch01603;
    @BindView(R.id.mp02ch01604)
    RadioButton mp02ch01604;
    @BindView(R.id.mp02ch01688)
    RadioButton mp02ch01688;
    @BindView(R.id.mp02ch01688x)
    EditText mp02ch01688x;

    @BindView(R.id.fldGrpmp02ch002)
    LinearLayout fldGrpmp02ch002;
    @BindView(R.id.fldGrpmp02ch006)
    LinearLayout fldGrpmp02ch006;
    @BindView(R.id.fldGrpmp02ch010)
    LinearLayout fldGrpmp02ch010;
    @BindView(R.id.fldGrpmp02ch014)
    LinearLayout fldGrpmp02ch014;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_ch);
        ButterKnife.bind(this);

        mp02ch00101.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    fldGrpmp02ch002.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02ch002.setVisibility(View.GONE);
                    mp02ch002.clearCheck();
                    mp02ch00301.setText(null);
                    mp02ch00302.setText(null);
                    mp02ch004.clearCheck();
                    mp02ch00488x.setText(null);
                }
            }
        });

        mp02ch00501.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    fldGrpmp02ch006.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02ch006.setVisibility(View.GONE);
                    mp02ch006.clearCheck();
                    mp02ch00701.setText(null);
                    mp02ch00702.setText(null);
                    mp02ch008.clearCheck();
                    mp02ch00888x.setText(null);
                }
            }
        });

        mp02ch00901.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    fldGrpmp02ch010.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02ch010.setVisibility(View.GONE);
                    mp02ch010.clearCheck();
                    mp02ch01101.setText(null);
                    mp02ch01102.setText(null);
                    mp02ch012.clearCheck();
                    mp02ch01288x.setText(null);
                }
            }
        });

        mp02ch01301.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    fldGrpmp02ch014.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02ch014.setVisibility(View.GONE);
                    mp02ch014.clearCheck();
                    mp02ch01501.setText(null);
                    mp02ch01502.setText(null);
                    mp02ch016.clearCheck();
                    mp02ch01688x.setText(null);
                }
            }
        });

//        4
        mp02ch00488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mp02ch00488x.setVisibility(View.VISIBLE);
                } else {
                    mp02ch00488x.setVisibility(View.GONE);
                    mp02ch00488x.setText(null);
                }
            }
        });

//        8
        mp02ch00888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mp02ch00888x.setVisibility(View.VISIBLE);
                } else {
                    mp02ch00888x.setVisibility(View.GONE);
                    mp02ch00888x.setText(null);
                }
            }
        });

//        12
        mp02ch01288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mp02ch01288x.setVisibility(View.VISIBLE);
                } else {
                    mp02ch01288x.setVisibility(View.GONE);
                    mp02ch01288x.setText(null);
                }
            }
        });

//        16
        mp02ch01688.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mp02ch01688x.setVisibility(View.VISIBLE);
                } else {
                    mp02ch01688x.setVisibility(View.GONE);
                    mp02ch01688x.setText(null);
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
                Intent seccha = new Intent(this, SectionCIAActivity.class);
                startActivity(seccha);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateCG();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public boolean ValidateForm() {

//        1
        if (mp02ch001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch001), Toast.LENGTH_SHORT).show();
            mp02ch00102.setError("This data is Required!");

            Log.i(TAG, "mp02ch001: This data is Required!");
            return false;
        } else {
            mp02ch00102.setError(null);
        }

//        Skip
        if (mp02ch00101.isChecked()) {

//            2
            if (mp02ch002.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch002), Toast.LENGTH_SHORT).show();
                mp02ch00205.setError("This data is Required!");

                Log.i(TAG, "mp02ch002: This data is Required!");
                return false;
            } else {
                mp02ch00205.setError(null);
            }

//            3
            if (mp02ch00301.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch003m), Toast.LENGTH_SHORT).show();
                mp02ch00301.setError("This data is Required!");

                Log.i(TAG, "mp02ch00301: This data is Required!");
                return false;
            } else {
                mp02ch00301.setError(null);
            }
            /*if (Integer.parseInt(mp02ch00301.getText().toString()) < 1 || Integer.parseInt(mp02ch00301.getText().toString()) > 11) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ch003m), Toast.LENGTH_SHORT).show();
                mp02ch00301.setError("Invalid:Month range 1 - 11");
                return false;
            } else {
                mp02ch00301.setError(null);
            }*/

            if (mp02ch00302.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch003d), Toast.LENGTH_SHORT).show();
                mp02ch00302.setError("This data is Required!");

                Log.i(TAG, "mp02ch00302: This data is Required!");
                return false;
            } else {
                mp02ch00302.setError(null);
            }


            if ((Integer.parseInt(mp02ch00301.getText().toString()) < 1 || Integer.parseInt(mp02ch00301.getText().toString()) > 11)
                    && (Integer.parseInt(mp02ch00302.getText().toString()) < 1 || Integer.parseInt(mp02ch00302.getText().toString()) > 29)) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ch003), Toast.LENGTH_SHORT).show();
                mp02ch00301.setError("Invalid:Month range 1 - 11");
                mp02ch00302.setError("Invalid:Days range 1 - 29");

                Log.i(TAG, "mp02ch00301: Invalid: Month range 1-11");
                return false;
            } else {
                mp02ch00301.setError(null);
                mp02ch00302.setError(null);
            }


//            4
            if (mp02ch004.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch004), Toast.LENGTH_SHORT).show();
                mp02ch00488.setError("This data is Required!");

                Log.i(TAG, "mp02ch004: This data is Required!");
                return false;
            } else {
                mp02ch00488.setError(null);
            }

            if (mp02ch00488.isChecked() && mp02ch00488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch004), Toast.LENGTH_SHORT).show();
                mp02ch00488x.setError("This data is Required!");

                Log.i(TAG, "mp02ch00488x: This data is Required!");
                return false;
            } else {
                mp02ch00488x.setError(null);
            }
        }

//        5
        if (mp02ch005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch005), Toast.LENGTH_SHORT).show();
            mp02ch00599.setError("This data is Required!");

            Log.i(TAG, "mp02ch005: This data is Required!");
            return false;
        } else {
            mp02ch00599.setError(null);
        }

//        Skip
        if (mp02ch00501.isChecked()) {

//            6
            if (mp02ch006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch006), Toast.LENGTH_SHORT).show();
                mp02ch00605.setError("This data is Required!");

                Log.i(TAG, "mp02ch006: This data is Required!");
                return false;
            } else {
                mp02ch00605.setError(null);
            }

//            7
            if (mp02ch00701.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch007m), Toast.LENGTH_SHORT).show();
                mp02ch00701.setError("This data is Required!");

                Log.i(TAG, "mp02ch007: This data is Required!");
                return false;
            } else {
                mp02ch00701.setError(null);
            }
            /*if (Integer.parseInt(mp02ch00701.getText().toString()) < 0 || Integer.parseInt(mp02ch00701.getText().toString()) > 11) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ch007m), Toast.LENGTH_SHORT).show();
                mp02ch00701.setError("Invalid:Month range 0 - 11");
                return false;
            } else {
                mp02ch00701.setError(null);
            }*/

            if (mp02ch00702.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch007d), Toast.LENGTH_SHORT).show();
                mp02ch00702.setError("This data is Required!");

                Log.i(TAG, "mp02ch00702: This data is Required!");
                return false;
            } else {
                mp02ch00702.setError(null);
            }
            /*if (Integer.parseInt(mp02ch00702.getText().toString()) < 0 || Integer.parseInt(mp02ch00702.getText().toString()) > 29) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ch007d), Toast.LENGTH_SHORT).show();
                mp02ch00702.setError("Invalid:Month range 0 - 29");
                return false;
            } else {
                mp02ch00702.setError(null);
            }*/

            if ((Integer.parseInt(mp02ch00701.getText().toString()) < 1 || Integer.parseInt(mp02ch00701.getText().toString()) > 11)
                    && (Integer.parseInt(mp02ch00702.getText().toString()) < 1 || Integer.parseInt(mp02ch00702.getText().toString()) > 29)) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ch007), Toast.LENGTH_SHORT).show();
                mp02ch00701.setError("Invalid:Month range 1 - 11");
                mp02ch00702.setError("Invalid:Days range 1 - 29");

                Log.i(TAG, "mp02ch00701: Month Range 1 - 11");
                return false;
            } else {
                mp02ch00701.setError(null);
                mp02ch00702.setError(null);
            }


//            8
            if (mp02ch008.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch008), Toast.LENGTH_SHORT).show();
                mp02ch00888.setError("This data is Required!");

                Log.i(TAG, "mp02ch008: This data is Required!");
                return false;
            } else {
                mp02ch00888.setError(null);
            }

            if (mp02ch00888.isChecked() && mp02ch00888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch008), Toast.LENGTH_SHORT).show();
                mp02ch00888x.setError("This data is Required!");

                Log.i(TAG, "mp02ch00888x: This data is Required!");
                return false;
            } else {
                mp02ch00888x.setError(null);
            }
        }

//        9
        if (mp02ch009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch009), Toast.LENGTH_SHORT).show();
            mp02ch00902.setError("This data is Required!");

            Log.i(TAG, "mp02ch009: This data is Required!");
            return false;
        } else {
            mp02ch00902.setError(null);
        }

//        Skip
        if (mp02ch00901.isChecked()) {

//            10
            if (mp02ch010.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch010), Toast.LENGTH_SHORT).show();
                mp02ch01005.setError("This data is Required!");

                Log.i(TAG, "mp02ch010: This data is Required!");
                return false;
            } else {
                mp02ch01005.setError(null);
            }

//        11
            if (mp02ch01101.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch011m), Toast.LENGTH_SHORT).show();
                mp02ch01101.setError("This data is Required!");

                Log.i(TAG, "mp02ch01101: This data is Required!");
                return false;
            } else {
                mp02ch01101.setError(null);
            }
            /*if (Integer.parseInt(mp02ch01101.getText().toString()) < 0 || Integer.parseInt(mp02ch01101.getText().toString()) > 11) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ch011m), Toast.LENGTH_SHORT).show();
                mp02ch01101.setError("Invalid:Month range 0 - 11");
                return false;
            } else {
                mp02ch01101.setError(null);
            }*/

            if (mp02ch01102.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch011d), Toast.LENGTH_SHORT).show();
                mp02ch01102.setError("This data is Required!");

                Log.i(TAG, "mp02ch01102: This data is Required!");
                return false;
            } else {
                mp02ch01102.setError(null);
            }
            /*if (Integer.parseInt(mp02ch01102.getText().toString()) < 0 || Integer.parseInt(mp02ch01102.getText().toString()) > 29) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ch011d), Toast.LENGTH_SHORT).show();
                mp02ch01102.setError("Invalid:Month range 0 - 29");
                return false;
            } else {
                mp02ch01102.setError(null);
            }*/

            if ((Integer.parseInt(mp02ch01101.getText().toString()) < 1 || Integer.parseInt(mp02ch01101.getText().toString()) > 11)
                    && (Integer.parseInt(mp02ch01102.getText().toString()) < 1 || Integer.parseInt(mp02ch01102.getText().toString()) > 29)) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ch011), Toast.LENGTH_SHORT).show();
                mp02ch01101.setError("Invalid:Month range 1 - 11");
                mp02ch01102.setError("Invalid:Days range 1 - 29");

                Log.i(TAG, "mp02ch01101: Month Range 1 - 11");
                return false;
            } else {
                mp02ch01101.setError(null);
                mp02ch01102.setError(null);
            }


//            12
            if (mp02ch012.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch012), Toast.LENGTH_SHORT).show();
                mp02ch01288.setError("This data is Required!");

                Log.i(TAG, "mp02ch012: This data is Required!");
                return false;
            } else {
                mp02ch01288.setError(null);
            }

            if (mp02ch01288.isChecked() && mp02ch01288x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch012), Toast.LENGTH_SHORT).show();
                mp02ch01288x.setError("This data is Required!");

                Log.i(TAG, "mp02ch01288x: This data is Required!");
                return false;
            } else {
                mp02ch01288x.setError(null);
            }
        }

//        13
        if (mp02ch013.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch013), Toast.LENGTH_SHORT).show();
            mp02ch01399.setError("This data is Required!");

            Log.i(TAG, "mp02ch013: This data is Required!");
            return false;
        } else {
            mp02ch01399.setError(null);
        }

//        Skip
        if (mp02ch01301.isChecked()) {

//            14
            if (mp02ch014.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch014), Toast.LENGTH_SHORT).show();
                mp02ch01405.setError("This data is Required!");

                Log.i(TAG, "mp02ch014: This data is Required!");
                return false;
            } else {
                mp02ch01405.setError(null);
            }

//        15
            if (mp02ch01501.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch015m), Toast.LENGTH_SHORT).show();
                mp02ch01501.setError("This data is Required!");

                Log.i(TAG, "mp02ch01501: This data is Required!");
                return false;
            } else {
                mp02ch01501.setError(null);
            }
            /*if (Integer.parseInt(mp02ch01501.getText().toString()) < 0 || Integer.parseInt(mp02ch01501.getText().toString()) > 11) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ch015m), Toast.LENGTH_SHORT).show();
                mp02ch01501.setError("Invalid:Month range 0 - 11");
                return false;
            } else {
                mp02ch01501.setError(null);
            }*/

            if (mp02ch01502.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch015d), Toast.LENGTH_SHORT).show();
                mp02ch01502.setError("This data is Required!");

                Log.i(TAG, "mp02ch01502: This data is Required!");
                return false;
            } else {
                mp02ch01502.setError(null);
            }
            /*if (Integer.parseInt(mp02ch01502.getText().toString()) < 0 || Integer.parseInt(mp02ch01502.getText().toString()) > 29) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ch015d), Toast.LENGTH_SHORT).show();
                mp02ch01502.setError("Invalid:Month range 0 - 29");
                return false;
            } else {
                mp02ch01502.setError(null);
            }*/

            if ((Integer.parseInt(mp02ch01501.getText().toString()) < 1 || Integer.parseInt(mp02ch01501.getText().toString()) > 11)
                    && (Integer.parseInt(mp02ch01502.getText().toString()) < 1 || Integer.parseInt(mp02ch01502.getText().toString()) > 29)) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ch015), Toast.LENGTH_SHORT).show();
                mp02ch01501.setError("Invalid:Month range 1 - 11");
                mp02ch01502.setError("Invalid:Days range 1 - 29");

                Log.i(TAG, "mp02ch01501: Month Range 1 - 11");
                return false;
            } else {
                mp02ch01501.setError(null);
                mp02ch01502.setError(null);
            }


//            16
            if (mp02ch016.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch016), Toast.LENGTH_SHORT).show();
                mp02ch01688.setError("This data is Required!");

                Log.i(TAG, "mp02ch016: This data is Required!");
                return false;
            } else {
                mp02ch01688.setError(null);
            }

            if (mp02ch01688.isChecked() && mp02ch01688x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ch016), Toast.LENGTH_SHORT).show();
                mp02ch01688x.setError("This data is Required!");

                Log.i(TAG, "mp02ch01688x: This data is Required!");
                return false;
            } else {
                mp02ch01688x.setError(null);
            }
        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sch = new JSONObject();

        sch.put("mp02ch001", mp02ch00101.isChecked() ? "1" : mp02ch00102.isChecked() ? "2" : "0");

        sch.put("mp02ch002", mp02ch00201.isChecked() ? "1" : mp02ch00202.isChecked() ? "2" : mp02ch00203.isChecked() ? "3"
                : mp02ch00204.isChecked() ? "4" : mp02ch00205.isChecked() ? "5" : "0");

        sch.put("mp02ch00301", mp02ch00301.getText().toString());
        sch.put("mp02ch00302", mp02ch00302.getText().toString());

        sch.put("mp02ch004", mp02ch00401.isChecked() ? "1" : mp02ch00402.isChecked() ? "2" : mp02ch00403.isChecked() ? "3"
                : mp02ch00404.isChecked() ? "4" : mp02ch00488.isChecked() ? "88" : "0");
        sch.put("mp02ch004", mp02ch00488x.getText().toString());

        sch.put("mp02ch005", mp02ch00501.isChecked() ? "1" : mp02ch00502.isChecked() ? "2" : mp02ch00503.isChecked() ? "3"
                : mp02ch00504.isChecked() ? "4" : mp02ch00599.isChecked() ? "99" : "0");

        sch.put("mp02ch006", mp02ch00601.isChecked() ? "1" : mp02ch00602.isChecked() ? "2" : mp02ch00603.isChecked() ? "3"
                : mp02ch00604.isChecked() ? "4" : mp02ch00605.isChecked() ? "5" : "0");

        sch.put("mp02ch00701", mp02ch00701.getText().toString());
        sch.put("mp02ch00702", mp02ch00702.getText().toString());

        sch.put("mp02ch008", mp02ch00801.isChecked() ? "1" : mp02ch00802.isChecked() ? "2" : mp02ch00803.isChecked() ? "3"
                : mp02ch00804.isChecked() ? "4" : mp02ch00888.isChecked() ? "88" : "0");
        sch.put("mp02ch008", mp02ch00888x.getText().toString());

        sch.put("mp02ch009", mp02ch00901.isChecked() ? "1" : mp02ch00902.isChecked() ? "2" : "0");

        sch.put("mp02ch010", mp02ch01001.isChecked() ? "1" : mp02ch01002.isChecked() ? "2" : mp02ch01003.isChecked() ? "3"
                : mp02ch01004.isChecked() ? "4" : mp02ch01005.isChecked() ? "5" : "0");

        sch.put("mp02ch01101", mp02ch01101.getText().toString());
        sch.put("mp02ch01102", mp02ch01102.getText().toString());

        sch.put("mp02ch012", mp02ch01201.isChecked() ? "1" : mp02ch01202.isChecked() ? "2" : mp02ch01203.isChecked() ? "3"
                : mp02ch01204.isChecked() ? "4" : mp02ch01288.isChecked() ? "88" : "0");
        sch.put("mp02ch012", mp02ch01288x.getText().toString());

        sch.put("mp02ch013", mp02ch01301.isChecked() ? "1" : mp02ch01302.isChecked() ? "2" : mp02ch01303.isChecked() ? "3"
                : mp02ch01304.isChecked() ? "4" : mp02ch01399.isChecked() ? "99" : "0");

        sch.put("mp02ch014", mp02ch01401.isChecked() ? "1" : mp02ch01402.isChecked() ? "2" : mp02ch01403.isChecked() ? "3"
                : mp02ch01404.isChecked() ? "4" : mp02ch01405.isChecked() ? "5" : "0");

        sch.put("mp02ch01501", mp02ch01501.getText().toString());
        sch.put("mp02ch01502", mp02ch01502.getText().toString());

        sch.put("mp02ch016", mp02ch01601.isChecked() ? "1" : mp02ch01602.isChecked() ? "2" : mp02ch01603.isChecked() ? "3"
                : mp02ch01604.isChecked() ? "4" : mp02ch01688.isChecked() ? "88" : "0");
        sch.put("mp02ch016", mp02ch01688x.getText().toString());

        //AppMain.pc.setsCG(String.valueOf(sch));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
