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

public class SectionCActivity extends Activity {

    @BindView(R.id.activity_section_c)
    RelativeLayout activitySectionC;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02c001)
    TextView mp02c001;
    @BindView(R.id.mp02c002)
    RadioGroup mp02c002;
    @BindView(R.id.mp02c00201)
    RadioButton mp02c00201;
    @BindView(R.id.mp02c00202)
    RadioButton mp02c00202;
    @BindView(R.id.mp02c00203)
    RadioButton mp02c00203;
    @BindView(R.id.mp02c00204)
    RadioButton mp02c00204;
    @BindView(R.id.mp02c00205)
    RadioButton mp02c00205;
    @BindView(R.id.mp02c00206)
    RadioButton mp02c00206;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        ButterKnife.bind(this);

        mp02c001.setText(AppMain.currentParticipantName);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        if (ValidateForm()) {
            Toast.makeText(this, "Complete Sections", Toast.LENGTH_SHORT).show();
//            Intent endSec = new Intent(this, EndingActivity.class);
//            endSec.putExtra("complete", false);
//            startActivity(endSec);
            finish();
        }
    }

    public boolean ValidateForm() {

        if (mp02c002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02a013), Toast.LENGTH_SHORT).show();
            mp02c00206.setError("This data is Required!");
            return false;
        } else {
            mp02c00206.setError(null);
        }

        return true;
    }

}
