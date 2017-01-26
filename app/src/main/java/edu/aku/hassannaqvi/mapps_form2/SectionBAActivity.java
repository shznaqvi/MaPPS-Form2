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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionBAActivity extends Activity {

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_ba);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Intent secbb = new Intent(this, SectionBBActivity.class);
        startActivity(secbb);

    }


}
