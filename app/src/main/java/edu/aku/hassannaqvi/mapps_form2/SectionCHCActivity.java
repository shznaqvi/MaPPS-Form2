package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
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

public class SectionCHCActivity extends Activity {

    @BindView(R.id.activity_section_chc)
    RelativeLayout activitySectionChc;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02chc001)
    RadioGroup mp02chc001;
    @BindView(R.id.mp02chc00101)
    RadioButton mp02chc00101;
    @BindView(R.id.mp02chc00102)
    RadioButton mp02chc00102;
    @BindView(R.id.mp02chc002)
    RadioGroup mp02chc002;
    @BindView(R.id.mp02chc00201)
    RadioButton mp02chc00201;
    @BindView(R.id.mp02chc00202)
    RadioButton mp02chc00202;
    @BindView(R.id.mp02chc00203)
    RadioButton mp02chc00203;
    @BindView(R.id.mp02chc00204)
    RadioButton mp02chc00204;
    @BindView(R.id.mp02chc003)
    RadioGroup mp02chc003;
    @BindView(R.id.mp02chc00301)
    RadioButton mp02chc00301;
    @BindView(R.id.mp02chc00302)
    RadioButton mp02chc00302;
    @BindView(R.id.mp02chc00303)
    RadioButton mp02chc00303;
    @BindView(R.id.mp02chc00304)
    RadioButton mp02chc00304;
    @BindView(R.id.mp02chc004)
    RadioGroup mp02chc004;
    @BindView(R.id.mp02chc00401)
    RadioButton mp02chc00401;
    @BindView(R.id.mp02chc00402)
    RadioButton mp02chc00402;
    @BindView(R.id.mp02chc00403)
    RadioButton mp02chc00403;
    @BindView(R.id.mp02chc00404)
    RadioButton mp02chc00404;
    @BindView(R.id.mp02chc005)
    RadioGroup mp02chc005;
    @BindView(R.id.mp02chc00501)
    RadioButton mp02chc00501;
    @BindView(R.id.mp02chc00502)
    RadioButton mp02chc00502;
    @BindView(R.id.mp02chc00503)
    RadioButton mp02chc00503;
    @BindView(R.id.mp02chc00504)
    RadioButton mp02chc00504;
    @BindView(R.id.mp02chc006)
    RadioGroup mp02chc006;
    @BindView(R.id.mp02chc00601)
    RadioButton mp02chc00601;
    @BindView(R.id.mp02chc00602)
    RadioButton mp02chc00602;
    @BindView(R.id.mp02chc00603)
    RadioButton mp02chc00603;
    @BindView(R.id.mp02chc00604)
    RadioButton mp02chc00604;
    @BindView(R.id.mp02chc007)
    RadioGroup mp02chc007;
    @BindView(R.id.mp02chc00701)
    RadioButton mp02chc00701;
    @BindView(R.id.mp02chc00702)
    RadioButton mp02chc00702;
    @BindView(R.id.mp02chc00703)
    RadioButton mp02chc00703;
    @BindView(R.id.mp02chc00704)
    RadioButton mp02chc00704;
    @BindView(R.id.mp02chc008)
    RadioGroup mp02chc008;
    @BindView(R.id.mp02chc00801)
    RadioButton mp02chc00801;
    @BindView(R.id.mp02chc00802)
    RadioButton mp02chc00802;
    @BindView(R.id.mp02chc00803)
    RadioButton mp02chc00803;
    @BindView(R.id.mp02chc00804)
    RadioButton mp02chc00804;
    @BindView(R.id.mp02chc009)
    RadioGroup mp02chc009;
    @BindView(R.id.mp02chc00901)
    RadioButton mp02chc00901;
    @BindView(R.id.mp02chc00902)
    RadioButton mp02chc00902;
    @BindView(R.id.mp02chc00903)
    RadioButton mp02chc00903;
    @BindView(R.id.mp02chc00904)
    RadioButton mp02chc00904;
    @BindView(R.id.mp02chc010)
    RadioGroup mp02chc010;
    @BindView(R.id.mp02chc01001)
    RadioButton mp02chc01001;
    @BindView(R.id.mp02chc01002)
    RadioButton mp02chc01002;
    @BindView(R.id.mp02chc01003)
    RadioButton mp02chc01003;
    @BindView(R.id.mp02chc01101)
    CheckBox mp02chc01101;
    @BindView(R.id.mp02chc01102)
    CheckBox mp02chc01102;
    @BindView(R.id.mp02chc01103)
    CheckBox mp02chc01103;
    @BindView(R.id.mp02chc01104)
    CheckBox mp02chc01104;
    @BindView(R.id.mp02chc01105)
    CheckBox mp02chc01105;
    @BindView(R.id.mp02chc01106)
    CheckBox mp02chc01106;
    @BindView(R.id.mp02chc01107)
    CheckBox mp02chc01107;
    @BindView(R.id.mp02chc01108)
    CheckBox mp02chc01108;
    @BindView(R.id.mp02chc01109)
    CheckBox mp02chc01109;
    @BindView(R.id.mp02chc01110)
    CheckBox mp02chc01110;
    @BindView(R.id.mp02chc01111)
    CheckBox mp02chc01111;
    @BindView(R.id.mp02chc01112)
    CheckBox mp02chc01112;
    @BindView(R.id.mp02chc01113)
    CheckBox mp02chc01113;
    @BindView(R.id.mp02chc01188)
    CheckBox mp02chc01188;
    @BindView(R.id.mp02chc01188x)
    EditText mp02chc01188x;
    @BindView(R.id.mp02chc012)
    RadioGroup mp02chc012;
    @BindView(R.id.mp02chc01201)
    RadioButton mp02chc01201;
    @BindView(R.id.mp02chc01202)
    RadioButton mp02chc01202;
    @BindView(R.id.mp02chc01203)
    RadioButton mp02chc01203;

    @BindView(R.id.fldGrpmp02chc002)
    RadioButton fldGrpmp02chc002;
    @BindView(R.id.fldGrpmp02chc011)
    RadioButton fldGrpmp02chc011;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_chc);
        ButterKnife.bind(this);

        mp02chc00102.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    fldGrpmp02chc002.setVisibility(View.GONE);

                    mp02chc002.clearCheck();
                    mp02chc003.clearCheck();
                    mp02chc004.clearCheck();
                    mp02chc005.clearCheck();
                    mp02chc006.clearCheck();
                    mp02chc007.clearCheck();
                    mp02chc008.clearCheck();
                    mp02chc009.clearCheck();

                }else {
                    fldGrpmp02chc002.setVisibility(View.VISIBLE);
                }
            }
        });

        mp02chc01001.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    fldGrpmp02chc011.setVisibility(View.VISIBLE);
                }else {
                    fldGrpmp02chc011.setVisibility(View.GONE);

                    mp02chc01101.setChecked(false);
                    mp02chc01102.setChecked(false);
                    mp02chc01103.setChecked(false);
                    mp02chc01104.setChecked(false);
                    mp02chc01105.setChecked(false);
                    mp02chc01106.setChecked(false);
                    mp02chc01107.setChecked(false);
                    mp02chc01108.setChecked(false);
                    mp02chc01109.setChecked(false);
                    mp02chc01110.setChecked(false);
                    mp02chc01111.setChecked(false);
                    mp02chc01112.setChecked(false);
                    mp02chc01113.setChecked(false);
                    mp02chc01188.setChecked(false);

                    mp02chc01188x.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Complete Sections", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);

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
        if (mp02chc001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02chc001), Toast.LENGTH_SHORT).show();
            mp02chc00102.setError("This data is Required!");
            return false;
        } else {
            mp02chc00102.setError(null);
        }

//        Skip
        if (mp02chc00101.isChecked()){


//            2
            if (mp02chc002.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02chc002), Toast.LENGTH_SHORT).show();
                mp02chc00204.setError("This data is Required!");
                return false;
            } else {
                mp02chc00204.setError(null);
            }

//            3
            if (mp02chc003.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02chc003), Toast.LENGTH_SHORT).show();
                mp02chc00304.setError("This data is Required!");
                return false;
            } else {
                mp02chc00304.setError(null);
            }

//            4
            if (mp02chc004.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02chc004), Toast.LENGTH_SHORT).show();
                mp02chc00404.setError("This data is Required!");
                return false;
            } else {
                mp02chc00404.setError(null);
            }

//            5
            if (mp02chc005.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02chc005), Toast.LENGTH_SHORT).show();
                mp02chc00504.setError("This data is Required!");
                return false;
            } else {
                mp02chc00504.setError(null);
            }

//            6
            if (mp02chc006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02chc006), Toast.LENGTH_SHORT).show();
                mp02chc00604.setError("This data is Required!");
                return false;
            } else {
                mp02chc00604.setError(null);
            }

//            7
            if (mp02chc007.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02chc007), Toast.LENGTH_SHORT).show();
                mp02chc00704.setError("This data is Required!");
                return false;
            } else {
                mp02chc00704.setError(null);
            }

//            8
            if (mp02chc008.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02chc008), Toast.LENGTH_SHORT).show();
                mp02chc00804.setError("This data is Required!");
                return false;
            } else {
                mp02chc00804.setError(null);
            }

//            9
            if (mp02chc009.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02chc009), Toast.LENGTH_SHORT).show();
                mp02chc00904.setError("This data is Required!");
                return false;
            } else {
                mp02chc00904.setError(null);
            }
        }

//        10
        if (mp02chc010.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02chc010), Toast.LENGTH_SHORT).show();
            mp02chc01003.setError("This data is Required!");
            return false;
        } else {
            mp02chc01003.setError(null);
        }

//        Skip
        if (mp02chc00101.isChecked()){

//            11
            if (!(mp02chc01101.isChecked() || mp02chc01102.isChecked() || mp02chc01103.isChecked() || mp02chc01104.isChecked()
                    || mp02chc01105.isChecked() || mp02chc01106.isChecked() || mp02chc01107.isChecked()
                    || mp02chc01108.isChecked() || mp02chc01109.isChecked() || mp02chc01110.isChecked()
                    || mp02chc01111.isChecked() || mp02chc01112.isChecked() || mp02chc01113.isChecked()
                    || mp02chc01188.isChecked()
            )) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02chc011), Toast.LENGTH_LONG).show();
                mp02chc01188.setError("This data is Required!");    // Set Error on last radio button
                return false;
            } else {
                mp02chc01188.setError(null);
            }

            if (mp02chc01188.isChecked() && mp02chc01188x.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02chc011), Toast.LENGTH_SHORT).show();
                mp02chc01188x.setError("This data is Required!");
                return false;
            } else {
                mp02chc01188x.setError(null);
            }

//            12
            if (mp02chc012.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02chc012), Toast.LENGTH_SHORT).show();
                mp02chc01203.setError("This data is Required!");
                return false;
            } else {
                mp02chc01203.setError(null);
            }
        }


        return true;
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

//        int updcount = db.updateSCHC();
//
//        if (updcount == 1) {
//            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
//            return true;
//        } else {
//            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
//            return false;
//        }

        return true;

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sCHC = new JSONObject();

        sCHC.put("mp02chc001", mp02chc00101.isChecked() ? "1" : mp02chc00102.isChecked() ? "2" : "0");

        sCHC.put("mp02chc002", mp02chc00201.isChecked() ? "1" : mp02chc00202.isChecked() ? "2" : mp02chc00203.isChecked() ? "3"
                : mp02chc00204.isChecked() ? "4" : "0");
        sCHC.put("mp02chc003", mp02chc00301.isChecked() ? "1" : mp02chc00302.isChecked() ? "2" : mp02chc00303.isChecked() ? "3"
                : mp02chc00304.isChecked() ? "4" : "0");
        sCHC.put("mp02chc004", mp02chc00401.isChecked() ? "1" : mp02chc00402.isChecked() ? "2" : mp02chc00403.isChecked() ? "3"
                : mp02chc00404.isChecked() ? "4" : "0");
        sCHC.put("mp02chc005", mp02chc00501.isChecked() ? "1" : mp02chc00502.isChecked() ? "2" : mp02chc00503.isChecked() ? "3"
                : mp02chc00504.isChecked() ? "4" : "0");
        sCHC.put("mp02chc006", mp02chc00601.isChecked() ? "1" : mp02chc00602.isChecked() ? "2" : mp02chc00603.isChecked() ? "3"
                : mp02chc00604.isChecked() ? "4" : "0");
        sCHC.put("mp02chc007", mp02chc00701.isChecked() ? "1" : mp02chc00702.isChecked() ? "2" : mp02chc00703.isChecked() ? "3"
                : mp02chc00704.isChecked() ? "4" : "0");
        sCHC.put("mp02chc008", mp02chc00801.isChecked() ? "1" : mp02chc00802.isChecked() ? "2" : mp02chc00803.isChecked() ? "3"
                : mp02chc00804.isChecked() ? "4" : "0");
        sCHC.put("mp02chc009", mp02chc00901.isChecked() ? "1" : mp02chc00902.isChecked() ? "2" : mp02chc00903.isChecked() ? "3"
                : mp02chc00904.isChecked() ? "4" : "0");

        sCHC.put("mp02chc010", mp02chc01001.isChecked() ? "1" : mp02chc01002.isChecked() ? "2" : "0");

        sCHC.put("mp02chc01101", mp02chc01101.isChecked() ? "1" : "0");
        sCHC.put("mp02chc01102", mp02chc01102.isChecked() ? "2" : "0");
        sCHC.put("mp02chc01103", mp02chc01103.isChecked() ? "3" : "0");
        sCHC.put("mp02chc01104", mp02chc01104.isChecked() ? "4" : "0");
        sCHC.put("mp02chc01105", mp02chc01105.isChecked() ? "5" : "0");
        sCHC.put("mp02chc01106", mp02chc01106.isChecked() ? "6" : "0");
        sCHC.put("mp02chc01107", mp02chc01107.isChecked() ? "7" : "0");
        sCHC.put("mp02chc01108", mp02chc01108.isChecked() ? "8" : "0");
        sCHC.put("mp02chc01109", mp02chc01109.isChecked() ? "9" : "0");
        sCHC.put("mp02chc01110", mp02chc01110.isChecked() ? "10" : "0");
        sCHC.put("mp02chc01111", mp02chc01111.isChecked() ? "11" : "0");
        sCHC.put("mp02chc01112", mp02chc01112.isChecked() ? "12" : "0");
        sCHC.put("mp02chc01113", mp02chc01113.isChecked() ? "13" : "0");
        sCHC.put("mp02chc01188", mp02chc01188.isChecked() ? "88" : "0");

        sCHC.put("mp02chc012", mp02chc01201.isChecked() ? "1" : mp02chc01202.isChecked() ? "2" : mp02chc01203.isChecked() ? "3" : "0");

        //MPApp.fc.setROW_SCHC(String.valueOf(sCHC));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

}
