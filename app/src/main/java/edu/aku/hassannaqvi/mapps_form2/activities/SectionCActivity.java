package edu.aku.hassannaqvi.mapps_form2.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form2.AppMain;
import edu.aku.hassannaqvi.mapps_form2.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form2.R;

public class SectionCActivity extends Activity {

    private static final String TAG = SectionCActivity.class.getSimpleName();

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
    @BindView(R.id.mp02c00207)
    RadioButton mp02c00207;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        ButterKnife.bind(this);

        mp02c001.setText(AppMain.currentParticipantName);

        Boolean check = getIntent().getExtras().getBoolean("complete");

        if (check) {

            AppMain.endFlag = true;

            mp02c00201.setEnabled(true);
            mp02c00202.setEnabled(false);
            mp02c00203.setEnabled(false);
            mp02c00204.setEnabled(false);
            mp02c00205.setEnabled(false);
            mp02c00206.setEnabled(false);
            mp02c00207.setEnabled(false);
        } else {
            mp02c00201.setEnabled(false);
            mp02c00202.setEnabled(true);
            mp02c00203.setEnabled(true);
            mp02c00204.setEnabled(true);
            mp02c00205.setEnabled(true);
            mp02c00206.setEnabled(true);
            mp02c00207.setEnabled(true);
        }

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Complete Sections", Toast.LENGTH_SHORT).show();
//            Intent endSec = new Intent(this, EndingActivity.class);
//            endSec.putExtra("complete", false);
//            startActivity(endSec);
                finish();
            }
        }
    }

    public boolean ValidateForm() {

        if (mp02c002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02a013), Toast.LENGTH_SHORT).show();
            mp02c00206.setError("This data is Required!");

            Log.i(TAG, "mp02c002: This data is Required!");
            return false;
        } else {
            mp02c00206.setError(null);
        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        AppMain.pc.setIstatus(mp02c00201.isChecked() ? "1" : mp02c00202.isChecked() ? "2" : mp02c00203.isChecked() ? "3" : mp02c00204.isChecked() ? "4"
                : mp02c00205.isChecked() ? "5" : mp02c00206.isChecked() ? "6" : mp02c00207.isChecked() ? "7" : "0");
        AppMain.pc.setApp_version(AppMain.versionName + "." + AppMain.versionCode);
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateParticipantEnding();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
