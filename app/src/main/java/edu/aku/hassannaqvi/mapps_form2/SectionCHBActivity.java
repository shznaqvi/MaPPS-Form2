package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionCHBActivity extends Activity {

    @BindView(R.id.activity_section_chb)
    RelativeLayout activitySectionChb;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02chb001)
    RadioGroup mp02chb001;
    @BindView(R.id.mp02chb00101)
    RadioButton mp02chb00101;
    @BindView(R.id.mp02chb00102)
    RadioButton mp02chb00102;
    @BindView(R.id.mp02chb00103)
    RadioButton mp02chb00103;
    @BindView(R.id.mp02chb00104)
    RadioButton mp02chb00104;
    @BindView(R.id.mp02chb002)
    RadioGroup mp02chb002;
    @BindView(R.id.mp02chb00201)
    RadioButton mp02chb00201;
    @BindView(R.id.mp02chb00202)
    RadioButton mp02chb00202;
    @BindView(R.id.mp02chb00203)
    RadioButton mp02chb00203;
    @BindView(R.id.mp02chb00204)
    RadioButton mp02chb00204;
    @BindView(R.id.mp02chb003)
    RadioGroup mp02chb003;
    @BindView(R.id.mp02chb00301)
    RadioButton mp02chb00301;
    @BindView(R.id.mp02chb00302)
    RadioButton mp02chb00302;
    @BindView(R.id.mp02chb00303)
    RadioButton mp02chb00303;
    @BindView(R.id.mp02chb00304)
    RadioButton mp02chb00304;
    @BindView(R.id.mp02chb004)
    RadioGroup mp02chb004;
    @BindView(R.id.mp02chb00401)
    RadioButton mp02chb00401;
    @BindView(R.id.mp02chb00402)
    RadioButton mp02chb00402;
    @BindView(R.id.mp02chb00403)
    RadioButton mp02chb00403;
    @BindView(R.id.mp02chb00404)
    RadioButton mp02chb00404;
    @BindView(R.id.mp02chb005)
    RadioGroup mp02chb005;
    @BindView(R.id.mp02chb00501)
    RadioButton mp02chb00501;
    @BindView(R.id.mp02chb00502)
    RadioButton mp02chb00502;
    @BindView(R.id.mp02chb00503)
    RadioButton mp02chb00503;
    @BindView(R.id.mp02chb00504)
    RadioButton mp02chb00504;
    @BindView(R.id.mp02chb006)
    RadioGroup mp02chb006;
    @BindView(R.id.mp02chb00601)
    RadioButton mp02chb00601;
    @BindView(R.id.mp02chb00602)
    RadioButton mp02chb00602;
    @BindView(R.id.mp02chb00603)
    RadioButton mp02chb00603;
    @BindView(R.id.mp02chb00604)
    RadioButton mp02chb00604;
    @BindView(R.id.mp02chb007)
    RadioGroup mp02chb007;
    @BindView(R.id.mp02chb00701)
    RadioButton mp02chb00701;
    @BindView(R.id.mp02chb00702)
    RadioButton mp02chb00702;
    @BindView(R.id.mp02chb00703)
    RadioButton mp02chb00703;
    @BindView(R.id.mp02chb00704)
    RadioButton mp02chb00704;
    @BindView(R.id.mp02chb008)
    RadioGroup mp02chb008;
    @BindView(R.id.mp02chb00801)
    RadioButton mp02chb00801;
    @BindView(R.id.mp02chb00802)
    RadioButton mp02chb00802;
    @BindView(R.id.mp02chb00803)
    RadioButton mp02chb00803;
    @BindView(R.id.mp02chb00804)
    RadioButton mp02chb00804;
    @BindView(R.id.mp02chb009)
    RadioGroup mp02chb009;
    @BindView(R.id.mp02chb00901)
    RadioButton mp02chb00901;
    @BindView(R.id.mp02chb00902)
    RadioButton mp02chb00902;
    @BindView(R.id.mp02chb00903)
    RadioButton mp02chb00903;
    @BindView(R.id.mp02chb00904)
    RadioButton mp02chb00904;
    @BindView(R.id.mp02chb010)
    RadioGroup mp02chb010;
    @BindView(R.id.mp02chb01001)
    RadioButton mp02chb01001;
    @BindView(R.id.mp02chb01002)
    RadioButton mp02chb01002;
    @BindView(R.id.mp02chb01003)
    RadioButton mp02chb01003;
    @BindView(R.id.mp02chb01004)
    RadioButton mp02chb01004;
    @BindView(R.id.mp02chb011)
    RadioGroup mp02chb011;
    @BindView(R.id.mp02chb01101)
    RadioButton mp02chb01101;
    @BindView(R.id.mp02chb01102)
    RadioButton mp02chb01102;
    @BindView(R.id.mp02chb01103)
    RadioButton mp02chb01103;
    @BindView(R.id.mp02chb01104)
    RadioButton mp02chb01104;
    @BindView(R.id.mp02chb012)
    RadioGroup mp02chb012;
    @BindView(R.id.mp02chb01201)
    RadioButton mp02chb01201;
    @BindView(R.id.mp02chb01202)
    RadioButton mp02chb01202;
    @BindView(R.id.mp02chb01203)
    RadioButton mp02chb01203;
    @BindView(R.id.mp02chb01204)
    RadioButton mp02chb01204;
    @BindView(R.id.mp02chb013)
    RadioGroup mp02chb013;
    @BindView(R.id.mp02chb01301)
    RadioButton mp02chb01301;
    @BindView(R.id.mp02chb01302)
    RadioButton mp02chb01302;
    @BindView(R.id.mp02chb01303)
    RadioButton mp02chb01303;
    @BindView(R.id.mp02chb01304)
    RadioButton mp02chb01304;
    @BindView(R.id.mp02chb014)
    RadioGroup mp02chb014;
    @BindView(R.id.mp02chb01401)
    RadioButton mp02chb01401;
    @BindView(R.id.mp02chb01402)
    RadioButton mp02chb01402;
    @BindView(R.id.mp02chb01403)
    RadioButton mp02chb01403;
    @BindView(R.id.mp02chb01404)
    RadioButton mp02chb01404;
    @BindView(R.id.mp02chb015)
    RadioGroup mp02chb015;
    @BindView(R.id.mp02chb01501)
    RadioButton mp02chb01501;
    @BindView(R.id.mp02chb01502)
    RadioButton mp02chb01502;
    @BindView(R.id.mp02chb01503)
    RadioButton mp02chb01503;
    @BindView(R.id.mp02chb01504)
    RadioButton mp02chb01504;
    @BindView(R.id.mp02chb016)
    RadioGroup mp02chb016;
    @BindView(R.id.mp02chb01601)
    RadioButton mp02chb01601;
    @BindView(R.id.mp02chb01602)
    RadioButton mp02chb01602;
    @BindView(R.id.mp02chb01603)
    RadioButton mp02chb01603;
    @BindView(R.id.mp02chb01604)
    RadioButton mp02chb01604;
    @BindView(R.id.mp02chb017)
    RadioGroup mp02chb017;
    @BindView(R.id.mp02chb01701)
    RadioButton mp02chb01701;
    @BindView(R.id.mp02chb01702)
    RadioButton mp02chb01702;
    @BindView(R.id.mp02chb01703)
    RadioButton mp02chb01703;
    @BindView(R.id.mp02chb01704)
    RadioButton mp02chb01704;
    @BindView(R.id.mp02chb018)
    RadioGroup mp02chb018;
    @BindView(R.id.mp02chb01801)
    RadioButton mp02chb01801;
    @BindView(R.id.mp02chb01802)
    RadioButton mp02chb01802;
    @BindView(R.id.mp02chb01803)
    RadioButton mp02chb01803;
    @BindView(R.id.mp02chb01804)
    RadioButton mp02chb01804;
    @BindView(R.id.mp02chb019)
    RadioGroup mp02chb019;
    @BindView(R.id.mp02chb01901)
    RadioButton mp02chb01901;
    @BindView(R.id.mp02chb01902)
    RadioButton mp02chb01902;
    @BindView(R.id.mp02chb01903)
    RadioButton mp02chb01903;
    @BindView(R.id.mp02chb01904)
    RadioButton mp02chb01904;
    @BindView(R.id.mp02chb020)
    RadioGroup mp02chb020;
    @BindView(R.id.mp02chb02001)
    RadioButton mp02chb02001;
    @BindView(R.id.mp02chb02002)
    RadioButton mp02chb02002;
    @BindView(R.id.mp02chb02003)
    RadioButton mp02chb02003;
    @BindView(R.id.mp02chb02004)
    RadioButton mp02chb02004;
    @BindView(R.id.mp02chb021)
    RadioGroup mp02chb021;
    @BindView(R.id.mp02chb02101)
    RadioButton mp02chb02101;
    @BindView(R.id.mp02chb02102)
    RadioButton mp02chb02102;
    @BindView(R.id.mp02chb02103)
    RadioButton mp02chb02103;
    @BindView(R.id.mp02chb02104)
    RadioButton mp02chb02104;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_chb);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Intent secchc = new Intent(this, SectionCHCActivity.class);
        startActivity(secchc);

    }


}
