package edu.aku.hassannaqvi.mapps_form2.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
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
import edu.aku.hassannaqvi.mapps_form2.AppMain;
import edu.aku.hassannaqvi.mapps_form2.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form2.R;

public class SectionBAActivity extends Activity {

    private static final String TAG = SectionBAActivity.class.getSimpleName();

    @BindView(R.id.activity_section_ba)
    RelativeLayout activitySectionBa;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02ba001)
    EditText mp02ba001;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.mp02ba002)
    RadioGroup mp02ba002;
    @BindView(R.id.mp02ba00201)
    RadioButton mp02ba00201;
    @BindView(R.id.mp02ba00202)
    RadioButton mp02ba00202;
    @BindView(R.id.mp02ba00288)
    RadioButton mp02ba00288;
    @BindView(R.id.mp02ba00299)
    RadioButton mp02ba00299;
    @BindView(R.id.mp02ba00288x)
    EditText mp02ba00288x;
    @BindView(R.id.mp02ba003)
    RadioGroup mp02ba003;
    @BindView(R.id.mp02ba00301)
    RadioButton mp02ba00301;
    @BindView(R.id.mp02ba00302)
    RadioButton mp02ba00302;
    @BindView(R.id.mp02ba00303)
    RadioButton mp02ba00303;
    @BindView(R.id.mp02ba00304)
    RadioButton mp02ba00304;
    @BindView(R.id.mp02ba00305)
    RadioButton mp02ba00305;
    @BindView(R.id.mp02ba00306)
    RadioButton mp02ba00306;
    @BindView(R.id.mp02ba00307)
    RadioButton mp02ba00307;
    @BindView(R.id.mp02ba00308)
    RadioButton mp02ba00308;
    @BindView(R.id.mp02ba00309)
    RadioButton mp02ba00309;
    @BindView(R.id.mp02ba00310)
    RadioButton mp02ba00310;
    @BindView(R.id.mp02ba00311)
    RadioButton mp02ba00311;
    @BindView(R.id.mp02ba00312)
    RadioButton mp02ba00312;
    @BindView(R.id.mp02ba00388)
    RadioButton mp02ba00388;
    @BindView(R.id.mp02ba00388x)
    EditText mp02ba00388x;
    @BindView(R.id.mp02ba004)
    RadioGroup mp02ba004;
    @BindView(R.id.mp02ba00401)
    RadioButton mp02ba00401;
    @BindView(R.id.mp02ba00402)
    RadioButton mp02ba00402;
    @BindView(R.id.mp02ba00403)
    RadioButton mp02ba00403;
    @BindView(R.id.mp02ba00404)
    RadioButton mp02ba00404;
    @BindView(R.id.mp02ba00405)
    RadioButton mp02ba00405;
    @BindView(R.id.mp02ba00406)
    RadioButton mp02ba00406;
    @BindView(R.id.mp02ba00407)
    RadioButton mp02ba00407;
    @BindView(R.id.mp02ba00408)
    RadioButton mp02ba00408;
    @BindView(R.id.mp02ba00409)
    RadioButton mp02ba00409;
    @BindView(R.id.mp02ba00410)
    RadioButton mp02ba00410;
    @BindView(R.id.mp02ba00411)
    RadioButton mp02ba00411;
    @BindView(R.id.mp02ba00412)
    RadioButton mp02ba00412;
    @BindView(R.id.mp02ba00413)
    RadioButton mp02ba00413;
    @BindView(R.id.mp02ba00488)
    RadioButton mp02ba00488;
    @BindView(R.id.mp02ba00488x)
    EditText mp02ba00488x;
    @BindView(R.id.mp02ba005)
    RadioGroup mp02ba005;
    @BindView(R.id.mp02ba00501)
    RadioButton mp02ba00501;
    @BindView(R.id.mp02ba00502)
    RadioButton mp02ba00502;
    @BindView(R.id.mp02ba00503)
    RadioButton mp02ba00503;
    @BindView(R.id.mp02ba00504)
    RadioButton mp02ba00504;
    @BindView(R.id.mp02ba00505)
    RadioButton mp02ba00505;
    @BindView(R.id.mp02ba00506)
    RadioButton mp02ba00506;
    @BindView(R.id.mp02ba00507)
    RadioButton mp02ba00507;
    @BindView(R.id.mp02ba00508)
    RadioButton mp02ba00508;
    @BindView(R.id.mp02ba00509)
    RadioButton mp02ba00509;
    @BindView(R.id.mp02ba00510)
    RadioButton mp02ba00510;
    @BindView(R.id.mp02ba00511)
    RadioButton mp02ba00511;
    @BindView(R.id.mp02ba00512)
    RadioButton mp02ba00512;
    @BindView(R.id.mp02ba00513)
    RadioButton mp02ba00513;
    @BindView(R.id.mp02ba00514)
    RadioButton mp02ba00514;
    @BindView(R.id.mp02ba00515)
    RadioButton mp02ba00515;
    @BindView(R.id.mp02ba00516)
    RadioButton mp02ba00516;
    @BindView(R.id.mp02ba00517)
    RadioButton mp02ba00517;
    @BindView(R.id.mp02ba00518)
    RadioButton mp02ba00518;
    @BindView(R.id.mp02ba00519)
    RadioButton mp02ba00519;
    @BindView(R.id.mp02ba00520)
    RadioButton mp02ba00520;
    @BindView(R.id.mp02ba00521)
    RadioButton mp02ba00521;
    @BindView(R.id.mp02ba00588)
    RadioButton mp02ba00588;
    @BindView(R.id.mp02ba00588x)
    EditText mp02ba00588x;
    @BindView(R.id.mp02ba006)
    EditText mp02ba006;
    @BindView(R.id.mp02ba007)
    RadioGroup mp02ba007;
    @BindView(R.id.mp02ba00701)
    RadioButton mp02ba00701;
    @BindView(R.id.mp02ba00702)
    RadioButton mp02ba00702;
    @BindView(R.id.mp02ba00703)
    RadioButton mp02ba00703;
    @BindView(R.id.mp02ba00704)
    RadioButton mp02ba00704;
    @BindView(R.id.mp02ba00705)
    RadioButton mp02ba00705;
    @BindView(R.id.mp02ba00706)
    RadioButton mp02ba00706;
    @BindView(R.id.mp02ba00707)
    RadioButton mp02ba00707;
    @BindView(R.id.mp02ba00708)
    RadioButton mp02ba00708;
    @BindView(R.id.mp02ba00709)
    RadioButton mp02ba00709;
    @BindView(R.id.mp02ba00710)
    RadioButton mp02ba00710;
    @BindView(R.id.mp02ba00711)
    RadioButton mp02ba00711;
    @BindView(R.id.mp02ba00788)
    RadioButton mp02ba00788;
    @BindView(R.id.mp02ba00788x)
    EditText mp02ba00788x;
    @BindView(R.id.mp02ba008)
    RadioGroup mp02ba008;
    @BindView(R.id.mp02ba00801)
    RadioButton mp02ba00801;
    @BindView(R.id.mp02ba00802)
    RadioButton mp02ba00802;
    @BindView(R.id.mp02ba00803)
    RadioButton mp02ba00803;
    @BindView(R.id.mp02ba00804)
    RadioButton mp02ba00804;
    @BindView(R.id.mp02ba00805)
    RadioButton mp02ba00805;
    @BindView(R.id.mp02ba00806)
    RadioButton mp02ba00806;
    @BindView(R.id.mp02ba00807)
    RadioButton mp02ba00807;
    @BindView(R.id.mp02ba00888)
    RadioButton mp02ba00888;
    @BindView(R.id.mp02ba00888x)
    EditText mp02ba00888x;
    @BindView(R.id.mp02ba009)
    RadioGroup mp02ba009;
    @BindView(R.id.mp02ba00901)
    RadioButton mp02ba00901;
    @BindView(R.id.mp02ba00902)
    RadioButton mp02ba00902;
    @BindView(R.id.mp02ba00903)
    RadioButton mp02ba00903;
    @BindView(R.id.mp02ba00904)
    RadioButton mp02ba00904;
    @BindView(R.id.mp02ba00905)
    RadioButton mp02ba00905;
    @BindView(R.id.mp02ba00988)
    RadioButton mp02ba00988;
    @BindView(R.id.mp02ba00988x)
    EditText mp02ba00988x;
    @BindView(R.id.mp02ba010)
    RadioGroup mp02ba010;
    @BindView(R.id.mp02ba01001)
    RadioButton mp02ba01001;
    @BindView(R.id.mp02ba01002)
    RadioButton mp02ba01002;
    @BindView(R.id.mp02ba011)
    EditText mp02ba011;
    @BindView(R.id.mp02ba012)
    RadioGroup mp02ba012;
    @BindView(R.id.mp02ba01201)
    RadioButton mp02ba01201;
    @BindView(R.id.mp02ba01202)
    RadioButton mp02ba01202;
    @BindView(R.id.mp02ba01203)
    RadioButton mp02ba01203;
    @BindView(R.id.mp02ba01204)
    RadioButton mp02ba01204;
    @BindView(R.id.mp02ba01288)
    RadioButton mp02ba01288;
    @BindView(R.id.mp02ba01288x)
    EditText mp02ba01288x;
    @BindView(R.id.mp02ba01301)
    CheckBox mp02ba01301;
    @BindView(R.id.mp02ba01302)
    CheckBox mp02ba01302;
    @BindView(R.id.mp02ba01303)
    CheckBox mp02ba01303;
    @BindView(R.id.mp02ba01304)
    CheckBox mp02ba01304;
    @BindView(R.id.mp02ba01305)
    CheckBox mp02ba01305;
    @BindView(R.id.mp02ba01306)
    CheckBox mp02ba01306;
    @BindView(R.id.mp02ba01307)
    CheckBox mp02ba01307;
    @BindView(R.id.mp02ba01308)
    CheckBox mp02ba01308;
    @BindView(R.id.mp02ba01309)
    CheckBox mp02ba01309;
    @BindView(R.id.mp02ba01310)
    CheckBox mp02ba01310;
    @BindView(R.id.mp02ba01311)
    CheckBox mp02ba01311;
    @BindView(R.id.mp02ba01312)
    CheckBox mp02ba01312;
    @BindView(R.id.mp02ba01313)
    CheckBox mp02ba01313;
    @BindView(R.id.mp02ba01314)
    CheckBox mp02ba01314;
    @BindView(R.id.mp02ba01315)
    CheckBox mp02ba01315;
    @BindView(R.id.mp02ba01316)
    CheckBox mp02ba01316;
    @BindView(R.id.mp02ba01317)
    CheckBox mp02ba01317;
    @BindView(R.id.mp02ba01318)
    CheckBox mp02ba01318;
    @BindView(R.id.mp02ba014)
    RadioGroup mp02ba014;
    @BindView(R.id.mp02ba01401)
    RadioButton mp02ba01401;
    @BindView(R.id.mp02ba01402)
    RadioButton mp02ba01402;
    @BindView(R.id.mp02ba01403)
    RadioButton mp02ba01403;
    @BindView(R.id.mp02ba01404)
    RadioButton mp02ba01404;
    @BindView(R.id.mp02ba01405)
    RadioButton mp02ba01405;
    @BindView(R.id.mp02ba01406)
    RadioButton mp02ba01406;
    @BindView(R.id.mp02ba01407)
    RadioButton mp02ba01407;
    @BindView(R.id.mp02ba01408)
    RadioButton mp02ba01408;
    @BindView(R.id.mp02ba01409)
    RadioButton mp02ba01409;
    @BindView(R.id.mp02ba01410)
    RadioButton mp02ba01410;
    @BindView(R.id.mp02ba01488)
    RadioButton mp02ba01488;
    @BindView(R.id.mp02ba01488x)
    EditText mp02ba01488x;
    @BindView(R.id.mp02ba015)
    RadioGroup mp02ba015;
    @BindView(R.id.mp02ba01501)
    RadioButton mp02ba01501;
    @BindView(R.id.mp02ba01502)
    RadioButton mp02ba01502;
    @BindView(R.id.mp02ba01503)
    RadioButton mp02ba01503;
    @BindView(R.id.mp02ba01588)
    RadioButton mp02ba01588;
    @BindView(R.id.mp02ba01588x)
    EditText mp02ba01588x;
    @BindView(R.id.mp02ba01601)
    CheckBox mp02ba01601;
    @BindView(R.id.mp02ba01602)
    CheckBox mp02ba01602;
    @BindView(R.id.mp02ba01603)
    CheckBox mp02ba01603;
    @BindView(R.id.mp02ba01604)
    CheckBox mp02ba01604;
    @BindView(R.id.mp02ba01605)
    CheckBox mp02ba01605;
    @BindView(R.id.mp02ba01606)
    CheckBox mp02ba01606;
    @BindView(R.id.mp02ba01607)
    CheckBox mp02ba01607;
    @BindView(R.id.mp02ba01608)
    CheckBox mp02ba01608;
    @BindView(R.id.mp02ba01609)
    CheckBox mp02ba01609;
    @BindView(R.id.mp02ba017)
    RadioGroup mp02ba017;
    @BindView(R.id.mp02ba01701)
    RadioButton mp02ba01701;
    @BindView(R.id.mp02ba01702)
    RadioButton mp02ba01702;
    @BindView(R.id.mp02ba018)
    RadioGroup mp02ba018;
    @BindView(R.id.mp02ba01801)
    RadioButton mp02ba01801;
    @BindView(R.id.mp02ba01802)
    RadioButton mp02ba01802;
    @BindView(R.id.mp02ba01901)
    CheckBox mp02ba01901;
    @BindView(R.id.mp02ba01902)
    CheckBox mp02ba01902;
    @BindView(R.id.mp02ba01903)
    CheckBox mp02ba01903;
    @BindView(R.id.mp02ba01904)
    CheckBox mp02ba01904;
    @BindView(R.id.mp02ba01905)
    CheckBox mp02ba01905;
    @BindView(R.id.mp02ba01906)
    CheckBox mp02ba01906;
    @BindView(R.id.mp02ba01907)
    CheckBox mp02ba01907;
    @BindView(R.id.mp02ba020)
    RadioGroup mp02ba020;
    @BindView(R.id.mp02ba02001)
    RadioButton mp02ba02001;
    @BindView(R.id.mp02ba02002)
    RadioButton mp02ba02002;
    @BindView(R.id.mp02ba02003)
    RadioButton mp02ba02003;
    @BindView(R.id.mp02ba02004)
    RadioButton mp02ba02004;
    @BindView(R.id.mp02ba02005)
    RadioButton mp02ba02005;
    @BindView(R.id.mp02ba02006)
    RadioButton mp02ba02006;
    @BindView(R.id.mp02ba02088)
    RadioButton mp02ba02088;
    @BindView(R.id.mp02ba02088x)
    EditText mp02ba02088x;

    @BindView(R.id.fldGrpmp02ba010)
    LinearLayout fldGrpmp02ba010;
    @BindView(R.id.fldGrpmp02ba011)
    LinearLayout fldGrpmp02ba011;
    @BindView(R.id.fldGrpmp02ba019)
    LinearLayout fldGrpmp02ba019;

    String data = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_ba);
        ButterKnife.bind(this);


        mp02ba01002.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    fldGrpmp02ba011.setVisibility(View.GONE);
                    mp02ba011.setText(null);
                }else {
                    fldGrpmp02ba011.setVisibility(View.VISIBLE);
                }
            }
        });

        mp02ba01802.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    fldGrpmp02ba019.setVisibility(View.GONE);
                    mp02ba01901.setChecked(false);
                    mp02ba01902.setChecked(false);
                    mp02ba01903.setChecked(false);
                    mp02ba01904.setChecked(false);
                    mp02ba01905.setChecked(false);
                    mp02ba01906.setChecked(false);
                    mp02ba01907.setChecked(false);
                }else {
                    fldGrpmp02ba019.setVisibility(View.VISIBLE);
                }
            }
        });


        mp02ba00288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ba00288x.setVisibility(View.VISIBLE);
                }else {
                    mp02ba00288x.setVisibility(View.GONE);
                    mp02ba00288x.setText(null);

                }
            }
        });

        mp02ba00388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ba00388x.setVisibility(View.VISIBLE);
                }else {
                    mp02ba00388x.setVisibility(View.GONE);
                    mp02ba00388x.setText(null);

                }
            }
        });

        mp02ba00488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ba00488x.setVisibility(View.VISIBLE);
                }else {
                    mp02ba00488x.setVisibility(View.GONE);
                    mp02ba00488x.setText(null);

                }
            }
        });

        mp02ba00588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ba00588x.setVisibility(View.VISIBLE);
                }else {
                    mp02ba00588x.setVisibility(View.GONE);
                    mp02ba00588x.setText(null);

                }
            }
        });

        mp02ba00788.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ba00788x.setVisibility(View.VISIBLE);
                }else {
                    mp02ba00788x.setVisibility(View.GONE);
                    mp02ba00788x.setText(null);

                }
            }
        });

        mp02ba00888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ba00888x.setVisibility(View.VISIBLE);
                }else {
                    mp02ba00888x.setVisibility(View.GONE);
                    mp02ba00888x.setText(null);

                }
            }
        });

        mp02ba00905.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    fldGrpmp02ba010.setVisibility(View.GONE);
                    mp02ba010.clearCheck();
                    mp02ba011.setText(null);
                }else {
                    fldGrpmp02ba010.setVisibility(View.VISIBLE);
                }
            }
        });

        mp02ba00988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ba00988x.setVisibility(View.VISIBLE);
                }else {
                    mp02ba00988x.setVisibility(View.GONE);
                    mp02ba00988x.setText(null);

                }
            }
        });

        mp02ba01288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ba01288x.setVisibility(View.VISIBLE);
                }else {
                    mp02ba01288x.setVisibility(View.GONE);
                    mp02ba01288x.setText(null);

                }
            }
        });

        mp02ba01488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ba01488x.setVisibility(View.VISIBLE);
                }else {
                    mp02ba01488x.setVisibility(View.GONE);
                    mp02ba01488x.setText(null);

                }
            }
        });

        mp02ba01588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ba01588x.setVisibility(View.VISIBLE);
                }else {
                    mp02ba01588x.setVisibility(View.GONE);
                    mp02ba01588x.setText(null);

                }
            }
        });

        mp02ba02088.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ba02088x.setVisibility(View.VISIBLE);
                }else {
                    mp02ba02088x.setVisibility(View.GONE);
                    mp02ba02088x.setText(null);

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

                Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, EndingActivity.class);
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

                Intent secbb = new Intent(this, SectionBBActivity.class);
                startActivity(secbb);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }


    }

    public boolean ValidateForm() {

//        15


        if (mp02ba001.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba001), Toast.LENGTH_SHORT).show();
            mp02ba001.setError("This data is Required!");

            Log.i(TAG, "mp02ba001: This Data is Required!");
            return false;
        } else {
            mp02ba001.setError(null);
        }

        int eligible = 0;
        if (getIntent().hasExtra("data"))

            eligible = (getIntent().getExtras().getInt("data"));


        if ((Integer.parseInt(mp02ba001.getText().toString().isEmpty() ? "0" : mp02ba001.getText().toString()) < eligible)
                || Integer.parseInt(mp02ba001.getText().toString()) > 99) {
            Toast.makeText(this, "Invalid:" + getString(R.string.mp02ba001), Toast.LENGTH_SHORT).show();
            mp02ba001.setError("Invalid: Can not be less than eligible woman");

            Log.i(TAG, "mp02ba001: This Data is Required!");
            return false;
        } else {
            mp02ba001.setError(null);
        }

//        16

        if (mp02ba002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba002), Toast.LENGTH_SHORT).show();
            mp02ba00299.setError("This data is Required!");

            Log.i(TAG, "mp02ba002: This Data is Required!");
            return false;
        } else {
            mp02ba00299.setError(null);
        }

        if (mp02ba00288.isChecked() && mp02ba00288x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba001), Toast.LENGTH_SHORT).show();
            mp02ba00288x.setError("This data is Required!");

            Log.i(TAG, "mp02ba001: This Data is Required!");
            return false;
        } else {
            mp02ba00288x.setError(null);
        }


//        17

        if (mp02ba003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba003), Toast.LENGTH_SHORT).show();
            mp02ba00388.setError("This data is Required!");

            Log.i(TAG, "mp02ba003: This Data is Required!");
            return false;
        } else {
            mp02ba00388.setError(null);
        }

        if (mp02ba00388.isChecked() && mp02ba00388x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba003), Toast.LENGTH_SHORT).show();
            mp02ba00388x.setError("This data is Required!");

            Log.i(TAG, "mp02ba00388x: This Data is Required!");
            return false;
        } else {
            mp02ba00388x.setError(null);
        }

//        18

        if (mp02ba004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba004), Toast.LENGTH_SHORT).show();
            mp02ba00488.setError("This data is Required!");

            Log.i(TAG, "mp02ba004: This Data is Required!");
            return false;
        } else {
            mp02ba00488.setError(null);
        }

        if (mp02ba00488.isChecked() && mp02ba00488x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba004), Toast.LENGTH_SHORT).show();
            mp02ba00488x.setError("This data is Required!");

            Log.i(TAG, "mp02ba00488x: This Data is Required!");
            return false;
        } else {
            mp02ba00488x.setError(null);
        }

//        19

        if (mp02ba005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba005), Toast.LENGTH_SHORT).show();
            mp02ba00588.setError("This data is Required!");

            Log.i(TAG, "mp02ba005: This Data is Required!");
            return false;
        } else {
            mp02ba00588.setError(null);
        }

        if (mp02ba00588.isChecked() && mp02ba00588x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba005), Toast.LENGTH_SHORT).show();
            mp02ba00588x.setError("This data is Required!");

            Log.i(TAG, "mp02ba00588x: This Data is Required!");
            return false;
        } else {
            mp02ba00588x.setError(null);
        }

//        20
        if (mp02ba006.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba006), Toast.LENGTH_SHORT).show();
            mp02ba006.setError("This data is Required!");

            Log.i(TAG, "mp02ba006: This Data is Required!");
            return false;
        } else {
            mp02ba006.setError(null);
        }

        if (Integer.parseInt(mp02ba006.getText().toString()) < 1 || Integer.parseInt(mp02ba006.getText().toString()) > 20) {
            Toast.makeText(this, "Invalid" + getString(R.string.mp02ba006), Toast.LENGTH_SHORT).show();
            mp02ba006.setError("Invalid: Cant be less than 1");

            Log.i(TAG, "mp02ba006: Invalid: Cant be less than 1!");
            return false;
        } else {
            mp02ba006.setError(null);
        }

//        21
        if (mp02ba007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba007), Toast.LENGTH_SHORT).show();
            mp02ba00788.setError("This data is Required!");

            Log.i(TAG, "mp02ba007: This data is Required!");
            return false;
        } else {
            mp02ba00788.setError(null);
        }

        if (mp02ba00788.isChecked() && mp02ba00788x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba007), Toast.LENGTH_SHORT).show();
            mp02ba00788x.setError("This data is Required!");
            Log.i(TAG, "mp02ba00788x: This data is Required!");
            return false;
        } else {
            mp02ba00788x.setError(null);
        }

//       22
        if (mp02ba008.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba008), Toast.LENGTH_SHORT).show();
            mp02ba00888.setError("This data is Required!");

            Log.i(TAG, "mp02ba008: This data is Required!");

            return false;
        } else {
            mp02ba00888.setError(null);
        }

        if (mp02ba00888.isChecked() && mp02ba00888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba008), Toast.LENGTH_SHORT).show();
            mp02ba00888x.setError("This data is Required!");

            Log.i(TAG, "mp02ba00888x: This data is Required!");
            return false;
        } else {
            mp02ba00888x.setError(null);
        }

//        23
        if (mp02ba009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba009), Toast.LENGTH_SHORT).show();
            mp02ba00988.setError("This data is Required!");

            Log.i(TAG, "mp02ba009: This data is Required!");
            return false;
        } else {
            mp02ba00988.setError(null);
        }

        if (mp02ba00988.isChecked() && mp02ba00988x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba009), Toast.LENGTH_SHORT).show();
            mp02ba00988x.setError("This data is Required!");

            Log.i(TAG, "mp02ba00988x: This data is Required!");
            return false;
        } else {
            mp02ba00988x.setError(null);
        }

//        Skip
        if (!mp02ba00905.isChecked()) {
//        24
            if (mp02ba010.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba010), Toast.LENGTH_SHORT).show();
                mp02ba01002.setError("This data is Required!");

                Log.i(TAG, "mp02ba010: This data is Required!");
                return false;
            } else {
                mp02ba01002.setError(null);
            }

//        25
            if (mp02ba01001.isChecked()) {
                if (mp02ba011.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba011), Toast.LENGTH_SHORT).show();
                    mp02ba011.setError("This data is Required!");

                    Log.i(TAG, "mp02ba011: This data is Required!");
                    return false;
                } else {
                    mp02ba011.setError(null);
                }

                if (Integer.parseInt(mp02ba011.getText().toString()) < 1) {
                    Toast.makeText(this, "Invalid:" + getString(R.string.mp02ba011), Toast.LENGTH_SHORT).show();
                    mp02ba011.setError("Invalid: Greater than 0");

                    Log.i(TAG, "mp02ba011: Invalid: Greater than 0");
                    return false;
                } else {
                    mp02ba011.setError(null);
                }
            }
        }

//        26
        if (mp02ba012.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba012), Toast.LENGTH_SHORT).show();
            mp02ba01288.setError("This data is Required!");

            Log.i(TAG, "mp02ba012: This data is Required!");
            return false;
        } else {
            mp02ba01288.setError(null);
        }

        if (mp02ba01288.isChecked() && mp02ba01288x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba012), Toast.LENGTH_SHORT).show();
            mp02ba01288x.setError("This data is Required!");

            Log.i(TAG, "mp02ba01288x: This data is Required!");
            return false;
        } else {
            mp02ba01288x.setError(null);
        }

//        27
        if (!(mp02ba01301.isChecked() || mp02ba01302.isChecked() || mp02ba01303.isChecked() || mp02ba01304.isChecked()
                || mp02ba01305.isChecked() || mp02ba01306.isChecked() || mp02ba01306.isChecked() || mp02ba01307.isChecked()
                || mp02ba01308.isChecked() || mp02ba01309.isChecked() || mp02ba01310.isChecked() || mp02ba01311.isChecked() || mp02ba01312.isChecked()
                || mp02ba01313.isChecked() || mp02ba01314.isChecked() || mp02ba01315.isChecked() || mp02ba01316.isChecked()
                || mp02ba01317.isChecked() || mp02ba01318.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ba013), Toast.LENGTH_LONG).show();
            mp02ba01318.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02ba013: This data is Required!");
            return false;
        } else {
            mp02ba01318.setError(null);
        }

//        28
        if (mp02ba014.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba014), Toast.LENGTH_SHORT).show();
            mp02ba01488.setError("This data is Required!");

            Log.i(TAG, "mp02ba014: This data is Required!");
            return false;
        } else {
            mp02ba01488.setError(null);
        }

        if (mp02ba01488.isChecked() && mp02ba01488x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba014), Toast.LENGTH_SHORT).show();
            mp02ba01488x.setError("This data is Required!");

            Log.i(TAG, "mp02ba01488x: This data is Required!");
            return false;
        } else {
            mp02ba01488x.setError(null);
        }

//        29
        if (mp02ba015.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba015), Toast.LENGTH_SHORT).show();
            mp02ba01588.setError("This data is Required!");

            Log.i(TAG, "mp02ba015: This data is Required!");
            return false;
        } else {
            mp02ba01588.setError(null);
        }

        if (mp02ba01588.isChecked() && mp02ba01588x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba015), Toast.LENGTH_SHORT).show();
            mp02ba01588x.setError("This data is Required!");

            Log.i(TAG, "mp02ba01588x: This data is Required!");
            return false;
        } else {
            mp02ba01588x.setError(null);
        }

//        30
        if (!(mp02ba01601.isChecked() || mp02ba01602.isChecked() || mp02ba01603.isChecked() || mp02ba01604.isChecked()
                || mp02ba01605.isChecked() || mp02ba01606.isChecked() || mp02ba01606.isChecked() || mp02ba01607.isChecked()
                || mp02ba01608.isChecked() || mp02ba01609.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ba016), Toast.LENGTH_LONG).show();
            mp02ba01609.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02ba016: This data is Required!");
            return false;
        } else {
            mp02ba01609.setError(null);
        }

//        31
        if (mp02ba017.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba017), Toast.LENGTH_SHORT).show();
            mp02ba01702.setError("This data is Required!");

            Log.i(TAG, "mp02ba017: This data is Required!");
            return false;
        } else {
            mp02ba01702.setError(null);
        }

//        32
        if (mp02ba018.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba018), Toast.LENGTH_SHORT).show();
            mp02ba01802.setError("This data is Required!");

            Log.i(TAG, "mp02ba018: This data is Required!");
            return false;
        } else {
            mp02ba01802.setError(null);
        }

//        33
        if (mp02ba01801.isChecked()){
            if (!(mp02ba01901.isChecked() || mp02ba01902.isChecked() || mp02ba01903.isChecked() || mp02ba01904.isChecked()
                    || mp02ba01905.isChecked() || mp02ba01906.isChecked() || mp02ba01906.isChecked() || mp02ba01907.isChecked()
            )) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ba019), Toast.LENGTH_LONG).show();
                mp02ba01907.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02ba019: This data is Required!");
                return false;
            } else {
                mp02ba01907.setError(null);
            }
        }

//        34
        if (mp02ba020.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba020), Toast.LENGTH_SHORT).show();
            mp02ba02088.setError("This data is Required!");

            Log.i(TAG, "mp02ba020: This data is Required!");
            return false;
        } else {
            mp02ba02088.setError(null);
        }

        if (mp02ba02088.isChecked() && mp02ba02088x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ba020), Toast.LENGTH_SHORT).show();
            mp02ba02088x.setError("This data is Required!");

            Log.i(TAG, "mp02ba02088x: This data is Required!");
            return false;
        } else {
            mp02ba02088x.setError(null);
        }



        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sBA = new JSONObject();

        sBA.put("mp02ba001", mp02ba001.getText().toString());

        sBA.put("mp02ba002", mp02ba00201.isChecked() ? "1" : mp02ba00202.isChecked() ? "2" : mp02ba00288.isChecked() ? "88" : "0");
        sBA.put("mp02ba00288x", mp02ba00288x.getText().toString());

        sBA.put("mp02ba003", mp02ba00301.isChecked() ? "1" : mp02ba00302.isChecked() ? "2": mp02ba00303.isChecked() ? "3"
                : mp02ba00304.isChecked() ? "4" : mp02ba00305.isChecked() ? "5" : mp02ba00306.isChecked() ? "6"
                : mp02ba00307.isChecked() ? "7" : mp02ba00308.isChecked() ? "8" : mp02ba00309.isChecked() ? "9"
                : mp02ba00310.isChecked() ? "10" : mp02ba00311.isChecked() ? "11" : mp02ba00312.isChecked() ? "12"
                : mp02ba00388.isChecked() ? "88" : "0");
        sBA.put("mp02ba00388x", mp02ba00388x.getText().toString());

        sBA.put("mp02ba004", mp02ba00401.isChecked() ? "1" : mp02ba00402.isChecked() ? "2": mp02ba00403.isChecked() ? "3"
                : mp02ba00404.isChecked() ? "4" : mp02ba00405.isChecked() ? "5" : mp02ba00406.isChecked() ? "6"
                : mp02ba00407.isChecked() ? "7" : mp02ba00408.isChecked() ? "8" : mp02ba00409.isChecked() ? "9"
                : mp02ba00410.isChecked() ? "10" : mp02ba00411.isChecked() ? "11" : mp02ba00412.isChecked() ? "12"
                : mp02ba00413.isChecked() ? "13" : mp02ba00488.isChecked() ? "88" : "0");
        sBA.put("mp02ba00488x", mp02ba00488x.getText().toString());

        sBA.put("mp02ba004", mp02ba00501.isChecked() ? "1" : mp02ba00502.isChecked() ? "2": mp02ba00503.isChecked() ? "3"
                : mp02ba00504.isChecked() ? "4" : mp02ba00505.isChecked() ? "5" : mp02ba00506.isChecked() ? "6"
                : mp02ba00507.isChecked() ? "7" : mp02ba00508.isChecked() ? "8" : mp02ba00509.isChecked() ? "9"
                : mp02ba00510.isChecked() ? "10" : mp02ba00511.isChecked() ? "11" : mp02ba00512.isChecked() ? "12"
                : mp02ba00513.isChecked() ? "13" : mp02ba00514.isChecked() ? "14" : mp02ba00515.isChecked() ? "15"
                : mp02ba00516.isChecked() ? "16" : mp02ba00517.isChecked() ? "17" : mp02ba00518.isChecked() ? "18"
                : mp02ba00519.isChecked() ? "19" : mp02ba00520.isChecked() ? "20" : mp02ba00521.isChecked() ? "21"
                : mp02ba00588.isChecked() ? "88" : "0");
        sBA.put("mp02ba00588x", mp02ba00588x.getText().toString());

        sBA.put("mp02ba006", mp02ba006.getText().toString());

        sBA.put("mp02ba007", mp02ba00701.isChecked() ? "1" : mp02ba00702.isChecked() ? "2": mp02ba00703.isChecked() ? "3"
                : mp02ba00704.isChecked() ? "4" : mp02ba00705.isChecked() ? "5" : mp02ba00706.isChecked() ? "6"
                : mp02ba00707.isChecked() ? "7" : mp02ba00708.isChecked() ? "8" : mp02ba00709.isChecked() ? "9"
                : mp02ba00710.isChecked() ? "10" : mp02ba00711.isChecked() ? "11"
                : mp02ba00788.isChecked() ? "88" : "0");
        sBA.put("mp02ba00788x", mp02ba00788x.getText().toString());

        sBA.put("mp02ba008", mp02ba00801.isChecked() ? "1" : mp02ba00802.isChecked() ? "2": mp02ba00803.isChecked() ? "3"
                : mp02ba00804.isChecked() ? "4" : mp02ba00805.isChecked() ? "5" : mp02ba00806.isChecked() ? "6"
                : mp02ba00807.isChecked() ? "7" : mp02ba00888.isChecked() ? "88" : "0");
        sBA.put("mp02ba00888x", mp02ba00888x.getText().toString());

        sBA.put("mp02ba009", mp02ba00901.isChecked() ? "1" : mp02ba00902.isChecked() ? "2": mp02ba00903.isChecked() ? "3"
                : mp02ba00904.isChecked() ? "4" : mp02ba00905.isChecked() ? "5"
                : mp02ba00988.isChecked() ? "88" : "0");
        sBA.put("mp02ba00988x", mp02ba00988x.getText().toString());

        sBA.put("mp02ba010", mp02ba01001.isChecked() ? "1" : mp02ba01002.isChecked() ? "2" : "0");

        sBA.put("mp02ba011", mp02ba011.getText().toString());

        sBA.put("mp02ba012", mp02ba01201.isChecked() ? "1" : mp02ba01202.isChecked() ? "2"
                :mp02ba01203.isChecked() ? "3" : mp02ba01204.isChecked() ? "4"
                : mp02ba01288.isChecked() ? "88" : "0");

        // Checkbox
        sBA.put("mp02ba01301", mp02ba01301.isChecked() ? "1" : "0");
        sBA.put("mp02ba01302", mp02ba01302.isChecked() ? "1" : "0");
        sBA.put("mp02ba01303", mp02ba01303.isChecked() ? "1" : "0");
        sBA.put("mp02ba01304", mp02ba01304.isChecked() ? "1" : "0");
        sBA.put("mp02ba01305", mp02ba01305.isChecked() ? "1" : "0");
        sBA.put("mp02ba01306", mp02ba01306.isChecked() ? "1" : "0");
        sBA.put("mp02ba01307", mp02ba01307.isChecked() ? "1" : "0");
        sBA.put("mp02ba01308", mp02ba01308.isChecked() ? "1" : "0");
        sBA.put("mp02ba01309", mp02ba01309.isChecked() ? "1" : "0");
        sBA.put("mp02ba01310", mp02ba01310.isChecked() ? "1" : "0");
        sBA.put("mp02ba01311", mp02ba01311.isChecked() ? "1" : "0");
        sBA.put("mp02ba01312", mp02ba01312.isChecked() ? "1" : "0");
        sBA.put("mp02ba01313", mp02ba01313.isChecked() ? "1" : "0");
        sBA.put("mp02ba01314", mp02ba01314.isChecked() ? "1" : "0");
        sBA.put("mp02ba01315", mp02ba01315.isChecked() ? "1" : "0");
        sBA.put("mp02ba01316", mp02ba01316.isChecked() ? "1" : "0");
        sBA.put("mp02ba01317", mp02ba01317.isChecked() ? "1" : "0");
        sBA.put("mp02ba01318", mp02ba01318.isChecked() ? "1" : "0");

        sBA.put("mp02ba014", mp02ba01401.isChecked() ? "1" : mp02ba01402.isChecked() ? "2": mp02ba01403.isChecked() ? "3"
                : mp02ba01404.isChecked() ? "4" : mp02ba01405.isChecked() ? "5" : mp02ba01406.isChecked() ? "6"
                : mp02ba01407.isChecked() ? "7" : mp02ba01408.isChecked() ? "8" : mp02ba01409.isChecked() ? "9"
                : mp02ba01410.isChecked() ? "10"
                : mp02ba01488.isChecked() ? "88" : "0");
        sBA.put("mp02ba01488x", mp02ba01488x.getText().toString());

        sBA.put("mp02ba015", mp02ba01501.isChecked() ? "1" : mp02ba01502.isChecked() ? "2"
                : mp02ba01503.isChecked() ? "3" : mp02ba01588.isChecked() ? "88" : "0");
        sBA.put("mp02ba01588x", mp02ba01588x.getText().toString());

        // Checkbox
        sBA.put("mp02ba01601", mp02ba01601.isChecked() ? "1" : "0");
        sBA.put("mp02ba01602", mp02ba01602.isChecked() ? "2" : "0");
        sBA.put("mp02ba01603", mp02ba01603.isChecked() ? "3" : "0");
        sBA.put("mp02ba01604", mp02ba01604.isChecked() ? "4" : "0");
        sBA.put("mp02ba01605", mp02ba01605.isChecked() ? "5" : "0");
        sBA.put("mp02ba01606", mp02ba01606.isChecked() ? "6" : "0");
        sBA.put("mp02ba01607", mp02ba01607.isChecked() ? "7" : "0");
        sBA.put("mp02ba01608", mp02ba01608.isChecked() ? "8" : "0");
        sBA.put("mp02ba01609", mp02ba01609.isChecked() ? "9" : "0");

        sBA.put("mp02ba017", mp02ba01701.isChecked() ? "1" : mp02ba01702.isChecked() ? "2" : "0");

        sBA.put("mp02ba018", mp02ba01801.isChecked() ? "1" : mp02ba01802.isChecked() ? "2" : "0");

        // Checkbox
        sBA.put("mp02ba01901", mp02ba01901.isChecked() ? "1" : "0");
        sBA.put("mp02ba01902", mp02ba01902.isChecked() ? "2" : "0");
        sBA.put("mp02ba01903", mp02ba01903.isChecked() ? "3" : "0");
        sBA.put("mp02ba01904", mp02ba01904.isChecked() ? "4" : "0");
        sBA.put("mp02ba01905", mp02ba01905.isChecked() ? "5" : "0");
        sBA.put("mp02ba01906", mp02ba01906.isChecked() ? "6" : "0");
        sBA.put("mp02ba01907", mp02ba01907.isChecked() ? "7" : "0");

        sBA.put("mp02ba020", mp02ba02001.isChecked() ? "1" : mp02ba02002.isChecked() ? "2": mp02ba02003.isChecked() ? "3"
                : mp02ba02004.isChecked() ? "4" : mp02ba02005.isChecked() ? "5" : mp02ba02006.isChecked() ? "6"
                : mp02ba02088.isChecked() ? "88" : "0");
        sBA.put("mp02ba02088x", mp02ba02088x.getText().toString());

        AppMain.fc.setsBA(String.valueOf(sBA));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateBA();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
