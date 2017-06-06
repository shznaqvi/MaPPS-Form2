package edu.aku.hassannaqvi.mapps_form2.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form2.AppMain;
import edu.aku.hassannaqvi.mapps_form2.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form2.R;

public class SectionCIAActivity extends Activity {

    private static final String TAG = SectionCIAActivity.class.getSimpleName();

    @BindView(R.id.activity_section_cia)
    RelativeLayout activitySectionCia;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02cia001)
    RadioGroup mp02cia001;
    @BindView(R.id.mp02cia00101)
    RadioButton mp02cia00101;
    @BindView(R.id.mp02cia00102)
    RadioButton mp02cia00102;
    @BindView(R.id.mp02cia00103)
    RadioButton mp02cia00103;
    @BindView(R.id.mp02cia00104)
    RadioButton mp02cia00104;
    @BindView(R.id.mp02cia00105)
    RadioButton mp02cia00105;
    @BindView(R.id.mp02cia002)
    RadioGroup mp02cia002;
    @BindView(R.id.mp02cia00201)
    RadioButton mp02cia00201;
    @BindView(R.id.mp02cia00202)
    RadioButton mp02cia00202;
    @BindView(R.id.mp02cia00203)
    RadioButton mp02cia00203;
    @BindView(R.id.mp02cia00204)
    RadioButton mp02cia00204;
    @BindView(R.id.mp02cia00205)
    RadioButton mp02cia00205;
    @BindView(R.id.mp02cia003)
    RadioGroup mp02cia003;
    @BindView(R.id.mp02cia00301)
    RadioButton mp02cia00301;
    @BindView(R.id.mp02cia00302)
    RadioButton mp02cia00302;
    @BindView(R.id.mp02cia00303)
    RadioButton mp02cia00303;
    @BindView(R.id.mp02cia00304)
    RadioButton mp02cia00304;
    @BindView(R.id.mp02cia00305)
    RadioButton mp02cia00305;
    @BindView(R.id.mp02cia004)
    RadioGroup mp02cia004;
    @BindView(R.id.mp02cia00401)
    RadioButton mp02cia00401;
    @BindView(R.id.mp02cia00402)
    RadioButton mp02cia00402;
    @BindView(R.id.mp02cia00403)
    RadioButton mp02cia00403;
    @BindView(R.id.mp02cia00404)
    RadioButton mp02cia00404;
    @BindView(R.id.mp02cia00405)
    RadioButton mp02cia00405;
    @BindView(R.id.mp02cia005)
    RadioGroup mp02cia005;
    @BindView(R.id.mp02cia00501)
    RadioButton mp02cia00501;
    @BindView(R.id.mp02cia00502)
    RadioButton mp02cia00502;
    @BindView(R.id.mp02cia00503)
    RadioButton mp02cia00503;
    @BindView(R.id.mp02cia00504)
    RadioButton mp02cia00504;
    @BindView(R.id.mp02cia00505)
    RadioButton mp02cia00505;
    @BindView(R.id.mp02cia006)
    RadioGroup mp02cia006;
    @BindView(R.id.mp02cia00601)
    RadioButton mp02cia00601;
    @BindView(R.id.mp02cia00602)
    RadioButton mp02cia00602;
    @BindView(R.id.mp02cia00603)
    RadioButton mp02cia00603;
    @BindView(R.id.mp02cia00604)
    RadioButton mp02cia00604;
    @BindView(R.id.mp02cia00605)
    RadioButton mp02cia00605;
    @BindView(R.id.mp02cia007)
    RadioGroup mp02cia007;
    @BindView(R.id.mp02cia00701)
    RadioButton mp02cia00701;
    @BindView(R.id.mp02cia00702)
    RadioButton mp02cia00702;
    @BindView(R.id.mp02cia00703)
    RadioButton mp02cia00703;
    @BindView(R.id.mp02cia00704)
    RadioButton mp02cia00704;
    @BindView(R.id.mp02cia00705)
    RadioButton mp02cia00705;
    @BindView(R.id.mp02cia008)
    RadioGroup mp02cia008;
    @BindView(R.id.mp02cia00801)
    RadioButton mp02cia00801;
    @BindView(R.id.mp02cia00802)
    RadioButton mp02cia00802;
    @BindView(R.id.mp02cia00803)
    RadioButton mp02cia00803;
    @BindView(R.id.mp02cia00804)
    RadioButton mp02cia00804;
    @BindView(R.id.mp02cia00805)
    RadioButton mp02cia00805;
    @BindView(R.id.mp02cia009)
    RadioGroup mp02cia009;
    @BindView(R.id.mp02cia00901)
    RadioButton mp02cia00901;
    @BindView(R.id.mp02cia00902)
    RadioButton mp02cia00902;
    @BindView(R.id.mp02cia00903)
    RadioButton mp02cia00903;
    @BindView(R.id.mp02cia00904)
    RadioButton mp02cia00904;
    @BindView(R.id.mp02cia00905)
    RadioButton mp02cia00905;
    @BindView(R.id.mp02cia010)
    RadioGroup mp02cia010;
    @BindView(R.id.mp02cia01001)
    RadioButton mp02cia01001;
    @BindView(R.id.mp02cia01002)
    RadioButton mp02cia01002;
    @BindView(R.id.mp02cia01003)
    RadioButton mp02cia01003;
    @BindView(R.id.mp02cia01004)
    RadioButton mp02cia01004;
    @BindView(R.id.mp02cia01005)
    RadioButton mp02cia01005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cia);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

//        if (ValidateForm()) {
//            try {
//                SaveDraft();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            if (UpdateDB()) {
        finish();
                Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, SectionCActivity.class);
                endSec.putExtra("complete", false);
                startActivity(endSec);
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();


        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();
                Intent secchb = new Intent(this, SectionCIBActivity.class);
                startActivity(secchb);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean ValidateForm() {

//        1
        if (mp02cia001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cia001), Toast.LENGTH_SHORT).show();
            mp02cia00105.setError("This data is Required!");

            Log.i(TAG, "mp02cia001: This data is Required!");
            return false;
        } else {
            mp02cia00105.setError(null);
        }

//        2
        if (mp02cia002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cia002), Toast.LENGTH_SHORT).show();
            mp02cia00205.setError("This data is Required!");

            Log.i(TAG, "mp02cia002: This data is Required!");
            return false;
        } else {
            mp02cia00205.setError(null);
        }

//        3
        if (mp02cia003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cia003), Toast.LENGTH_SHORT).show();
            mp02cia00305.setError("This data is Required!");

            Log.i(TAG, "mp02cia003: This data is Required!");
            return false;
        } else {
            mp02cia00305.setError(null);
        }

//        4
        if (mp02cia004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cia004), Toast.LENGTH_SHORT).show();
            mp02cia00405.setError("This data is Required!");

            Log.i(TAG, "mp02cia004: This data is Required!");
            return false;
        } else {
            mp02cia00405.setError(null);
        }

//        5
        if (mp02cia005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cia005), Toast.LENGTH_SHORT).show();
            mp02cia00505.setError("This data is Required!");

            Log.i(TAG, "mp02cia005: This data is Required!");
            return false;
        } else {
            mp02cia00505.setError(null);
        }

//        6
        if (mp02cia006.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cia006), Toast.LENGTH_SHORT).show();
            mp02cia00605.setError("This data is Required!");

            Log.i(TAG, "mp02cia006: This data is Required!");
            return false;
        } else {
            mp02cia00605.setError(null);
        }

//       7
        if (mp02cia007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cia007), Toast.LENGTH_SHORT).show();
            mp02cia00705.setError("This data is Required!");

            Log.i(TAG, "mp02cia001: This data is Required!");
            return false;
        } else {
            mp02cia00705.setError(null);
        }

//        8
        if (mp02cia008.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cia008), Toast.LENGTH_SHORT).show();
            mp02cia00805.setError("This data is Required!");

            Log.i(TAG, "mp02cia008: This data is Required!");
            return false;
        } else {
            mp02cia00805.setError(null);
        }

//        9
        if (mp02cia009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cia009), Toast.LENGTH_SHORT).show();
            mp02cia00905.setError("This data is Required!");

            Log.i(TAG, "mp02cia009: This data is Required!");
            return false;
        } else {
            mp02cia00905.setError(null);
        }

//        10
        if (mp02cia010.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cia010), Toast.LENGTH_SHORT).show();
            mp02cia01005.setError("This data is Required!");

            Log.i(TAG, "mp02cia010: This data is Required!");
            return false;
        } else {
            mp02cia01005.setError(null);
        }

        return true;
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateCIA();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject SCIA = new JSONObject();

        SCIA.put("mp02cia001", mp02cia00101.isChecked() ? "1" : mp02cia00102.isChecked() ? "2" : mp02cia00103.isChecked() ? "3"
                : mp02cia00104.isChecked() ? "4" : mp02cia00105.isChecked() ? "5" : "0");
        SCIA.put("mp02cia002", mp02cia00201.isChecked() ? "1" : mp02cia00202.isChecked() ? "2" : mp02cia00203.isChecked() ? "3"
                : mp02cia00204.isChecked() ? "4" : mp02cia00205.isChecked() ? "5" : "0");
        SCIA.put("mp02cia003", mp02cia00301.isChecked() ? "1" : mp02cia00302.isChecked() ? "2" : mp02cia00303.isChecked() ? "3"
                : mp02cia00304.isChecked() ? "4" : mp02cia00305.isChecked() ? "5" : "0");
        SCIA.put("mp02cia004", mp02cia00401.isChecked() ? "1" : mp02cia00402.isChecked() ? "2" : mp02cia00403.isChecked() ? "3"
                : mp02cia00404.isChecked() ? "4" : mp02cia00405.isChecked() ? "5" : "0");
        SCIA.put("mp02cia005", mp02cia00501.isChecked() ? "1" : mp02cia00502.isChecked() ? "2" : mp02cia00503.isChecked() ? "3"
                : mp02cia00504.isChecked() ? "4" : mp02cia00505.isChecked() ? "5" : "0");
        SCIA.put("mp02cia006", mp02cia00601.isChecked() ? "1" : mp02cia00602.isChecked() ? "2" : mp02cia00603.isChecked() ? "3"
                : mp02cia00604.isChecked() ? "4" : mp02cia00605.isChecked() ? "5" : "0");
        SCIA.put("mp02cia007", mp02cia00701.isChecked() ? "1" : mp02cia00702.isChecked() ? "2" : mp02cia00703.isChecked() ? "3"
                : mp02cia00704.isChecked() ? "4" : mp02cia00705.isChecked() ? "5" : "0");
        SCIA.put("mp02cia008", mp02cia00801.isChecked() ? "1" : mp02cia00802.isChecked() ? "2" : mp02cia00803.isChecked() ? "3"
                : mp02cia00804.isChecked() ? "4" : mp02cia00805.isChecked() ? "5" : "0");
        SCIA.put("mp02cia009", mp02cia00901.isChecked() ? "1" : mp02cia00902.isChecked() ? "2" : mp02cia00903.isChecked() ? "3"
                : mp02cia00904.isChecked() ? "4" : mp02cia00905.isChecked() ? "5" : "0");
        SCIA.put("mp02cia010", mp02cia01001.isChecked() ? "1" : mp02cia01002.isChecked() ? "2" : mp02cia01003.isChecked() ? "3"
                : mp02cia01004.isChecked() ? "4" : mp02cia01005.isChecked() ? "5" : "0");

        AppMain.pc.setsCIA(String.valueOf(SCIA));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
