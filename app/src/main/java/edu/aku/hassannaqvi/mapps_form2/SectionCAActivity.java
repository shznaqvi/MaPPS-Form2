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

public class SectionCAActivity extends Activity {

    @BindView(R.id.activity_section_ca)
    RelativeLayout activitySectionCa;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02ca00101)
    RadioGroup mp02ca00101;
    @BindView(R.id.mp02ca00102)
    RadioButton mp02ca00102;
    @BindView(R.id.mp02bb00102)
    RadioButton mp02bb00102;
    @BindView(R.id.mp02ca002)
    RadioGroup mp02ca002;
    @BindView(R.id.mp02ca00201)
    RadioButton mp02ca00201;
    @BindView(R.id.mp02bb00202)
    RadioButton mp02bb00202;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_ca);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Intent seccb = new Intent(this, SectionCBActivity.class);
        startActivity(seccb);

    }

}
