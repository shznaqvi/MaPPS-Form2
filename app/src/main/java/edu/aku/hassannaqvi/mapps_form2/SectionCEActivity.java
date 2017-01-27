package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionCEActivity extends Activity {

    @BindView(R.id.activity_section_ce)
    RelativeLayout activitySectionCe;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02ce00101)
    CheckBox mp02ce00101;
    @BindView(R.id.mp02ce00102)
    CheckBox mp02ce00102;
    @BindView(R.id.mp02ce00103)
    CheckBox mp02ce00103;
    @BindView(R.id.mp02ce00104)
    CheckBox mp02ce00104;
    @BindView(R.id.mp02ce00105)
    CheckBox mp02ce00105;
    @BindView(R.id.mp02ce00106)
    CheckBox mp02ce00106;
    @BindView(R.id.mp02ce00188)
    CheckBox mp02ce00188;
    @BindView(R.id.mp02ce00188x)
    EditText mp02ce00188x;
    @BindView(R.id.mp02ce00201)
    CheckBox mp02ce00201;
    @BindView(R.id.mp02ce00202)
    CheckBox mp02ce00202;
    @BindView(R.id.mp02ce00203)
    CheckBox mp02ce00203;
    @BindView(R.id.mp02ce00204)
    CheckBox mp02ce00204;
    @BindView(R.id.mp02ce00205)
    CheckBox mp02ce00205;
    @BindView(R.id.mp02ce00206)
    CheckBox mp02ce00206;
    @BindView(R.id.mp02ce00288)
    CheckBox mp02ce00288;
    @BindView(R.id.mp02ce00288x)
    EditText mp02ce00288x;
    @BindView(R.id.mp02ce00301)
    CheckBox mp02ce00301;
    @BindView(R.id.mp02ce00302)
    CheckBox mp02ce00302;
    @BindView(R.id.mp02ce00303)
    CheckBox mp02ce00303;
    @BindView(R.id.mp02ce00304)
    CheckBox mp02ce00304;
    @BindView(R.id.mp02ce00305)
    CheckBox mp02ce00305;
    @BindView(R.id.mp02ce00306)
    CheckBox mp02ce00306;
    @BindView(R.id.mp02ce00388)
    CheckBox mp02ce00388;
    @BindView(R.id.mp02ce00388x)
    EditText mp02ce00388x;
    @BindView(R.id.mp02ce00401)
    CheckBox mp02ce00401;
    @BindView(R.id.mp02ce00402)
    CheckBox mp02ce00402;
    @BindView(R.id.mp02ce00403)
    CheckBox mp02ce00403;
    @BindView(R.id.mp02ce00404)
    CheckBox mp02ce00404;
    @BindView(R.id.mp02ce00405)
    CheckBox mp02ce00405;
    @BindView(R.id.mp02ce00406)
    CheckBox mp02ce00406;
    @BindView(R.id.mp02ce00488)
    CheckBox mp02ce00488;
    @BindView(R.id.mp02ce00488x)
    EditText mp02ce00488x;
    @BindView(R.id.mp02ce00501)
    CheckBox mp02ce00501;
    @BindView(R.id.mp02ce00502)
    CheckBox mp02ce00502;
    @BindView(R.id.mp02ce00503)
    CheckBox mp02ce00503;
    @BindView(R.id.mp02ce00504)
    CheckBox mp02ce00504;
    @BindView(R.id.mp02ce00505)
    CheckBox mp02ce00505;
    @BindView(R.id.mp02ce00506)
    CheckBox mp02ce00506;
    @BindView(R.id.mp02ce00588)
    CheckBox mp02ce00588;
    @BindView(R.id.mp02ce00588x)
    EditText mp02ce00588x;
    @BindView(R.id.mp02ce00601)
    CheckBox mp02ce00601;
    @BindView(R.id.mp02ce00602)
    CheckBox mp02ce00602;
    @BindView(R.id.mp02ce00603)
    CheckBox mp02ce00603;
    @BindView(R.id.mp02ce00604)
    CheckBox mp02ce00604;
    @BindView(R.id.mp02ce00605)
    CheckBox mp02ce00605;
    @BindView(R.id.mp02ce00606)
    CheckBox mp02ce00606;
    @BindView(R.id.mp02ce00688)
    CheckBox mp02ce00688;
    @BindView(R.id.mp02ce00688x)
    EditText mp02ce00688x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_ce);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Intent seccf = new Intent(this, SectionCFActivity.class);
        startActivity(seccf);

    }


}
