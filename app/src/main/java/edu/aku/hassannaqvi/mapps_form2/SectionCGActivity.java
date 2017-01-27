package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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

public class SectionCGActivity extends Activity {

    @BindView(R.id.activity_section_cg)
    RelativeLayout activitySectionCg;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02cg001)
    RadioGroup mp02cg001;
    @BindView(R.id.mp02cg00101)
    RadioButton mp02cg00101;
    @BindView(R.id.mp02cg00102)
    RadioButton mp02cg00102;
    @BindView(R.id.mp02cg002)
    RadioGroup mp02cg002;
    @BindView(R.id.mp02cg00201)
    RadioButton mp02cg00201;
    @BindView(R.id.mp02cg00202)
    RadioButton mp02cg00202;
    @BindView(R.id.mp02cg00203)
    RadioButton mp02cg00203;
    @BindView(R.id.mp02cg00204)
    RadioButton mp02cg00204;
    @BindView(R.id.mp02cg00205)
    RadioButton mp02cg00205;
    @BindView(R.id.mp02cg00301)
    EditText mp02cg00301;
    @BindView(R.id.mp02cg00302)
    EditText mp02cg00302;
    @BindView(R.id.mp02cg004)
    RadioGroup mp02cg004;
    @BindView(R.id.mp02cg00401)
    RadioButton mp02cg00401;
    @BindView(R.id.mp02cg00402)
    RadioButton mp02cg00402;
    @BindView(R.id.mp02cg00403)
    RadioButton mp02cg00403;
    @BindView(R.id.mp02cg00404)
    RadioButton mp02cg00404;
    @BindView(R.id.mp02cg00488)
    RadioButton mp02cg00488;
    @BindView(R.id.mp02cg00488x)
    EditText mp02cg00488x;
    @BindView(R.id.mp02cg005)
    RadioGroup mp02cg005;
    @BindView(R.id.mp02cg00501)
    RadioButton mp02cg00501;
    @BindView(R.id.mp02cg00502)
    RadioButton mp02cg00502;
    @BindView(R.id.mp02cg00503)
    RadioButton mp02cg00503;
    @BindView(R.id.mp02cg00504)
    RadioButton mp02cg00504;
    @BindView(R.id.mp02cg00599)
    RadioButton mp02cg00599;
    @BindView(R.id.mp02cg006)
    RadioGroup mp02cg006;
    @BindView(R.id.mp02cg00601)
    RadioButton mp02cg00601;
    @BindView(R.id.mp02cg00602)
    RadioButton mp02cg00602;
    @BindView(R.id.mp02cg00603)
    RadioButton mp02cg00603;
    @BindView(R.id.mp02cg00604)
    RadioButton mp02cg00604;
    @BindView(R.id.mp02cg00605)
    RadioButton mp02cg00605;
    @BindView(R.id.mp02cg00701)
    EditText mp02cg00701;
    @BindView(R.id.mp02cg00702)
    EditText mp02cg00702;
    @BindView(R.id.mp02cg008)
    RadioGroup mp02cg008;
    @BindView(R.id.mp02cg00801)
    RadioButton mp02cg00801;
    @BindView(R.id.mp02cg00802)
    RadioButton mp02cg00802;
    @BindView(R.id.mp02cg00803)
    RadioButton mp02cg00803;
    @BindView(R.id.mp02cg00804)
    RadioButton mp02cg00804;
    @BindView(R.id.mp02cg00888)
    RadioButton mp02cg00888;
    @BindView(R.id.mp02cg00888x)
    EditText mp02cg00888x;
    @BindView(R.id.mp02cg009)
    RadioGroup mp02cg009;
    @BindView(R.id.mp02cg00901)
    RadioButton mp02cg00901;
    @BindView(R.id.mp02cg00902)
    RadioButton mp02cg00902;
    @BindView(R.id.mp02cg010)
    RadioGroup mp02cg010;
    @BindView(R.id.mp02cg01001)
    RadioButton mp02cg01001;
    @BindView(R.id.mp02cg01002)
    RadioButton mp02cg01002;
    @BindView(R.id.mp02cg01003)
    RadioButton mp02cg01003;
    @BindView(R.id.mp02cg01004)
    RadioButton mp02cg01004;
    @BindView(R.id.mp02cg01005)
    RadioButton mp02cg01005;
    @BindView(R.id.mp02cg01101)
    EditText mp02cg01101;
    @BindView(R.id.mp02cg01102)
    EditText mp02cg01102;
    @BindView(R.id.mp02cg012)
    RadioGroup mp02cg012;
    @BindView(R.id.mp02cg01201)
    RadioButton mp02cg01201;
    @BindView(R.id.mp02cg01202)
    RadioButton mp02cg01202;
    @BindView(R.id.mp02cg01203)
    RadioButton mp02cg01203;
    @BindView(R.id.mp02cg01204)
    RadioButton mp02cg01204;
    @BindView(R.id.mp02cg01288)
    RadioButton mp02cg01288;
    @BindView(R.id.mp02cg01288x)
    EditText mp02cg01288x;
    @BindView(R.id.mp02cg013)
    RadioGroup mp02cg013;
    @BindView(R.id.mp02cg01301)
    RadioButton mp02cg01301;
    @BindView(R.id.mp02cg01302)
    RadioButton mp02cg01302;
    @BindView(R.id.mp02cg01303)
    RadioButton mp02cg01303;
    @BindView(R.id.mp02cg01304)
    RadioButton mp02cg01304;
    @BindView(R.id.mp02cg01399)
    RadioButton mp02cg01399;
    @BindView(R.id.mp02cg014)
    RadioGroup mp02cg014;
    @BindView(R.id.mp02cg01401)
    RadioButton mp02cg01401;
    @BindView(R.id.mp02cg01402)
    RadioButton mp02cg01402;
    @BindView(R.id.mp02cg01403)
    RadioButton mp02cg01403;
    @BindView(R.id.mp02cg01404)
    RadioButton mp02cg01404;
    @BindView(R.id.mp02cg01405)
    RadioButton mp02cg01405;
    @BindView(R.id.mp02cg01501)
    EditText mp02cg01501;
    @BindView(R.id.mp02cg01502)
    EditText mp02cg01502;
    @BindView(R.id.mp02cg016)
    RadioGroup mp02cg016;
    @BindView(R.id.mp02cg01601)
    RadioButton mp02cg01601;
    @BindView(R.id.mp02cg01602)
    RadioButton mp02cg01602;
    @BindView(R.id.mp02cg01603)
    RadioButton mp02cg01603;
    @BindView(R.id.mp02cg01604)
    RadioButton mp02cg01604;
    @BindView(R.id.mp02cg01688)
    RadioButton mp02cg01688;
    @BindView(R.id.mp02cg01688x)
    EditText mp02cg01688x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cg);
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
        Intent seccha = new Intent(this, SectionCHAActivity.class);
        startActivity(seccha);

    }


}
