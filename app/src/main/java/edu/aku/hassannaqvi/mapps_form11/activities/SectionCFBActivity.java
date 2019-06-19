package edu.aku.hassannaqvi.mapps_form11.activities;

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
import edu.aku.hassannaqvi.mapps_form11.R;
import edu.aku.hassannaqvi.mapps_form11.core.AppMain;
import edu.aku.hassannaqvi.mapps_form11.core.DatabaseHelper;

public class SectionCFBActivity extends Activity {

    private static final String TAG = SectionCFBActivity.class.getSimpleName();

    @BindView(R.id.activity_section_chb)
    RelativeLayout activitySectionChb;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02cib001)
    RadioGroup mp02cib001;
    @BindView(R.id.mp02cib00101)
    RadioButton mp02cib00101;
    @BindView(R.id.mp02cib00102)
    RadioButton mp02cib00102;
    @BindView(R.id.mp02cib00103)
    RadioButton mp02cib00103;
    @BindView(R.id.mp02cib00104)
    RadioButton mp02cib00104;
    @BindView(R.id.mp02cib002)
    RadioGroup mp02cib002;
    @BindView(R.id.mp02cib00201)
    RadioButton mp02cib00201;
    @BindView(R.id.mp02cib00202)
    RadioButton mp02cib00202;
    @BindView(R.id.mp02cib00203)
    RadioButton mp02cib00203;
    @BindView(R.id.mp02cib00204)
    RadioButton mp02cib00204;
    @BindView(R.id.mp02cib003)
    RadioGroup mp02cib003;
    @BindView(R.id.mp02cib00301)
    RadioButton mp02cib00301;
    @BindView(R.id.mp02cib00302)
    RadioButton mp02cib00302;
    @BindView(R.id.mp02cib00303)
    RadioButton mp02cib00303;
    @BindView(R.id.mp02cib00304)
    RadioButton mp02cib00304;
    @BindView(R.id.mp02cib004)
    RadioGroup mp02cib004;
    @BindView(R.id.mp02cib00401)
    RadioButton mp02cib00401;
    @BindView(R.id.mp02cib00402)
    RadioButton mp02cib00402;
    @BindView(R.id.mp02cib00403)
    RadioButton mp02cib00403;
    @BindView(R.id.mp02cib00404)
    RadioButton mp02cib00404;
    @BindView(R.id.mp02cib005)
    RadioGroup mp02cib005;
    @BindView(R.id.mp02cib00501)
    RadioButton mp02cib00501;
    @BindView(R.id.mp02cib00502)
    RadioButton mp02cib00502;
    @BindView(R.id.mp02cib00503)
    RadioButton mp02cib00503;
    @BindView(R.id.mp02cib00504)
    RadioButton mp02cib00504;
    @BindView(R.id.mp02cib006)
    RadioGroup mp02cib006;
    @BindView(R.id.mp02cib00601)
    RadioButton mp02cib00601;
    @BindView(R.id.mp02cib00602)
    RadioButton mp02cib00602;
    @BindView(R.id.mp02cib00603)
    RadioButton mp02cib00603;
    @BindView(R.id.mp02cib00604)
    RadioButton mp02cib00604;
    @BindView(R.id.mp02cib007)
    RadioGroup mp02cib007;
    @BindView(R.id.mp02cib00701)
    RadioButton mp02cib00701;
    @BindView(R.id.mp02cib00702)
    RadioButton mp02cib00702;
    @BindView(R.id.mp02cib00703)
    RadioButton mp02cib00703;
    @BindView(R.id.mp02cib00704)
    RadioButton mp02cib00704;
    @BindView(R.id.mp02cib008)
    RadioGroup mp02cib008;
    @BindView(R.id.mp02cib00801)
    RadioButton mp02cib00801;
    @BindView(R.id.mp02cib00802)
    RadioButton mp02cib00802;
    @BindView(R.id.mp02cib00803)
    RadioButton mp02cib00803;
    @BindView(R.id.mp02cib00804)
    RadioButton mp02cib00804;
    @BindView(R.id.mp02cib009)
    RadioGroup mp02cib009;
    @BindView(R.id.mp02cib00901)
    RadioButton mp02cib00901;
    @BindView(R.id.mp02cib00902)
    RadioButton mp02cib00902;
    @BindView(R.id.mp02cib00903)
    RadioButton mp02cib00903;
    @BindView(R.id.mp02cib00904)
    RadioButton mp02cib00904;
    @BindView(R.id.mp02cib010)
    RadioGroup mp02cib010;
    @BindView(R.id.mp02cib01001)
    RadioButton mp02cib01001;
    @BindView(R.id.mp02cib01002)
    RadioButton mp02cib01002;
    @BindView(R.id.mp02cib01003)
    RadioButton mp02cib01003;
    @BindView(R.id.mp02cib01004)
    RadioButton mp02cib01004;
    @BindView(R.id.mp02cib011)
    RadioGroup mp02cib011;
    @BindView(R.id.mp02cib01101)
    RadioButton mp02cib01101;
    @BindView(R.id.mp02cib01102)
    RadioButton mp02cib01102;
    @BindView(R.id.mp02cib01103)
    RadioButton mp02cib01103;
    @BindView(R.id.mp02cib01104)
    RadioButton mp02cib01104;
    @BindView(R.id.mp02cib012)
    RadioGroup mp02cib012;
    @BindView(R.id.mp02cib01201)
    RadioButton mp02cib01201;
    @BindView(R.id.mp02cib01202)
    RadioButton mp02cib01202;
    @BindView(R.id.mp02cib01203)
    RadioButton mp02cib01203;
    @BindView(R.id.mp02cib01204)
    RadioButton mp02cib01204;
    @BindView(R.id.mp02cib013)
    RadioGroup mp02cib013;
    @BindView(R.id.mp02cib01301)
    RadioButton mp02cib01301;
    @BindView(R.id.mp02cib01302)
    RadioButton mp02cib01302;
    @BindView(R.id.mp02cib01303)
    RadioButton mp02cib01303;
    @BindView(R.id.mp02cib01304)
    RadioButton mp02cib01304;
    @BindView(R.id.mp02cib014)
    RadioGroup mp02cib014;
    @BindView(R.id.mp02cib01401)
    RadioButton mp02cib01401;
    @BindView(R.id.mp02cib01402)
    RadioButton mp02cib01402;
    @BindView(R.id.mp02cib01403)
    RadioButton mp02cib01403;
    @BindView(R.id.mp02cib01404)
    RadioButton mp02cib01404;
    @BindView(R.id.mp02cib015)
    RadioGroup mp02cib015;
    @BindView(R.id.mp02cib01501)
    RadioButton mp02cib01501;
    @BindView(R.id.mp02cib01502)
    RadioButton mp02cib01502;
    @BindView(R.id.mp02cib01503)
    RadioButton mp02cib01503;
    @BindView(R.id.mp02cib01504)
    RadioButton mp02cib01504;
    @BindView(R.id.mp02cib016)
    RadioGroup mp02cib016;
    @BindView(R.id.mp02cib01601)
    RadioButton mp02cib01601;
    @BindView(R.id.mp02cib01602)
    RadioButton mp02cib01602;
    @BindView(R.id.mp02cib01603)
    RadioButton mp02cib01603;
    @BindView(R.id.mp02cib01604)
    RadioButton mp02cib01604;
    @BindView(R.id.mp02cib017)
    RadioGroup mp02cib017;
    @BindView(R.id.mp02cib01701)
    RadioButton mp02cib01701;
    @BindView(R.id.mp02cib01702)
    RadioButton mp02cib01702;
    @BindView(R.id.mp02cib01703)
    RadioButton mp02cib01703;
    @BindView(R.id.mp02cib01704)
    RadioButton mp02cib01704;
    @BindView(R.id.mp02cib018)
    RadioGroup mp02cib018;
    @BindView(R.id.mp02cib01801)
    RadioButton mp02cib01801;
    @BindView(R.id.mp02cib01802)
    RadioButton mp02cib01802;
    @BindView(R.id.mp02cib01803)
    RadioButton mp02cib01803;
    @BindView(R.id.mp02cib01804)
    RadioButton mp02cib01804;
    @BindView(R.id.mp02cib019)
    RadioGroup mp02cib019;
    @BindView(R.id.mp02cib01901)
    RadioButton mp02cib01901;
    @BindView(R.id.mp02cib01902)
    RadioButton mp02cib01902;
    @BindView(R.id.mp02cib01903)
    RadioButton mp02cib01903;
    @BindView(R.id.mp02cib01904)
    RadioButton mp02cib01904;
    @BindView(R.id.mp02cib020)
    RadioGroup mp02cib020;
    @BindView(R.id.mp02cib02001)
    RadioButton mp02cib02001;
    @BindView(R.id.mp02cib02002)
    RadioButton mp02cib02002;
    @BindView(R.id.mp02cib02003)
    RadioButton mp02cib02003;
    @BindView(R.id.mp02cib02004)
    RadioButton mp02cib02004;
    @BindView(R.id.mp02cib021)
    RadioGroup mp02cib021;
    @BindView(R.id.mp02cib02101)
    RadioButton mp02cib02101;
    @BindView(R.id.mp02cib02102)
    RadioButton mp02cib02102;
    @BindView(R.id.mp02cib02103)
    RadioButton mp02cib02103;
    @BindView(R.id.mp02cib02104)
    RadioButton mp02cib02104;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cfb);
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
                Intent secchc = new Intent(this, SectionCFCActivity.class);
                startActivity(secchc);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public boolean ValidateForm() {

//        1
        if (mp02cib001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib001), Toast.LENGTH_SHORT).show();
            mp02cib00104.setError("This data is Required!");

            Log.i(TAG, "mp02cib001: This data is Required!");
            return false;
        } else {
            mp02cib00104.setError(null);
        }

//        2
        if (mp02cib002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib002), Toast.LENGTH_SHORT).show();
            mp02cib00204.setError("This data is Required!");

            Log.i(TAG, "mp02cib002: This data is Required!");
            return false;
        } else {
            mp02cib00204.setError(null);
        }

//        3
        if (mp02cib003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib003), Toast.LENGTH_SHORT).show();
            mp02cib00304.setError("This data is Required!");

            Log.i(TAG, "mp02cib003: This data is Required!");
            return false;
        } else {
            mp02cib00304.setError(null);
        }

//        4
        if (mp02cib004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib004), Toast.LENGTH_SHORT).show();
            mp02cib00404.setError("This data is Required!");

            Log.i(TAG, "mp02cib004: This data is Required!");
            return false;
        } else {
            mp02cib00404.setError(null);
        }

//        5
        if (mp02cib005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib005), Toast.LENGTH_SHORT).show();
            mp02cib00504.setError("This data is Required!");

            Log.i(TAG, "mp02cib005: This data is Required!");
            return false;
        } else {
            mp02cib00504.setError(null);
        }

//        6
        if (mp02cib006.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib006), Toast.LENGTH_SHORT).show();
            mp02cib00604.setError("This data is Required!");

            Log.i(TAG, "mp02cib006: This data is Required!");
            return false;
        } else {
            mp02cib00604.setError(null);
        }

//       7
        if (mp02cib007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib007), Toast.LENGTH_SHORT).show();
            mp02cib00704.setError("This data is Required!");

            Log.i(TAG, "mp02cib007: This data is Required!");
            return false;
        } else {
            mp02cib00704.setError(null);
        }

//        8
        if (mp02cib008.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib008), Toast.LENGTH_SHORT).show();
            mp02cib00804.setError("This data is Required!");

            Log.i(TAG, "mp02cib008: This data is Required!");
            return false;
        } else {
            mp02cib00804.setError(null);
        }

//        9
        if (mp02cib009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib009), Toast.LENGTH_SHORT).show();
            mp02cib00904.setError("This data is Required!");

            Log.i(TAG, "mp02cib009: This data is Required!");
            return false;
        } else {
            mp02cib00904.setError(null);
        }

//        10
        if (mp02cib010.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib010), Toast.LENGTH_SHORT).show();
            mp02cib01004.setError("This data is Required!");

            Log.i(TAG, "mp02cib010: This data is Required!");
            return false;
        } else {
            mp02cib01004.setError(null);
        }

//        11
        if (mp02cib011.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib011), Toast.LENGTH_SHORT).show();
            mp02cib01104.setError("This data is Required!");

            Log.i(TAG, "mp02cib011: This data is Required!");
            return false;
        } else {
            mp02cib01104.setError(null);
        }

//        12
        if (mp02cib012.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib012), Toast.LENGTH_SHORT).show();
            mp02cib01204.setError("This data is Required!");

            Log.i(TAG, "mp02cib012: This data is Required!");
            return false;
        } else {
            mp02cib01204.setError(null);
        }

//        13
        if (mp02cib013.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib013), Toast.LENGTH_SHORT).show();
            mp02cib01304.setError("This data is Required!");

            Log.i(TAG, "mp02cib013: This data is Required!");
            return false;
        } else {
            mp02cib01304.setError(null);
        }

//        14
        if (mp02cib014.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib014), Toast.LENGTH_SHORT).show();
            mp02cib01404.setError("This data is Required!");

            Log.i(TAG, "mp02cib014: This data is Required!");
            return false;
        } else {
            mp02cib01404.setError(null);
        }

//        15
        if (mp02cib015.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib015), Toast.LENGTH_SHORT).show();
            mp02cib01504.setError("This data is Required!");

            Log.i(TAG, "mp02cib015: This data is Required!");
            return false;
        } else {
            mp02cib01504.setError(null);
        }

//        16
        if (mp02cib016.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib016), Toast.LENGTH_SHORT).show();
            mp02cib01604.setError("This data is Required!");

            Log.i(TAG, "mp02cib016: This data is Required!");
            return false;
        } else {
            mp02cib01604.setError(null);
        }

//        17
        if (mp02cib017.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib017), Toast.LENGTH_SHORT).show();
            mp02cib01704.setError("This data is Required!");

            Log.i(TAG, "mp02cib017: This data is Required!");
            return false;
        } else {
            mp02cib01704.setError(null);
        }

//        18
        if (mp02cib018.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib018), Toast.LENGTH_SHORT).show();
            mp02cib01804.setError("This data is Required!");

            Log.i(TAG, "mp02cib018: This data is Required!");
            return false;
        } else {
            mp02cib01804.setError(null);
        }

//        19
        if (mp02cib019.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib019), Toast.LENGTH_SHORT).show();
            mp02cib01904.setError("This data is Required!");

            Log.i(TAG, "mp02cib019: This data is Required!");
            return false;
        } else {
            mp02cib01904.setError(null);
        }

//        20
        if (mp02cib020.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib020), Toast.LENGTH_SHORT).show();
            mp02cib02004.setError("This data is Required!");

            Log.i(TAG, "mp02cib020: This data is Required!");
            return false;
        } else {
            mp02cib02004.setError(null);
        }

//        21
        if (mp02cib021.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cib021), Toast.LENGTH_SHORT).show();
            mp02cib02104.setError("This data is Required!");

            Log.i(TAG, "mp02cib021: This data is Required!");
            return false;
        } else {
            mp02cib02104.setError(null);
        }

        return true;
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateCFB();

        if (updcount == 1) {

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject SCIB = new JSONObject();

        SCIB.put("mp03q127", mp02cib00101.isChecked() ? "1" : mp02cib00102.isChecked() ? "2" : mp02cib00103.isChecked() ? "3"
                : mp02cib00104.isChecked() ? "4" : "0");

        SCIB.put("mp03q128", mp02cib00201.isChecked() ? "1" : mp02cib00202.isChecked() ? "2" : mp02cib00203.isChecked() ? "3"
                : mp02cib00204.isChecked() ? "4" : "0");

        SCIB.put("mp03q129", mp02cib00301.isChecked() ? "1" : mp02cib00302.isChecked() ? "2" : mp02cib00303.isChecked() ? "3"
                : mp02cib00304.isChecked() ? "4" : "0");

        SCIB.put("mp03q130", mp02cib00401.isChecked() ? "1" : mp02cib00402.isChecked() ? "2" : mp02cib00403.isChecked() ? "3"
                : mp02cib00404.isChecked() ? "4" : "0");

        SCIB.put("mp03q131", mp02cib00501.isChecked() ? "1" : mp02cib00502.isChecked() ? "2" : mp02cib00503.isChecked() ? "3"
                : mp02cib00504.isChecked() ? "4" : "0");

        SCIB.put("mp03q132", mp02cib00601.isChecked() ? "1" : mp02cib00602.isChecked() ? "2" : mp02cib00603.isChecked() ? "3"
                : mp02cib00604.isChecked() ? "4" : "0");

        SCIB.put("mp03q133", mp02cib00701.isChecked() ? "1" : mp02cib00702.isChecked() ? "2" : mp02cib00703.isChecked() ? "3"
                : mp02cib00704.isChecked() ? "4" : "0");

        SCIB.put("mp03q134", mp02cib00801.isChecked() ? "1" : mp02cib00802.isChecked() ? "2" : mp02cib00803.isChecked() ? "3"
                : mp02cib00804.isChecked() ? "4" : "0");

        SCIB.put("mp03q135", mp02cib00901.isChecked() ? "1" : mp02cib00902.isChecked() ? "2" : mp02cib00903.isChecked() ? "3"
                : mp02cib00904.isChecked() ? "4" : "0");

        SCIB.put("mp03q136", mp02cib01001.isChecked() ? "1" : mp02cib01002.isChecked() ? "2" : mp02cib01003.isChecked() ? "3"
                : mp02cib01004.isChecked() ? "4" : "0");

        SCIB.put("mp03q137", mp02cib01101.isChecked() ? "1" : mp02cib01102.isChecked() ? "2" : mp02cib01103.isChecked() ? "3"
                : mp02cib01104.isChecked() ? "4" : "0");

        SCIB.put("mp03q138", mp02cib01201.isChecked() ? "1" : mp02cib01202.isChecked() ? "2" : mp02cib01203.isChecked() ? "3"
                : mp02cib01204.isChecked() ? "4" : "0");

        SCIB.put("mp03q139", mp02cib01301.isChecked() ? "1" : mp02cib01302.isChecked() ? "2" : mp02cib01303.isChecked() ? "3"
                : mp02cib01304.isChecked() ? "4" : "0");

        SCIB.put("mp03q140", mp02cib01401.isChecked() ? "1" : mp02cib01402.isChecked() ? "2" : mp02cib01403.isChecked() ? "3"
                : mp02cib01404.isChecked() ? "4" : "0");

        SCIB.put("mp03q141", mp02cib01501.isChecked() ? "1" : mp02cib01502.isChecked() ? "2" : mp02cib01503.isChecked() ? "3"
                : mp02cib01504.isChecked() ? "4" : "0");

        SCIB.put("mp03q142", mp02cib01601.isChecked() ? "1" : mp02cib01602.isChecked() ? "2" : mp02cib01603.isChecked() ? "3"
                : mp02cib01604.isChecked() ? "4" : "0");

        SCIB.put("mp03q143", mp02cib01701.isChecked() ? "1" : mp02cib01702.isChecked() ? "2" : mp02cib01703.isChecked() ? "3"
                : mp02cib01704.isChecked() ? "4" : "0");

        SCIB.put("mp03q144", mp02cib01801.isChecked() ? "1" : mp02cib01802.isChecked() ? "2" : mp02cib01803.isChecked() ? "3"
                : mp02cib01804.isChecked() ? "4" : "0");

        SCIB.put("mp03q145", mp02cib01901.isChecked() ? "1" : mp02cib01902.isChecked() ? "2" : mp02cib01903.isChecked() ? "3"
                : mp02cib01904.isChecked() ? "4" : "0");

        SCIB.put("mp03q146", mp02cib02001.isChecked() ? "1" : mp02cib02002.isChecked() ? "2" : mp02cib02003.isChecked() ? "3"
                : mp02cib02004.isChecked() ? "4" : "0");

        SCIB.put("mp03q147", mp02cib02101.isChecked() ? "1" : mp02cib02102.isChecked() ? "2" : mp02cib02103.isChecked() ? "3"
                : mp02cib02104.isChecked() ? "4" : "0");

        AppMain.fc.setsCFB(String.valueOf(SCIB));


    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
