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

public class SectionDActivity extends Activity {

    @BindView(R.id.activity_section_d)
    RelativeLayout activitySectionD;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02d001)
    EditText mp02d001;
    @BindView(R.id.mp02d001id1)
    EditText mp02d001id1;
    @BindView(R.id.mp02d002)
    EditText mp02d002;
    @BindView(R.id.mp02d002id2)
    EditText mp02d002id2;
    @BindView(R.id.mp02d003)
    RadioGroup mp02d003;
    @BindView(R.id.mp02d00301)
    RadioButton mp02d00301;
    @BindView(R.id.mp02d00302)
    RadioButton mp02d00302;
    @BindView(R.id.mp02d004)
    EditText mp02d004;
    @BindView(R.id.mp02d004id3)
    EditText mp02d004id3;
    @BindView(R.id.mp02d005)
    EditText mp02d005;
    @BindView(R.id.mp02d005id1)
    EditText mp02d005id1;
    @BindView(R.id.mp02d006)
    EditText mp02d006;
    @BindView(R.id.mp02d006id1)
    EditText mp02d006id1;
    @BindView(R.id.mp02d007)
    RadioGroup mp02d007;
    @BindView(R.id.mp02d00701)
    RadioButton mp02d00701;
    @BindView(R.id.mp02d00702)
    RadioButton mp02d00702;
    @BindView(R.id.mp02d008)
    EditText mp02d008;
    @BindView(R.id.mp02d008id3)
    EditText mp02d008id3;
    @BindView(R.id.mp02d009)
    EditText mp02d009;
    @BindView(R.id.mp02d009id1)
    EditText mp02d009id1;
    @BindView(R.id.mp02d010)
    EditText mp02d010;
    @BindView(R.id.mp02d010id2)
    EditText mp02d010id2;
    @BindView(R.id.mp02d011)
    RadioGroup mp02d011;
    @BindView(R.id.mp02d01101)
    RadioButton mp02d01101;
    @BindView(R.id.mp02d01102)
    RadioButton mp02d01102;
    @BindView(R.id.mp02d012)
    EditText mp02d012;
    @BindView(R.id.mp02d012id3)
    EditText mp02d012id3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
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
        Intent sece = new Intent(this, SectionEActivity.class);
        startActivity(sece);

    }


}
