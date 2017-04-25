package edu.aku.hassannaqvi.mapps_form2.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

public class SectionCFActivity extends Activity {

    private static final String TAG = SectionCFActivity.class.getSimpleName();

    @BindView(R.id.activity_section_cf)
    RelativeLayout activitySectionCf;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02cf001)
    RadioGroup mp02cf001;
    @BindView(R.id.mp02cf00101)
    RadioButton mp02cf00101;
    @BindView(R.id.mp02cf00102)
    RadioButton mp02cf00102;
    @BindView(R.id.mp02cf00103)
    RadioButton mp02cf00103;
    @BindView(R.id.mp02cf00104)
    RadioButton mp02cf00104;
    @BindView(R.id.mp02cf002)
    EditText mp02cf002;
    @BindView(R.id.mp02cf003)
    RadioGroup mp02cf003;
    @BindView(R.id.mp02cf00301)
    RadioButton mp02cf00301;
    @BindView(R.id.mp02cf00302)
    RadioButton mp02cf00302;
    @BindView(R.id.fldGrpmp02cf04)
    LinearLayout fldGrpmp02cf04;
    @BindView(R.id.mp02cf004)
    EditText mp02cf004;
    @BindView(R.id.mp02cf005)
    RadioGroup mp02cf005;
    @BindView(R.id.mp02cf00501)
    RadioButton mp02cf00501;
    @BindView(R.id.mp02cf00502)
    RadioButton mp02cf00502;
    @BindView(R.id.fldGrpmp02cf06)
    LinearLayout fldGrpmp02cf06;
    @BindView(R.id.mp02cf006)
    EditText mp02cf006;
    @BindView(R.id.mp02cf007)
    EditText mp02cf007;
    @BindView(R.id.mp02cf008)
    EditText mp02cf008;
    @BindView(R.id.mp02cf009)
    EditText mp02cf009;
    @BindView(R.id.mp02cf010)
    EditText mp02cf010;
    @BindView(R.id.mp02cf011)
    EditText mp02cf011;
    @BindView(R.id.mp02cf012)
    EditText mp02cf012;
    @BindView(R.id.mp02cf013)
    EditText mp02cf013;
    @BindView(R.id.mp02cf014)
    EditText mp02cf014;
    @BindView(R.id.mp02cf015)
    EditText mp02cf015;
    @BindView(R.id.mp02cf016)
    RadioGroup mp02cf016;
    @BindView(R.id.mp02cf01601)
    RadioButton mp02cf01601;
    @BindView(R.id.mp02cf01602)
    RadioButton mp02cf01602;
    @BindView(R.id.mp02cf01603)
    RadioButton mp02cf01603;
    @BindView(R.id.mp02cf01699)
    RadioButton mp02cf01699;
    @BindView(R.id.mp02cf01688)
    RadioButton mp02cf01688;
    @BindView(R.id.mp02cf01688x)
    EditText mp02cf01688x;
    @BindView(R.id.mp02cf017)
    RadioGroup mp02cf017;
    @BindView(R.id.mp02cf01701)
    RadioButton mp02cf01701;
    @BindView(R.id.mp02cf01702)
    RadioButton mp02cf01702;
    @BindView(R.id.mp02cf01703)
    RadioButton mp02cf01703;
    @BindView(R.id.mp02cf01704)
    RadioButton mp02cf01704;
    @BindView(R.id.mp02cf01705)
    RadioButton mp02cf01705;
    @BindView(R.id.mp02cf01706)
    RadioButton mp02cf01706;
    @BindView(R.id.mp02cf01707)
    RadioButton mp02cf01707;
    @BindView(R.id.mp02cf01799)
    RadioButton mp02cf01799;
    @BindView(R.id.mp02cf01788)
    RadioButton mp02cf01788;
    @BindView(R.id.mp02cf01788x)
    EditText mp02cf01788x;
    @BindView(R.id.mp02cf018)
    RadioGroup mp02cf018;
    @BindView(R.id.mp02cf01801)
    RadioButton mp02cf01801;
    @BindView(R.id.mp02cf01802)
    RadioButton mp02cf01802;
    @BindView(R.id.mp02cf01899)
    RadioButton mp02cf01899;
    @BindView(R.id.mp02cf01901)
    CheckBox mp02cf01901;
    @BindView(R.id.mp02cf01902)
    CheckBox mp02cf01902;
    @BindView(R.id.mp02cf01903)
    CheckBox mp02cf01903;
    @BindView(R.id.mp02cf01904)
    CheckBox mp02cf01904;
    @BindView(R.id.mp02cf01905)
    CheckBox mp02cf01905;
    @BindView(R.id.mp02cf01906)
    CheckBox mp02cf01906;
    @BindView(R.id.mp02cf01907)
    CheckBox mp02cf01907;
    @BindView(R.id.mp02cf01908)
    CheckBox mp02cf01908;
    @BindView(R.id.mp02cf01909)
    CheckBox mp02cf01909;
    @BindView(R.id.mp02cf01910)
    CheckBox mp02cf01910;
    @BindView(R.id.mp02cf01911)
    CheckBox mp02cf01911;
    @BindView(R.id.mp02cf01912)
    CheckBox mp02cf01912;
    @BindView(R.id.mp02cf01913)
    CheckBox mp02cf01913;
    @BindView(R.id.mp02cf01914)
    CheckBox mp02cf01914;
    @BindView(R.id.mp02cf01915)
    CheckBox mp02cf01915;
    @BindView(R.id.mp02cf01999)
    CheckBox mp02cf01999;
    @BindView(R.id.mp02cf01988)
    CheckBox mp02cf01988;
    @BindView(R.id.mp02cf01988x)
    EditText mp02cf01988x;
    @BindView(R.id.mp02cf020)
    RadioGroup mp02cf020;
    @BindView(R.id.mp02cf02001)
    RadioButton mp02cf02001;
    @BindView(R.id.mp02cf02002)
    RadioButton mp02cf02002;
    @BindView(R.id.mp02cf02099)
    RadioButton mp02cf02099;
    @BindView(R.id.mp02cf021)
    EditText mp02cf021;
    @BindView(R.id.mp02cf022)
    RadioGroup mp02cf022;
    @BindView(R.id.mp02cf02201)
    RadioButton mp02cf02201;
    @BindView(R.id.mp02cf02202)
    RadioButton mp02cf02202;
    @BindView(R.id.mp02cf023)
    RadioGroup mp02cf023;
    @BindView(R.id.mp02cf02301)
    RadioButton mp02cf02301;
    @BindView(R.id.mp02cf02302)
    RadioButton mp02cf02302;
    @BindView(R.id.mp02cf02303)
    RadioButton mp02cf02303;
    @BindView(R.id.mp02cf02304)
    RadioButton mp02cf02304;
    @BindView(R.id.mp02cf02305)
    RadioButton mp02cf02305;
    @BindView(R.id.mp02cf02306)
    RadioButton mp02cf02306;
    @BindView(R.id.mp02cf02307)
    RadioButton mp02cf02307;
    @BindView(R.id.mp02cf02308)
    RadioButton mp02cf02308;
    @BindView(R.id.mp02cf02309)
    RadioButton mp02cf02309;
    @BindView(R.id.mp02cf02310)
    RadioButton mp02cf02310;
    @BindView(R.id.mp02cf02388)
    RadioButton mp02cf02388;
    @BindView(R.id.mp02cf02388x)
    EditText mp02cf02388x;
    @BindView(R.id.mp02cf024)
    RadioGroup mp02cf024;
    @BindView(R.id.mp02cf02401)
    RadioButton mp02cf02401;
    @BindView(R.id.mp02cf02402)
    RadioButton mp02cf02402;
    @BindView(R.id.mp02cf02403)
    RadioButton mp02cf02403;
    @BindView(R.id.mp02cf02404)
    RadioButton mp02cf02404;
    @BindView(R.id.mp02cf02405)
    RadioButton mp02cf02405;
    @BindView(R.id.mp02cf02406)
    RadioButton mp02cf02406;
    @BindView(R.id.mp02cf02407)
    RadioButton mp02cf02407;
    @BindView(R.id.mp02cf02408)
    RadioButton mp02cf02408;
    @BindView(R.id.mp02cf02488)
    RadioButton mp02cf02488;
    @BindView(R.id.mp02cf02488x)
    EditText mp02cf02488x;
    @BindView(R.id.mp02cf025)
    RadioGroup mp02cf025;
    @BindView(R.id.mp02cf02501)
    RadioButton mp02cf02501;
    @BindView(R.id.mp02cf02502)
    RadioButton mp02cf02502;
    @BindView(R.id.mp02cf02599)
    RadioButton mp02cf02599;
    @BindView(R.id.fldGrpmp02cf26)
    LinearLayout fldGrpmp02cf26;
    @BindView(R.id.mp02cf026)
    RadioGroup mp02cf026;
    @BindView(R.id.mp02cf02601)
    RadioButton mp02cf02601;
    @BindView(R.id.mp02cf02602)
    RadioButton mp02cf02602;
    @BindView(R.id.mp02cf02603)
    RadioButton mp02cf02603;
    @BindView(R.id.mp02cf02604)
    RadioButton mp02cf02604;
    @BindView(R.id.mp02cf02605)
    RadioButton mp02cf02605;
    @BindView(R.id.mp02cf02606)
    RadioButton mp02cf02606;
    @BindView(R.id.mp02cf02607)
    RadioButton mp02cf02607;
    @BindView(R.id.mp02cf02608)
    RadioButton mp02cf02608;
    @BindView(R.id.mp02cf02688)
    RadioButton mp02cf02688;
    @BindView(R.id.mp02cf02688x)
    EditText mp02cf02688x;
    @BindView(R.id.fldGrpmp02cf21)
    LinearLayout fldGrpmp02cf21;
    @BindView(R.id.fldGrpmp02cf23)
    LinearLayout fldGrpmp02cf23;
    @BindView(R.id.fldGrpmp02cf006)
    LinearLayout fldGrpmp02cf006;
    @BindView(R.id.fldGrpmp02cf010)
    LinearLayout fldGrpmp02cf010;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cf);
        ButterKnife.bind(this);

        // ================= Q 16 Others ===============
        mp02cf016.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf01688.isChecked()) {
                    mp02cf01688x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf01688x.setVisibility(View.GONE);
                    mp02cf01688x.setText(null);
                }
            }
        });

        // ================= Q 17 Others ===============
        mp02cf017.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf01788.isChecked()) {
                    mp02cf01788x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf01788x.setVisibility(View.GONE);
                    mp02cf01788x.setText(null);
                }
            }
        });

        // ================= Q 19 Others ===============
        mp02cf01988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf01988x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf01988x.setVisibility(View.GONE);
                    mp02cf01688x.setText(null);
                }
            }
        });

        // ================= Q 23 Others ===============
        mp02cf023.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf02388.isChecked()) {
                    mp02cf02388x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf02388x.setVisibility(View.GONE);
                    mp02cf02388x.setText(null);
                }
            }
        });


        // ================= Q 24 Others ===============
        mp02cf024.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf02488.isChecked()) {
                    mp02cf02488x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf02488x.setVisibility(View.GONE);
                    mp02cf02488x.setText(null);
                }
            }
        });

        // ================= Q 26 Others ===============
        mp02cf026.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf02688.isChecked()) {
                    mp02cf02688x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf02688x.setVisibility(View.GONE);
                    mp02cf02688x.setText(null);
                }
            }
        });

        //==================== Q 3 Skip pattern ==================
        mp02cf003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf00301.isChecked()) {
                    fldGrpmp02cf04.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cf04.setVisibility(View.GONE);
                    mp02cf004.setText(null);
                    mp02cf005.clearCheck();
                    mp02cf006.setText(null);
                    mp02cf007.setText(null);
                    mp02cf008.setText(null);
                    mp02cf009.setText(null);
                    mp02cf010.setText(null);
                    mp02cf011.setText(null);
                    mp02cf012.setText(null);
                    mp02cf013.setText(null);
                    mp02cf014.setText(null);
                    mp02cf015.setText(null);
                    mp02cf016.clearCheck();
                    mp02cf01688x.setText(null);
                    mp02cf017.clearCheck();
                    mp02cf01788x.setText(null);
                    mp02cf018.clearCheck();
                    mp02cf01901.setChecked(false);
                    mp02cf01902.setChecked(false);
                    mp02cf01903.setChecked(false);
                    mp02cf01904.setChecked(false);
                    mp02cf01905.setChecked(false);
                    mp02cf01906.setChecked(false);
                    mp02cf01907.setChecked(false);
                    mp02cf01908.setChecked(false);
                    mp02cf01909.setChecked(false);
                    mp02cf01910.setChecked(false);
                    mp02cf01911.setChecked(false);
                    mp02cf01912.setChecked(false);
                    mp02cf01913.setChecked(false);
                    mp02cf01914.setChecked(false);
                    mp02cf01915.setChecked(false);
                    mp02cf01999.setChecked(false);
                    mp02cf01988.setChecked(false);
                    mp02cf01988x.setText(null);
                    mp02cf020.clearCheck();
                    mp02cf021.setText(null);
                    mp02cf022.clearCheck();
                    mp02cf023.clearCheck();
                    mp02cf02388x.setText(null);
                    mp02cf024.clearCheck();
                    mp02cf02488x.setText(null);
                    mp02cf025.clearCheck();
                    mp02cf026.clearCheck();
                    mp02cf02688x.setText(null);

                }
            }
        });


        //==================== Q 4 Skip pattern ==================
        mp02cf005.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf00501.isChecked()) {
                    fldGrpmp02cf06.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cf06.setVisibility(View.GONE);
                    mp02cf006.setText(null);
                    mp02cf007.setText(null);
                    mp02cf008.setText(null);
                    mp02cf009.setText(null);
                    mp02cf010.setText(null);
                    mp02cf011.setText(null);
                    mp02cf012.setText(null);
                    mp02cf013.setText(null);
                    mp02cf014.setText(null);
                    mp02cf015.setText(null);
                    mp02cf016.clearCheck();
                    mp02cf01688x.setText(null);
                    mp02cf017.clearCheck();
                    mp02cf01788x.setText(null);
                    mp02cf018.clearCheck();
                    mp02cf01901.setChecked(false);
                    mp02cf01902.setChecked(false);
                    mp02cf01903.setChecked(false);
                    mp02cf01904.setChecked(false);
                    mp02cf01905.setChecked(false);
                    mp02cf01906.setChecked(false);
                    mp02cf01907.setChecked(false);
                    mp02cf01908.setChecked(false);
                    mp02cf01909.setChecked(false);
                    mp02cf01910.setChecked(false);
                    mp02cf01911.setChecked(false);
                    mp02cf01912.setChecked(false);
                    mp02cf01913.setChecked(false);
                    mp02cf01914.setChecked(false);
                    mp02cf01915.setChecked(false);
                    mp02cf01999.setChecked(false);
                    mp02cf01988.setChecked(false);
                    mp02cf01988x.setText(null);

                }
            }
        });

        //==================== Q 20 Skip pattern ==================
        mp02cf020.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf02001.isChecked()) {
                    fldGrpmp02cf21.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cf21.setVisibility(View.GONE);
                    mp02cf021.setText(null);
                }
            }
        });

        //==================== Q 22 Skip pattern ==================
        mp02cf022.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf02201.isChecked()) {
                    fldGrpmp02cf23.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cf23.setVisibility(View.GONE);
                    mp02cf023.clearCheck();
                    mp02cf02388x.setText(null);
                    mp02cf024.clearCheck();
                    mp02cf02488x.setText(null);
                }
            }
        });

        //==================== Q 25 Skip pattern ==================
        mp02cf025.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf02501.isChecked()) {
                    fldGrpmp02cf26.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cf26.setVisibility(View.GONE);
                    mp02cf026.clearCheck();
                    mp02cf02688x.setText(null);
                }
            }
        });

        mp02cf006.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (mp02cf006.getText().toString().equals("0")) {
                    fldGrpmp02cf006.setVisibility(View.GONE);
                    mp02cf007.setText(null);
                    mp02cf008.setText(null);
                    mp02cf009.setText(null);
                } else {
                    fldGrpmp02cf006.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mp02cf010.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (mp02cf010.getText().toString().equals("0")) {
                    fldGrpmp02cf010.setVisibility(View.GONE);
                    mp02cf011.setText(null);
                    mp02cf012.setText(null);
                    mp02cf013.setText(null);
                } else {
                    fldGrpmp02cf010.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mp02cf01999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf01901.setEnabled(false);
                    mp02cf01901.setChecked(false);
                    mp02cf01902.setEnabled(false);
                    mp02cf01902.setChecked(false);
                    mp02cf01903.setEnabled(false);
                    mp02cf01903.setChecked(false);
                    mp02cf01904.setEnabled(false);
                    mp02cf01904.setChecked(false);
                    mp02cf01905.setEnabled(false);
                    mp02cf01905.setChecked(false);
                    mp02cf01906.setEnabled(false);
                    mp02cf01906.setChecked(false);
                    mp02cf01907.setEnabled(false);
                    mp02cf01907.setChecked(false);
                    mp02cf01908.setEnabled(false);
                    mp02cf01908.setChecked(false);
                    mp02cf01909.setEnabled(false);
                    mp02cf01909.setChecked(false);
                    mp02cf01910.setEnabled(false);
                    mp02cf01910.setChecked(false);
                    mp02cf01911.setEnabled(false);
                    mp02cf01911.setChecked(false);
                    mp02cf01912.setEnabled(false);
                    mp02cf01912.setChecked(false);
                    mp02cf01913.setEnabled(false);
                    mp02cf01913.setChecked(false);
                    mp02cf01914.setEnabled(false);
                    mp02cf01914.setChecked(false);
                    mp02cf01915.setEnabled(false);
                    mp02cf01915.setChecked(false);
                    mp02cf01988.setEnabled(false);
                    mp02cf01988.setChecked(false);
                    mp02cf01988x.setText(null);
                } else {
                    mp02cf01901.setEnabled(true);
                    mp02cf01902.setEnabled(true);
                    mp02cf01903.setEnabled(true);
                    mp02cf01904.setEnabled(true);
                    mp02cf01905.setEnabled(true);
                    mp02cf01906.setEnabled(true);
                    mp02cf01907.setEnabled(true);
                    mp02cf01908.setEnabled(true);
                    mp02cf01909.setEnabled(true);
                    mp02cf01910.setEnabled(true);
                    mp02cf01911.setEnabled(true);
                    mp02cf01912.setEnabled(true);
                    mp02cf01913.setEnabled(true);
                    mp02cf01914.setEnabled(true);
                    mp02cf01915.setEnabled(true);
                    mp02cf01988.setEnabled(true);

                }
            }
        });

        mp02cf01915.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf01901.setEnabled(false);
                    mp02cf01901.setChecked(false);
                    mp02cf01902.setEnabled(false);
                    mp02cf01902.setChecked(false);
                    mp02cf01903.setEnabled(false);
                    mp02cf01903.setChecked(false);
                    mp02cf01904.setEnabled(false);
                    mp02cf01904.setChecked(false);
                    mp02cf01905.setEnabled(false);
                    mp02cf01905.setChecked(false);
                    mp02cf01906.setEnabled(false);
                    mp02cf01906.setChecked(false);
                    mp02cf01907.setEnabled(false);
                    mp02cf01907.setChecked(false);
                    mp02cf01908.setEnabled(false);
                    mp02cf01908.setChecked(false);
                    mp02cf01909.setEnabled(false);
                    mp02cf01909.setChecked(false);
                    mp02cf01910.setEnabled(false);
                    mp02cf01910.setChecked(false);
                    mp02cf01911.setEnabled(false);
                    mp02cf01911.setChecked(false);
                    mp02cf01912.setEnabled(false);
                    mp02cf01912.setChecked(false);
                    mp02cf01913.setEnabled(false);
                    mp02cf01913.setChecked(false);
                    mp02cf01914.setEnabled(false);
                    mp02cf01914.setChecked(false);
                    mp02cf01999.setEnabled(false);
                    mp02cf01999.setChecked(false);
                    mp02cf01988.setEnabled(false);
                    mp02cf01988.setChecked(false);
                    mp02cf01988x.setText(null);
                } else {
                    mp02cf01901.setEnabled(true);
                    mp02cf01902.setEnabled(true);
                    mp02cf01903.setEnabled(true);
                    mp02cf01904.setEnabled(true);
                    mp02cf01905.setEnabled(true);
                    mp02cf01906.setEnabled(true);
                    mp02cf01907.setEnabled(true);
                    mp02cf01908.setEnabled(true);
                    mp02cf01909.setEnabled(true);
                    mp02cf01910.setEnabled(true);
                    mp02cf01911.setEnabled(true);
                    mp02cf01912.setEnabled(true);
                    mp02cf01913.setEnabled(true);
                    mp02cf01914.setEnabled(true);
                    mp02cf01999.setEnabled(true);
                    mp02cf01988.setEnabled(true);

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

                Intent seccg = new Intent(this, SectionCGActivity.class);
                startActivity(seccg);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }


    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateCF();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject scf = new JSONObject();

        scf.put("mp02cf001", mp02cf00101.isChecked() ? "1" : mp02cf00102.isChecked() ? "2" : mp02cf00103.isChecked() ? "3"
                : mp02cf00104.isChecked() ? "4" : "0");
        scf.put("mp02cf002", mp02cf002.getText().toString());
        scf.put("mp02cf003", mp02cf00301.isChecked() ? "1" : mp02cf00302.isChecked() ? "2" : "0");
        scf.put("mp02cf004", mp02cf004.getText().toString());
        scf.put("mp02cf005", mp02cf00501.isChecked() ? "1" : mp02cf00502.isChecked() ? "2" : "0");
        scf.put("mp02cf006", mp02cf006.getText().toString());
        scf.put("mp02cf007", mp02cf007.getText().toString());
        scf.put("mp02cf008", mp02cf008.getText().toString());
        scf.put("mp02cf009", mp02cf009.getText().toString());
        scf.put("mp02cf010", mp02cf010.getText().toString());
        scf.put("mp02cf011", mp02cf011.getText().toString());
        scf.put("mp02cf012", mp02cf012.getText().toString());
        scf.put("mp02cf013", mp02cf013.getText().toString());
        scf.put("mp02cf014", mp02cf014.getText().toString());
        scf.put("mp02cf015", mp02cf015.getText().toString());
        scf.put("mp02cf016", mp02cf01601.isChecked() ? "1" : mp02cf01602.isChecked() ? "2" : mp02cf01603.isChecked() ? "3"
                : mp02cf01699.isChecked() ? "99" : mp02cf01688.isChecked() ? "88" : "0");
        scf.put("mp02cf01688x", mp02cf01688x.getText().toString());
        scf.put("mp02cf017", mp02cf01701.isChecked() ? "1" : mp02cf01702.isChecked() ? "2" : mp02cf01703.isChecked() ? "3"
                : mp02cf01704.isChecked() ? "4" : mp02cf01705.isChecked() ? "5" : mp02cf01706.isChecked() ? "6"
                : mp02cf01707.isChecked() ? "7" : mp02cf01799.isChecked() ? "99" : mp02cf01788.isChecked() ? "88" : "0");
        scf.put("mp02cf01788x", mp02cf01788x.getText().toString());
        scf.put("mp02cf018", mp02cf01801.isChecked() ? "1" : mp02cf01802.isChecked() ? "2" : mp02cf01899.isChecked() ? "99" : "0");
        scf.put("mp02cf01901", mp02cf01901.isChecked() ? "1" : "0");
        scf.put("mp02cf01902", mp02cf01902.isChecked() ? "1" : "0");
        scf.put("mp02cf01903", mp02cf01903.isChecked() ? "1" : "0");
        scf.put("mp02cf01904", mp02cf01904.isChecked() ? "1" : "0");
        scf.put("mp02cf01905", mp02cf01905.isChecked() ? "1" : "0");
        scf.put("mp02cf01906", mp02cf01906.isChecked() ? "1" : "0");
        scf.put("mp02cf01907", mp02cf01907.isChecked() ? "1" : "0");
        scf.put("mp02cf01908", mp02cf01908.isChecked() ? "1" : "0");
        scf.put("mp02cf01901", mp02cf01909.isChecked() ? "1" : "0");
        scf.put("mp02cf01901", mp02cf01910.isChecked() ? "1" : "0");
        scf.put("mp02cf01901", mp02cf01911.isChecked() ? "1" : "0");
        scf.put("mp02cf01901", mp02cf01912.isChecked() ? "1" : "0");
        scf.put("mp02cf01901", mp02cf01913.isChecked() ? "1" : "0");
        scf.put("mp02cf01901", mp02cf01914.isChecked() ? "1" : "0");
        scf.put("mp02cf01901", mp02cf01915.isChecked() ? "1" : "0");
        scf.put("mp02cf01901", mp02cf01988.isChecked() ? "1" : "0");
        scf.put("mp02cf01901", mp02cf01999.isChecked() ? "1" : "0");
        scf.put("mp02cf01988x", mp02cf01988x.getText().toString());
        scf.put("mp02cf020", mp02cf02001.isChecked() ? "1" : mp02cf02002.isChecked() ? "2" : mp02cf02099.isChecked() ? "99" : "0");
        scf.put("mp02cf021", mp02cf021.getText().toString());
        scf.put("mp02cf022", mp02cf02201.isChecked() ? "1" : mp02cf02202.isChecked() ? "2" : "0");
        scf.put("mp02cf023", mp02cf02301.isChecked() ? "1" : mp02cf02302.isChecked() ? "2" : mp02cf02303.isChecked() ? "3"
                : mp02cf02304.isChecked() ? "4" : mp02cf02305.isChecked() ? "5" : mp02cf02306.isChecked() ? "6"
                : mp02cf02307.isChecked() ? "7" : mp02cf02308.isChecked() ? "8" : mp02cf02309.isChecked() ? "9"
                : mp02cf02310.isChecked() ? "10" : mp02cf02388.isChecked() ? "88" : "0");
        scf.put("mp02cf02388x", mp02cf02388x.getText().toString());
        scf.put("mp02cf024", mp02cf02401.isChecked() ? "1" : mp02cf02402.isChecked() ? "2" : mp02cf02403.isChecked() ? "3"
                : mp02cf02404.isChecked() ? "4" : mp02cf02405.isChecked() ? "5" : mp02cf02406.isChecked() ? "6"
                : mp02cf02407.isChecked() ? "7" : mp02cf02408.isChecked() ? "8" : mp02cf02488.isChecked() ? "88" : "0");
        scf.put("mp02cf02488x", mp02cf02488x.getText().toString());
        scf.put("mp02cf025", mp02cf02501.isChecked() ? "1" : mp02cf02502.isChecked() ? "2" : mp02cf02599.isChecked() ? "99" : "0");
        scf.put("mp02cf026", mp02cf02601.isChecked() ? "1" : mp02cf02602.isChecked() ? "2" : mp02cf02603.isChecked() ? "3"
                : mp02cf02604.isChecked() ? "4" : mp02cf02605.isChecked() ? "5" : mp02cf02606.isChecked() ? "6"
                : mp02cf02607.isChecked() ? "7" : mp02cf02608.isChecked() ? "8" : mp02cf02688.isChecked() ? "88" : "0");
        scf.put("mp02cf02688x", mp02cf02688x.getText().toString());

        AppMain.pc.setsCF(String.valueOf(scf));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        //======================= Q 1 ===============
        if (mp02cf001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf001), Toast.LENGTH_LONG).show();
            mp02cf00104.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02cf001: This data is Required!");
            return false;
        } else {
            mp02cf00104.setError(null);
        }

        //======================= Q 2 ===============
        if (mp02cf002.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf002), Toast.LENGTH_LONG).show();
            mp02cf002.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02cf002: This data is Required!");
            return false;
        } else {
            mp02cf002.setError(null);
        }

        if (Integer.parseInt(mp02cf002.getText().toString()) < 0 &&
                (Integer.parseInt(mp02cf002.getText().toString()) < 10) || (Integer.parseInt(mp02cf002.getText().toString()) > 18)) {
            Toast.makeText(this, "ERROR: " + getString(R.string.mp02cf002), Toast.LENGTH_LONG).show();
            mp02cf002.setError("Age Limit is from 10 to 18 Years! ");
            Log.i(TAG, "mp02cf002: Age Limit is from 10 to 18 Years");
            return false;
        } else {
            mp02cf002.setError(null);
        }

        //======================= Q 3 ===============
        if (mp02cf003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf003), Toast.LENGTH_LONG).show();
            mp02cf00302.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02cf003: This data is Required!");
            return false;
        } else {
            mp02cf00302.setError(null);
        }

        // ======================= Skip Check till Q 26 ==================
        if (mp02cf00301.isChecked()) {

            // ====================== Q 4 ===================
            if (mp02cf004.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf004), Toast.LENGTH_LONG).show();
                mp02cf004.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf004: This data is Required!");
                return false;
            } else {
                mp02cf004.setError(null);
            }

            if (((Integer.parseInt(mp02cf004.getText().toString()) < 0)
                    && (Integer.parseInt(mp02cf004.getText().toString()) < 15))
                    || Integer.parseInt(mp02cf004.getText().toString()) > 24
                    && (Integer.parseInt(mp02cf004.getText().toString()) != 99)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.mp02cf004), Toast.LENGTH_LONG).show();
                mp02cf004.setError("Age Limit is from 15 to 24 Years");
                Log.i(TAG, "mp02cf004: Age Limit is from 15 to 24 Years");
                return false;
            } else {
                mp02cf004.setError(null);
            }

            // ====================== Q 5 ===================
            if (mp02cf005.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf005), Toast.LENGTH_LONG).show();
                mp02cf00502.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf005: This data is Required!");
                return false;
            } else {
                mp02cf00502.setError(null);
            }
            // ============ Skip Check till question 20 ============
            if (mp02cf00501.isChecked()) {
                // ====================== Q 6 ===================
                if ((mp02cf006.getText().toString().isEmpty())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf006), Toast.LENGTH_LONG).show();
                    mp02cf006.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf006: This data is Required!");
                    return false;
                } else {
                    mp02cf006.setError(null);
                }

/*                // ====================== Q 7 ===================
                if ((mp02cf007.getText().toString().isEmpty()) || Integer.parseInt(mp02cf007.getText().toString()) < 0) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf007), Toast.LENGTH_LONG).show();
                    mp02cf007.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf007: This data is Required!");
                    return false;
                } else {
                    mp02cf007.setError(null);
                }

                // ====================== Q 8 ===================
                if ((mp02cf008.getText().toString().isEmpty()) || Integer.parseInt(mp02cf008.getText().toString()) < 0) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf008), Toast.LENGTH_LONG).show();
                    mp02cf008.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf008: This data is Required!");
                    return false;
                } else {
                    mp02cf008.setError(null);
                }

                // ====================== Q 9 ===================
                if ((mp02cf009.getText().toString().isEmpty()) || Integer.parseInt(mp02cf009.getText().toString()) < 0) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf009), Toast.LENGTH_LONG).show();
                    mp02cf009.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf009: This data is Required!");
                    return false;
                } else {
                    mp02cf009.setError(null);
                }*/

                // ====================== Q 10 ===================
                if ((mp02cf010.getText().toString().isEmpty())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf010), Toast.LENGTH_LONG).show();
                    mp02cf010.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf010: This data is Required!");
                    return false;
                } else {
                    mp02cf010.setError(null);
                }

/*                // ====================== Q 11 ===================
                if ((mp02cf011.getText().toString().isEmpty()) || Integer.parseInt(mp02cf011.getText().toString()) < 0) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf011), Toast.LENGTH_LONG).show();
                    mp02cf011.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf011: This data is Required!");
                    return false;
                } else {
                    mp02cf011.setError(null);
                }
                // ====================== Q 12 ===================
                if ((mp02cf012.getText().toString().isEmpty()) || Integer.parseInt(mp02cf012.getText().toString()) < 0) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf012), Toast.LENGTH_LONG).show();
                    mp02cf012.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf012: This data is Required!");
                    return false;
                } else {
                    mp02cf012.setError(null);
                }

                // ====================== Q 13 ===================
                if ((mp02cf013.getText().toString().isEmpty()) || Integer.parseInt(mp02cf013.getText().toString()) < 0) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf013), Toast.LENGTH_LONG).show();
                    mp02cf013.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf013: This data is Required!");
                    return false;
                } else {
                    mp02cf013.setError(null);
                }*/

                if (Integer.parseInt(mp02cf006.getText().toString().isEmpty() ? "0" : mp02cf006.getText().toString()) < 1
                        && Integer.parseInt(mp02cf010.getText().toString().isEmpty() ? "0" : mp02cf010.getText().toString()) < 1) {
                    Toast.makeText(this, "Invalid: " + getString(R.string.mp02cf006), Toast.LENGTH_LONG).show();
                    mp02cf006.setError("Invalid : Can not be zero");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf006: Can not be Zero");
                    return false;
                } else {
                    mp02cf006.setError(null);
                }

                if (Integer.parseInt(mp02cf006.getText().toString().isEmpty() ? "0" : mp02cf006.getText().toString()) > 0) {
                    if ((Integer.parseInt(mp02cf007.getText().toString().isEmpty() ? "0" : mp02cf007.getText().toString()) < 1)
                            && (Integer.parseInt(mp02cf008.getText().toString().isEmpty() ? "0" : mp02cf008.getText().toString()) < 1)
                            && (Integer.parseInt(mp02cf009.getText().toString().isEmpty() ? "0" : mp02cf009.getText().toString()) < 1)) {
                        Toast.makeText(this, "Invalid: " + getString(R.string.mp02cf007), Toast.LENGTH_LONG).show();
                        mp02cf007.setError("Invalid : Can not be zero");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf007: Can not be Zero");
                        return false;
                    } else {
                        mp02cf007.setError(null);
                    }

                }

                if (Integer.parseInt(mp02cf010.getText().toString().isEmpty() ? "0" : mp02cf010.getText().toString()) > 0) {
                    if ((Integer.parseInt(mp02cf011.getText().toString().isEmpty() ? "0" : mp02cf011.getText().toString()) < 1)
                            && (Integer.parseInt(mp02cf012.getText().toString().isEmpty() ? "0" : mp02cf012.getText().toString()) < 1)
                            && (Integer.parseInt(mp02cf013.getText().toString().isEmpty() ? "0" : mp02cf013.getText().toString()) < 1)) {
                        Toast.makeText(this, "Invalid: " + getString(R.string.mp02cf011), Toast.LENGTH_LONG).show();
                        mp02cf011.setError("Invalid : Can not be zero");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf011: Can not be Zero");
                        return false;
                    } else {
                        mp02cf011.setError(null);
                    }
                }

                if (Integer.parseInt(mp02cf006.getText().toString().isEmpty() ? "0" : mp02cf006.getText().toString()) > 0) {
                    if ((Integer.parseInt(mp02cf007.getText().toString().isEmpty() ? "0" : mp02cf007.getText().toString())
                            + Integer.parseInt(mp02cf008.getText().toString().isEmpty() ? "0" : mp02cf008.getText().toString())
                            + Integer.parseInt(mp02cf009.getText().toString().isEmpty() ? "0" : mp02cf009.getText().toString()))
                            != Integer.parseInt(mp02cf006.getText().toString().isEmpty() ? "0" : mp02cf006.getText().toString())) {
                        Toast.makeText(this, "Invalid: " + getString(R.string.mp02cf006), Toast.LENGTH_LONG).show();
                        mp02cf006.setError("Invalid : Check again");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf006: Check Again");
                        return false;
                    }
                }

                if (Integer.parseInt(mp02cf010.getText().toString().isEmpty() ? "0" : mp02cf010.getText().toString()) > 0) {
                    if ((Integer.parseInt(mp02cf011.getText().toString().isEmpty() ? "0" : mp02cf011.getText().toString())
                            + Integer.parseInt(mp02cf012.getText().toString().isEmpty() ? "0" : mp02cf012.getText().toString())
                            + Integer.parseInt(mp02cf013.getText().toString().isEmpty() ? "0" : mp02cf013.getText().toString()))
                            != Integer.parseInt(mp02cf010.getText().toString().isEmpty() ? "0" : mp02cf010.getText().toString())) {
                        Toast.makeText(this, "Invalid: " + getString(R.string.mp02cf010), Toast.LENGTH_LONG).show();
                        mp02cf010.setError("Invalid : Check again");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf010: Check Again");
                        return false;
                    }
                }


                // ====================== Q 14 ===================
                if (mp02cf014.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf014), Toast.LENGTH_LONG).show();
                    mp02cf014.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf014: This data is Required!");
                    return false;
                } else {
                    mp02cf014.setError(null);
                }

                if ((Integer.parseInt(mp02cf014.getText().toString()) < 13) || (Integer.parseInt(mp02cf014.getText().toString()) > 23
                        && (Integer.parseInt(mp02cf014.getText().toString()) != 99))) {
                    Toast.makeText(this, "ERROR(Range Error): " + getString(R.string.mp02cf014), Toast.LENGTH_LONG).show();
                    mp02cf014.setError("Range is 13 to 23 Years!");    // Set Error on last radio button
                    Log.i(TAG, "mp02cf014: Age Limit is from 13 to 23 Years");

                } else {
                    mp02cf014.setError(null);
                }

                // ====================== Q 15 ===================
                if (mp02cf015.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf015), Toast.LENGTH_LONG).show();
                    mp02cf015.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf015: This data is Required!");
                    return false;
                } else {
                    mp02cf015.setError(null);
                }

                if ((Integer.parseInt(mp02cf015.getText().toString()) < 0) || (Integer.parseInt(mp02cf015.getText().toString()) > 15
                        && (Integer.parseInt(mp02cf015.getText().toString()) != 99))) {
                    Toast.makeText(this, "ERROR(Range Error): " + getString(R.string.mp02cf015), Toast.LENGTH_LONG).show();
                    mp02cf015.setError("Range is 1 to 15 Times!");    // Set Error on last radio button
                    Log.i(TAG, "mp02cf015: Range is 1 to 15 times");

                } else {
                    mp02cf015.setError(null);
                }

                // ====================== Q 16 ===================
                if (mp02cf016.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf016), Toast.LENGTH_LONG).show();
                    mp02cf01688.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf016: This data is Required!");
                    return false;
                } else {
                    mp02cf01688.setError(null);
                }
                // ====================== Q 16 Others ===================
                if (mp02cf01688.isChecked() && mp02cf01688x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf016) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    mp02cf01688x.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf01688x: This data is Required!");
                    return false;
                } else {
                    mp02cf01688x.setError(null);
                }

                // ====================== Q 17 ===================
                if (mp02cf017.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf017), Toast.LENGTH_LONG).show();
                    mp02cf01788.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf017: This data is Required!");
                    return false;
                } else {
                    mp02cf01788.setError(null);
                }
                // ====================== Q 17 Others ===================
                if (mp02cf01788.isChecked() && mp02cf01788x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf017) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    mp02cf01788x.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf01788x: This data is Required!");
                    return false;
                } else {
                    mp02cf01788x.setError(null);
                }

                // ====================== Q 18 ===================
                if (mp02cf018.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf018), Toast.LENGTH_LONG).show();
                    mp02cf01899.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf018: This data is Required!");
                    return false;
                } else {
                    mp02cf01899.setError(null);
                }

                // ====================== Q 19 ===================
                if (!(mp02cf01901.isChecked() || mp02cf01902.isChecked() || mp02cf01903.isChecked() || mp02cf01904.isChecked()
                        || mp02cf01905.isChecked() || mp02cf01906.isChecked() || mp02cf01907.isChecked()
                        || mp02cf01908.isChecked() || mp02cf01909.isChecked() || mp02cf01910.isChecked()
                        || mp02cf01911.isChecked() || mp02cf01912.isChecked() || mp02cf01913.isChecked()
                        || mp02cf01914.isChecked() || mp02cf01915.isChecked() || mp02cf01999.isChecked()
                        || mp02cf01988.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf019), Toast.LENGTH_LONG).show();
                    mp02cf01988.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf019: This data is Required!");
                    return false;
                } else {
                    mp02cf01988.setError(null);
                }

                // ====================== Q 19 Others ===================
                if (mp02cf01988.isChecked() && mp02cf01988x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf019) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    mp02cf01988x.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf01988x: This data is Required!");
                    return false;
                } else {
                    mp02cf01988x.setError(null);
                }


            }

            // ====================== Q 20 ===================
            if (mp02cf020.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf020), Toast.LENGTH_LONG).show();
                mp02cf02099.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf020: This data is Required!");
                return false;
            } else {
                mp02cf02099.setError(null);
            }
            // ========== Skip Check Q20
            if (mp02cf02001.isChecked()) {
                if (mp02cf021.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf021), Toast.LENGTH_LONG).show();
                    mp02cf021.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf021: This data is Required!");
                    return false;
                } else {
                    mp02cf021.setError(null);
                }

                if (Integer.parseInt(mp02cf021.getText().toString()) < 1 || (Integer.parseInt(mp02cf021.getText().toString()) > 19)) {
                    Toast.makeText(this, "ERROR(Range Error): " + getString(R.string.mp02cf021), Toast.LENGTH_LONG).show();
                    mp02cf021.setError("Range is 1 - 19 Months");    // Set Error on last radio button

                } else {
                    mp02cf021.setError(null);
                }
            }

            // ====================== Q 22 ===================
            if (mp02cf022.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf022), Toast.LENGTH_LONG).show();
                mp02cf02202.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf022: This data is Required!");
                return false;
            } else {
                mp02cf02202.setError(null);
            }

            /// ========== Skip Check Q21
            if (mp02cf02201.isChecked()) {
                if (mp02cf023.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf023), Toast.LENGTH_LONG).show();
                    mp02cf02388.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf023: This data is Required!");
                    return false;
                } else {
                    mp02cf02388.setError(null);
                }

                //============= Q 23 Others ===============
                if (mp02cf02388.isChecked() && mp02cf02388x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf023) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    mp02cf02388x.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf02388x: This data is Required!");
                    return false;
                } else {
                    mp02cf02388x.setError(null);
                }

                if (mp02cf024.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf024), Toast.LENGTH_LONG).show();
                    mp02cf02488.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf024: This data is Required!");
                    return false;
                } else {
                    mp02cf02488.setError(null);
                }

                //============= Q 24 Others ===============
                if (mp02cf02488.isChecked() && mp02cf02488x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf024) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    mp02cf02488x.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf02488x: This data is Required!");
                    return false;
                } else {
                    mp02cf02488x.setError(null);
                }


            }
            // ================ Q 25 ===============
            if (mp02cf025.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf025), Toast.LENGTH_LONG).show();
                mp02cf02599.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf025: This data is Required!");
                return false;
            } else {
                mp02cf02599.setError(null);
            }
            /// ========== Skip Check Q21
            if (mp02cf02501.isChecked()) {
                if (mp02cf026.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf026), Toast.LENGTH_LONG).show();
                    mp02cf02688.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf026: This data is Required!");
                    return false;
                } else {
                    mp02cf02688.setError(null);
                }

                //============= Q 24 Others ===============
                if (mp02cf02688.isChecked() && mp02cf02688x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf026) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    mp02cf02688x.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf02688x: This data is Required!");
                    return false;
                } else {
                    mp02cf02688x.setError(null);
                }


            }
        }


        return true;


    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
