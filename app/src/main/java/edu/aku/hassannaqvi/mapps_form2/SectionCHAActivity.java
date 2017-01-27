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

public class SectionCHAActivity extends Activity {

    @BindView(R.id.activity_section_cha)
    RelativeLayout activitySectionCha;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02cha001)
    RadioGroup mp02cha001;
    @BindView(R.id.mp02cha00101)
    RadioButton mp02cha00101;
    @BindView(R.id.mp02cha00102)
    RadioButton mp02cha00102;
    @BindView(R.id.mp02cha00103)
    RadioButton mp02cha00103;
    @BindView(R.id.mp02cha00104)
    RadioButton mp02cha00104;
    @BindView(R.id.mp02cha00105)
    RadioButton mp02cha00105;
    @BindView(R.id.mp02cha002)
    RadioGroup mp02cha002;
    @BindView(R.id.mp02cha00201)
    RadioButton mp02cha00201;
    @BindView(R.id.mp02cha00202)
    RadioButton mp02cha00202;
    @BindView(R.id.mp02cha00203)
    RadioButton mp02cha00203;
    @BindView(R.id.mp02cha00204)
    RadioButton mp02cha00204;
    @BindView(R.id.mp02cha00205)
    RadioButton mp02cha00205;
    @BindView(R.id.mp02cha003)
    RadioGroup mp02cha003;
    @BindView(R.id.mp02cha00301)
    RadioButton mp02cha00301;
    @BindView(R.id.mp02cha00302)
    RadioButton mp02cha00302;
    @BindView(R.id.mp02cha00303)
    RadioButton mp02cha00303;
    @BindView(R.id.mp02cha00304)
    RadioButton mp02cha00304;
    @BindView(R.id.mp02cha00305)
    RadioButton mp02cha00305;
    @BindView(R.id.mp02cha004)
    RadioGroup mp02cha004;
    @BindView(R.id.mp02cha00401)
    RadioButton mp02cha00401;
    @BindView(R.id.mp02cha00402)
    RadioButton mp02cha00402;
    @BindView(R.id.mp02cha00403)
    RadioButton mp02cha00403;
    @BindView(R.id.mp02cha00404)
    RadioButton mp02cha00404;
    @BindView(R.id.mp02cha00405)
    RadioButton mp02cha00405;
    @BindView(R.id.mp02cha005)
    RadioGroup mp02cha005;
    @BindView(R.id.mp02cha00501)
    RadioButton mp02cha00501;
    @BindView(R.id.mp02cha00502)
    RadioButton mp02cha00502;
    @BindView(R.id.mp02cha00503)
    RadioButton mp02cha00503;
    @BindView(R.id.mp02cha00504)
    RadioButton mp02cha00504;
    @BindView(R.id.mp02cha00505)
    RadioButton mp02cha00505;
    @BindView(R.id.mp02cha006)
    RadioGroup mp02cha006;
    @BindView(R.id.mp02cha00601)
    RadioButton mp02cha00601;
    @BindView(R.id.mp02cha00602)
    RadioButton mp02cha00602;
    @BindView(R.id.mp02cha00603)
    RadioButton mp02cha00603;
    @BindView(R.id.mp02cha00604)
    RadioButton mp02cha00604;
    @BindView(R.id.mp02cha00605)
    RadioButton mp02cha00605;
    @BindView(R.id.mp02cha007)
    RadioGroup mp02cha007;
    @BindView(R.id.mp02cha00701)
    RadioButton mp02cha00701;
    @BindView(R.id.mp02cha00702)
    RadioButton mp02cha00702;
    @BindView(R.id.mp02cha00703)
    RadioButton mp02cha00703;
    @BindView(R.id.mp02cha00704)
    RadioButton mp02cha00704;
    @BindView(R.id.mp02cha00705)
    RadioButton mp02cha00705;
    @BindView(R.id.mp02cha008)
    RadioGroup mp02cha008;
    @BindView(R.id.mp02cha00801)
    RadioButton mp02cha00801;
    @BindView(R.id.mp02cha00802)
    RadioButton mp02cha00802;
    @BindView(R.id.mp02cha00803)
    RadioButton mp02cha00803;
    @BindView(R.id.mp02cha00804)
    RadioButton mp02cha00804;
    @BindView(R.id.mp02cha00805)
    RadioButton mp02cha00805;
    @BindView(R.id.mp02cha009)
    RadioGroup mp02cha009;
    @BindView(R.id.mp02cha00901)
    RadioButton mp02cha00901;
    @BindView(R.id.mp02cha00902)
    RadioButton mp02cha00902;
    @BindView(R.id.mp02cha00903)
    RadioButton mp02cha00903;
    @BindView(R.id.mp02cha00904)
    RadioButton mp02cha00904;
    @BindView(R.id.mp02cha00905)
    RadioButton mp02cha00905;
    @BindView(R.id.mp02cha010)
    RadioGroup mp02cha010;
    @BindView(R.id.mp02cha01001)
    RadioButton mp02cha01001;
    @BindView(R.id.mp02cha01002)
    RadioButton mp02cha01002;
    @BindView(R.id.mp02cha01003)
    RadioButton mp02cha01003;
    @BindView(R.id.mp02cha01004)
    RadioButton mp02cha01004;
    @BindView(R.id.mp02cha01005)
    RadioButton mp02cha01005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cha);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Intent secchb = new Intent(this, SectionCHBActivity.class);
        startActivity(secchb);

    }


}
