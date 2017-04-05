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

public class SectionCHAActivity extends Activity {

    private static final String TAG = SectionCHAActivity.class.getSimpleName();

    @BindView(R.id.activity_section_cha)
    RelativeLayout activitySectionCha;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02cha001)
    RadioGroup mp02cha001;
    @BindView(R.id.mp02cha00101)
    RadioButton mp02cha00101;
    @BindView(R.id.mp02cha00102)
    RadioButton mp02cha00102;
    @BindView(R.id.mp02cha00103)
    RadioButton mp02cha00103;
    @BindView(R.id.mp02cha00104)
    RadioButton mp02cha00104;
    @BindView(R.id.mp02cha00105)
    RadioButton mp02cha00105;
    @BindView(R.id.mp02cha002)
    RadioGroup mp02cha002;
    @BindView(R.id.mp02cha00201)
    RadioButton mp02cha00201;
    @BindView(R.id.mp02cha00202)
    RadioButton mp02cha00202;
    @BindView(R.id.mp02cha00203)
    RadioButton mp02cha00203;
    @BindView(R.id.mp02cha00204)
    RadioButton mp02cha00204;
    @BindView(R.id.mp02cha00205)
    RadioButton mp02cha00205;
    @BindView(R.id.mp02cha003)
    RadioGroup mp02cha003;
    @BindView(R.id.mp02cha00301)
    RadioButton mp02cha00301;
    @BindView(R.id.mp02cha00302)
    RadioButton mp02cha00302;
    @BindView(R.id.mp02cha00303)
    RadioButton mp02cha00303;
    @BindView(R.id.mp02cha00304)
    RadioButton mp02cha00304;
    @BindView(R.id.mp02cha00305)
    RadioButton mp02cha00305;
    @BindView(R.id.mp02cha004)
    RadioGroup mp02cha004;
    @BindView(R.id.mp02cha00401)
    RadioButton mp02cha00401;
    @BindView(R.id.mp02cha00402)
    RadioButton mp02cha00402;
    @BindView(R.id.mp02cha00403)
    RadioButton mp02cha00403;
    @BindView(R.id.mp02cha00404)
    RadioButton mp02cha00404;
    @BindView(R.id.mp02cha00405)
    RadioButton mp02cha00405;
    @BindView(R.id.mp02cha005)
    RadioGroup mp02cha005;
    @BindView(R.id.mp02cha00501)
    RadioButton mp02cha00501;
    @BindView(R.id.mp02cha00502)
    RadioButton mp02cha00502;
    @BindView(R.id.mp02cha00503)
    RadioButton mp02cha00503;
    @BindView(R.id.mp02cha00504)
    RadioButton mp02cha00504;
    @BindView(R.id.mp02cha00505)
    RadioButton mp02cha00505;
    @BindView(R.id.mp02cha006)
    RadioGroup mp02cha006;
    @BindView(R.id.mp02cha00601)
    RadioButton mp02cha00601;
    @BindView(R.id.mp02cha00602)
    RadioButton mp02cha00602;
    @BindView(R.id.mp02cha00603)
    RadioButton mp02cha00603;
    @BindView(R.id.mp02cha00604)
    RadioButton mp02cha00604;
    @BindView(R.id.mp02cha00605)
    RadioButton mp02cha00605;
    @BindView(R.id.mp02cha007)
    RadioGroup mp02cha007;
    @BindView(R.id.mp02cha00701)
    RadioButton mp02cha00701;
    @BindView(R.id.mp02cha00702)
    RadioButton mp02cha00702;
    @BindView(R.id.mp02cha00703)
    RadioButton mp02cha00703;
    @BindView(R.id.mp02cha00704)
    RadioButton mp02cha00704;
    @BindView(R.id.mp02cha00705)
    RadioButton mp02cha00705;
    @BindView(R.id.mp02cha008)
    RadioGroup mp02cha008;
    @BindView(R.id.mp02cha00801)
    RadioButton mp02cha00801;
    @BindView(R.id.mp02cha00802)
    RadioButton mp02cha00802;
    @BindView(R.id.mp02cha00803)
    RadioButton mp02cha00803;
    @BindView(R.id.mp02cha00804)
    RadioButton mp02cha00804;
    @BindView(R.id.mp02cha00805)
    RadioButton mp02cha00805;
    @BindView(R.id.mp02cha009)
    RadioGroup mp02cha009;
    @BindView(R.id.mp02cha00901)
    RadioButton mp02cha00901;
    @BindView(R.id.mp02cha00902)
    RadioButton mp02cha00902;
    @BindView(R.id.mp02cha00903)
    RadioButton mp02cha00903;
    @BindView(R.id.mp02cha00904)
    RadioButton mp02cha00904;
    @BindView(R.id.mp02cha00905)
    RadioButton mp02cha00905;
    @BindView(R.id.mp02cha010)
    RadioGroup mp02cha010;
    @BindView(R.id.mp02cha01001)
    RadioButton mp02cha01001;
    @BindView(R.id.mp02cha01002)
    RadioButton mp02cha01002;
    @BindView(R.id.mp02cha01003)
    RadioButton mp02cha01003;
    @BindView(R.id.mp02cha01004)
    RadioButton mp02cha01004;
    @BindView(R.id.mp02cha01005)
    RadioButton mp02cha01005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cha);
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
                Intent secchb = new Intent(this, SectionCHBActivity.class);
                startActivity(secchb);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean ValidateForm() {

//        1
        if (mp02cha001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cha001), Toast.LENGTH_SHORT).show();
            mp02cha00105.setError("This data is Required!");

            Log.i(TAG, "mp02cha001: This data is Required!");
            return false;
        } else {
            mp02cha00105.setError(null);
        }

//        2
        if (mp02cha002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cha002), Toast.LENGTH_SHORT).show();
            mp02cha00205.setError("This data is Required!");

            Log.i(TAG, "mp02cha002: This data is Required!");
            return false;
        } else {
            mp02cha00205.setError(null);
        }

//        3
        if (mp02cha003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cha003), Toast.LENGTH_SHORT).show();
            mp02cha00305.setError("This data is Required!");

            Log.i(TAG, "mp02cha003: This data is Required!");
            return false;
        } else {
            mp02cha00305.setError(null);
        }

//        4
        if (mp02cha004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cha004), Toast.LENGTH_SHORT).show();
            mp02cha00405.setError("This data is Required!");

            Log.i(TAG, "mp02cha004: This data is Required!");
            return false;
        } else {
            mp02cha00405.setError(null);
        }

//        5
        if (mp02cha005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cha005), Toast.LENGTH_SHORT).show();
            mp02cha00505.setError("This data is Required!");

            Log.i(TAG, "mp02cha005: This data is Required!");
            return false;
        } else {
            mp02cha00505.setError(null);
        }

//        6
        if (mp02cha006.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cha006), Toast.LENGTH_SHORT).show();
            mp02cha00605.setError("This data is Required!");

            Log.i(TAG, "mp02cha006: This data is Required!");
            return false;
        } else {
            mp02cha00605.setError(null);
        }

//       7
        if (mp02cha007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cha007), Toast.LENGTH_SHORT).show();
            mp02cha00705.setError("This data is Required!");

            Log.i(TAG, "mp02cha001: This data is Required!");
            return false;
        } else {
            mp02cha00705.setError(null);
        }

//        8
        if (mp02cha008.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cha008), Toast.LENGTH_SHORT).show();
            mp02cha00805.setError("This data is Required!");

            Log.i(TAG, "mp02cha008: This data is Required!");
            return false;
        } else {
            mp02cha00805.setError(null);
        }

//        9
        if (mp02cha009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cha009), Toast.LENGTH_SHORT).show();
            mp02cha00905.setError("This data is Required!");

            Log.i(TAG, "mp02cha009: This data is Required!");
            return false;
        } else {
            mp02cha00905.setError(null);
        }

//        10
        if (mp02cha010.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cha010), Toast.LENGTH_SHORT).show();
            mp02cha01005.setError("This data is Required!");

            Log.i(TAG, "mp02cha010: This data is Required!");
            return false;
        } else {
            mp02cha01005.setError(null);
        }

        return true;
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateCHA();

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

        JSONObject sCHA = new JSONObject();

        sCHA.put("mp02cha001", mp02cha00101.isChecked() ? "1" : mp02cha00102.isChecked() ? "2" : mp02cha00103.isChecked() ? "3"
                : mp02cha00104.isChecked() ? "4" : mp02cha00105.isChecked() ? "5" : "0");
        sCHA.put("mp02cha002", mp02cha00201.isChecked() ? "1" : mp02cha00202.isChecked() ? "2" : mp02cha00203.isChecked() ? "3"
                : mp02cha00204.isChecked() ? "4" : mp02cha00205.isChecked() ? "5" : "0");
        sCHA.put("mp02cha003", mp02cha00301.isChecked() ? "1" : mp02cha00302.isChecked() ? "2" : mp02cha00303.isChecked() ? "3"
                : mp02cha00304.isChecked() ? "4" : mp02cha00305.isChecked() ? "5" : "0");
        sCHA.put("mp02cha004", mp02cha00401.isChecked() ? "1" : mp02cha00402.isChecked() ? "2" : mp02cha00403.isChecked() ? "3"
                : mp02cha00404.isChecked() ? "4" : mp02cha00405.isChecked() ? "5" : "0");
        sCHA.put("mp02cha005", mp02cha00501.isChecked() ? "1" : mp02cha00502.isChecked() ? "2" : mp02cha00503.isChecked() ? "3"
                : mp02cha00504.isChecked() ? "4" : mp02cha00505.isChecked() ? "5" : "0");
        sCHA.put("mp02cha006", mp02cha00601.isChecked() ? "1" : mp02cha00602.isChecked() ? "2" : mp02cha00603.isChecked() ? "3"
                : mp02cha00604.isChecked() ? "4" : mp02cha00605.isChecked() ? "5" : "0");
        sCHA.put("mp02cha007", mp02cha00701.isChecked() ? "1" : mp02cha00702.isChecked() ? "2" : mp02cha00703.isChecked() ? "3"
                : mp02cha00704.isChecked() ? "4" : mp02cha00705.isChecked() ? "5" : "0");
        sCHA.put("mp02cha008", mp02cha00801.isChecked() ? "1" : mp02cha00802.isChecked() ? "2" : mp02cha00803.isChecked() ? "3"
                : mp02cha00804.isChecked() ? "4" : mp02cha00805.isChecked() ? "5" : "0");
        sCHA.put("mp02cha009", mp02cha00901.isChecked() ? "1" : mp02cha00902.isChecked() ? "2" : mp02cha00903.isChecked() ? "3"
                : mp02cha00904.isChecked() ? "4" : mp02cha00905.isChecked() ? "5" : "0");
        sCHA.put("mp02cha010", mp02cha01001.isChecked() ? "1" : mp02cha01002.isChecked() ? "2" : mp02cha01003.isChecked() ? "3"
                : mp02cha01004.isChecked() ? "4" : mp02cha01005.isChecked() ? "5" : "0");

        AppMain.pc.setsCHA(String.valueOf(sCHA));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
