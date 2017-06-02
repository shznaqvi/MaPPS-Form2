package edu.aku.hassannaqvi.mapps_form2.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form2.R;

public class AccessToLHWActivity extends Activity {

    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02cg00101)
    EditText mp02cg00101;
    @BindView(R.id.mp02cg00102)
    EditText mp02cg00102;
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
    @BindView(R.id.mp02cg00288)
    RadioButton mp02cg00288;
    @BindView(R.id.mp02cg00288x)
    EditText mp02cg00288x;
    @BindView(R.id.mp02cg003)
    RadioGroup mp02cg003;
    @BindView(R.id.mp02cg00301)
    RadioButton mp02cg00301;
    @BindView(R.id.mp02cg00302)
    RadioButton mp02cg00302;
    @BindView(R.id.mp02cg00303)
    RadioButton mp02cg00303;
    @BindView(R.id.mp02cg00304)
    RadioButton mp02cg00304;
    @BindView(R.id.mp02cg00305)
    RadioButton mp02cg00305;
    @BindView(R.id.mp02cg00306)
    RadioButton mp02cg00306;
    @BindView(R.id.mp02cg00307)
    RadioButton mp02cg00307;
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
    @BindView(R.id.mp02cg005)
    RadioGroup mp02cg005;
    @BindView(R.id.mp02cg00501)
    RadioButton mp02cg00501;
    @BindView(R.id.mp02cg00502)
    RadioButton mp02cg00502;
    @BindView(R.id.fldGrpmp02cg006)
    LinearLayout fldGrpmp02cg006;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_to_lhw);
        ButterKnife.bind(this);

        mp02cg00288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cg00288x.setVisibility(View.VISIBLE);
                } else {
                    mp02cg00288x.setVisibility(View.GONE);
                    mp02cg00288x.setText(null);
                }
            }
        });
        

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement
    }

    
}
