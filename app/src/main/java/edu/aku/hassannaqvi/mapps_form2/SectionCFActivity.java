package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionCFActivity extends Activity {

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
    @BindView(R.id.mp02cf004)
    EditText mp02cf004;
    @BindView(R.id.mp02cf005)
    RadioGroup mp02cf005;
    @BindView(R.id.mp02cf00501)
    RadioButton mp02cf00501;
    @BindView(R.id.mp02cf00502)
    RadioButton mp02cf00502;
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
    @BindView(R.id.mp02cf01688)
    RadioButton mp02cf01688;
    @BindView(R.id.mp02cf01699)
    RadioButton mp02cf01699;
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
    @BindView(R.id.mp02cf01788)
    RadioButton mp02cf01788;
    @BindView(R.id.mp02cf01799)
    RadioButton mp02cf01799;
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
    @BindView(R.id.mp02cf01988)
    CheckBox mp02cf01988;
    @BindView(R.id.mp02cf01999)
    CheckBox mp02cf01999;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cf);
        ButterKnife.bind(this);

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
        Intent seccg = new Intent(this, SectionCGActivity.class);
        startActivity(seccg);

    }


}
