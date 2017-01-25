package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TimePicker;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionAActivity extends Activity {

    @BindView(R.id.activity_section_a)
    RelativeLayout activitySectionA;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02a001)
    EditText mp02a001;
    @BindView(R.id.mp02a002)
    EditText mp02a002;
    @BindView(R.id.mp02a003)
    EditText mp02a003;
    @BindView(R.id.mp02a005)
    EditText mp02a005;
    @BindView(R.id.mp02a006)
    EditText mp02a006;
    @BindView(R.id.mp02a007)
    EditText mp02a007;
    @BindView(R.id.mp02a008)
    EditText mp02a008;
    @BindView(R.id.mp02a009)
    EditText mp02a009;
    @BindView(R.id.mp02a010)
    EditText mp02a010;
    @BindView(R.id.mn02a011)
    DatePicker mn02a011;
    @BindView(R.id.mp02a012)
    TimePicker mp02a012;
    @BindView(R.id.mp02a013)
    RadioGroup mp02a013;
    @BindView(R.id.mp02a01301)
    RadioButton mp02a01301;
    @BindView(R.id.mp02a1302)
    RadioButton mp02a1302;
    @BindView(R.id.mp02a014)
    RadioGroup mp02a014;
    @BindView(R.id.mp02a01401)
    RadioButton mp02a01401;
    @BindView(R.id.mp02a01402)
    RadioButton mp02a01402;
    @BindView(R.id.mp02a01403)
    RadioButton mp02a01403;
    @BindView(R.id.mp02a01404)
    RadioButton mp02a01404;
    @BindView(R.id.mp02a01405)
    RadioButton mp02a01405;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Intent secba = new Intent(this, SectionBAActivity.class);
        startActivity(secba);

    }


}
