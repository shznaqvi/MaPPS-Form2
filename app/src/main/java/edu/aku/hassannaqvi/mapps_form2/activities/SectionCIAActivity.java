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

public class SectionCIAActivity extends Activity {

    private static final String TAG = SectionCIAActivity.class.getSimpleName();

    @BindView(R.id.activity_section_ch)
    RelativeLayout activitySectionch;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02ci001)
    RadioGroup mp02ci001;
    @BindView(R.id.mp02ci00101)
    RadioButton mp02ci00101;
    @BindView(R.id.mp02ci00102)
    RadioButton mp02ci00102;
    @BindView(R.id.mp02ci002)
    RadioGroup mp02ci002;
    @BindView(R.id.mp02ci00201)
    RadioButton mp02ci00201;
    @BindView(R.id.mp02ci00202)
    RadioButton mp02ci00202;
    @BindView(R.id.mp02ci00203)
    RadioButton mp02ci00203;
    @BindView(R.id.mp02ci00204)
    RadioButton mp02ci00204;
    @BindView(R.id.mp02ci00205)
    RadioButton mp02ci00205;
    @BindView(R.id.mp02ci00301)
    EditText mp02ci00301;
    @BindView(R.id.mp02ci00302)
    EditText mp02ci00302;
    @BindView(R.id.mp02ci004)
    RadioGroup mp02ci004;
    @BindView(R.id.mp02ci00401)
    RadioButton mp02ci00401;
    @BindView(R.id.mp02ci00402)
    RadioButton mp02ci00402;
    @BindView(R.id.mp02ci00403)
    RadioButton mp02ci00403;
    @BindView(R.id.mp02ci00404)
    RadioButton mp02ci00404;
    @BindView(R.id.mp02ci00488)
    RadioButton mp02ci00488;
    @BindView(R.id.mp02ci00488x)
    EditText mp02ci00488x;
    @BindView(R.id.mp02ci005)
    RadioGroup mp02ci005;
    @BindView(R.id.mp02ci00501)
    RadioButton mp02ci00501;
    @BindView(R.id.mp02ci00502)
    RadioButton mp02ci00502;
    @BindView(R.id.mp02ci00503)
    RadioButton mp02ci00503;
    @BindView(R.id.mp02ci00504)
    RadioButton mp02ci00504;
    @BindView(R.id.mp02ci00599)
    RadioButton mp02ci00599;
    @BindView(R.id.mp02ci006)
    RadioGroup mp02ci006;
    @BindView(R.id.mp02ci00601)
    RadioButton mp02ci00601;
    @BindView(R.id.mp02ci00602)
    RadioButton mp02ci00602;
    @BindView(R.id.mp02ci00603)
    RadioButton mp02ci00603;
    @BindView(R.id.mp02ci00604)
    RadioButton mp02ci00604;
    @BindView(R.id.mp02ci00605)
    RadioButton mp02ci00605;
    @BindView(R.id.mp02ci00701)
    EditText mp02ci00701;
    @BindView(R.id.mp02ci00702)
    EditText mp02ci00702;
    @BindView(R.id.mp02ci008)
    RadioGroup mp02ci008;
    @BindView(R.id.mp02ci00801)
    RadioButton mp02ci00801;
    @BindView(R.id.mp02ci00802)
    RadioButton mp02ci00802;
    @BindView(R.id.mp02ci00803)
    RadioButton mp02ci00803;
    @BindView(R.id.mp02ci00804)
    RadioButton mp02ci00804;
    @BindView(R.id.mp02ci00888)
    RadioButton mp02ci00888;
    @BindView(R.id.mp02ci00888x)
    EditText mp02ci00888x;
    @BindView(R.id.mp02ci009)
    RadioGroup mp02ci009;
    @BindView(R.id.mp02ci00901)
    RadioButton mp02ci00901;
    @BindView(R.id.mp02ci00902)
    RadioButton mp02ci00902;
    @BindView(R.id.mp02ci010)
    RadioGroup mp02ci010;
    @BindView(R.id.mp02ci01001)
    RadioButton mp02ci01001;
    @BindView(R.id.mp02ci01002)
    RadioButton mp02ci01002;
    @BindView(R.id.mp02ci01003)
    RadioButton mp02ci01003;
    @BindView(R.id.mp02ci01004)
    RadioButton mp02ci01004;
    @BindView(R.id.mp02ci01005)
    RadioButton mp02ci01005;
    @BindView(R.id.mp02ci01101)
    EditText mp02ci01101;
    @BindView(R.id.mp02ci01102)
    EditText mp02ci01102;
    @BindView(R.id.mp02ci012)
    RadioGroup mp02ci012;
    @BindView(R.id.mp02ci01201)
    RadioButton mp02ci01201;
    @BindView(R.id.mp02ci01202)
    RadioButton mp02ci01202;
    @BindView(R.id.mp02ci01203)
    RadioButton mp02ci01203;
    @BindView(R.id.mp02ci01204)
    RadioButton mp02ci01204;
    @BindView(R.id.mp02ci01288)
    RadioButton mp02ci01288;
    @BindView(R.id.mp02ci01288x)
    EditText mp02ci01288x;
    @BindView(R.id.mp02ci013)
    RadioGroup mp02ci013;
    @BindView(R.id.mp02ci01301)
    RadioButton mp02ci01301;
    @BindView(R.id.mp02ci01302)
    RadioButton mp02ci01302;
    @BindView(R.id.mp02ci01303)
    RadioButton mp02ci01303;
    @BindView(R.id.mp02ci01304)
    RadioButton mp02ci01304;
    @BindView(R.id.mp02ci01399)
    RadioButton mp02ci01399;
    @BindView(R.id.mp02ci014)
    RadioGroup mp02ci014;
    @BindView(R.id.mp02ci01401)
    RadioButton mp02ci01401;
    @BindView(R.id.mp02ci01402)
    RadioButton mp02ci01402;
    @BindView(R.id.mp02ci01403)
    RadioButton mp02ci01403;
    @BindView(R.id.mp02ci01404)
    RadioButton mp02ci01404;
    @BindView(R.id.mp02ci01405)
    RadioButton mp02ci01405;
    @BindView(R.id.mp02ci01501)
    EditText mp02ci01501;
    @BindView(R.id.mp02ci01502)
    EditText mp02ci01502;
    @BindView(R.id.mp02ci016)
    RadioGroup mp02ci016;
    @BindView(R.id.mp02ci01601)
    RadioButton mp02ci01601;
    @BindView(R.id.mp02ci01602)
    RadioButton mp02ci01602;
    @BindView(R.id.mp02ci01603)
    RadioButton mp02ci01603;
    @BindView(R.id.mp02ci01604)
    RadioButton mp02ci01604;
    @BindView(R.id.mp02ci01688)
    RadioButton mp02ci01688;
    @BindView(R.id.mp02ci01688x)
    EditText mp02ci01688x;

    @BindView(R.id.fldGrpmp02ci002)
    LinearLayout fldGrpmp02ci002;
    @BindView(R.id.fldGrpmp02ci006)
    LinearLayout fldGrpmp02ci006;
    @BindView(R.id.fldGrpmp02ci010)
    LinearLayout fldGrpmp02ci010;
    @BindView(R.id.fldGrpmp02ci014)
    LinearLayout fldGrpmp02ci014;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_ch);
        ButterKnife.bind(this);

        mp02ci00101.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    fldGrpmp02ci002.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02ci002.setVisibility(View.GONE);
                    mp02ci002.clearCheck();
                    mp02ci00301.setText(null);
                    mp02ci00302.setText(null);
                    mp02ci004.clearCheck();
                    mp02ci00488x.setText(null);
                }
            }
        });

        mp02ci00501.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    fldGrpmp02ci006.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02ci006.setVisibility(View.GONE);
                    mp02ci006.clearCheck();
                    mp02ci00701.setText(null);
                    mp02ci00702.setText(null);
                    mp02ci008.clearCheck();
                    mp02ci00888x.setText(null);
                }
            }
        });

        mp02ci00901.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    fldGrpmp02ci010.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02ci010.setVisibility(View.GONE);
                    mp02ci010.clearCheck();
                    mp02ci01101.setText(null);
                    mp02ci01102.setText(null);
                    mp02ci012.clearCheck();
                    mp02ci01288x.setText(null);
                }
            }
        });

        mp02ci01301.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    fldGrpmp02ci014.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02ci014.setVisibility(View.GONE);
                    mp02ci014.clearCheck();
                    mp02ci01501.setText(null);
                    mp02ci01502.setText(null);
                    mp02ci016.clearCheck();
                    mp02ci01688x.setText(null);
                }
            }
        });

//        4
        mp02ci00488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mp02ci00488x.setVisibility(View.VISIBLE);
                } else {
                    mp02ci00488x.setVisibility(View.GONE);
                    mp02ci00488x.setText(null);
                }
            }
        });

//        8
        mp02ci00888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mp02ci00888x.setVisibility(View.VISIBLE);
                } else {
                    mp02ci00888x.setVisibility(View.GONE);
                    mp02ci00888x.setText(null);
                }
            }
        });

//        12
        mp02ci01288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mp02ci01288x.setVisibility(View.VISIBLE);
                } else {
                    mp02ci01288x.setVisibility(View.GONE);
                    mp02ci01288x.setText(null);
                }
            }
        });

//        16
        mp02ci01688.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mp02ci01688x.setVisibility(View.VISIBLE);
                } else {
                    mp02ci01688x.setVisibility(View.GONE);
                    mp02ci01688x.setText(null);
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
                Intent seccha = new Intent(this, SectionCHAActivity.class);
                startActivity(seccha);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updatech();

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
        if (mp02ci001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci001), Toast.LENGTH_SHORT).show();
            mp02ci00102.setError("This data is Required!");

            Log.i(TAG, "mp02ci001: This data is Required!");
            return false;
        } else {
            mp02ci00102.setError(null);
        }

//        Skip
        if (mp02ci00101.isChecked()) {

//            2
            if (mp02ci002.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci002), Toast.LENGTH_SHORT).show();
                mp02ci00205.setError("This data is Required!");

                Log.i(TAG, "mp02ci002: This data is Required!");
                return false;
            } else {
                mp02ci00205.setError(null);
            }

//            3
            if (mp02ci00301.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci003m), Toast.LENGTH_SHORT).show();
                mp02ci00301.setError("This data is Required!");

                Log.i(TAG, "mp02ci00301: This data is Required!");
                return false;
            } else {
                mp02ci00301.setError(null);
            }
            /*if (Integer.parseInt(mp02ci00301.getText().toString()) < 1 || Integer.parseInt(mp02ci00301.getText().toString()) > 11) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ci003m), Toast.LENGTH_SHORT).show();
                mp02ci00301.setError("Invalid:Month range 1 - 11");
                return false;
            } else {
                mp02ci00301.setError(null);
            }*/

            if (mp02ci00302.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci003d), Toast.LENGTH_SHORT).show();
                mp02ci00302.setError("This data is Required!");

                Log.i(TAG, "mp02ci00302: This data is Required!");
                return false;
            } else {
                mp02ci00302.setError(null);
            }


            if ((Integer.parseInt(mp02ci00301.getText().toString()) < 1 || Integer.parseInt(mp02ci00301.getText().toString()) > 11)
                    && (Integer.parseInt(mp02ci00302.getText().toString()) < 1 || Integer.parseInt(mp02ci00302.getText().toString()) > 29)) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ci003), Toast.LENGTH_SHORT).show();
                mp02ci00301.setError("Invalid:Month range 1 - 11");
                mp02ci00302.setError("Invalid:Days range 1 - 29");

                Log.i(TAG, "mp02ci00301: Invalid: Month range 1-11");
                return false;
            } else {
                mp02ci00301.setError(null);
                mp02ci00302.setError(null);
            }


//            4
            if (mp02ci004.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci004), Toast.LENGTH_SHORT).show();
                mp02ci00488.setError("This data is Required!");

                Log.i(TAG, "mp02ci004: This data is Required!");
                return false;
            } else {
                mp02ci00488.setError(null);
            }

            if (mp02ci00488.isChecked() && mp02ci00488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci004), Toast.LENGTH_SHORT).show();
                mp02ci00488x.setError("This data is Required!");

                Log.i(TAG, "mp02ci00488x: This data is Required!");
                return false;
            } else {
                mp02ci00488x.setError(null);
            }
        }

//        5
        if (mp02ci005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci005), Toast.LENGTH_SHORT).show();
            mp02ci00599.setError("This data is Required!");

            Log.i(TAG, "mp02ci005: This data is Required!");
            return false;
        } else {
            mp02ci00599.setError(null);
        }

//        Skip
        if (mp02ci00501.isChecked()) {

//            6
            if (mp02ci006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci006), Toast.LENGTH_SHORT).show();
                mp02ci00605.setError("This data is Required!");

                Log.i(TAG, "mp02ci006: This data is Required!");
                return false;
            } else {
                mp02ci00605.setError(null);
            }

//            7
            if (mp02ci00701.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci007m), Toast.LENGTH_SHORT).show();
                mp02ci00701.setError("This data is Required!");

                Log.i(TAG, "mp02ci007: This data is Required!");
                return false;
            } else {
                mp02ci00701.setError(null);
            }
            /*if (Integer.parseInt(mp02ci00701.getText().toString()) < 0 || Integer.parseInt(mp02ci00701.getText().toString()) > 11) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ci007m), Toast.LENGTH_SHORT).show();
                mp02ci00701.setError("Invalid:Month range 0 - 11");
                return false;
            } else {
                mp02ci00701.setError(null);
            }*/

            if (mp02ci00702.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci007d), Toast.LENGTH_SHORT).show();
                mp02ci00702.setError("This data is Required!");

                Log.i(TAG, "mp02ci00702: This data is Required!");
                return false;
            } else {
                mp02ci00702.setError(null);
            }
            /*if (Integer.parseInt(mp02ci00702.getText().toString()) < 0 || Integer.parseInt(mp02ci00702.getText().toString()) > 29) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ci007d), Toast.LENGTH_SHORT).show();
                mp02ci00702.setError("Invalid:Month range 0 - 29");
                return false;
            } else {
                mp02ci00702.setError(null);
            }*/

            if ((Integer.parseInt(mp02ci00701.getText().toString()) < 1 || Integer.parseInt(mp02ci00701.getText().toString()) > 11)
                    && (Integer.parseInt(mp02ci00702.getText().toString()) < 1 || Integer.parseInt(mp02ci00702.getText().toString()) > 29)) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ci007), Toast.LENGTH_SHORT).show();
                mp02ci00701.setError("Invalid:Month range 1 - 11");
                mp02ci00702.setError("Invalid:Days range 1 - 29");

                Log.i(TAG, "mp02ci00701: Month Range 1 - 11");
                return false;
            } else {
                mp02ci00701.setError(null);
                mp02ci00702.setError(null);
            }


//            8
            if (mp02ci008.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci008), Toast.LENGTH_SHORT).show();
                mp02ci00888.setError("This data is Required!");

                Log.i(TAG, "mp02ci008: This data is Required!");
                return false;
            } else {
                mp02ci00888.setError(null);
            }

            if (mp02ci00888.isChecked() && mp02ci00888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci008), Toast.LENGTH_SHORT).show();
                mp02ci00888x.setError("This data is Required!");

                Log.i(TAG, "mp02ci00888x: This data is Required!");
                return false;
            } else {
                mp02ci00888x.setError(null);
            }
        }

//        9
        if (mp02ci009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci009), Toast.LENGTH_SHORT).show();
            mp02ci00902.setError("This data is Required!");

            Log.i(TAG, "mp02ci009: This data is Required!");
            return false;
        } else {
            mp02ci00902.setError(null);
        }

//        Skip
        if (mp02ci00901.isChecked()) {

//            10
            if (mp02ci010.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci010), Toast.LENGTH_SHORT).show();
                mp02ci01005.setError("This data is Required!");

                Log.i(TAG, "mp02ci010: This data is Required!");
                return false;
            } else {
                mp02ci01005.setError(null);
            }

//        11
            if (mp02ci01101.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci011m), Toast.LENGTH_SHORT).show();
                mp02ci01101.setError("This data is Required!");

                Log.i(TAG, "mp02ci01101: This data is Required!");
                return false;
            } else {
                mp02ci01101.setError(null);
            }
            /*if (Integer.parseInt(mp02ci01101.getText().toString()) < 0 || Integer.parseInt(mp02ci01101.getText().toString()) > 11) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ci011m), Toast.LENGTH_SHORT).show();
                mp02ci01101.setError("Invalid:Month range 0 - 11");
                return false;
            } else {
                mp02ci01101.setError(null);
            }*/

            if (mp02ci01102.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci011d), Toast.LENGTH_SHORT).show();
                mp02ci01102.setError("This data is Required!");

                Log.i(TAG, "mp02ci01102: This data is Required!");
                return false;
            } else {
                mp02ci01102.setError(null);
            }
            /*if (Integer.parseInt(mp02ci01102.getText().toString()) < 0 || Integer.parseInt(mp02ci01102.getText().toString()) > 29) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ci011d), Toast.LENGTH_SHORT).show();
                mp02ci01102.setError("Invalid:Month range 0 - 29");
                return false;
            } else {
                mp02ci01102.setError(null);
            }*/

            if ((Integer.parseInt(mp02ci01101.getText().toString()) < 1 || Integer.parseInt(mp02ci01101.getText().toString()) > 11)
                    && (Integer.parseInt(mp02ci01102.getText().toString()) < 1 || Integer.parseInt(mp02ci01102.getText().toString()) > 29)) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ci011), Toast.LENGTH_SHORT).show();
                mp02ci01101.setError("Invalid:Month range 1 - 11");
                mp02ci01102.setError("Invalid:Days range 1 - 29");

                Log.i(TAG, "mp02ci01101: Month Range 1 - 11");
                return false;
            } else {
                mp02ci01101.setError(null);
                mp02ci01102.setError(null);
            }


//            12
            if (mp02ci012.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci012), Toast.LENGTH_SHORT).show();
                mp02ci01288.setError("This data is Required!");

                Log.i(TAG, "mp02ci012: This data is Required!");
                return false;
            } else {
                mp02ci01288.setError(null);
            }

            if (mp02ci01288.isChecked() && mp02ci01288x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci012), Toast.LENGTH_SHORT).show();
                mp02ci01288x.setError("This data is Required!");

                Log.i(TAG, "mp02ci01288x: This data is Required!");
                return false;
            } else {
                mp02ci01288x.setError(null);
            }
        }

//        13
        if (mp02ci013.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci013), Toast.LENGTH_SHORT).show();
            mp02ci01399.setError("This data is Required!");

            Log.i(TAG, "mp02ci013: This data is Required!");
            return false;
        } else {
            mp02ci01399.setError(null);
        }

//        Skip
        if (mp02ci01301.isChecked()) {

//            14
            if (mp02ci014.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci014), Toast.LENGTH_SHORT).show();
                mp02ci01405.setError("This data is Required!");

                Log.i(TAG, "mp02ci014: This data is Required!");
                return false;
            } else {
                mp02ci01405.setError(null);
            }

//        15
            if (mp02ci01501.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci015m), Toast.LENGTH_SHORT).show();
                mp02ci01501.setError("This data is Required!");

                Log.i(TAG, "mp02ci01501: This data is Required!");
                return false;
            } else {
                mp02ci01501.setError(null);
            }
            /*if (Integer.parseInt(mp02ci01501.getText().toString()) < 0 || Integer.parseInt(mp02ci01501.getText().toString()) > 11) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ci015m), Toast.LENGTH_SHORT).show();
                mp02ci01501.setError("Invalid:Month range 0 - 11");
                return false;
            } else {
                mp02ci01501.setError(null);
            }*/

            if (mp02ci01502.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci015d), Toast.LENGTH_SHORT).show();
                mp02ci01502.setError("This data is Required!");

                Log.i(TAG, "mp02ci01502: This data is Required!");
                return false;
            } else {
                mp02ci01502.setError(null);
            }
            /*if (Integer.parseInt(mp02ci01502.getText().toString()) < 0 || Integer.parseInt(mp02ci01502.getText().toString()) > 29) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ci015d), Toast.LENGTH_SHORT).show();
                mp02ci01502.setError("Invalid:Month range 0 - 29");
                return false;
            } else {
                mp02ci01502.setError(null);
            }*/

            if ((Integer.parseInt(mp02ci01501.getText().toString()) < 1 || Integer.parseInt(mp02ci01501.getText().toString()) > 11)
                    && (Integer.parseInt(mp02ci01502.getText().toString()) < 1 || Integer.parseInt(mp02ci01502.getText().toString()) > 29)) {
                Toast.makeText(this, "Invalid:" + getString(R.string.mp02ci015), Toast.LENGTH_SHORT).show();
                mp02ci01501.setError("Invalid:Month range 1 - 11");
                mp02ci01502.setError("Invalid:Days range 1 - 29");

                Log.i(TAG, "mp02ci01501: Month Range 1 - 11");
                return false;
            } else {
                mp02ci01501.setError(null);
                mp02ci01502.setError(null);
            }


//            16
            if (mp02ci016.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci016), Toast.LENGTH_SHORT).show();
                mp02ci01688.setError("This data is Required!");

                Log.i(TAG, "mp02ci016: This data is Required!");
                return false;
            } else {
                mp02ci01688.setError(null);
            }

            if (mp02ci01688.isChecked() && mp02ci01688x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ci016), Toast.LENGTH_SHORT).show();
                mp02ci01688x.setError("This data is Required!");

                Log.i(TAG, "mp02ci01688x: This data is Required!");
                return false;
            } else {
                mp02ci01688x.setError(null);
            }
        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sch = new JSONObject();

        sch.put("mp02ci001", mp02ci00101.isChecked() ? "1" : mp02ci00102.isChecked() ? "2" : "0");

        sch.put("mp02ci002", mp02ci00201.isChecked() ? "1" : mp02ci00202.isChecked() ? "2" : mp02ci00203.isChecked() ? "3"
                : mp02ci00204.isChecked() ? "4" : mp02ci00205.isChecked() ? "5" : "0");

        sch.put("mp02ci00301", mp02ci00301.getText().toString());
        sch.put("mp02ci00302", mp02ci00302.getText().toString());

        sch.put("mp02ci004", mp02ci00401.isChecked() ? "1" : mp02ci00402.isChecked() ? "2" : mp02ci00403.isChecked() ? "3"
                : mp02ci00404.isChecked() ? "4" : mp02ci00488.isChecked() ? "88" : "0");
        sch.put("mp02ci004", mp02ci00488x.getText().toString());

        sch.put("mp02ci005", mp02ci00501.isChecked() ? "1" : mp02ci00502.isChecked() ? "2" : mp02ci00503.isChecked() ? "3"
                : mp02ci00504.isChecked() ? "4" : mp02ci00599.isChecked() ? "99" : "0");

        sch.put("mp02ci006", mp02ci00601.isChecked() ? "1" : mp02ci00602.isChecked() ? "2" : mp02ci00603.isChecked() ? "3"
                : mp02ci00604.isChecked() ? "4" : mp02ci00605.isChecked() ? "5" : "0");

        sch.put("mp02ci00701", mp02ci00701.getText().toString());
        sch.put("mp02ci00702", mp02ci00702.getText().toString());

        sch.put("mp02ci008", mp02ci00801.isChecked() ? "1" : mp02ci00802.isChecked() ? "2" : mp02ci00803.isChecked() ? "3"
                : mp02ci00804.isChecked() ? "4" : mp02ci00888.isChecked() ? "88" : "0");
        sch.put("mp02ci008", mp02ci00888x.getText().toString());

        sch.put("mp02ci009", mp02ci00901.isChecked() ? "1" : mp02ci00902.isChecked() ? "2" : "0");

        sch.put("mp02ci010", mp02ci01001.isChecked() ? "1" : mp02ci01002.isChecked() ? "2" : mp02ci01003.isChecked() ? "3"
                : mp02ci01004.isChecked() ? "4" : mp02ci01005.isChecked() ? "5" : "0");

        sch.put("mp02ci01101", mp02ci01101.getText().toString());
        sch.put("mp02ci01102", mp02ci01102.getText().toString());

        sch.put("mp02ci012", mp02ci01201.isChecked() ? "1" : mp02ci01202.isChecked() ? "2" : mp02ci01203.isChecked() ? "3"
                : mp02ci01204.isChecked() ? "4" : mp02ci01288.isChecked() ? "88" : "0");
        sch.put("mp02ci012", mp02ci01288x.getText().toString());

        sch.put("mp02ci013", mp02ci01301.isChecked() ? "1" : mp02ci01302.isChecked() ? "2" : mp02ci01303.isChecked() ? "3"
                : mp02ci01304.isChecked() ? "4" : mp02ci01399.isChecked() ? "99" : "0");

        sch.put("mp02ci014", mp02ci01401.isChecked() ? "1" : mp02ci01402.isChecked() ? "2" : mp02ci01403.isChecked() ? "3"
                : mp02ci01404.isChecked() ? "4" : mp02ci01405.isChecked() ? "5" : "0");

        sch.put("mp02ci01501", mp02ci01501.getText().toString());
        sch.put("mp02ci01502", mp02ci01502.getText().toString());

        sch.put("mp02ci016", mp02ci01601.isChecked() ? "1" : mp02ci01602.isChecked() ? "2" : mp02ci01603.isChecked() ? "3"
                : mp02ci01604.isChecked() ? "4" : mp02ci01688.isChecked() ? "88" : "0");
        sch.put("mp02ci016", mp02ci01688x.getText().toString());

        //AppMain.pc.setsCG(String.valueOf(sch));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
