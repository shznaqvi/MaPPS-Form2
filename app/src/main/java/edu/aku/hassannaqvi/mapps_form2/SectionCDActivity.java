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

public class SectionCDActivity extends Activity {

    @BindView(R.id.activity_section_cd)
    RelativeLayout activitySectionCd;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02ca001)
    RadioGroup mp02ca001;
    @BindView(R.id.mp02cd00101)
    RadioButton mp02cd00101;
    @BindView(R.id.mp02cd00102)
    RadioButton mp02cd00102;
    @BindView(R.id.mp02cd00103)
    RadioButton mp02cd00103;
    @BindView(R.id.mp02cd00104)
    RadioButton mp02cd00104;
    @BindView(R.id.mp02cd00105)
    RadioButton mp02cd00105;
    @BindView(R.id.mp02cd002)
    RadioGroup mp02cd002;
    @BindView(R.id.mp02cd00201)
    RadioButton mp02cd00201;
    @BindView(R.id.mp02cd00202)
    RadioButton mp02cd00202;
    @BindView(R.id.mp02cd00203)
    RadioButton mp02cd00203;
    @BindView(R.id.mp02cd00204)
    RadioButton mp02cd00204;
    @BindView(R.id.mp02cd00205)
    RadioButton mp02cd00205;
    @BindView(R.id.mp02cd003)
    RadioGroup mp02cd003;
    @BindView(R.id.mp02cd00301)
    RadioButton mp02cd00301;
    @BindView(R.id.mp02cd00302)
    RadioButton mp02cd00302;
    @BindView(R.id.mp02cd00303)
    RadioButton mp02cd00303;
    @BindView(R.id.mp02cd00304)
    RadioButton mp02cd00304;
    @BindView(R.id.mp02cd00305)
    RadioButton mp02cd00305;
    @BindView(R.id.mp02cd004)
    RadioGroup mp02cd004;
    @BindView(R.id.mp02cd00401)
    RadioButton mp02cd00401;
    @BindView(R.id.mp02cd00402)
    RadioButton mp02cd00402;
    @BindView(R.id.mp02cd00403)
    RadioButton mp02cd00403;
    @BindView(R.id.mp02cd00404)
    RadioButton mp02cd00404;
    @BindView(R.id.mp02cd00405)
    RadioButton mp02cd00405;
    @BindView(R.id.mp02cd005)
    RadioGroup mp02cd005;
    @BindView(R.id.mp02cd00501)
    RadioButton mp02cd00501;
    @BindView(R.id.mp02cd00502)
    RadioButton mp02cd00502;
    @BindView(R.id.mp02cd00503)
    RadioButton mp02cd00503;
    @BindView(R.id.mp02cd00504)
    RadioButton mp02cd00504;
    @BindView(R.id.mp02cd00505)
    RadioButton mp02cd00505;
    @BindView(R.id.mp02cd006)
    RadioGroup mp02cd006;
    @BindView(R.id.mp02cd00601)
    RadioButton mp02cd00601;
    @BindView(R.id.mp02cd00602)
    RadioButton mp02cd00602;
    @BindView(R.id.mp02cd00603)
    RadioButton mp02cd00603;
    @BindView(R.id.mp02cd00604)
    RadioButton mp02cd00604;
    @BindView(R.id.mp02cd00605)
    RadioButton mp02cd00605;
    @BindView(R.id.mp02cd007)
    RadioGroup mp02cd007;
    @BindView(R.id.mp02cd00701)
    RadioButton mp02cd00701;
    @BindView(R.id.mp02cd00702)
    RadioButton mp02cd00702;
    @BindView(R.id.mp02cd00703)
    RadioButton mp02cd00703;
    @BindView(R.id.mp02cd00704)
    RadioButton mp02cd00704;
    @BindView(R.id.mp02cd00705)
    RadioButton mp02cd00705;
    @BindView(R.id.mp02cd008)
    RadioGroup mp02cd008;
    @BindView(R.id.mp02cd00801)
    RadioButton mp02cd00801;
    @BindView(R.id.mp02cd00802)
    RadioButton mp02cd00802;
    @BindView(R.id.mp02cd00803)
    RadioButton mp02cd00803;
    @BindView(R.id.mp02cd00804)
    RadioButton mp02cd00804;
    @BindView(R.id.mp02cd00805)
    RadioButton mp02cd00805;
    @BindView(R.id.mp02cd009)
    RadioGroup mp02cd009;
    @BindView(R.id.mp02cd00901)
    RadioButton mp02cd00901;
    @BindView(R.id.mp02cd00902)
    RadioButton mp02cd00902;
    @BindView(R.id.mp02cd00903)
    RadioButton mp02cd00903;
    @BindView(R.id.mp02cd00904)
    RadioButton mp02cd00904;
    @BindView(R.id.mp02cd00905)
    RadioButton mp02cd00905;
    @BindView(R.id.mp02cd010)
    RadioGroup mp02cd010;
    @BindView(R.id.mp02cd01001)
    RadioButton mp02cd01001;
    @BindView(R.id.mp02cd01002)
    RadioButton mp02cd01002;
    @BindView(R.id.mp02cd01003)
    RadioButton mp02cd01003;
    @BindView(R.id.mp02cd01004)
    RadioButton mp02cd01004;
    @BindView(R.id.mp02cd01005)
    RadioButton mp02cd01005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cd);
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
        Intent secce = new Intent(this, SectionCEActivity.class);
        startActivity(secce);

    }


}
