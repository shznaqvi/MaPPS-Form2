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

public class SectionCHCActivity extends Activity {

    @BindView(R.id.activity_section_chc)
    RelativeLayout activitySectionChc;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02chc001)
    RadioGroup mp02chc001;
    @BindView(R.id.mp02chc00101)
    RadioButton mp02chc00101;
    @BindView(R.id.mp02chc00102)
    RadioButton mp02chc00102;
    @BindView(R.id.mp02chc002)
    RadioGroup mp02chc002;
    @BindView(R.id.mp02chc00201)
    RadioButton mp02chc00201;
    @BindView(R.id.mp02chc00202)
    RadioButton mp02chc00202;
    @BindView(R.id.mp02chc00203)
    RadioButton mp02chc00203;
    @BindView(R.id.mp02chc00204)
    RadioButton mp02chc00204;
    @BindView(R.id.mp02chc003)
    RadioGroup mp02chc003;
    @BindView(R.id.mp02chc00301)
    RadioButton mp02chc00301;
    @BindView(R.id.mp02chc00302)
    RadioButton mp02chc00302;
    @BindView(R.id.mp02chc00303)
    RadioButton mp02chc00303;
    @BindView(R.id.mp02chc00304)
    RadioButton mp02chc00304;
    @BindView(R.id.mp02chc004)
    RadioGroup mp02chc004;
    @BindView(R.id.mp02chc00401)
    RadioButton mp02chc00401;
    @BindView(R.id.mp02chc00402)
    RadioButton mp02chc00402;
    @BindView(R.id.mp02chc00403)
    RadioButton mp02chc00403;
    @BindView(R.id.mp02chc00404)
    RadioButton mp02chc00404;
    @BindView(R.id.mp02chc005)
    RadioGroup mp02chc005;
    @BindView(R.id.mp02chc00501)
    RadioButton mp02chc00501;
    @BindView(R.id.mp02chc00502)
    RadioButton mp02chc00502;
    @BindView(R.id.mp02chc00503)
    RadioButton mp02chc00503;
    @BindView(R.id.mp02chc00504)
    RadioButton mp02chc00504;
    @BindView(R.id.mp02chc006)
    RadioGroup mp02chc006;
    @BindView(R.id.mp02chc00601)
    RadioButton mp02chc00601;
    @BindView(R.id.mp02chc00602)
    RadioButton mp02chc00602;
    @BindView(R.id.mp02chc00603)
    RadioButton mp02chc00603;
    @BindView(R.id.mp02chc00604)
    RadioButton mp02chc00604;
    @BindView(R.id.mp02chc007)
    RadioGroup mp02chc007;
    @BindView(R.id.mp02chc00701)
    RadioButton mp02chc00701;
    @BindView(R.id.mp02chc00702)
    RadioButton mp02chc00702;
    @BindView(R.id.mp02chc00703)
    RadioButton mp02chc00703;
    @BindView(R.id.mp02chc00704)
    RadioButton mp02chc00704;
    @BindView(R.id.mp02chc008)
    RadioGroup mp02chc008;
    @BindView(R.id.mp02chc00801)
    RadioButton mp02chc00801;
    @BindView(R.id.mp02chc00802)
    RadioButton mp02chc00802;
    @BindView(R.id.mp02chc00803)
    RadioButton mp02chc00803;
    @BindView(R.id.mp02chc00804)
    RadioButton mp02chc00804;
    @BindView(R.id.mp02chc009)
    RadioGroup mp02chc009;
    @BindView(R.id.mp02chc00901)
    RadioButton mp02chc00901;
    @BindView(R.id.mp02chc00902)
    RadioButton mp02chc00902;
    @BindView(R.id.mp02chc00903)
    RadioButton mp02chc00903;
    @BindView(R.id.mp02chc00904)
    RadioButton mp02chc00904;
    @BindView(R.id.mp02chc010)
    RadioGroup mp02chc010;
    @BindView(R.id.mp02chc01001)
    RadioButton mp02chc01001;
    @BindView(R.id.mp02chc01002)
    RadioButton mp02chc01002;
    @BindView(R.id.mp02chc01003)
    RadioButton mp02chc01003;
    @BindView(R.id.mp02chc01101)
    CheckBox mp02chc01101;
    @BindView(R.id.mp02chc01102)
    CheckBox mp02chc01102;
    @BindView(R.id.mp02chc01103)
    CheckBox mp02chc01103;
    @BindView(R.id.mp02chc01104)
    CheckBox mp02chc01104;
    @BindView(R.id.mp02chc01105)
    CheckBox mp02chc01105;
    @BindView(R.id.mp02chc01106)
    CheckBox mp02chc01106;
    @BindView(R.id.mp02chc01107)
    CheckBox mp02chc01107;
    @BindView(R.id.mp02chc01108)
    CheckBox mp02chc01108;
    @BindView(R.id.mp02chc01109)
    CheckBox mp02chc01109;
    @BindView(R.id.mp02chc01110)
    CheckBox mp02chc01110;
    @BindView(R.id.mp02chc01111)
    CheckBox mp02chc01111;
    @BindView(R.id.mp02chc01112)
    CheckBox mp02chc01112;
    @BindView(R.id.mp02chc01113)
    CheckBox mp02chc01113;
    @BindView(R.id.mp02chc01188)
    CheckBox mp02chc01188;
    @BindView(R.id.dce0696x)
    EditText dce0696x;
    @BindView(R.id.mp02chc012)
    RadioGroup mp02chc012;
    @BindView(R.id.mp02chc01201)
    RadioButton mp02chc01201;
    @BindView(R.id.mp02chc01202)
    RadioButton mp02chc01202;
    @BindView(R.id.mp02chc01203)
    RadioButton mp02chc01203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_chc);
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
        Intent secd = new Intent(this, SectionDActivity.class);
        startActivity(secd);

    }


}
