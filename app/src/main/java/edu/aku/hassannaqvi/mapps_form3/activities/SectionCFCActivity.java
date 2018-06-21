package edu.aku.hassannaqvi.mapps_form3.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
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
import edu.aku.hassannaqvi.mapps_form3.R;
import edu.aku.hassannaqvi.mapps_form3.core.AppMain;
import edu.aku.hassannaqvi.mapps_form3.core.DatabaseHelper;

public class SectionCFCActivity extends Activity {

    private static final String TAG = SectionCFCActivity.class.getSimpleName();

    @BindView(R.id.activity_section_chc)
    RelativeLayout activitySectionChc;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02cic001)
    RadioGroup mp02cic001;
    @BindView(R.id.mp02cic00101)
    RadioButton mp02cic00101;
    @BindView(R.id.mp02cic00102)
    RadioButton mp02cic00102;
    @BindView(R.id.fldGrpmp02cic002)
    LinearLayout fldGrpmp02cic002;
    @BindView(R.id.mp02cic002)
    RadioGroup mp02cic002;
    @BindView(R.id.mp02cic00201)
    RadioButton mp02cic00201;
    @BindView(R.id.mp02cic00202)
    RadioButton mp02cic00202;
    @BindView(R.id.mp02cic00203)
    RadioButton mp02cic00203;
    @BindView(R.id.mp02cic00204)
    RadioButton mp02cic00204;
    @BindView(R.id.mp02cic00277)
    RadioButton mp02cic00277;
    @BindView(R.id.mp02cic003)
    RadioGroup mp02cic003;
    @BindView(R.id.mp02cic00301)
    RadioButton mp02cic00301;
    @BindView(R.id.mp02cic00302)
    RadioButton mp02cic00302;
    @BindView(R.id.mp02cic00303)
    RadioButton mp02cic00303;
    @BindView(R.id.mp02cic00304)
    RadioButton mp02cic00304;
    @BindView(R.id.mp02cic00377)
    RadioButton mp02cic00377;
    @BindView(R.id.mp02cic004)
    RadioGroup mp02cic004;
    @BindView(R.id.mp02cic00401)
    RadioButton mp02cic00401;
    @BindView(R.id.mp02cic00402)
    RadioButton mp02cic00402;
    @BindView(R.id.mp02cic00403)
    RadioButton mp02cic00403;
    @BindView(R.id.mp02cic00404)
    RadioButton mp02cic00404;
    @BindView(R.id.mp02cic00477)
    RadioButton mp02cic00477;
    @BindView(R.id.mp02cic005)
    RadioGroup mp02cic005;
    @BindView(R.id.mp02cic00501)
    RadioButton mp02cic00501;
    @BindView(R.id.mp02cic00502)
    RadioButton mp02cic00502;
    @BindView(R.id.mp02cic00503)
    RadioButton mp02cic00503;
    @BindView(R.id.mp02cic00504)
    RadioButton mp02cic00504;
    @BindView(R.id.mp02cic00577)
    RadioButton mp02cic00577;
    @BindView(R.id.mp02cic006)
    RadioGroup mp02cic006;
    @BindView(R.id.mp02cic00601)
    RadioButton mp02cic00601;
    @BindView(R.id.mp02cic00602)
    RadioButton mp02cic00602;
    @BindView(R.id.mp02cic00603)
    RadioButton mp02cic00603;
    @BindView(R.id.mp02cic00604)
    RadioButton mp02cic00604;
    @BindView(R.id.mp02cic00677)
    RadioButton mp02cic00677;
    @BindView(R.id.mp02cic007)
    RadioGroup mp02cic007;
    @BindView(R.id.mp02cic00701)
    RadioButton mp02cic00701;
    @BindView(R.id.mp02cic00702)
    RadioButton mp02cic00702;
    @BindView(R.id.mp02cic00703)
    RadioButton mp02cic00703;
    @BindView(R.id.mp02cic00704)
    RadioButton mp02cic00704;
    @BindView(R.id.mp02cic00777)
    RadioButton mp02cic00777;
    @BindView(R.id.mp02cic008)
    RadioGroup mp02cic008;
    @BindView(R.id.mp02cic00801)
    RadioButton mp02cic00801;
    @BindView(R.id.mp02cic00802)
    RadioButton mp02cic00802;
    @BindView(R.id.mp02cic00803)
    RadioButton mp02cic00803;
    @BindView(R.id.mp02cic00804)
    RadioButton mp02cic00804;
    @BindView(R.id.mp02cic00877)
    RadioButton mp02cic00877;
    @BindView(R.id.mp02cic009)
    RadioGroup mp02cic009;
    @BindView(R.id.mp02cic00901)
    RadioButton mp02cic00901;
    @BindView(R.id.mp02cic00902)
    RadioButton mp02cic00902;
    @BindView(R.id.mp02cic00903)
    RadioButton mp02cic00903;
    @BindView(R.id.mp02cic00904)
    RadioButton mp02cic00904;
    @BindView(R.id.mp02cic00977)
    RadioButton mp02cic00977;
    @BindView(R.id.mp02cic010)
    RadioGroup mp02cic010;
    @BindView(R.id.mp02cic01001)
    RadioButton mp02cic01001;
    @BindView(R.id.mp02cic01002)
    RadioButton mp02cic01002;
    @BindView(R.id.mp02cic01003)
    RadioButton mp02cic01003;
    @BindView(R.id.fldGrpmp02cic011)
    LinearLayout fldGrpmp02cic011;
    @BindView(R.id.mp02cic01101)
    CheckBox mp02cic01101;
    @BindView(R.id.mp02cic01102)
    CheckBox mp02cic01102;
    @BindView(R.id.mp02cic01103)
    CheckBox mp02cic01103;
    @BindView(R.id.mp02cic01104)
    CheckBox mp02cic01104;
    @BindView(R.id.mp02cic01105)
    CheckBox mp02cic01105;
    @BindView(R.id.mp02cic01106)
    CheckBox mp02cic01106;
    @BindView(R.id.mp02cic01107)
    CheckBox mp02cic01107;
    @BindView(R.id.mp02cic01108)
    CheckBox mp02cic01108;
    @BindView(R.id.mp02cic01109)
    CheckBox mp02cic01109;
    @BindView(R.id.mp02cic01110)
    CheckBox mp02cic01110;
    @BindView(R.id.mp02cic01111)
    CheckBox mp02cic01111;
    @BindView(R.id.mp02cic01112)
    CheckBox mp02cic01112;
    @BindView(R.id.mp02cic01113)
    CheckBox mp02cic01113;
    @BindView(R.id.mp02cic01188)
    CheckBox mp02cic01188;
    @BindView(R.id.mp02cic01188x)
    EditText mp02cic01188x;
    @BindView(R.id.mp02cic012)
    RadioGroup mp02cic012;
    @BindView(R.id.mp02cic01201)
    RadioButton mp02cic01201;
    @BindView(R.id.mp02cic01202)
    RadioButton mp02cic01202;
    @BindView(R.id.mp02cic01203)
    RadioButton mp02cic01203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cfc);
        ButterKnife.bind(this);


        if (AppMain.maritalStatus == 1) {
                    fldGrpmp02cic002.setVisibility(View.VISIBLE);

                }else {
                    fldGrpmp02cic002.setVisibility(View.GONE);
                    mp02cic002.clearCheck();
                    mp02cic003.clearCheck();
                    mp02cic004.clearCheck();
                    mp02cic005.clearCheck();
                    mp02cic006.clearCheck();
                    mp02cic007.clearCheck();
                    mp02cic008.clearCheck();
                    mp02cic009.clearCheck();
                }


        mp02cic01001.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    fldGrpmp02cic011.setVisibility(View.VISIBLE);
                }else {
                    fldGrpmp02cic011.setVisibility(View.GONE);
                    mp02cic01101.setChecked(false);
                    mp02cic01102.setChecked(false);
                    mp02cic01103.setChecked(false);
                    mp02cic01104.setChecked(false);
                    mp02cic01105.setChecked(false);
                    mp02cic01106.setChecked(false);
                    mp02cic01107.setChecked(false);
                    mp02cic01108.setChecked(false);
                    mp02cic01109.setChecked(false);
                    mp02cic01110.setChecked(false);
                    mp02cic01111.setChecked(false);
                    mp02cic01112.setChecked(false);
                    mp02cic01113.setChecked(false);
                    mp02cic01188.setChecked(false);
                    mp02cic01188x.setText(null);
                    mp02cic012.clearCheck();
                }
            }
        });

        mp02cic01188.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02cic01188x.setVisibility(View.VISIBLE);
                }else {
                    mp02cic01188x.setVisibility(View.GONE);
                    mp02cic01188x.setText(null);
                }
            }
        });

        if (AppMain.maritalStatus == 5) {
            mp02cic01108.setEnabled(false);
            mp02cic01108.setChecked(false);
            mp02cic01109.setEnabled(false);
            mp02cic01109.setChecked(false);
            mp02cic01110.setEnabled(false);
            mp02cic01110.setChecked(false);
        } else {
            mp02cic01108.setEnabled(true);
            mp02cic01109.setEnabled(true);
            mp02cic01110.setEnabled(true);

        }

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

                Intent secd = new Intent(this, SectionDActivity.class);
                startActivity(secd);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean ValidateForm() {

//        1
        /*if (mp02cic001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cic001), Toast.LENGTH_SHORT).show();
            mp02cic00102.setError("This data is Required!");

            Log.i(TAG, "mp02cib001: This data is Required!");

            return false;
        } else {
            mp02cic00102.setError(null);
        }*/

//        Skip
        if (AppMain.maritalStatus == 1) {


//            2
            if (mp02cic002.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cic002), Toast.LENGTH_SHORT).show();
                mp02cic00277.setError("This data is Required!");

                Log.i(TAG, "mp02cib002: This data is Required!");
                return false;
            } else {
                mp02cic00277.setError(null);
            }

//            3
            if (mp02cic003.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cic003), Toast.LENGTH_SHORT).show();
                mp02cic00377.setError("This data is Required!");

                Log.i(TAG, "mp02cib003: This data is Required!");
                return false;
            } else {
                mp02cic00377.setError(null);
            }

//            4
            if (mp02cic004.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cic004), Toast.LENGTH_SHORT).show();
                mp02cic00477.setError("This data is Required!");

                Log.i(TAG, "mp02cib004: This data is Required!");
                return false;
            } else {
                mp02cic00477.setError(null);
            }

//            5
            if (mp02cic005.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cic005), Toast.LENGTH_SHORT).show();
                mp02cic00577.setError("This data is Required!");

                Log.i(TAG, "mp02cib005: This data is Required!");
                return false;
            } else {
                mp02cic00577.setError(null);
            }

//            6
            if (mp02cic006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cic006), Toast.LENGTH_SHORT).show();
                mp02cic00677.setError("This data is Required!");

                Log.i(TAG, "mp02cib006: This data is Required!");
                return false;
            } else {
                mp02cic00677.setError(null);
            }

//            7
            if (mp02cic007.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cic007), Toast.LENGTH_SHORT).show();
                mp02cic00777.setError("This data is Required!");

                Log.i(TAG, "mp02cib007: This data is Required!");
                return false;
            } else {
                mp02cic00777.setError(null);
            }

//            8
            if (mp02cic008.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cic008), Toast.LENGTH_SHORT).show();
                mp02cic00877.setError("This data is Required!");

                Log.i(TAG, "mp02cib008: This data is Required!");
                return false;
            } else {
                mp02cic00877.setError(null);
            }

//            9
            if (mp02cic009.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cic009), Toast.LENGTH_SHORT).show();
                mp02cic00977.setError("This data is Required!");

                Log.i(TAG, "mp02cib009: This data is Required!");
                return false;
            } else {
                mp02cic00977.setError(null);
            }
        }

//        10
        if (mp02cic010.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cic010), Toast.LENGTH_SHORT).show();
            mp02cic01003.setError("This data is Required!");

            Log.i(TAG, "mp02cib010: This data is Required!");
            return false;
        } else {
            mp02cic01003.setError(null);
        }

//        Skip
        if (mp02cic01001.isChecked()) {

//            11
            if (!(mp02cic01101.isChecked() || mp02cic01102.isChecked() || mp02cic01103.isChecked() || mp02cic01104.isChecked()
                    || mp02cic01105.isChecked() || mp02cic01106.isChecked() || mp02cic01107.isChecked()
                    || mp02cic01108.isChecked() || mp02cic01109.isChecked() || mp02cic01110.isChecked()
                    || mp02cic01111.isChecked() || mp02cic01112.isChecked() || mp02cic01113.isChecked()
                    || mp02cic01188.isChecked()
            )) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cic011), Toast.LENGTH_LONG).show();
                mp02cic01188.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cib011: This data is Required!");
                return false;
            } else {
                mp02cic01188.setError(null);
            }

            if (mp02cic01188.isChecked() && mp02cic01188x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cic011), Toast.LENGTH_SHORT).show();
                mp02cic01188x.setError("This data is Required!");

                Log.i(TAG, "mp02cib01188x: This data is Required!");
                return false;
            } else {
                mp02cic01188x.setError(null);
            }

//            12
            if (mp02cic012.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cic012), Toast.LENGTH_SHORT).show();
                mp02cic01203.setError("This data is Required!");

                Log.i(TAG, "mp02cib012: This data is Required!");
                return false;
            } else {
                mp02cic01203.setError(null);
            }
        }


        return true;
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateCIC();

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

        JSONObject SCIC = new JSONObject();

        if (AppMain.maritalStatus == 1) {
            SCIC.put("mp02cic001", 1);
        } else {
            SCIC.put("mp02cic001", 2);
        }
        SCIC.put("mp02cic002", mp02cic00201.isChecked() ? "1" : mp02cic00202.isChecked() ? "2" : mp02cic00203.isChecked() ? "3"
                : mp02cic00204.isChecked() ? "4" : mp02cic00277.isChecked() ? "77" : "0");
        SCIC.put("mp02cic003", mp02cic00301.isChecked() ? "1" : mp02cic00302.isChecked() ? "2" : mp02cic00303.isChecked() ? "3"
                : mp02cic00304.isChecked() ? "4" : mp02cic00377.isChecked() ? "77" : "0");
        SCIC.put("mp02cic004", mp02cic00401.isChecked() ? "1" : mp02cic00402.isChecked() ? "2" : mp02cic00403.isChecked() ? "3"
                : mp02cic00404.isChecked() ? "4" : mp02cic00477.isChecked() ? "77" : "0");
        SCIC.put("mp02cic005", mp02cic00501.isChecked() ? "1" : mp02cic00502.isChecked() ? "2" : mp02cic00503.isChecked() ? "3"
                : mp02cic00504.isChecked() ? "4" : mp02cic00577.isChecked() ? "77" : "0");
        SCIC.put("mp02cic006", mp02cic00601.isChecked() ? "1" : mp02cic00602.isChecked() ? "2" : mp02cic00603.isChecked() ? "3"
                : mp02cic00604.isChecked() ? "4" : mp02cic00677.isChecked() ? "77" : "0");
        SCIC.put("mp02cic007", mp02cic00701.isChecked() ? "1" : mp02cic00702.isChecked() ? "2" : mp02cic00703.isChecked() ? "3"
                : mp02cic00704.isChecked() ? "4" : mp02cic00777.isChecked() ? "77" : "0");
        SCIC.put("mp02cic008", mp02cic00801.isChecked() ? "1" : mp02cic00802.isChecked() ? "2" : mp02cic00803.isChecked() ? "3"
                : mp02cic00804.isChecked() ? "4" : mp02cic00877.isChecked() ? "77" : "0");
        SCIC.put("mp02cic009", mp02cic00901.isChecked() ? "1" : mp02cic00902.isChecked() ? "2" : mp02cic00903.isChecked() ? "3"
                : mp02cic00904.isChecked() ? "4" : mp02cic00977.isChecked() ? "77" : "0");

        SCIC.put("mp02cic010", mp02cic01001.isChecked() ? "1" : mp02cic01002.isChecked() ? "2" : "0");

        SCIC.put("mp02cic01101", mp02cic01101.isChecked() ? "1" : "0");
        SCIC.put("mp02cic01102", mp02cic01102.isChecked() ? "2" : "0");
        SCIC.put("mp02cic01103", mp02cic01103.isChecked() ? "3" : "0");
        SCIC.put("mp02cic01104", mp02cic01104.isChecked() ? "4" : "0");
        SCIC.put("mp02cic01105", mp02cic01105.isChecked() ? "5" : "0");
        SCIC.put("mp02cic01106", mp02cic01106.isChecked() ? "6" : "0");
        SCIC.put("mp02cic01107", mp02cic01107.isChecked() ? "7" : "0");
        SCIC.put("mp02cic01108", mp02cic01108.isChecked() ? "8" : "0");
        SCIC.put("mp02cic01109", mp02cic01109.isChecked() ? "9" : "0");
        SCIC.put("mp02cic01110", mp02cic01110.isChecked() ? "10" : "0");
        SCIC.put("mp02cic01111", mp02cic01111.isChecked() ? "11" : "0");
        SCIC.put("mp02cic01112", mp02cic01112.isChecked() ? "12" : "0");
        SCIC.put("mp02cic01113", mp02cic01113.isChecked() ? "13" : "0");
        SCIC.put("mp02cic01188", mp02cic01188.isChecked() ? "88" : "0");
        SCIC.put("mp02cic01188x", mp02cic01188x.getText().toString());

        SCIC.put("mp02cic012", mp02cic01201.isChecked() ? "1" : mp02cic01202.isChecked() ? "2" : mp02cic01203.isChecked() ? "3" : "0");

        AppMain.pc.setsCIC(String.valueOf(SCIC));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
