package edu.aku.hassannaqvi.mapps_form2.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
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
    RadioGroup mp02cf002;
    @BindView(R.id.mp02cf00201)
    RadioButton mp02cf00201;
    @BindView(R.id.mp02cf00202)
    RadioButton mp02cf00202;
    @BindView(R.id.mp02cf00203)
    RadioButton mp02cf00203;
    @BindView(R.id.mp02cf00204)
    RadioButton mp02cf00204;
    @BindView(R.id.mp02cf00205)
    RadioButton mp02cf00205;
    @BindView(R.id.mp02cf00288)
    RadioButton mp02cf00288;
    @BindView(R.id.mp02cf00288x)
    EditText mp02cf00288x;
    @BindView(R.id.mp02cf003)
    EditText mp02cf003;
    @BindView(R.id.fldGrpmp02cf004)
    LinearLayout fldGrpmp02cf004;
    @BindView(R.id.mp02cf004)
    RadioGroup mp02cf004;
    @BindView(R.id.mp02cf00401)
    RadioButton mp02cf00401;
    @BindView(R.id.mp02cf00402)
    RadioButton mp02cf00402;
    @BindView(R.id.mp02cf00403)
    RadioButton mp02cf00403;
    @BindView(R.id.mp02cf00404)
    RadioButton mp02cf00404;
    @BindView(R.id.mp02cf00405)
    RadioButton mp02cf00405;
    @BindView(R.id.mp02cf00406)
    RadioButton mp02cf00406;
    @BindView(R.id.mp02cf00488)
    RadioButton mp02cf00488;
    @BindView(R.id.mp02cf00488x)
    EditText mp02cf00488x;
    @BindView(R.id.mp02cf005)
    RadioGroup mp02cf005;
    @BindView(R.id.mp02cf00501)
    RadioButton mp02cf00501;
    @BindView(R.id.mp02cf00502)
    RadioButton mp02cf00502;
    @BindView(R.id.mp02cf00503)
    RadioButton mp02cf00503;
    @BindView(R.id.mp02cf00504)
    RadioButton mp02cf00504;
    @BindView(R.id.mp02cf00505)
    RadioButton mp02cf00505;
    @BindView(R.id.mp02cf00506)
    RadioButton mp02cf00506;
    @BindView(R.id.mp02cf006)
    RadioGroup mp02cf006;
    @BindView(R.id.mp02cf00601)
    RadioButton mp02cf00601;
    @BindView(R.id.mp02cf00602)
    RadioButton mp02cf00602;
    @BindView(R.id.mp02cf00603)
    RadioButton mp02cf00603;
    @BindView(R.id.mp02cf007)
    RadioGroup mp02cf007;
    @BindView(R.id.mp02cf00701)
    RadioButton mp02cf00701;
    @BindView(R.id.mp02cf00702)
    RadioButton mp02cf00702;
    @BindView(R.id.mp02cf00703)
    RadioButton mp02cf00703;
    @BindView(R.id.fldGrpmp02cf08)
    LinearLayout fldGrpmp02cf08;
    @BindView(R.id.mp02cf008)
    RadioGroup mp02cf008;
    @BindView(R.id.mp02cf00801)
    RadioButton mp02cf00801;
    @BindView(R.id.mp02cf00802)
    RadioButton mp02cf00802;
    @BindView(R.id.mp02cf00803)
    RadioButton mp02cf00803;
    @BindView(R.id.mp02cf009)
    RadioGroup mp02cf009;
    @BindView(R.id.mp02cf00901)
    RadioButton mp02cf00901;
    @BindView(R.id.mp02cf00902)
    RadioButton mp02cf00902;
    @BindView(R.id.mp02cf00903)
    RadioButton mp02cf00903;
    @BindView(R.id.mp02cf00988)
    RadioButton mp02cf00988;
    @BindView(R.id.mp02cf00988x)
    EditText mp02cf00988x;
    @BindView(R.id.mp02cf01001)
    CheckBox mp02cf01001;
    @BindView(R.id.mp02cf01002)
    CheckBox mp02cf01002;
    @BindView(R.id.mp02cf01003)
    CheckBox mp02cf01003;
    @BindView(R.id.mp02cf01004)
    CheckBox mp02cf01004;
    @BindView(R.id.mp02cf01005)
    CheckBox mp02cf01005;
    @BindView(R.id.mp02cf01006)
    CheckBox mp02cf01006;
    @BindView(R.id.mp02cf01007)
    CheckBox mp02cf01007;
    @BindView(R.id.mp02cf01088)
    CheckBox mp02cf01088;
    @BindView(R.id.mp02cf01088x)
    EditText mp02cf01088x;
    @BindView(R.id.mp02cf011)
    RadioGroup mp02cf011;
    @BindView(R.id.mp02cf01101)
    RadioButton mp02cf01101;
    @BindView(R.id.mp02cf01102)
    RadioButton mp02cf01102;
    @BindView(R.id.mp02cf01103)
    RadioButton mp02cf01103;
    @BindView(R.id.mp02cf01104)
    RadioButton mp02cf01104;
    @BindView(R.id.mp02cf01105)
    RadioButton mp02cf01105;
    @BindView(R.id.mp02cf01106)
    RadioButton mp02cf01106;
    @BindView(R.id.mp02cf01188)
    RadioButton mp02cf01188;
    @BindView(R.id.mp02cf01188x)
    EditText mp02cf01188x;
    @BindView(R.id.mp02cf012)
    RadioGroup mp02cf012;
    @BindView(R.id.mp02cf01201)
    RadioButton mp02cf01201;
    @BindView(R.id.mp02cf01202)
    RadioButton mp02cf01202;
    @BindView(R.id.fldGrpmp02cf013)
    LinearLayout fldGrpmp02cf013;
    @BindView(R.id.mp02cf01301)
    CheckBox mp02cf01301;
    @BindView(R.id.mp02cf01302)
    CheckBox mp02cf01302;
    @BindView(R.id.mp02cf01303)
    CheckBox mp02cf01303;
    @BindView(R.id.mp02cf01304)
    CheckBox mp02cf01304;
    @BindView(R.id.mp02cf01305)
    CheckBox mp02cf01305;
    @BindView(R.id.mp02cf01388)
    CheckBox mp02cf01388;
    @BindView(R.id.mp02cf01388x)
    EditText mp02cf01388x;
    @BindView(R.id.mp02cf01401)
    CheckBox mp02cf01401;
    @BindView(R.id.mp02cf01402)
    CheckBox mp02cf01402;
    @BindView(R.id.mp02cf01403)
    CheckBox mp02cf01403;
    @BindView(R.id.mp02cf01404)
    CheckBox mp02cf01404;
    @BindView(R.id.mp02cf01405)
    CheckBox mp02cf01405;
    @BindView(R.id.mp02cf01501)
    CheckBox mp02cf01501;
    @BindView(R.id.mp02cf01502)
    CheckBox mp02cf01502;
    @BindView(R.id.mp02cf01503)
    CheckBox mp02cf01503;
    @BindView(R.id.mp02cf01504)
    CheckBox mp02cf01504;
    @BindView(R.id.mp02cf01505)
    CheckBox mp02cf01505;
    @BindView(R.id.mp02cf01506)
    CheckBox mp02cf01506;
    @BindView(R.id.mp02cf01588)
    CheckBox mp02cf01588;
    @BindView(R.id.mp02cf01588x)
    EditText mp02cf01588x;
    @BindView(R.id.mp02cf016)
    RadioGroup mp02cf016;
    @BindView(R.id.mp02cf01601)
    RadioButton mp02cf01601;
    @BindView(R.id.mp02cf01602)
    RadioButton mp02cf01602;
    @BindView(R.id.fldGrpmp02cf17)
    LinearLayout fldGrpmp02cf17;
    @BindView(R.id.mp02cf017)
    EditText mp02cf017;
    @BindView(R.id.mp02cf018)
    RadioGroup mp02cf018;
    @BindView(R.id.mp02cf01801)
    RadioButton mp02cf01801;
    @BindView(R.id.mp02cf01802)
    RadioButton mp02cf01802;
    @BindView(R.id.fldGrpmp02cf19)
    LinearLayout fldGrpmp02cf19;
    @BindView(R.id.mp02cf019)
    EditText mp02cf019;
    @BindView(R.id.fldGrpmp02cf019)
    LinearLayout fldGrpmp02cf019;
    @BindView(R.id.mp02cf020)
    EditText mp02cf020;
    @BindView(R.id.mp02cf021)
    EditText mp02cf021;
    @BindView(R.id.mp02cf022)
    EditText mp02cf022;
    @BindView(R.id.mp02cf023)
    EditText mp02cf023;
    @BindView(R.id.fldGrpmp02cf023)
    LinearLayout fldGrpmp02cf023;
    @BindView(R.id.mp02cf024)
    EditText mp02cf024;
    @BindView(R.id.mp02cf025)
    EditText mp02cf025;
    @BindView(R.id.mp02cf026)
    EditText mp02cf026;
    @BindView(R.id.mp02cf027)
    EditText mp02cf027;
    @BindView(R.id.mp02cf028)
    EditText mp02cf028;
    @BindView(R.id.mp02cf029)
    RadioGroup mp02cf029;
    @BindView(R.id.mp02cf02901)
    RadioButton mp02cf02901;
    @BindView(R.id.mp02cf02902)
    RadioButton mp02cf02902;
    @BindView(R.id.mp02cf02903)
    RadioButton mp02cf02903;
    @BindView(R.id.mp02cf02999)
    RadioButton mp02cf02999;
    @BindView(R.id.mp02cf02988)
    RadioButton mp02cf02988;
    @BindView(R.id.mp02cf02988x)
    EditText mp02cf02988x;
    @BindView(R.id.mp02cf030)
    RadioGroup mp02cf030;
    @BindView(R.id.mp02cf03001)
    RadioButton mp02cf03001;
    @BindView(R.id.mp02cf03002)
    RadioButton mp02cf03002;
    @BindView(R.id.mp02cf03003)
    RadioButton mp02cf03003;
    @BindView(R.id.mp02cf03004)
    RadioButton mp02cf03004;
    @BindView(R.id.mp02cf03005)
    RadioButton mp02cf03005;
    @BindView(R.id.mp02cf03006)
    RadioButton mp02cf03006;
    @BindView(R.id.mp02cf03007)
    RadioButton mp02cf03007;
    @BindView(R.id.mp02cf03099)
    RadioButton mp02cf03099;
    @BindView(R.id.mp02cf03088)
    RadioButton mp02cf03088;
    @BindView(R.id.mp02cf03088x)
    EditText mp02cf03088x;
    @BindView(R.id.mp02cf031)
    RadioGroup mp02cf031;
    @BindView(R.id.mp02cf03101)
    RadioButton mp02cf03101;
    @BindView(R.id.mp02cf03102)
    RadioButton mp02cf03102;
    @BindView(R.id.mp02cf03199)
    RadioButton mp02cf03199;
    @BindView(R.id.mp02cf03201)
    CheckBox mp02cf03201;
    @BindView(R.id.mp02cf03202)
    CheckBox mp02cf03202;
    @BindView(R.id.mp02cf03203)
    CheckBox mp02cf03203;
    @BindView(R.id.mp02cf03204)
    CheckBox mp02cf03204;
    @BindView(R.id.mp02cf03205)
    CheckBox mp02cf03205;
    @BindView(R.id.mp02cf03206)
    CheckBox mp02cf03206;
    @BindView(R.id.mp02cf03207)
    CheckBox mp02cf03207;
    @BindView(R.id.mp02cf03208)
    CheckBox mp02cf03208;
    @BindView(R.id.mp02cf03209)
    CheckBox mp02cf03209;
    @BindView(R.id.mp02cf03210)
    CheckBox mp02cf03210;
    @BindView(R.id.mp02cf03211)
    CheckBox mp02cf03211;
    @BindView(R.id.mp02cf03212)
    CheckBox mp02cf03212;
    @BindView(R.id.mp02cf03213)
    CheckBox mp02cf03213;
    @BindView(R.id.mp02cf03214)
    CheckBox mp02cf03214;
    @BindView(R.id.mp02cf03215)
    CheckBox mp02cf03215;
    @BindView(R.id.mp02cf03299)
    CheckBox mp02cf03299;
    @BindView(R.id.mp02cf03288)
    CheckBox mp02cf03288;
    @BindView(R.id.mp02cf03288x)
    EditText mp02cf03288x;
    @BindView(R.id.mp02cf033)
    RadioGroup mp02cf033;
    @BindView(R.id.mp02cf03301)
    RadioButton mp02cf03301;
    @BindView(R.id.mp02cf03302)
    RadioButton mp02cf03302;
    @BindView(R.id.mp02cf03399)
    RadioButton mp02cf03399;
    @BindView(R.id.fldGrpmp02cf34)
    LinearLayout fldGrpmp02cf34;
    @BindView(R.id.mp02cf034)
    EditText mp02cf034;
    @BindView(R.id.mp02cf035)
    RadioGroup mp02cf035;
    @BindView(R.id.mp02cf03501)
    RadioButton mp02cf03501;
    @BindView(R.id.mp02cf03502)
    RadioButton mp02cf03502;
    @BindView(R.id.fldGrpmp02cf36)
    LinearLayout fldGrpmp02cf36;
    @BindView(R.id.mp02cf036)
    RadioGroup mp02cf036;
    @BindView(R.id.mp02cf03601)
    RadioButton mp02cf03601;
    @BindView(R.id.mp02cf03602)
    RadioButton mp02cf03602;
    @BindView(R.id.mp02cf03603)
    RadioButton mp02cf03603;
    @BindView(R.id.mp02cf03604)
    RadioButton mp02cf03604;
    @BindView(R.id.mp02cf03605)
    RadioButton mp02cf03605;
    @BindView(R.id.mp02cf03606)
    RadioButton mp02cf03606;
    @BindView(R.id.mp02cf03607)
    RadioButton mp02cf03607;
    @BindView(R.id.mp02cf03608)
    RadioButton mp02cf03608;
    @BindView(R.id.mp02cf03609)
    RadioButton mp02cf03609;
    @BindView(R.id.mp02cf03610)
    RadioButton mp02cf03610;
    @BindView(R.id.mp02cf03688)
    RadioButton mp02cf03688;
    @BindView(R.id.mp02cf03688x)
    EditText mp02cf03688x;
    @BindView(R.id.mp02cf037)
    RadioGroup mp02cf037;
    @BindView(R.id.mp02cf03701)
    RadioButton mp02cf03701;
    @BindView(R.id.mp02cf03702)
    RadioButton mp02cf03702;
    @BindView(R.id.mp02cf03703)
    RadioButton mp02cf03703;
    @BindView(R.id.mp02cf03704)
    RadioButton mp02cf03704;
    @BindView(R.id.mp02cf03705)
    RadioButton mp02cf03705;
    @BindView(R.id.mp02cf03706)
    RadioButton mp02cf03706;
    @BindView(R.id.mp02cf03707)
    RadioButton mp02cf03707;
    @BindView(R.id.mp02cf03708)
    RadioButton mp02cf03708;
    @BindView(R.id.mp02cf03788)
    RadioButton mp02cf03788;
    @BindView(R.id.mp02cf03788x)
    EditText mp02cf03788x;
    @BindView(R.id.mp02cf038)
    RadioGroup mp02cf038;
    @BindView(R.id.mp02cf03801)
    RadioButton mp02cf03801;
    @BindView(R.id.mp02cf03802)
    RadioButton mp02cf03802;
    @BindView(R.id.mp02cf03899)
    RadioButton mp02cf03899;
    @BindView(R.id.fldGrpmp02cf39)
    LinearLayout fldGrpmp02cf39;
    @BindView(R.id.mp02cf03901)
    CheckBox mp02cf03901;
    @BindView(R.id.mp02cf03902)
    CheckBox mp02cf03902;
    @BindView(R.id.mp02cf03903)
    CheckBox mp02cf03903;
    @BindView(R.id.mp02cf03904)
    CheckBox mp02cf03904;
    @BindView(R.id.mp02cf03905)
    CheckBox mp02cf03905;
    @BindView(R.id.mp02cf03906)
    CheckBox mp02cf03906;
    @BindView(R.id.mp02cf03907)
    CheckBox mp02cf03907;
    @BindView(R.id.mp02cf03908)
    CheckBox mp02cf03908;
    @BindView(R.id.mp02cf03988)
    CheckBox mp02cf03988;
    @BindView(R.id.mp02cf03988x)
    EditText mp02cf03988x;
    @BindView(R.id.fldGrpmp02cf11)
    LinearLayout fldGrpmp02cf11;
    @BindView(R.id.fldGrpmp02cf033)
    LinearLayout fldGrpmp02cf033;
    @BindView(R.id.fldGrpmp02cf007)
    LinearLayout fldGrpmp02cf007;
    @BindView(R.id.fldGrpmp02cf005)
    LinearLayout fldGrpmp02cf005;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cf);
        ButterKnife.bind(this);

        mp02cf003.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {

                if (Integer.valueOf(mp02cf003.getText().toString().isEmpty() ? "0" : mp02cf003.getText().toString()) == 0) {
                    fldGrpmp02cf004.setVisibility(View.GONE);
                    mp02cf004.clearCheck();
                    mp02cf00488x.setText(null);
                    mp02cf005.clearCheck();
                    mp02cf006.clearCheck();
                    mp02cf007.clearCheck();
                    mp02cf008.clearCheck();
                    mp02cf009.clearCheck();
                    mp02cf00988x.setText(null);
                    mp02cf01001.setChecked(false);
                    mp02cf01002.setChecked(false);
                    mp02cf01003.setChecked(false);
                    mp02cf01004.setChecked(false);
                    mp02cf01005.setChecked(false);
                    mp02cf01006.setChecked(false);
                    mp02cf01007.setChecked(false);
                    mp02cf01088x.setText(null);
                    mp02cf011.clearCheck();
                    mp02cf01188x.setText(null);
                    mp02cf012.clearCheck();
                    mp02cf01301.setChecked(false);
                    mp02cf01302.setChecked(false);
                    mp02cf01303.setChecked(false);
                    mp02cf01304.setChecked(false);
                    mp02cf01305.setChecked(false);
                    mp02cf01388x.setText(null);
                    mp02cf01401.setChecked(false);
                    mp02cf01402.setChecked(false);
                    mp02cf01403.setChecked(false);
                    mp02cf01404.setChecked(false);
                    mp02cf01405.setChecked(false);
                    mp02cf01501.setChecked(false);
                    mp02cf01502.setChecked(false);
                    mp02cf01503.setChecked(false);
                    mp02cf01504.setChecked(false);
                    mp02cf01505.setChecked(false);
                    mp02cf01506.setChecked(false);
                    mp02cf01588x.setText(null);
                } else {
                    fldGrpmp02cf004.setVisibility(View.VISIBLE);
                }

            }
        });

        mp02cf007.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mp02cf00701.isChecked()) {
                    fldGrpmp02cf08.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cf08.setVisibility(View.GONE);
                    mp02cf008.clearCheck();
                }
            }
        });

        mp02cf012.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mp02cf01201.isChecked()) {
                    fldGrpmp02cf013.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cf013.setVisibility(View.GONE);
                    mp02cf01301.setChecked(false);
                    mp02cf01302.setChecked(false);
                    mp02cf01303.setChecked(false);
                    mp02cf01304.setChecked(false);
                    mp02cf01305.setChecked(false);
                    mp02cf01388x.setText(null);
                }
            }
        });

        mp02cf00288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf00288x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf00288x.setVisibility(View.GONE);
                    mp02cf00288x.setText(null);
                }
            }
        });

        mp02cf00488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf00488x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf00488x.setVisibility(View.GONE);
                    mp02cf00488x.setText(null);
                }
            }
        });

        mp02cf00988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf00988x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf00988x.setVisibility(View.GONE);
                    mp02cf00988x.setText(null);
                }
            }
        });

        mp02cf01088.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf01088x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf01088x.setVisibility(View.GONE);
                    mp02cf01088x.setText(null);
                }
            }
        });

        mp02cf01188.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf01188x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf01188x.setVisibility(View.GONE);
                    mp02cf01188x.setText(null);
                }
            }
        });

        mp02cf01388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf01388x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf01388x.setVisibility(View.GONE);
                    mp02cf01388x.setText(null);
                }
            }
        });

        mp02cf01588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf01588x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf01588x.setVisibility(View.GONE);
                    mp02cf01588x.setText(null);
                }
            }
        });

        // ================= Q 29 Others ===============
        mp02cf029.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf02988.isChecked()) {
                    mp02cf02988x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf02988x.setVisibility(View.GONE);
                    mp02cf02988x.setText(null);
                }
            }
        });

        // ================= Q 30 Others ===============
        mp02cf030.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf03088.isChecked()) {
                    mp02cf03088x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf03088x.setVisibility(View.GONE);
                    mp02cf03088x.setText(null);
                }
            }
        });

        // ================= Q 32 Others ===============
        mp02cf03288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf03288x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf03288x.setVisibility(View.GONE);
                    mp02cf03288x.setText(null);
                }
            }
        });

        // ================= Q 36 Others ===============
        mp02cf036.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf03688.isChecked()) {
                    mp02cf03688x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf03688x.setVisibility(View.GONE);
                    mp02cf03688x.setText(null);
                }
            }
        });


        // ================= Q 37 Others ===============
        mp02cf037.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf03788.isChecked()) {
                    mp02cf03788x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf03788x.setVisibility(View.GONE);
                    mp02cf03788x.setText(null);
                }
            }
        });

        mp02cf03988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf03988x.setVisibility(View.VISIBLE);
                } else {
                    mp02cf03988x.setVisibility(View.GONE);
                    mp02cf03988x.setText(null);
                }
            }
        });


        //==================== Q 16 Skip pattern ==================

        if (AppMain.maritalStatus == 5) {
            fldGrpmp02cf17.setVisibility(View.GONE);
            mp02cf017.setText(null);
            mp02cf018.clearCheck();
            mp02cf019.setText(null);
            mp02cf020.setText(null);
            mp02cf021.setText(null);
            mp02cf022.setText(null);
            mp02cf023.setText(null);
            mp02cf024.setText(null);
            mp02cf025.setText(null);
            mp02cf026.setText(null);
            mp02cf027.setText(null);
            mp02cf028.setText(null);
            mp02cf029.clearCheck();
            mp02cf02988x.setText(null);
            mp02cf030.clearCheck();
            mp02cf03088x.setText(null);
            mp02cf031.clearCheck();
            mp02cf03201.setChecked(false);
            mp02cf03202.setChecked(false);
            mp02cf03203.setChecked(false);
            mp02cf03204.setChecked(false);
            mp02cf03205.setChecked(false);
            mp02cf03206.setChecked(false);
            mp02cf03207.setChecked(false);
            mp02cf03208.setChecked(false);
            mp02cf03209.setChecked(false);
            mp02cf03210.setChecked(false);
            mp02cf03211.setChecked(false);
            mp02cf03212.setChecked(false);
            mp02cf03213.setChecked(false);
            mp02cf03214.setChecked(false);
            mp02cf03215.setChecked(false);
            mp02cf03299.setChecked(false);
            mp02cf03288.setChecked(false);
            mp02cf03288x.setText(null);
            mp02cf033.clearCheck();
            mp02cf034.setText(null);
            mp02cf035.clearCheck();
            mp02cf036.clearCheck();
            mp02cf03688x.setText(null);
            mp02cf037.clearCheck();
            mp02cf03788x.setText(null);
            mp02cf038.clearCheck();
            mp02cf03901.setChecked(false);
            mp02cf03902.setChecked(false);
            mp02cf03903.setChecked(false);
            mp02cf03904.setChecked(false);
            mp02cf03905.setChecked(false);
            mp02cf03906.setChecked(false);
            mp02cf03907.setChecked(false);
            mp02cf03908.setChecked(false);
            mp02cf03988.setChecked(false);
            mp02cf03988x.setText(null);

        } else {
            fldGrpmp02cf17.setVisibility(View.VISIBLE);

        }


        //==================== Q 4 Skip pattern ==================
        mp02cf018.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf01801.isChecked()) {
                    fldGrpmp02cf19.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cf19.setVisibility(View.GONE);
                    mp02cf019.setText(null);
                    mp02cf020.setText(null);
                    mp02cf021.setText(null);
                    mp02cf022.setText(null);
                    mp02cf023.setText(null);
                    mp02cf024.setText(null);
                    mp02cf025.setText(null);
                    mp02cf026.setText(null);
                    mp02cf027.setText(null);
                    mp02cf028.setText(null);
                    mp02cf029.clearCheck();
                    mp02cf02988x.setText(null);
                    mp02cf030.clearCheck();
                    mp02cf03088x.setText(null);
                    mp02cf031.clearCheck();
                    mp02cf03201.setChecked(false);
                    mp02cf03202.setChecked(false);
                    mp02cf03203.setChecked(false);
                    mp02cf03204.setChecked(false);
                    mp02cf03205.setChecked(false);
                    mp02cf03206.setChecked(false);
                    mp02cf03207.setChecked(false);
                    mp02cf03208.setChecked(false);
                    mp02cf03209.setChecked(false);
                    mp02cf03210.setChecked(false);
                    mp02cf03211.setChecked(false);
                    mp02cf03212.setChecked(false);
                    mp02cf03213.setChecked(false);
                    mp02cf03214.setChecked(false);
                    mp02cf03215.setChecked(false);
                    mp02cf03299.setChecked(false);
                    mp02cf03288.setChecked(false);
                    mp02cf03288x.setText(null);

                }
            }
        });

        //==================== Q 33 Skip pattern ==================
        mp02cf033.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf03301.isChecked()) {
                    fldGrpmp02cf34.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cf34.setVisibility(View.GONE);
                    mp02cf034.setText(null);
                }
            }
        });

        //==================== Q 35 Skip pattern ==================
        mp02cf035.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf03501.isChecked()) {
                    fldGrpmp02cf36.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cf36.setVisibility(View.GONE);
                    mp02cf036.clearCheck();
                    mp02cf03688x.setText(null);
                    mp02cf037.clearCheck();
                    mp02cf03788x.setText(null);
                }
            }
        });

        //==================== Q 38 Skip pattern ==================
        mp02cf038.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cf03801.isChecked()) {
                    fldGrpmp02cf39.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cf39.setVisibility(View.GONE);
                    mp02cf03901.setChecked(false);
                    mp02cf03902.setChecked(false);
                    mp02cf03903.setChecked(false);
                    mp02cf03904.setChecked(false);
                    mp02cf03905.setChecked(false);
                    mp02cf03906.setChecked(false);
                    mp02cf03907.setChecked(false);
                    mp02cf03908.setChecked(false);
                    mp02cf03988.setChecked(false);
                    mp02cf03988x.setText(null);
                }
            }
        });

        mp02cf019.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (mp02cf019.getText().toString().equals("0")) {
                    fldGrpmp02cf019.setVisibility(View.GONE);
                    mp02cf020.setText(null);
                    mp02cf021.setText(null);
                    mp02cf022.setText(null);
                } else {
                    fldGrpmp02cf019.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mp02cf023.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (mp02cf023.getText().toString().equals("0")) {
                    fldGrpmp02cf023.setVisibility(View.GONE);
                    mp02cf024.setText(null);
                    mp02cf025.setText(null);
                    mp02cf026.setText(null);
                } else {
                    fldGrpmp02cf023.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mp02cf03299.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf03201.setEnabled(false);
                    mp02cf03201.setChecked(false);
                    mp02cf03202.setEnabled(false);
                    mp02cf03202.setChecked(false);
                    mp02cf03203.setEnabled(false);
                    mp02cf03203.setChecked(false);
                    mp02cf03204.setEnabled(false);
                    mp02cf03204.setChecked(false);
                    mp02cf03205.setEnabled(false);
                    mp02cf03205.setChecked(false);
                    mp02cf03206.setEnabled(false);
                    mp02cf03206.setChecked(false);
                    mp02cf03207.setEnabled(false);
                    mp02cf03207.setChecked(false);
                    mp02cf03208.setEnabled(false);
                    mp02cf03208.setChecked(false);
                    mp02cf03209.setEnabled(false);
                    mp02cf03209.setChecked(false);
                    mp02cf03210.setEnabled(false);
                    mp02cf03210.setChecked(false);
                    mp02cf03211.setEnabled(false);
                    mp02cf03211.setChecked(false);
                    mp02cf03212.setEnabled(false);
                    mp02cf03212.setChecked(false);
                    mp02cf03213.setEnabled(false);
                    mp02cf03213.setChecked(false);
                    mp02cf03214.setEnabled(false);
                    mp02cf03214.setChecked(false);
                    mp02cf03215.setEnabled(false);
                    mp02cf03215.setChecked(false);
                    mp02cf03288.setEnabled(false);
                    mp02cf03288.setChecked(false);
                    mp02cf03288x.setText(null);
                } else {
                    mp02cf03201.setEnabled(true);
                    mp02cf03202.setEnabled(true);
                    mp02cf03203.setEnabled(true);
                    mp02cf03204.setEnabled(true);
                    mp02cf03205.setEnabled(true);
                    mp02cf03206.setEnabled(true);
                    mp02cf03207.setEnabled(true);
                    mp02cf03208.setEnabled(true);
                    mp02cf03209.setEnabled(true);
                    mp02cf03210.setEnabled(true);
                    mp02cf03211.setEnabled(true);
                    mp02cf03212.setEnabled(true);
                    mp02cf03213.setEnabled(true);
                    mp02cf03214.setEnabled(true);
                    mp02cf03215.setEnabled(true);
                    mp02cf03288.setEnabled(true);

                }
            }
        });

        mp02cf03215.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cf03201.setEnabled(false);
                    mp02cf03201.setChecked(false);
                    mp02cf03202.setEnabled(false);
                    mp02cf03202.setChecked(false);
                    mp02cf03203.setEnabled(false);
                    mp02cf03203.setChecked(false);
                    mp02cf03204.setEnabled(false);
                    mp02cf03204.setChecked(false);
                    mp02cf03205.setEnabled(false);
                    mp02cf03205.setChecked(false);
                    mp02cf03206.setEnabled(false);
                    mp02cf03206.setChecked(false);
                    mp02cf03207.setEnabled(false);
                    mp02cf03207.setChecked(false);
                    mp02cf03208.setEnabled(false);
                    mp02cf03208.setChecked(false);
                    mp02cf03209.setEnabled(false);
                    mp02cf03209.setChecked(false);
                    mp02cf03210.setEnabled(false);
                    mp02cf03210.setChecked(false);
                    mp02cf03211.setEnabled(false);
                    mp02cf03211.setChecked(false);
                    mp02cf03212.setEnabled(false);
                    mp02cf03212.setChecked(false);
                    mp02cf03213.setEnabled(false);
                    mp02cf03213.setChecked(false);
                    mp02cf03214.setEnabled(false);
                    mp02cf03214.setChecked(false);
                    mp02cf03299.setEnabled(false);
                    mp02cf03299.setChecked(false);
                    mp02cf03288.setEnabled(false);
                    mp02cf03288.setChecked(false);
                    mp02cf03288x.setText(null);
                } else {
                    mp02cf03201.setEnabled(true);
                    mp02cf03202.setEnabled(true);
                    mp02cf03203.setEnabled(true);
                    mp02cf03204.setEnabled(true);
                    mp02cf03205.setEnabled(true);
                    mp02cf03206.setEnabled(true);
                    mp02cf03207.setEnabled(true);
                    mp02cf03208.setEnabled(true);
                    mp02cf03209.setEnabled(true);
                    mp02cf03210.setEnabled(true);
                    mp02cf03211.setEnabled(true);
                    mp02cf03212.setEnabled(true);
                    mp02cf03213.setEnabled(true);
                    mp02cf03214.setEnabled(true);
                    mp02cf03299.setEnabled(true);
                    mp02cf03288.setEnabled(true);

                }
            }
        });

        mp02cf004.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mp02cf00401.isChecked()) {
                    fldGrpmp02cf11.setVisibility(View.GONE);
                    mp02cf011.clearCheck();
                    mp02cf01188x.setText(null);
                } else if (mp02cf00406.isChecked()) {
                    fldGrpmp02cf005.setVisibility(View.GONE);
                    fldGrpmp02cf11.setVisibility(View.VISIBLE);
                    mp02cf005.clearCheck();
                    mp02cf006.clearCheck();
                    mp02cf007.clearCheck();
                    mp02cf008.clearCheck();
                } else {
                    fldGrpmp02cf11.setVisibility(View.VISIBLE);
                    fldGrpmp02cf005.setVisibility(View.VISIBLE);
                }
            }
        });

        if (AppMain.maritalStatus == 1) {
            fldGrpmp02cf033.setVisibility(View.VISIBLE);
        } else {
            fldGrpmp02cf033.setVisibility(View.GONE);
            mp02cf033.clearCheck();
            mp02cf034.setText(null);
            mp02cf035.clearCheck();
            mp02cf036.clearCheck();
            mp02cf03688x.setText(null);
            mp02cf037.clearCheck();
            mp02cf03788x.setText(null);
            mp02cf038.clearCheck();
            mp02cf03901.setChecked(false);
            mp02cf03902.setChecked(false);
            mp02cf03902.setChecked(false);
            mp02cf03903.setChecked(false);
            mp02cf03904.setChecked(false);
            mp02cf03905.setChecked(false);
            mp02cf03906.setChecked(false);
            mp02cf03907.setChecked(false);
            mp02cf03908.setChecked(false);
            mp02cf03988.setChecked(false);
            mp02cf03988x.setText(null);
        }

        mp02cf006.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mp02cf00602.isChecked() || mp02cf00603.isChecked()) {
                    fldGrpmp02cf007.setVisibility(View.GONE);
                    mp02cf007.clearCheck();
                    mp02cf008.clearCheck();
                } else {
                    fldGrpmp02cf007.setVisibility(View.VISIBLE);
                }
            }
        });

        if (AppMain.maritalStatus == 5) {
            mp02cf01004.setEnabled(false);
            mp02cf01004.setChecked(false);
            mp02cf01005.setEnabled(false);
            mp02cf01005.setChecked(false);
        } else {
            mp02cf01004.setEnabled(true);
            mp02cf01005.setEnabled(true);

        }


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
        scf.put("mp02cf002", mp02cf00201.isChecked() ? "1" : mp02cf00202.isChecked() ? "2" : mp02cf00203.isChecked() ? "3"
                : mp02cf00204.isChecked() ? "4" : mp02cf00205.isChecked() ? "5" : "0");
        scf.put("mp02cf00288x", mp02cf00288x.getText().toString());
        scf.put("mp02cf003", mp02cf003.getText().toString());
        scf.put("mp02cf004", mp02cf00401.isChecked() ? "1" : mp02cf00402.isChecked() ? "2" : mp02cf00403.isChecked() ? "3"
                : mp02cf00404.isChecked() ? "4" : mp02cf00405.isChecked() ? "5" : mp02cf00406.isChecked() ? "6"
                : mp02cf00488.isChecked() ? "88" : "0");
        scf.put("mp02cf00488x", mp02cf00488x.getText().toString());
        scf.put("mp02cf005", mp02cf00501.isChecked() ? "1" : mp02cf00502.isChecked() ? "2" : mp02cf00503.isChecked() ? "3"
                : mp02cf00504.isChecked() ? "4" : mp02cf00505.isChecked() ? "5" : mp02cf00506.isChecked() ? "6" : "0");
        scf.put("mp02cf006", mp02cf00601.isChecked() ? "1" : mp02cf00602.isChecked() ? "2" : mp02cf00603.isChecked() ? "3" : "0");
        scf.put("mp02cf007", mp02cf00701.isChecked() ? "1" : mp02cf00702.isChecked() ? "2" : mp02cf00703.isChecked() ? "3" : "0");
        scf.put("mp02cf008", mp02cf00801.isChecked() ? "1" : mp02cf00802.isChecked() ? "2" : mp02cf00803.isChecked() ? "3" : "0");
        scf.put("mp02cf009", mp02cf00901.isChecked() ? "1" : mp02cf00902.isChecked() ? "2" : mp02cf00903.isChecked() ? "3"
                : mp02cf00988.isChecked() ? "88" : "0");
        scf.put("mp02cf00988x", mp02cf00988x.getText().toString());
        scf.put("mp02cf01001", mp02cf01001.isChecked() ? "1" : "0");
        scf.put("mp02cf01002", mp02cf01002.isChecked() ? "2" : "0");
        scf.put("mp02cf01003", mp02cf01003.isChecked() ? "3" : "0");
        scf.put("mp02cf01004", mp02cf01004.isChecked() ? "4" : "0");
        scf.put("mp02cf01005", mp02cf01005.isChecked() ? "5" : "0");
        scf.put("mp02cf01006", mp02cf01006.isChecked() ? "6" : "0");
        scf.put("mp02cf01007", mp02cf01007.isChecked() ? "7" : "0");
        scf.put("mp02cf01088", mp02cf01088.isChecked() ? "88" : "0");
        scf.put("mp02cf01088x", mp02cf01088x.getText().toString());

        scf.put("mp02cf011", mp02cf01001.isChecked() ? "1" : mp02cf01102.isChecked() ? "2" : mp02cf01103.isChecked() ? "3"
                : mp02cf01104.isChecked() ? "4" : mp02cf01105.isChecked() ? "5" : mp02cf01106.isChecked() ? "6"
                : mp02cf01188.isChecked() ? "88" : "0");
        scf.put("mp02cf01188x", mp02cf01188x.getText().toString());
        scf.put("mp02cf012", mp02cf01201.isChecked() ? "1" : mp02cf01202.isChecked() ? "2" : "0");

        scf.put("mp02cf01301", mp02cf01301.isChecked() ? "1" : "0");
        scf.put("mp02cf01302", mp02cf01302.isChecked() ? "2" : "0");
        scf.put("mp02cf01303", mp02cf01303.isChecked() ? "3" : "0");
        scf.put("mp02cf01304", mp02cf01304.isChecked() ? "4" : "0");
        scf.put("mp02cf01305", mp02cf01305.isChecked() ? "5" : "0");
        scf.put("mp02cf01388", mp02cf01388.isChecked() ? "88" : "0");
        scf.put("mp02cf01388x", mp02cf01388x.getText().toString());

        scf.put("mp02cf01401", mp02cf01401.isChecked() ? "1" : "0");
        scf.put("mp02cf01402", mp02cf01402.isChecked() ? "2" : "0");
        scf.put("mp02cf01403", mp02cf01403.isChecked() ? "3" : "0");
        scf.put("mp02cf01404", mp02cf01404.isChecked() ? "4" : "0");
        scf.put("mp02cf01405", mp02cf01405.isChecked() ? "5" : "0");

        scf.put("mp02cf01501", mp02cf01501.isChecked() ? "1" : "0");
        scf.put("mp02cf01502", mp02cf01502.isChecked() ? "2" : "0");
        scf.put("mp02cf01503", mp02cf01503.isChecked() ? "3" : "0");
        scf.put("mp02cf01504", mp02cf01504.isChecked() ? "4" : "0");
        scf.put("mp02cf01505", mp02cf01505.isChecked() ? "5" : "0");
        scf.put("mp02cf01506", mp02cf01506.isChecked() ? "6" : "0");
        scf.put("mp02cf01588", mp02cf01588.isChecked() ? "88" : "0");
        scf.put("mp02cf01588x", mp02cf01588x.getText().toString());

        if (AppMain.maritalStatus == 1) {
            scf.put("mp02cf016", 1);
        } else {
            scf.put("mp02cf016", 2);
        }
        //scf.put("mp02cf016", mp02cf01601.isChecked() ? "1" : mp02cf01602.isChecked() ? "2" : "0");
        scf.put("mp02cf017", mp02cf017.getText().toString());
        scf.put("mp02cf018", mp02cf01801.isChecked() ? "1" : mp02cf01802.isChecked() ? "2" : "0");
        scf.put("mp02cf019", mp02cf019.getText().toString());
        scf.put("mp02cf020", mp02cf020.getText().toString());
        scf.put("mp02cf021", mp02cf021.getText().toString());
        scf.put("mp02cf022", mp02cf022.getText().toString());
        scf.put("mp02cf023", mp02cf023.getText().toString());
        scf.put("mp02cf024", mp02cf024.getText().toString());
        scf.put("mp02cf025", mp02cf025.getText().toString());
        scf.put("mp02cf026", mp02cf026.getText().toString());
        scf.put("mp02cf027", mp02cf027.getText().toString());
        scf.put("mp02cf028", mp02cf028.getText().toString());
        scf.put("mp02cf029", mp02cf02901.isChecked() ? "1" : mp02cf02902.isChecked() ? "2" : mp02cf02903.isChecked() ? "3"
                : mp02cf02999.isChecked() ? "99" : mp02cf02988.isChecked() ? "88" : "0");
        scf.put("mp02cf02988x", mp02cf02988x.getText().toString());
        scf.put("mp02cf030", mp02cf03001.isChecked() ? "1" : mp02cf03002.isChecked() ? "2" : mp02cf03003.isChecked() ? "3"
                : mp02cf03004.isChecked() ? "4" : mp02cf03005.isChecked() ? "5" : mp02cf03006.isChecked() ? "6"
                : mp02cf03007.isChecked() ? "7" : mp02cf03099.isChecked() ? "99" : mp02cf03088.isChecked() ? "88" : "0");
        scf.put("mp02cf03088x", mp02cf03088x.getText().toString());
        scf.put("mp02cf031", mp02cf03101.isChecked() ? "1" : mp02cf03102.isChecked() ? "2" : mp02cf03199.isChecked() ? "99" : "0");
        scf.put("mp02cf03201", mp02cf03201.isChecked() ? "1" : "0");
        scf.put("mp02cf03202", mp02cf03202.isChecked() ? "1" : "0");
        scf.put("mp02cf03203", mp02cf03203.isChecked() ? "1" : "0");
        scf.put("mp02cf03204", mp02cf03204.isChecked() ? "1" : "0");
        scf.put("mp02cf03205", mp02cf03205.isChecked() ? "1" : "0");
        scf.put("mp02cf03206", mp02cf03206.isChecked() ? "1" : "0");
        scf.put("mp02cf03207", mp02cf03207.isChecked() ? "1" : "0");
        scf.put("mp02cf03208", mp02cf03208.isChecked() ? "1" : "0");
        scf.put("mp02cf03209", mp02cf03209.isChecked() ? "1" : "0");
        scf.put("mp02cf03210", mp02cf03210.isChecked() ? "1" : "0");
        scf.put("mp02cf03211", mp02cf03211.isChecked() ? "1" : "0");
        scf.put("mp02cf03212", mp02cf03212.isChecked() ? "1" : "0");
        scf.put("mp02cf03213", mp02cf03213.isChecked() ? "1" : "0");
        scf.put("mp02cf03214", mp02cf03214.isChecked() ? "1" : "0");
        scf.put("mp02cf03215", mp02cf03215.isChecked() ? "1" : "0");
        scf.put("mp02cf03288", mp02cf03288.isChecked() ? "1" : "0");
        scf.put("mp02cf03299", mp02cf03299.isChecked() ? "1" : "0");
        scf.put("mp02cf03288x", mp02cf03288x.getText().toString());
        scf.put("mp02cf033", mp02cf03301.isChecked() ? "1" : mp02cf03302.isChecked() ? "2" : mp02cf03399.isChecked() ? "99" : "0");
        scf.put("mp02cf034", mp02cf034.getText().toString());
        scf.put("mp02cf035", mp02cf03501.isChecked() ? "1" : mp02cf03502.isChecked() ? "2" : "0");
        scf.put("mp02cf036", mp02cf03601.isChecked() ? "1" : mp02cf03602.isChecked() ? "2" : mp02cf03603.isChecked() ? "3"
                : mp02cf03604.isChecked() ? "4" : mp02cf03605.isChecked() ? "5" : mp02cf03606.isChecked() ? "6"
                : mp02cf03607.isChecked() ? "7" : mp02cf03608.isChecked() ? "8" : mp02cf03609.isChecked() ? "9"
                : mp02cf03610.isChecked() ? "10" : mp02cf03688.isChecked() ? "88" : "0");
        scf.put("mp02cf03688x", mp02cf03688x.getText().toString());
        scf.put("mp02cf037", mp02cf03701.isChecked() ? "1" : mp02cf03702.isChecked() ? "2" : mp02cf03703.isChecked() ? "3"
                : mp02cf03704.isChecked() ? "4" : mp02cf03705.isChecked() ? "5" : mp02cf03706.isChecked() ? "6"
                : mp02cf03707.isChecked() ? "7" : mp02cf03708.isChecked() ? "8" : mp02cf03788.isChecked() ? "88" : "0");
        scf.put("mp02cf03788x", mp02cf03788x.getText().toString());
        scf.put("mp02cf038", mp02cf03801.isChecked() ? "1" : mp02cf03802.isChecked() ? "2" : mp02cf03899.isChecked() ? "99" : "0");
        scf.put("mp02cf03901", mp02cf03901.isChecked() ? "1" : "0");
        scf.put("mp02cf03902", mp02cf03902.isChecked() ? "2" : "0");
        scf.put("mp02cf03903", mp02cf03903.isChecked() ? "3" : "0");
        scf.put("mp02cf03904", mp02cf03904.isChecked() ? "4" : "0");
        scf.put("mp02cf03905", mp02cf03905.isChecked() ? "5" : "0");
        scf.put("mp02cf03906", mp02cf03906.isChecked() ? "6" : "0");
        scf.put("mp02cf03907", mp02cf03907.isChecked() ? "7" : "0");
        scf.put("mp02cf03908", mp02cf03908.isChecked() ? "8" : "0");
        scf.put("mp02cf03988", mp02cf03988.isChecked() ? "88" : "0");
        scf.put("mp02cf02688x", mp02cf03988x.getText().toString());

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

        if (mp02cf002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf002), Toast.LENGTH_LONG).show();
            mp02cf00288.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02cf002: This data is Required!");
            return false;
        } else {
            mp02cf00288.setError(null);
        }

        if (mp02cf00288.isChecked() && mp02cf00288x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf002) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            mp02cf00288x.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02cf00288x: This data is Required!");
            return false;
        } else {
            mp02cf00288x.setError(null);
        }

        //======================= Q 3 ===============
        if (mp02cf003.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf003), Toast.LENGTH_LONG).show();
            mp02cf003.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02cf003: This data is Required!");
            return false;
        } else {
            mp02cf003.setError(null);
        }

        if ((Integer.parseInt(mp02cf003.getText().toString().isEmpty() ? "0" : mp02cf003.getText().toString()) < 10
                && Integer.parseInt(mp02cf003.getText().toString().isEmpty() ? "0" : mp02cf003.getText().toString()) != 0)
                || Integer.parseInt(mp02cf003.getText().toString().isEmpty() ? "0" : mp02cf003.getText().toString()) > 18) {
            Toast.makeText(this, "ERROR: " + getString(R.string.mp02cf003), Toast.LENGTH_LONG).show();
            mp02cf003.setError("Age Limit is from 10 to 18 Years! ");
            Log.i(TAG, "mp02cf003: Age Limit is from 10 to 18 Years");
            return false;
        } else {
            mp02cf003.setError(null);
        }

        if (Integer.valueOf(mp02cf003.getText().toString()) != 0) {
            if (mp02cf004.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf004), Toast.LENGTH_LONG).show();
                mp02cf00488.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf004: This data is Required!");
                return false;
            } else {
                mp02cf00488.setError(null);
            }

            if (mp02cf00488.isChecked() && mp02cf00488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf004) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                mp02cf00488x.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf00488x: This data is Required!");
                return false;
            } else {
                mp02cf00488x.setError(null);
            }
            if (!mp02cf00406.isChecked()) {
                if (mp02cf005.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf005), Toast.LENGTH_LONG).show();
                    mp02cf00506.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf005: This data is Required!");
                    return false;
                } else {
                    mp02cf00506.setError(null);
                }

                if (mp02cf006.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf006), Toast.LENGTH_LONG).show();
                    mp02cf00603.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf006: This data is Required!");
                    return false;
                } else {
                    mp02cf00603.setError(null);
                }

                if (mp02cf00601.isChecked()) {
                    if (mp02cf007.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf007), Toast.LENGTH_LONG).show();
                        mp02cf00703.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf007: This data is Required!");
                        return false;
                    } else {
                        mp02cf00703.setError(null);
                    }

                    if (mp02cf00701.isChecked()) {
                        if (mp02cf008.getCheckedRadioButtonId() == -1) {
                            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf008), Toast.LENGTH_LONG).show();
                            mp02cf00803.setError("This data is Required!");    // Set Error on last radio button

                            Log.i(TAG, "mp02cf008: This data is Required!");
                            return false;
                        } else {
                            mp02cf00803.setError(null);
                        }
                    }
                }
            }

            if (mp02cf009.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf009), Toast.LENGTH_LONG).show();
                mp02cf00988.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf009: This data is Required!");
                return false;
            } else {
                mp02cf00988.setError(null);
            }
            if (mp02cf00988.isChecked() && mp02cf00988x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf009) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                mp02cf00988x.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf00988x: This data is Required!");
                return false;
            } else {
                mp02cf00988x.setError(null);
            }

            if (!(mp02cf01001.isChecked() || mp02cf01002.isChecked() || mp02cf01003.isChecked() || mp02cf01004.isChecked()
                    || mp02cf01005.isChecked() || mp02cf01006.isChecked() || mp02cf01007.isChecked() || mp02cf01088.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf010), Toast.LENGTH_LONG).show();
                mp02cf01088.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf010: This data is Required!");
                return false;
            } else {
                mp02cf01088.setError(null);
            }

            if (mp02cf01088.isChecked() && mp02cf01088x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf010) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                mp02cf01088x.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf01088x: This data is Required!");
                return false;
            } else {
                mp02cf01088x.setError(null);
            }

            if (!mp02cf00401.isChecked()) {
                if (mp02cf011.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf011), Toast.LENGTH_LONG).show();
                    mp02cf01188.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf011: This data is Required!");
                    return false;
                } else {
                    mp02cf01188.setError(null);
                }

                if (mp02cf01188.isChecked() && mp02cf01188x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf011) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    mp02cf01188x.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf01188x: This data is Required!");
                    return false;
                } else {
                    mp02cf01188x.setError(null);
                }
            }

            if (mp02cf012.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf012), Toast.LENGTH_LONG).show();
                mp02cf01202.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf012: This data is Required!");
                return false;
            } else {
                mp02cf01202.setError(null);
            }

            if (mp02cf01201.isChecked()) {
                if (!(mp02cf01301.isChecked() || mp02cf01302.isChecked() || mp02cf01303.isChecked() || mp02cf01304.isChecked()
                        || mp02cf01305.isChecked() || mp02cf01388.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf013), Toast.LENGTH_LONG).show();
                    mp02cf01388.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf013: This data is Required!");
                    return false;
                } else {
                    mp02cf01388.setError(null);
                }

                if (mp02cf01388.isChecked() && mp02cf01388x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf013) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    mp02cf01388x.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf01388x: This data is Required!");
                    return false;
                } else {
                    mp02cf01388x.setError(null);
                }
            }

            if (!(mp02cf01401.isChecked() || mp02cf01402.isChecked() || mp02cf01403.isChecked() || mp02cf01404.isChecked()
                    || mp02cf01405.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf014), Toast.LENGTH_LONG).show();
                mp02cf01405.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf014: This data is Required!");
                return false;
            } else {
                mp02cf01405.setError(null);
            }

            if (!(mp02cf01501.isChecked() || mp02cf01502.isChecked() || mp02cf01503.isChecked() || mp02cf01504.isChecked()
                    || mp02cf01505.isChecked() || mp02cf01506.isChecked() || mp02cf01588.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf015), Toast.LENGTH_LONG).show();
                mp02cf01588.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf015: This data is Required!");
                return false;
            } else {
                mp02cf01588.setError(null);
            }

            if (mp02cf01588.isChecked() && mp02cf01588x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf015) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                mp02cf01588x.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf01588x: This data is Required!");
                return false;
            } else {
                mp02cf01588x.setError(null);
            }

        }

       /* //======================= Q 3 ===============
        if (mp02cf016.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf016), Toast.LENGTH_LONG).show();
            mp02cf01602.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02cf016: This data is Required!");
            return false;
        } else {
            mp02cf01602.setError(null);
        }*/

        // ======================= Skip Check till Q 26 ==================
        if (AppMain.maritalStatus == 1) {

            // ====================== Q 4 ===================
            if (mp02cf017.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf017), Toast.LENGTH_LONG).show();
                mp02cf017.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf017: This data is Required!");
                return false;
            } else {
                mp02cf017.setError(null);
            }

            if ((Integer.parseInt(mp02cf017.getText().toString().isEmpty() ? "0" : mp02cf017.getText().toString()) < 15
                    && Integer.parseInt(mp02cf017.getText().toString().isEmpty() ? "0" : mp02cf017.getText().toString()) != 0)
                    || (Integer.parseInt(mp02cf017.getText().toString().isEmpty() ? "0" : mp02cf017.getText().toString()) > 24
                    && Integer.parseInt(mp02cf017.getText().toString().isEmpty() ? "0" : mp02cf017.getText().toString()) != 99)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.mp02cf017), Toast.LENGTH_LONG).show();
                mp02cf017.setError("Age Limit is from 15 to 24 Years");
                Log.i(TAG, "mp02cf017: Age Limit is from 15 to 24 Years");
                return false;
            } else {
                mp02cf017.setError(null);
            }

            // ====================== Q 5 ===================
            if (mp02cf018.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf018), Toast.LENGTH_LONG).show();
                mp02cf01802.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cf018: This data is Required!");
                return false;
            } else {
                mp02cf01802.setError(null);
            }
            // ============ Skip Check till question 20 ============
            if (mp02cf01801.isChecked()) {
                // ====================== Q 6 ===================
                if ((mp02cf019.getText().toString().isEmpty())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf019), Toast.LENGTH_LONG).show();
                    mp02cf019.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf019: This data is Required!");
                    return false;
                } else {
                    mp02cf019.setError(null);
                }

/*                // ====================== Q 7 ===================
                if ((mp02cf020.getText().toString().isEmpty()) || Integer.parseInt(mp02cf020.getText().toString()) < 0) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf020), Toast.LENGTH_LONG).show();
                    mp02cf020.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf020: This data is Required!");
                    return false;
                } else {
                    mp02cf020.setError(null);
                }

                // ====================== Q 8 ===================
                if ((mp02cf021.getText().toString().isEmpty()) || Integer.parseInt(mp02cf021.getText().toString()) < 0) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf021), Toast.LENGTH_LONG).show();
                    mp02cf021.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf021: This data is Required!");
                    return false;
                } else {
                    mp02cf021.setError(null);
                }

                // ====================== Q 9 ===================
                if ((mp02cf022.getText().toString().isEmpty()) || Integer.parseInt(mp02cf022.getText().toString()) < 0) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf022), Toast.LENGTH_LONG).show();
                    mp02cf022.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf022: This data is Required!");
                    return false;
                } else {
                    mp02cf022.setError(null);
                }*/

                // ====================== Q 10 ===================
                if ((mp02cf023.getText().toString().isEmpty())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf023), Toast.LENGTH_LONG).show();
                    mp02cf023.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf023: This data is Required!");
                    return false;
                } else {
                    mp02cf023.setError(null);
                }
                if (Integer.parseInt(mp02cf019.getText().toString().isEmpty() ? "0" : mp02cf019.getText().toString()) < 1
                        && Integer.parseInt(mp02cf023.getText().toString().isEmpty() ? "0" : mp02cf023.getText().toString()) < 1) {
                    Toast.makeText(this, "Invalid: " + getString(R.string.mp02cf019), Toast.LENGTH_LONG).show();
                    mp02cf019.setError("Invalid : Can not be zero");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf019: Can not be Zero");
                    return false;
                } else {
                    mp02cf019.setError(null);
                }

                if (Integer.parseInt(mp02cf019.getText().toString().isEmpty() ? "0" : mp02cf019.getText().toString()) > 0) {
                    if ((Integer.parseInt(mp02cf020.getText().toString().isEmpty() ? "0" : mp02cf020.getText().toString()) < 1)
                            && (Integer.parseInt(mp02cf021.getText().toString().isEmpty() ? "0" : mp02cf021.getText().toString()) < 1)
                            && (Integer.parseInt(mp02cf022.getText().toString().isEmpty() ? "0" : mp02cf022.getText().toString()) < 1)) {
                        Toast.makeText(this, "Invalid: " + getString(R.string.mp02cf020), Toast.LENGTH_LONG).show();
                        mp02cf020.setError("Invalid : Can not be zero");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf020: Can not be Zero");
                        return false;
                    } else {
                        mp02cf020.setError(null);
                    }

                }

                if (Integer.parseInt(mp02cf023.getText().toString().isEmpty() ? "0" : mp02cf023.getText().toString()) > 0) {
                    if ((Integer.parseInt(mp02cf024.getText().toString().isEmpty() ? "0" : mp02cf024.getText().toString()) < 1)
                            && (Integer.parseInt(mp02cf025.getText().toString().isEmpty() ? "0" : mp02cf025.getText().toString()) < 1)
                            && (Integer.parseInt(mp02cf026.getText().toString().isEmpty() ? "0" : mp02cf026.getText().toString()) < 1)) {
                        Toast.makeText(this, "Invalid: " + getString(R.string.mp02cf024), Toast.LENGTH_LONG).show();
                        mp02cf024.setError("Invalid : Can not be zero");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf024: Can not be Zero");
                        return false;
                    } else {
                        mp02cf024.setError(null);
                    }
                }

                if (Integer.parseInt(mp02cf019.getText().toString().isEmpty() ? "0" : mp02cf019.getText().toString()) > 0) {
                    if ((Integer.parseInt(mp02cf020.getText().toString().isEmpty() ? "0" : mp02cf020.getText().toString())
                            + Integer.parseInt(mp02cf021.getText().toString().isEmpty() ? "0" : mp02cf021.getText().toString())
                            + Integer.parseInt(mp02cf022.getText().toString().isEmpty() ? "0" : mp02cf022.getText().toString()))
                            != Integer.parseInt(mp02cf019.getText().toString().isEmpty() ? "0" : mp02cf019.getText().toString())) {
                        Toast.makeText(this, "Invalid: " + getString(R.string.mp02cf019), Toast.LENGTH_LONG).show();
                        mp02cf019.setError("Invalid : Check again");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf019: Check Again");
                        return false;
                    }
                }

                if (Integer.parseInt(mp02cf023.getText().toString().isEmpty() ? "0" : mp02cf023.getText().toString()) > 0) {
                    if ((Integer.parseInt(mp02cf024.getText().toString().isEmpty() ? "0" : mp02cf024.getText().toString())
                            + Integer.parseInt(mp02cf025.getText().toString().isEmpty() ? "0" : mp02cf025.getText().toString())
                            + Integer.parseInt(mp02cf026.getText().toString().isEmpty() ? "0" : mp02cf026.getText().toString()))
                            != (Integer.parseInt(mp02cf023.getText().toString().isEmpty() ? "0" : mp02cf023.getText().toString())) * 2) {
                        Toast.makeText(this, "Invalid: " + getString(R.string.mp02cf023), Toast.LENGTH_LONG).show();
                        mp02cf023.setError("Invalid : Check again");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf023: Check Again");
                        return false;
                    }
                }


                // ====================== Q 14 ===================
                if (mp02cf027.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf027), Toast.LENGTH_LONG).show();
                    mp02cf027.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf027: This data is Required!");
                    return false;
                } else {
                    mp02cf027.setError(null);
                }

                if ((Integer.parseInt(mp02cf027.getText().toString().isEmpty() ? "0" : mp02cf027.getText().toString()) < 13)
                        || (Integer.parseInt(mp02cf027.getText().toString().isEmpty() ? "0" : mp02cf027.getText().toString()) > 23
                        && (Integer.parseInt(mp02cf027.getText().toString().isEmpty() ? "0" : mp02cf027.getText().toString()) != 99))) {
                    Toast.makeText(this, "ERROR(Range Error): " + getString(R.string.mp02cf027), Toast.LENGTH_LONG).show();
                    mp02cf027.setError("Range is 13 to 23 Years!");    // Set Error on last radio button
                    Log.i(TAG, "mp02cf027: Age Limit is from 13 to 23 Years");

                } else {
                    mp02cf027.setError(null);
                }

                // ====================== Q 15 ===================
                if (mp02cf028.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf028), Toast.LENGTH_LONG).show();
                    mp02cf028.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf028: This data is Required!");
                    return false;
                } else {
                    mp02cf028.setError(null);
                }

                if ((Integer.parseInt(mp02cf028.getText().toString().isEmpty() ? "0" : mp02cf028.getText().toString()) < 0)
                        || (Integer.parseInt(mp02cf028.getText().toString().isEmpty() ? "0" : mp02cf028.getText().toString()) > 15
                        && (Integer.parseInt(mp02cf028.getText().toString().isEmpty() ? "0" : mp02cf028.getText().toString()) != 99))) {
                    Toast.makeText(this, "ERROR(Range Error): " + getString(R.string.mp02cf028), Toast.LENGTH_LONG).show();
                    mp02cf028.setError("Range is 1 to 15 Times!");    // Set Error on last radio button
                    Log.i(TAG, "mp02cf028: Range is 1 to 15 times");

                } else {
                    mp02cf028.setError(null);
                }

                // ====================== Q 16 ===================
                if (mp02cf029.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf029), Toast.LENGTH_LONG).show();
                    mp02cf02988.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf029: This data is Required!");
                    return false;
                } else {
                    mp02cf02988.setError(null);
                }
                // ====================== Q 16 Others ===================
                if (mp02cf02988.isChecked() && mp02cf02988x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf029) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    mp02cf02988x.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf02988x: This data is Required!");
                    return false;
                } else {
                    mp02cf02988x.setError(null);
                }

                // ====================== Q 17 ===================
                if (mp02cf030.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf030), Toast.LENGTH_LONG).show();
                    mp02cf03088.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf030: This data is Required!");
                    return false;
                } else {
                    mp02cf03088.setError(null);
                }
                // ====================== Q 17 Others ===================
                if (mp02cf03088.isChecked() && mp02cf03088x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf030) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    mp02cf03088x.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf03088x: This data is Required!");
                    return false;
                } else {
                    mp02cf03088x.setError(null);
                }

                // ====================== Q 18 ===================
                if (mp02cf031.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf031), Toast.LENGTH_LONG).show();
                    mp02cf03199.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf031: This data is Required!");
                    return false;
                } else {
                    mp02cf03199.setError(null);
                }

                // ====================== Q 19 ===================
                if (!(mp02cf03201.isChecked() || mp02cf03202.isChecked() || mp02cf03203.isChecked() || mp02cf03204.isChecked()
                        || mp02cf03205.isChecked() || mp02cf03206.isChecked() || mp02cf03207.isChecked()
                        || mp02cf03208.isChecked() || mp02cf03209.isChecked() || mp02cf03210.isChecked()
                        || mp02cf03211.isChecked() || mp02cf03212.isChecked() || mp02cf03213.isChecked()
                        || mp02cf03214.isChecked() || mp02cf03215.isChecked() || mp02cf03299.isChecked()
                        || mp02cf03288.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf032), Toast.LENGTH_LONG).show();
                    mp02cf03288.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf032: This data is Required!");
                    return false;
                } else {
                    mp02cf03288.setError(null);
                }

                // ====================== Q 19 Others ===================
                if (mp02cf03288.isChecked() && mp02cf03288x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf032) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    mp02cf03288x.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf03288x: This data is Required!");
                    return false;
                } else {
                    mp02cf03288x.setError(null);
                }


            }

            if (AppMain.maritalStatus == 1) {

                // ====================== Q 20 ===================
                if (mp02cf033.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf033), Toast.LENGTH_LONG).show();
                    mp02cf03399.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf033: This data is Required!");
                    return false;
                } else {
                    mp02cf03399.setError(null);
                }
                // ========== Skip Check Q20
                if (mp02cf03301.isChecked()) {
                    if (mp02cf034.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf034), Toast.LENGTH_LONG).show();
                        mp02cf034.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf034: This data is Required!");
                        return false;
                    } else {
                        mp02cf034.setError(null);
                    }

                    if (Integer.parseInt(mp02cf034.getText().toString().isEmpty() ? "0" : mp02cf034.getText().toString()) < 1
                            || (Integer.parseInt(mp02cf034.getText().toString().isEmpty() ? "0" : mp02cf034.getText().toString()) > 19)) {
                        Toast.makeText(this, "ERROR(Range Error): " + getString(R.string.mp02cf034), Toast.LENGTH_LONG).show();
                        mp02cf034.setError("Range is 1 - 19 Months");    // Set Error on last radio button

                    } else {
                        mp02cf034.setError(null);
                    }
                }

                // ====================== Q 22 ===================
                if (mp02cf035.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf035), Toast.LENGTH_LONG).show();
                    mp02cf03502.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf035: This data is Required!");
                    return false;
                } else {
                    mp02cf03502.setError(null);
                }

                /// ========== Skip Check Q21
                if (mp02cf03501.isChecked()) {
                    if (mp02cf036.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf036), Toast.LENGTH_LONG).show();
                        mp02cf03688.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf036: This data is Required!");
                        return false;
                    } else {
                        mp02cf03688.setError(null);
                    }

                    //============= Q 23 Others ===============
                    if (mp02cf03688.isChecked() && mp02cf03688x.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf036) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                        mp02cf03688x.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf03688x: This data is Required!");
                        return false;
                    } else {
                        mp02cf03688x.setError(null);
                    }

                    if (mp02cf037.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf037), Toast.LENGTH_LONG).show();
                        mp02cf03788.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf037: This data is Required!");
                        return false;
                    } else {
                        mp02cf03788.setError(null);
                    }

                    //============= Q 24 Others ===============
                    if (mp02cf03788.isChecked() && mp02cf03788x.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf037) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                        mp02cf03788x.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf03788x: This data is Required!");
                        return false;
                    } else {
                        mp02cf03788x.setError(null);
                    }


                }
                // ================ Q 25 ===============
                if (mp02cf038.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf038), Toast.LENGTH_LONG).show();
                    mp02cf03899.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cf038: This data is Required!");
                    return false;
                } else {
                    mp02cf03899.setError(null);
                }
                /// ========== Skip Check Q21
                if (mp02cf03801.isChecked()) {
                    if (!(mp02cf03901.isChecked() || mp02cf03902.isChecked() || mp02cf03903.isChecked() || mp02cf03904.isChecked()
                            || mp02cf03905.isChecked() || mp02cf03906.isChecked() || mp02cf03907.isChecked() || mp02cf03908.isChecked()
                            || mp02cf03988.isChecked())) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf039), Toast.LENGTH_LONG).show();
                        mp02cf03988.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf039: This data is Required!");
                        return false;
                    } else {
                        mp02cf03988.setError(null);
                    }

                    //============= Q 24 Others ===============
                    if (mp02cf03988.isChecked() && mp02cf03988x.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cf039) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                        mp02cf03988x.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cf03988x: This data is Required!");
                        return false;
                    } else {
                        mp02cf03988x.setError(null);
                    }


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
