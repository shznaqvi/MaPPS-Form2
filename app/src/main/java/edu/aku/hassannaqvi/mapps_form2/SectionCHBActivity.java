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

public class SectionCHBActivity extends Activity {

    private static final String TAG = SectionCHBActivity.class.getSimpleName();

    @BindView(R.id.activity_section_chb)
    RelativeLayout activitySectionChb;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02chb001)
    RadioGroup mp02chb001;
    @BindView(R.id.mp02chb00101)
    RadioButton mp02chb00101;
    @BindView(R.id.mp02chb00102)
    RadioButton mp02chb00102;
    @BindView(R.id.mp02chb00103)
    RadioButton mp02chb00103;
    @BindView(R.id.mp02chb00104)
    RadioButton mp02chb00104;
    @BindView(R.id.mp02chb002)
    RadioGroup mp02chb002;
    @BindView(R.id.mp02chb00201)
    RadioButton mp02chb00201;
    @BindView(R.id.mp02chb00202)
    RadioButton mp02chb00202;
    @BindView(R.id.mp02chb00203)
    RadioButton mp02chb00203;
    @BindView(R.id.mp02chb00204)
    RadioButton mp02chb00204;
    @BindView(R.id.mp02chb003)
    RadioGroup mp02chb003;
    @BindView(R.id.mp02chb00301)
    RadioButton mp02chb00301;
    @BindView(R.id.mp02chb00302)
    RadioButton mp02chb00302;
    @BindView(R.id.mp02chb00303)
    RadioButton mp02chb00303;
    @BindView(R.id.mp02chb00304)
    RadioButton mp02chb00304;
    @BindView(R.id.mp02chb004)
    RadioGroup mp02chb004;
    @BindView(R.id.mp02chb00401)
    RadioButton mp02chb00401;
    @BindView(R.id.mp02chb00402)
    RadioButton mp02chb00402;
    @BindView(R.id.mp02chb00403)
    RadioButton mp02chb00403;
    @BindView(R.id.mp02chb00404)
    RadioButton mp02chb00404;
    @BindView(R.id.mp02chb005)
    RadioGroup mp02chb005;
    @BindView(R.id.mp02chb00501)
    RadioButton mp02chb00501;
    @BindView(R.id.mp02chb00502)
    RadioButton mp02chb00502;
    @BindView(R.id.mp02chb00503)
    RadioButton mp02chb00503;
    @BindView(R.id.mp02chb00504)
    RadioButton mp02chb00504;
    @BindView(R.id.mp02chb006)
    RadioGroup mp02chb006;
    @BindView(R.id.mp02chb00601)
    RadioButton mp02chb00601;
    @BindView(R.id.mp02chb00602)
    RadioButton mp02chb00602;
    @BindView(R.id.mp02chb00603)
    RadioButton mp02chb00603;
    @BindView(R.id.mp02chb00604)
    RadioButton mp02chb00604;
    @BindView(R.id.mp02chb007)
    RadioGroup mp02chb007;
    @BindView(R.id.mp02chb00701)
    RadioButton mp02chb00701;
    @BindView(R.id.mp02chb00702)
    RadioButton mp02chb00702;
    @BindView(R.id.mp02chb00703)
    RadioButton mp02chb00703;
    @BindView(R.id.mp02chb00704)
    RadioButton mp02chb00704;
    @BindView(R.id.mp02chb008)
    RadioGroup mp02chb008;
    @BindView(R.id.mp02chb00801)
    RadioButton mp02chb00801;
    @BindView(R.id.mp02chb00802)
    RadioButton mp02chb00802;
    @BindView(R.id.mp02chb00803)
    RadioButton mp02chb00803;
    @BindView(R.id.mp02chb00804)
    RadioButton mp02chb00804;
    @BindView(R.id.mp02chb009)
    RadioGroup mp02chb009;
    @BindView(R.id.mp02chb00901)
    RadioButton mp02chb00901;
    @BindView(R.id.mp02chb00902)
    RadioButton mp02chb00902;
    @BindView(R.id.mp02chb00903)
    RadioButton mp02chb00903;
    @BindView(R.id.mp02chb00904)
    RadioButton mp02chb00904;
    @BindView(R.id.mp02chb010)
    RadioGroup mp02chb010;
    @BindView(R.id.mp02chb01001)
    RadioButton mp02chb01001;
    @BindView(R.id.mp02chb01002)
    RadioButton mp02chb01002;
    @BindView(R.id.mp02chb01003)
    RadioButton mp02chb01003;
    @BindView(R.id.mp02chb01004)
    RadioButton mp02chb01004;
    @BindView(R.id.mp02chb011)
    RadioGroup mp02chb011;
    @BindView(R.id.mp02chb01101)
    RadioButton mp02chb01101;
    @BindView(R.id.mp02chb01102)
    RadioButton mp02chb01102;
    @BindView(R.id.mp02chb01103)
    RadioButton mp02chb01103;
    @BindView(R.id.mp02chb01104)
    RadioButton mp02chb01104;
    @BindView(R.id.mp02chb012)
    RadioGroup mp02chb012;
    @BindView(R.id.mp02chb01201)
    RadioButton mp02chb01201;
    @BindView(R.id.mp02chb01202)
    RadioButton mp02chb01202;
    @BindView(R.id.mp02chb01203)
    RadioButton mp02chb01203;
    @BindView(R.id.mp02chb01204)
    RadioButton mp02chb01204;
    @BindView(R.id.mp02chb013)
    RadioGroup mp02chb013;
    @BindView(R.id.mp02chb01301)
    RadioButton mp02chb01301;
    @BindView(R.id.mp02chb01302)
    RadioButton mp02chb01302;
    @BindView(R.id.mp02chb01303)
    RadioButton mp02chb01303;
    @BindView(R.id.mp02chb01304)
    RadioButton mp02chb01304;
    @BindView(R.id.mp02chb014)
    RadioGroup mp02chb014;
    @BindView(R.id.mp02chb01401)
    RadioButton mp02chb01401;
    @BindView(R.id.mp02chb01402)
    RadioButton mp02chb01402;
    @BindView(R.id.mp02chb01403)
    RadioButton mp02chb01403;
    @BindView(R.id.mp02chb01404)
    RadioButton mp02chb01404;
    @BindView(R.id.mp02chb015)
    RadioGroup mp02chb015;
    @BindView(R.id.mp02chb01501)
    RadioButton mp02chb01501;
    @BindView(R.id.mp02chb01502)
    RadioButton mp02chb01502;
    @BindView(R.id.mp02chb01503)
    RadioButton mp02chb01503;
    @BindView(R.id.mp02chb01504)
    RadioButton mp02chb01504;
    @BindView(R.id.mp02chb016)
    RadioGroup mp02chb016;
    @BindView(R.id.mp02chb01601)
    RadioButton mp02chb01601;
    @BindView(R.id.mp02chb01602)
    RadioButton mp02chb01602;
    @BindView(R.id.mp02chb01603)
    RadioButton mp02chb01603;
    @BindView(R.id.mp02chb01604)
    RadioButton mp02chb01604;
    @BindView(R.id.mp02chb017)
    RadioGroup mp02chb017;
    @BindView(R.id.mp02chb01701)
    RadioButton mp02chb01701;
    @BindView(R.id.mp02chb01702)
    RadioButton mp02chb01702;
    @BindView(R.id.mp02chb01703)
    RadioButton mp02chb01703;
    @BindView(R.id.mp02chb01704)
    RadioButton mp02chb01704;
    @BindView(R.id.mp02chb018)
    RadioGroup mp02chb018;
    @BindView(R.id.mp02chb01801)
    RadioButton mp02chb01801;
    @BindView(R.id.mp02chb01802)
    RadioButton mp02chb01802;
    @BindView(R.id.mp02chb01803)
    RadioButton mp02chb01803;
    @BindView(R.id.mp02chb01804)
    RadioButton mp02chb01804;
    @BindView(R.id.mp02chb019)
    RadioGroup mp02chb019;
    @BindView(R.id.mp02chb01901)
    RadioButton mp02chb01901;
    @BindView(R.id.mp02chb01902)
    RadioButton mp02chb01902;
    @BindView(R.id.mp02chb01903)
    RadioButton mp02chb01903;
    @BindView(R.id.mp02chb01904)
    RadioButton mp02chb01904;
    @BindView(R.id.mp02chb020)
    RadioGroup mp02chb020;
    @BindView(R.id.mp02chb02001)
    RadioButton mp02chb02001;
    @BindView(R.id.mp02chb02002)
    RadioButton mp02chb02002;
    @BindView(R.id.mp02chb02003)
    RadioButton mp02chb02003;
    @BindView(R.id.mp02chb02004)
    RadioButton mp02chb02004;
    @BindView(R.id.mp02chb021)
    RadioGroup mp02chb021;
    @BindView(R.id.mp02chb02101)
    RadioButton mp02chb02101;
    @BindView(R.id.mp02chb02102)
    RadioButton mp02chb02102;
    @BindView(R.id.mp02chb02103)
    RadioButton mp02chb02103;
    @BindView(R.id.mp02chb02104)
    RadioButton mp02chb02104;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_chb);
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
                Intent endSec = new Intent(this, EndingActivity.class);
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
                Intent secchc = new Intent(this, SectionCHCActivity.class);
                startActivity(secchc);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public boolean ValidateForm() {

//        1
        if (mp02chb001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb001), Toast.LENGTH_SHORT).show();
            mp02chb00104.setError("This data is Required!");

            Log.i(TAG, "mp02chb001: This data is Required!");
            return false;
        } else {
            mp02chb00104.setError(null);
        }

//        2
        if (mp02chb002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb002), Toast.LENGTH_SHORT).show();
            mp02chb00204.setError("This data is Required!");

            Log.i(TAG, "mp02chb002: This data is Required!");
            return false;
        } else {
            mp02chb00204.setError(null);
        }

//        3
        if (mp02chb003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb003), Toast.LENGTH_SHORT).show();
            mp02chb00304.setError("This data is Required!");

            Log.i(TAG, "mp02chb003: This data is Required!");
            return false;
        } else {
            mp02chb00304.setError(null);
        }

//        4
        if (mp02chb004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb004), Toast.LENGTH_SHORT).show();
            mp02chb00404.setError("This data is Required!");

            Log.i(TAG, "mp02chb004: This data is Required!");
            return false;
        } else {
            mp02chb00404.setError(null);
        }

//        5
        if (mp02chb005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb005), Toast.LENGTH_SHORT).show();
            mp02chb00504.setError("This data is Required!");

            Log.i(TAG, "mp02chb005: This data is Required!");
            return false;
        } else {
            mp02chb00504.setError(null);
        }

//        6
        if (mp02chb006.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb006), Toast.LENGTH_SHORT).show();
            mp02chb00604.setError("This data is Required!");

            Log.i(TAG, "mp02chb006: This data is Required!");
            return false;
        } else {
            mp02chb00604.setError(null);
        }

//       7
        if (mp02chb007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb007), Toast.LENGTH_SHORT).show();
            mp02chb00704.setError("This data is Required!");

            Log.i(TAG, "mp02chb007: This data is Required!");
            return false;
        } else {
            mp02chb00704.setError(null);
        }

//        8
        if (mp02chb008.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb008), Toast.LENGTH_SHORT).show();
            mp02chb00804.setError("This data is Required!");

            Log.i(TAG, "mp02chb008: This data is Required!");
            return false;
        } else {
            mp02chb00804.setError(null);
        }

//        9
        if (mp02chb009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb009), Toast.LENGTH_SHORT).show();
            mp02chb00904.setError("This data is Required!");

            Log.i(TAG, "mp02chb009: This data is Required!");
            return false;
        } else {
            mp02chb00904.setError(null);
        }

//        10
        if (mp02chb010.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb010), Toast.LENGTH_SHORT).show();
            mp02chb01004.setError("This data is Required!");

            Log.i(TAG, "mp02chb010: This data is Required!");
            return false;
        } else {
            mp02chb01004.setError(null);
        }

//        11
        if (mp02chb011.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb011), Toast.LENGTH_SHORT).show();
            mp02chb01104.setError("This data is Required!");

            Log.i(TAG, "mp02chb011: This data is Required!");
            return false;
        } else {
            mp02chb01104.setError(null);
        }

//        12
        if (mp02chb012.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb012), Toast.LENGTH_SHORT).show();
            mp02chb01204.setError("This data is Required!");

            Log.i(TAG, "mp02chb012: This data is Required!");
            return false;
        } else {
            mp02chb01204.setError(null);
        }

//        13
        if (mp02chb013.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb013), Toast.LENGTH_SHORT).show();
            mp02chb01304.setError("This data is Required!");

            Log.i(TAG, "mp02chb013: This data is Required!");
            return false;
        } else {
            mp02chb01304.setError(null);
        }

//        14
        if (mp02chb014.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb014), Toast.LENGTH_SHORT).show();
            mp02chb01404.setError("This data is Required!");

            Log.i(TAG, "mp02chb014: This data is Required!");
            return false;
        } else {
            mp02chb01404.setError(null);
        }

//        15
        if (mp02chb015.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb015), Toast.LENGTH_SHORT).show();
            mp02chb01504.setError("This data is Required!");

            Log.i(TAG, "mp02chb015: This data is Required!");
            return false;
        } else {
            mp02chb01504.setError(null);
        }

//        16
        if (mp02chb016.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb016), Toast.LENGTH_SHORT).show();
            mp02chb01604.setError("This data is Required!");

            Log.i(TAG, "mp02chb016: This data is Required!");
            return false;
        } else {
            mp02chb01604.setError(null);
        }

//        17
        if (mp02chb017.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb017), Toast.LENGTH_SHORT).show();
            mp02chb01704.setError("This data is Required!");

            Log.i(TAG, "mp02chb017: This data is Required!");
            return false;
        } else {
            mp02chb01704.setError(null);
        }

//        18
        if (mp02chb018.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb018), Toast.LENGTH_SHORT).show();
            mp02chb01804.setError("This data is Required!");

            Log.i(TAG, "mp02chb018: This data is Required!");
            return false;
        } else {
            mp02chb01804.setError(null);
        }

//        19
        if (mp02chb019.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb019), Toast.LENGTH_SHORT).show();
            mp02chb01904.setError("This data is Required!");

            Log.i(TAG, "mp02chb019: This data is Required!");
            return false;
        } else {
            mp02chb01904.setError(null);
        }

//        20
        if (mp02chb020.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb020), Toast.LENGTH_SHORT).show();
            mp02chb02004.setError("This data is Required!");

            Log.i(TAG, "mp02chb020: This data is Required!");
            return false;
        } else {
            mp02chb02004.setError(null);
        }

//        21
        if (mp02chb021.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02chb021), Toast.LENGTH_SHORT).show();
            mp02chb02104.setError("This data is Required!");

            Log.i(TAG, "mp02chb021: This data is Required!");
            return false;
        } else {
            mp02chb02104.setError(null);
        }

        return true;
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateCHB();

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

        JSONObject sCHB = new JSONObject();

        sCHB.put("mp02chb001", mp02chb00101.isChecked() ? "1" : mp02chb00102.isChecked() ? "2" : mp02chb00103.isChecked() ? "3"
                : mp02chb00104.isChecked() ? "4" : "0");

        sCHB.put("mp02chb002", mp02chb00201.isChecked() ? "1" : mp02chb00202.isChecked() ? "2" : mp02chb00203.isChecked() ? "3"
                : mp02chb00204.isChecked() ? "4" : "0");

        sCHB.put("mp02chb003", mp02chb00301.isChecked() ? "1" : mp02chb00302.isChecked() ? "2" : mp02chb00303.isChecked() ? "3"
                : mp02chb00304.isChecked() ? "4" : "0");

        sCHB.put("mp02chb004", mp02chb00401.isChecked() ? "1" : mp02chb00402.isChecked() ? "2" : mp02chb00403.isChecked() ? "3"
                : mp02chb00404.isChecked() ? "4" : "0");

        sCHB.put("mp02chb005", mp02chb00501.isChecked() ? "1" : mp02chb00502.isChecked() ? "2" : mp02chb00503.isChecked() ? "3"
                : mp02chb00504.isChecked() ? "4" : "0");

        sCHB.put("mp02chb006", mp02chb00601.isChecked() ? "1" : mp02chb00602.isChecked() ? "2" : mp02chb00603.isChecked() ? "3"
                : mp02chb00604.isChecked() ? "4" : "0");

        sCHB.put("mp02chb007", mp02chb00701.isChecked() ? "1" : mp02chb00702.isChecked() ? "2" : mp02chb00703.isChecked() ? "3"
                : mp02chb00704.isChecked() ? "4" : "0");

        sCHB.put("mp02chb008", mp02chb00801.isChecked() ? "1" : mp02chb00802.isChecked() ? "2" : mp02chb00803.isChecked() ? "3"
                : mp02chb00804.isChecked() ? "4" : "0");

        sCHB.put("mp02chb009", mp02chb00901.isChecked() ? "1" : mp02chb00902.isChecked() ? "2" : mp02chb00903.isChecked() ? "3"
                : mp02chb00904.isChecked() ? "4" : "0");

        sCHB.put("mp02chb010", mp02chb01001.isChecked() ? "1" : mp02chb01002.isChecked() ? "2" : mp02chb01003.isChecked() ? "3"
                : mp02chb01004.isChecked() ? "4" : "0");

        sCHB.put("mp02chb011", mp02chb01101.isChecked() ? "1" : mp02chb01102.isChecked() ? "2" : mp02chb01103.isChecked() ? "3"
                : mp02chb01104.isChecked() ? "4" : "0");

        sCHB.put("mp02chb012", mp02chb01201.isChecked() ? "1" : mp02chb01202.isChecked() ? "2" : mp02chb01203.isChecked() ? "3"
                : mp02chb01204.isChecked() ? "4" : "0");

        sCHB.put("mp02chb013", mp02chb01301.isChecked() ? "1" : mp02chb01302.isChecked() ? "2" : mp02chb01303.isChecked() ? "3"
                : mp02chb01304.isChecked() ? "4" : "0");

        sCHB.put("mp02chb014", mp02chb01401.isChecked() ? "1" : mp02chb01402.isChecked() ? "2" : mp02chb01403.isChecked() ? "3"
                : mp02chb01404.isChecked() ? "4" : "0");

        sCHB.put("mp02chb015", mp02chb01501.isChecked() ? "1" : mp02chb01502.isChecked() ? "2" : mp02chb01503.isChecked() ? "3"
                : mp02chb01504.isChecked() ? "4" : "0");

        sCHB.put("mp02chb016", mp02chb01601.isChecked() ? "1" : mp02chb01602.isChecked() ? "2" : mp02chb01603.isChecked() ? "3"
                : mp02chb01604.isChecked() ? "4" : "0");

        sCHB.put("mp02chb017", mp02chb01701.isChecked() ? "1" : mp02chb01702.isChecked() ? "2" : mp02chb01703.isChecked() ? "3"
                : mp02chb01704.isChecked() ? "4" : "0");

        sCHB.put("mp02chb018", mp02chb01801.isChecked() ? "1" : mp02chb01802.isChecked() ? "2" : mp02chb01803.isChecked() ? "3"
                : mp02chb01804.isChecked() ? "4" : "0");

        sCHB.put("mp02chb019", mp02chb01901.isChecked() ? "1" : mp02chb01902.isChecked() ? "2" : mp02chb01903.isChecked() ? "3"
                : mp02chb01904.isChecked() ? "4" : "0");

        sCHB.put("mp02chb020", mp02chb02001.isChecked() ? "1" : mp02chb02002.isChecked() ? "2" : mp02chb02003.isChecked() ? "3"
                : mp02chb02004.isChecked() ? "4" : "0");

        sCHB.put("mp02chb021", mp02chb02101.isChecked() ? "1" : mp02chb02102.isChecked() ? "2" : mp02chb02103.isChecked() ? "3"
                : mp02chb02104.isChecked() ? "4" : "0");

        AppMain.pc.setsCHB(String.valueOf(sCHB));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


}
