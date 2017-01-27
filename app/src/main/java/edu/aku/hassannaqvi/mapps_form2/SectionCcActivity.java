package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionCCActivity extends Activity  {

    @BindView(R.id.activity_section_cc) RelativeLayout activitySectionCc;
    @BindView(R.id.scrollView01) ScrollView scrollView01;
    @BindView(R.id.app_header) TextView appHeader;
    @BindView(R.id.mp02cc001) EditText mp02cc001;
    @BindView(R.id.mp02cc002) RadioGroup mp02cc002;
    @BindView(R.id.mp02cc00201) RadioButton mp02cc00201;
    @BindView(R.id.mp02cc00202) RadioButton mp02cc00202;
    @BindView(R.id.mp02cc00203) RadioButton mp02cc00203;
    @BindView(R.id.mp02cc00204) RadioButton mp02cc00204;
    @BindView(R.id.mp02cc00205) RadioButton mp02cc00205;
    @BindView(R.id.mp02cc003) RadioGroup mp02cc003;
    @BindView(R.id.mp02cc00301) RadioButton mp02cc00301;
    @BindView(R.id.mp02cc00302) RadioButton mp02cc00302;
    @BindView(R.id.mp02cc00303) RadioButton mp02cc00303;
    @BindView(R.id.mp02cc00304) RadioButton mp02cc00304;
    @BindView(R.id.mp02cc004) RadioGroup mp02cc004;
    @BindView(R.id.mp02cc00401) RadioButton mp02cc00401;
    @BindView(R.id.mp02cc00402) RadioButton mp02cc00402;
    @BindView(R.id.mp02cc00403) RadioButton mp02cc00403;
    @BindView(R.id.mp02cc00404) RadioButton mp02cc00404;
    @BindView(R.id.mp02cc00405) RadioButton mp02cc00405;
    @BindView(R.id.mp02cc00406) RadioButton mp02cc00406;
    @BindView(R.id.mp02cc00407) RadioButton mp02cc00407;
    @BindView(R.id.mp02cc005) RadioGroup mp02cc005;
    @BindView(R.id.mp02cc00501) RadioButton mp02cc00501;
    @BindView(R.id.mp02cc00502) RadioButton mp02cc00502;
    @BindView(R.id.mp02cc00503) RadioButton mp02cc00503;
    @BindView(R.id.mp02cc00504) RadioButton mp02cc00504;
    @BindView(R.id.mp02cc00505) RadioButton mp02cc00505;
    @BindView(R.id.mp02cc00506) RadioButton mp02cc00506;
    //@BindView(R.id.mp02cc006) DiscreteLabelSlider mp02cc006;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cc);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End) void onBtnEndClick() {
        //TODO implement
    }


    @OnClick(R.id.btn_Continue) void onBtnContinueClick() {
        //TODO implement
    }


}
