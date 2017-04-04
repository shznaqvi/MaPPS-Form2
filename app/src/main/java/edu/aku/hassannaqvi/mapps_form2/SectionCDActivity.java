package edu.aku.hassannaqvi.mapps_form2;

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

public class SectionCDActivity extends Activity {

    private static final String TAG = SectionCDActivity.class.getSimpleName();

    @BindView(R.id.activity_section_cd)
    RelativeLayout activitySectionCd;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02cd001)
    RadioGroup mp02cd001;
    @BindView(R.id.mp02cd00101)
    RadioButton mp02cd00101;
    @BindView(R.id.mp02cd00102)
    RadioButton mp02cd00102;
    @BindView(R.id.mp02cd00103)
    RadioButton mp02cd00103;
    @BindView(R.id.mp02cd00104)
    RadioButton mp02cd00104;
    @BindView(R.id.mp02cd00105)
    RadioButton mp02cd00105;
    @BindView(R.id.mp02cd002)
    RadioGroup mp02cd002;
    @BindView(R.id.mp02cd00201)
    RadioButton mp02cd00201;
    @BindView(R.id.mp02cd00202)
    RadioButton mp02cd00202;
    @BindView(R.id.mp02cd00203)
    RadioButton mp02cd00203;
    @BindView(R.id.mp02cd00204)
    RadioButton mp02cd00204;
    @BindView(R.id.mp02cd00205)
    RadioButton mp02cd00205;
    @BindView(R.id.mp02cd003)
    RadioGroup mp02cd003;
    @BindView(R.id.mp02cd00301)
    RadioButton mp02cd00301;
    @BindView(R.id.mp02cd00302)
    RadioButton mp02cd00302;
    @BindView(R.id.mp02cd00303)
    RadioButton mp02cd00303;
    @BindView(R.id.mp02cd00304)
    RadioButton mp02cd00304;
    @BindView(R.id.mp02cd00305)
    RadioButton mp02cd00305;
    @BindView(R.id.mp02cd004)
    RadioGroup mp02cd004;
    @BindView(R.id.mp02cd00401)
    RadioButton mp02cd00401;
    @BindView(R.id.mp02cd00402)
    RadioButton mp02cd00402;
    @BindView(R.id.mp02cd00403)
    RadioButton mp02cd00403;
    @BindView(R.id.mp02cd00404)
    RadioButton mp02cd00404;
    @BindView(R.id.mp02cd00405)
    RadioButton mp02cd00405;
    @BindView(R.id.mp02cd005)
    RadioGroup mp02cd005;
    @BindView(R.id.mp02cd00501)
    RadioButton mp02cd00501;
    @BindView(R.id.mp02cd00502)
    RadioButton mp02cd00502;
    @BindView(R.id.mp02cd00503)
    RadioButton mp02cd00503;
    @BindView(R.id.mp02cd00504)
    RadioButton mp02cd00504;
    @BindView(R.id.mp02cd00505)
    RadioButton mp02cd00505;
    @BindView(R.id.mp02cd006)
    RadioGroup mp02cd006;
    @BindView(R.id.mp02cd00601)
    RadioButton mp02cd00601;
    @BindView(R.id.mp02cd00602)
    RadioButton mp02cd00602;
    @BindView(R.id.mp02cd00603)
    RadioButton mp02cd00603;
    @BindView(R.id.mp02cd00604)
    RadioButton mp02cd00604;
    @BindView(R.id.mp02cd00605)
    RadioButton mp02cd00605;
    @BindView(R.id.mp02cd007)
    RadioGroup mp02cd007;
    @BindView(R.id.mp02cd00701)
    RadioButton mp02cd00701;
    @BindView(R.id.mp02cd00702)
    RadioButton mp02cd00702;
    @BindView(R.id.mp02cd00703)
    RadioButton mp02cd00703;
    @BindView(R.id.mp02cd00704)
    RadioButton mp02cd00704;
    @BindView(R.id.mp02cd00705)
    RadioButton mp02cd00705;
    @BindView(R.id.mp02cd008)
    RadioGroup mp02cd008;
    @BindView(R.id.mp02cd00801)
    RadioButton mp02cd00801;
    @BindView(R.id.mp02cd00802)
    RadioButton mp02cd00802;
    @BindView(R.id.mp02cd00803)
    RadioButton mp02cd00803;
    @BindView(R.id.mp02cd00804)
    RadioButton mp02cd00804;
    @BindView(R.id.mp02cd00805)
    RadioButton mp02cd00805;
    @BindView(R.id.mp02cd009)
    RadioGroup mp02cd009;
    @BindView(R.id.mp02cd00901)
    RadioButton mp02cd00901;
    @BindView(R.id.mp02cd00902)
    RadioButton mp02cd00902;
    @BindView(R.id.mp02cd00903)
    RadioButton mp02cd00903;
    @BindView(R.id.mp02cd00904)
    RadioButton mp02cd00904;
    @BindView(R.id.mp02cd00905)
    RadioButton mp02cd00905;
    @BindView(R.id.mp02cd010)
    RadioGroup mp02cd010;
    @BindView(R.id.mp02cd01001)
    RadioButton mp02cd01001;
    @BindView(R.id.mp02cd01002)
    RadioButton mp02cd01002;
    @BindView(R.id.mp02cd01003)
    RadioButton mp02cd01003;
    @BindView(R.id.mp02cd01004)
    RadioButton mp02cd01004;
    @BindView(R.id.mp02cd01005)
    RadioButton mp02cd01005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cd);
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
                Intent secce = new Intent(this, SectionCEActivity.class);
                startActivity(secce);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sCD = new JSONObject();

        sCD.put("mp02cd001", mp02cd00101.isChecked() ? "1" : mp02cd00102.isChecked() ? "2" : mp02cd00103.isChecked() ? "3"
                : mp02cd00104.isChecked() ? "4" : mp02cd00105.isChecked() ? "5" : "0");

        sCD.put("mp02cd002", mp02cd00201.isChecked() ? "1" : mp02cd00202.isChecked() ? "2" : mp02cd00203.isChecked() ? "3"
                : mp02cd00204.isChecked() ? "4" : mp02cd00205.isChecked() ? "5" : "0");

        sCD.put("mp02cd003", mp02cd00301.isChecked() ? "1" : mp02cd00302.isChecked() ? "2" : mp02cd00303.isChecked() ? "3"
                : mp02cd00304.isChecked() ? "4" : mp02cd00305.isChecked() ? "5" : "0");

        sCD.put("mp02cd004", mp02cd00401.isChecked() ? "1" : mp02cd00402.isChecked() ? "2" : mp02cd00403.isChecked() ? "3"
                : mp02cd00404.isChecked() ? "4" : mp02cd00405.isChecked() ? "5" : "0");

        sCD.put("mp02cd005", mp02cd00501.isChecked() ? "1" : mp02cd00502.isChecked() ? "2" : mp02cd00503.isChecked() ? "3"
                : mp02cd00504.isChecked() ? "4" : mp02cd00505.isChecked() ? "5" : "0");

        sCD.put("mp02cd006", mp02cd00601.isChecked() ? "1" : mp02cd00602.isChecked() ? "2" : mp02cd00603.isChecked() ? "3"
                : mp02cd00604.isChecked() ? "4" : mp02cd00605.isChecked() ? "5" : "0");

        sCD.put("mp02cd007", mp02cd00701.isChecked() ? "1" : mp02cd00702.isChecked() ? "2" : mp02cd00703.isChecked() ? "3"
                : mp02cd00704.isChecked() ? "4" : mp02cd00705.isChecked() ? "5" : "0");

        sCD.put("mp02cd008", mp02cd00801.isChecked() ? "1" : mp02cd00802.isChecked() ? "2" : mp02cd00803.isChecked() ? "3"
                : mp02cd00804.isChecked() ? "4" : mp02cd00805.isChecked() ? "5" : "0");

        sCD.put("mp02cd009", mp02cd00901.isChecked() ? "1" : mp02cd00902.isChecked() ? "2" : mp02cd00903.isChecked() ? "3"
                : mp02cd00904.isChecked() ? "4" : mp02cd00905.isChecked() ? "5" : "0");

        sCD.put("mp02cd010", mp02cd01001.isChecked() ? "1" : mp02cd01002.isChecked() ? "2" : mp02cd01003.isChecked() ? "3"
                : mp02cd01004.isChecked() ? "4" : mp02cd01005.isChecked() ? "5" : "0");

        AppMain.pc.setsCD(String.valueOf(sCD));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateCD();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    public boolean ValidateForm() {


//        1
        if (mp02cd001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cd001), Toast.LENGTH_SHORT).show();
            mp02cd00105.setError("This data is Required!");

            Log.i(TAG, "mp02cd001: This data is Required!");
            return false;
        } else {
            mp02cd00105.setError(null);
        }

//        1
        if (mp02cd002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cd002), Toast.LENGTH_SHORT).show();
            mp02cd00205.setError("This data is Required!");

            Log.i(TAG, "mp02cd002: This data is Required!");
            return false;
        } else {
            mp02cd00205.setError(null);
        }

//        1
        if (mp02cd003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cd003), Toast.LENGTH_SHORT).show();
            mp02cd00305.setError("This data is Required!");

            Log.i(TAG, "mp02cd003: This data is Required!");
            return false;
        } else {
            mp02cd00305.setError(null);
        }

//        1
        if (mp02cd004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cd004), Toast.LENGTH_SHORT).show();
            mp02cd00405.setError("This data is Required!");

            Log.i(TAG, "mp02cd004: This data is Required!");
            return false;
        } else {
            mp02cd00405.setError(null);
        }

//        1
        if (mp02cd005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cd005), Toast.LENGTH_SHORT).show();
            mp02cd00505.setError("This data is Required!");

            Log.i(TAG, "mp02cd005: This data is Required!");
            return false;
        } else {
            mp02cd00505.setError(null);
        }

//        1
        if (mp02cd006.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cd006), Toast.LENGTH_SHORT).show();
            mp02cd00605.setError("This data is Required!");

            Log.i(TAG, "mp02cd006: This data is Required!");
            return false;
        } else {
            mp02cd00605.setError(null);
        }

//        1
        if (mp02cd007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cd007), Toast.LENGTH_SHORT).show();
            mp02cd00705.setError("This data is Required!");

            Log.i(TAG, "mp02cd007: This data is Required!");
            return false;
        } else {
            mp02cd00705.setError(null);
        }

//        1
        if (mp02cd008.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cd008), Toast.LENGTH_SHORT).show();
            mp02cd00805.setError("This data is Required!");

            Log.i(TAG, "mp02cd008: This data is Required!");
            return false;
        } else {
            mp02cd00805.setError(null);
        }

//        1
        if (mp02cd009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cd009), Toast.LENGTH_SHORT).show();
            mp02cd00905.setError("This data is Required!");

            Log.i(TAG, "mp02cd009: This data is Required!");
            return false;
        } else {
            mp02cd00905.setError(null);
        }

//        1
        if (mp02cd010.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cd010), Toast.LENGTH_SHORT).show();
            mp02cd01005.setError("This data is Required!");

            Log.i(TAG, "mp02cd010: This data is Required!");
            return false;
        } else {
            mp02cd01005.setError(null);
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
