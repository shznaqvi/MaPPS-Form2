package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EndingActivity extends Activity {

    @BindView(R.id.activity_ending)
    RelativeLayout activityEnding;
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
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Complete Sections", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, MainActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);

    }


}