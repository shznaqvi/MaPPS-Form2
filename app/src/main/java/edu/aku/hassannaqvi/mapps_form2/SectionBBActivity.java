package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionBBActivity extends Activity {

    @BindView(R.id.activity_section_bb)
    RelativeLayout activitySectionBb;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02bb001)
    RadioGroup mp02bb001;
    @BindView(R.id.mp02bb00101)
    RadioButton mp02bb00101;
    @BindView(R.id.mp02bb00102)
    RadioButton mp02bb00102;
    @BindView(R.id.mp02bb002)
    RadioGroup mp02bb002;
    @BindView(R.id.mp02bb00201)
    RadioButton mp02bb00201;
    @BindView(R.id.mp02bb00202)
    RadioButton mp02bb00202;
    @BindView(R.id.mp02bb00203)
    RadioButton mp02bb00203;
    @BindView(R.id.mp02bb003)
    RadioGroup mp02bb003;
    @BindView(R.id.mp02bb00301)
    RadioButton mp02bb00301;
    @BindView(R.id.mp02bb00302)
    RadioButton mp02bb00302;
    @BindView(R.id.mp02bb004)
    RadioGroup mp02bb004;
    @BindView(R.id.mp02bb00401)
    RadioButton mp02bb00401;
    @BindView(R.id.mp02bb00402)
    RadioButton mp02bb00402;
    @BindView(R.id.mp02bb00403)
    RadioButton mp02bb00403;
    @BindView(R.id.mp02bb005)
    RadioGroup mp02bb005;
    @BindView(R.id.mp02bb00501)
    RadioButton mp02bb00501;
    @BindView(R.id.mp02bb00502)
    RadioButton mp02bb00502;
    @BindView(R.id.mp02bb006)
    RadioGroup mp02bb006;
    @BindView(R.id.mp02bb00601)
    RadioButton mp02bb00601;
    @BindView(R.id.mp02bb00602)
    RadioButton mp02bb00602;
    @BindView(R.id.mp02bb00603)
    RadioButton mp02bb00603;
    @BindView(R.id.mp02bb007)
    RadioGroup mp02bb007;
    @BindView(R.id.mp02bb00701)
    RadioButton mp02bb00701;
    @BindView(R.id.mp02bb00702)
    RadioButton mp02bb00702;
    @BindView(R.id.mp02bb008)
    RadioGroup mp02bb008;
    @BindView(R.id.mp02bb00801)
    RadioButton mp02bb00801;
    @BindView(R.id.mp02bb00802)
    RadioButton mp02bb00802;
    @BindView(R.id.mp02bb00803)
    RadioButton mp02bb00803;
    @BindView(R.id.mp02bb009)
    RadioGroup mp02bb009;
    @BindView(R.id.mp02bb00901)
    RadioButton mp02bb00901;
    @BindView(R.id.mp02bb00902)
    RadioButton mp02bb00902;
    @BindView(R.id.mp02bb010)
    RadioGroup mp02bb010;
    @BindView(R.id.mp02bb01001)
    RadioButton mp02bb01001;
    @BindView(R.id.mp02bb01002)
    RadioButton mp02bb01002;
    @BindView(R.id.mp02bb01003)
    RadioButton mp02bb01003;
    @BindView(R.id.mp02bb011)
    RadioGroup mp02bb011;
    @BindView(R.id.mp02bb01101)
    RadioButton mp02bb01101;
    @BindView(R.id.mp02bb01102)
    RadioButton mp02bb01102;
    @BindView(R.id.mp02bb012)
    RadioGroup mp02bb012;
    @BindView(R.id.mp02bb01201)
    RadioButton mp02bb01201;
    @BindView(R.id.mp02bb01202)
    RadioButton mp02bb01202;
    @BindView(R.id.mp02bb01203)
    RadioButton mp02bb01203;
    @BindView(R.id.mp02bb013)
    RadioGroup mp02bb013;
    @BindView(R.id.mp02bb01301)
    RadioButton mp02bb01301;
    @BindView(R.id.mp02bb01302)
    RadioButton mp02bb01302;
    @BindView(R.id.mp02bb014)
    RadioGroup mp02bb014;
    @BindView(R.id.mp02bb01401)
    RadioButton mp02bb01401;
    @BindView(R.id.mp02bb01402)
    RadioButton mp02bb01402;
    @BindView(R.id.mp02bb01403)
    RadioButton mp02bb01403;
    @BindView(R.id.mp02bb015)
    RadioGroup mp02bb015;
    @BindView(R.id.mp02bb01501)
    RadioButton mp02bb01501;
    @BindView(R.id.mp02bb01502)
    RadioButton mp02bb01502;
    @BindView(R.id.mp02bb016)
    RadioGroup mp02bb016;
    @BindView(R.id.mp02bb01601)
    RadioButton mp02bb01601;
    @BindView(R.id.mp02bb01602)
    RadioButton mp02bb01602;
    @BindView(R.id.mp02bb01603)
    RadioButton mp02bb01603;
    @BindView(R.id.mp02bb017)
    RadioGroup mp02bb017;
    @BindView(R.id.mp02bb01701)
    RadioButton mp02bb01701;
    @BindView(R.id.mp02bb01702)
    RadioButton mp02bb01702;
    @BindView(R.id.mp02bb018)
    RadioGroup mp02bb018;
    @BindView(R.id.mp02bb01801)
    RadioButton mp02bb01801;
    @BindView(R.id.mp02bb01802)
    RadioButton mp02bb01802;
    @BindView(R.id.mp02bb01803)
    RadioButton mp02bb01803;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_bb);
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
        Intent secc = new Intent(this, SectionCActivity.class);
        startActivity(secc);

    }


}
