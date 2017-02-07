package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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

public class SectionCBActivity extends Activity {

    @BindView(R.id.activity_section_cb)
    RelativeLayout activitySectionCb;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02cb00101)
    EditText mp02cb00101;
    @BindView(R.id.mp02cb00102)
    EditText mp02cb00102;
    @BindView(R.id.mp02cb002)
    EditText mp02cb002;
    @BindView(R.id.mp02bc003)
    RadioGroup mp02bc003;
    @BindView(R.id.mp02cb00301)
    RadioButton mp02cb00301;
    @BindView(R.id.mp02cb00302)
    RadioButton mp02cb00302;
    @BindView(R.id.mp02cb00303)
    RadioButton mp02cb00303;
    @BindView(R.id.mp02cb00304)
    RadioButton mp02cb00304;
    @BindView(R.id.mp02cb00305)
    RadioButton mp02cb00305;
    @BindView(R.id.mp02cb00306)
    RadioButton mp02cb00306;
    @BindView(R.id.mp02cb00388)
    RadioButton mp02cb00388;
    @BindView(R.id.mp02cb00388x)
    EditText mp02cb00388x;
    @BindView(R.id.mp02cb004)
    RadioGroup mp02cb004;
    @BindView(R.id.mp02cb00401)
    RadioButton mp02cb00401;
    @BindView(R.id.mp02cb00402)
    RadioButton mp02cb00402;
    @BindView(R.id.mp02cb00403)
    RadioButton mp02cb00403;
    @BindView(R.id.mp02cb00404)
    RadioButton mp02cb00404;
    @BindView(R.id.mp02cb00488)
    RadioButton mp02cb00488;
    @BindView(R.id.mp02cb00488x)
    EditText mp02cb00488x;
    @BindView(R.id.mp02cb005)
    RadioGroup mp02cb005;
    @BindView(R.id.mp02cb00501)
    RadioButton mp02cb00501;
    @BindView(R.id.mp02cb00502)
    RadioButton mp02cb00502;
    @BindView(R.id.fldGrpmp02cb006)
    LinearLayout fldGrpmp02cb006;
    @BindView(R.id.mp02cb006)
    EditText mp02cb006;
    @BindView(R.id.mp02cb007)
    RadioGroup mp02cb007;
    @BindView(R.id.mp02cb00701)
    RadioButton mp02cb00701;
    @BindView(R.id.mp02cb00702)
    RadioButton mp02cb00702;
    @BindView(R.id.mp02cb00703)
    RadioButton mp02cb00703;
    @BindView(R.id.mp02cb00704)
    RadioButton mp02cb00704;
    @BindView(R.id.mp02cb00705)
    RadioButton mp02cb00705;
    @BindView(R.id.mp02cb00706)
    RadioButton mp02cb00706;
    @BindView(R.id.mp02cb008)
    RadioGroup mp02cb008;
    @BindView(R.id.mp02cb00801)
    RadioButton mp02cb00801;
    @BindView(R.id.mp02cb00802)
    RadioButton mp02cb00802;
    @BindView(R.id.mp02cb00803)
    RadioButton mp02cb00803;
    @BindView(R.id.mp02cb00804)
    RadioButton mp02cb00804;
    @BindView(R.id.mp02cb00805)
    RadioButton mp02cb00805;
    @BindView(R.id.mp02cb00806)
    RadioButton mp02cb00806;
    @BindView(R.id.mp02cb00807)
    RadioButton mp02cb00807;
    @BindView(R.id.mp02cb00808)
    RadioButton mp02cb00808;
    @BindView(R.id.mp02cb00888)
    RadioButton mp02cb00888;
    @BindView(R.id.mp02cb00888x)
    EditText mp02cb00888x;
    @BindView(R.id.mp02cb009)
    RadioGroup mp02cb009;
    @BindView(R.id.mp02cb00901)
    RadioButton mp02cb00901;
    @BindView(R.id.mp02cb00902)
    RadioButton mp02cb00902;
    @BindView(R.id.mp02cb00903)
    RadioButton mp02cb00903;
    @BindView(R.id.mp02cb00904)
    RadioButton mp02cb00904;
    @BindView(R.id.mp02cb00905)
    RadioButton mp02cb00905;
    @BindView(R.id.fldGrpmp02cb010)
    LinearLayout fldGrpmp02cb010;
    @BindView(R.id.fldGrpmp02cb010a)
    LinearLayout fldGrpmp02cb010a;
    @BindView(R.id.mp02cb010)
    EditText mp02cb010;
    @BindView(R.id.mp02cb011)
    RadioGroup mp02cb011;
    @BindView(R.id.mp02cb01101)
    RadioButton mp02cb01101;
    @BindView(R.id.mp02cb01102)
    RadioButton mp02cb01102;
    @BindView(R.id.fldGrpmp02cb012)
    LinearLayout fldGrpmp02cb012;
    @BindView(R.id.mp02cb012)
    EditText mp02cb012;
    @BindView(R.id.mp02cb013)
    RadioGroup mp02cb013;
    @BindView(R.id.mp02cb01301)
    RadioButton mp02cb01301;
    @BindView(R.id.mp02cb01302)
    RadioButton mp02cb01302;
    @BindView(R.id.mp02cb01303)
    RadioButton mp02cb01303;
    @BindView(R.id.mp02cb01304)
    RadioButton mp02cb01304;
    @BindView(R.id.mp02cb01305)
    RadioButton mp02cb01305;
    @BindView(R.id.mp02cb01306)
    RadioButton mp02cb01306;
    @BindView(R.id.mp02cb014)
    RadioGroup mp02cb014;
    @BindView(R.id.mp02cb01401)
    RadioButton mp02cb01401;
    @BindView(R.id.mp02cb01402)
    RadioButton mp02cb01402;
    @BindView(R.id.mp02cb01403)
    RadioButton mp02cb01403;
    @BindView(R.id.mp02cb01404)
    RadioButton mp02cb01404;
    @BindView(R.id.mp02cb01405)
    RadioButton mp02cb01405;
    @BindView(R.id.mp02cb01406)
    RadioButton mp02cb01406;
    @BindView(R.id.mp02cb01407)
    RadioButton mp02cb01407;
    @BindView(R.id.mp02cb01408)
    RadioButton mp02cb01408;
    @BindView(R.id.mp02cb01488)
    RadioButton mp02cb01488;
    @BindView(R.id.mp02cb01488x)
    EditText mp02cb01488x;
    @BindView(R.id.mp02cb015)
    RadioGroup mp02cb015;
    @BindView(R.id.mp02cb01501)
    RadioButton mp02cb01501;
    @BindView(R.id.mp02cb01502)
    RadioButton mp02cb01502;
    @BindView(R.id.mp02cb016)
    RadioGroup mp02cb016;
    @BindView(R.id.mp02cb01601)
    RadioButton mp02cb01601;
    @BindView(R.id.mp02cb01602)
    RadioButton mp02cb01602;
    @BindView(R.id.mp02cb01603)
    RadioButton mp02cb01603;
    @BindView(R.id.fldGrpmp02cb017)
    LinearLayout fldGrpmp02cb017;
    @BindView(R.id.mp02cb017)
    EditText mp02cb017;
    @BindView(R.id.mp02cb018)
    RadioGroup mp02cb018;
    @BindView(R.id.mp02cb01801)
    RadioButton mp02cb01801;
    @BindView(R.id.mp02cb01802)
    RadioButton mp02cb01802;
    @BindView(R.id.mp02cb01803)
    RadioButton mp02cb01803;
    @BindView(R.id.fldGrpmp02cb019)
    LinearLayout fldGrpmp02cb019;
    @BindView(R.id.mp02cb019)
    RadioGroup mp02cb019;
    @BindView(R.id.mp02cb01901)
    RadioButton mp02cb01901;
    @BindView(R.id.mp02cb01902)
    RadioButton mp02cb01902;
    @BindView(R.id.mp02cb01903)
    RadioButton mp02cb01903;
    @BindView(R.id.mp02cb01904)
    RadioButton mp02cb01904;
    @BindView(R.id.mp02cb020)
    RadioGroup mp02cb020;
    @BindView(R.id.mp02cb02001)
    RadioButton mp02cb02001;
    @BindView(R.id.mp02cb02002)
    RadioButton mp02cb02002;
    @BindView(R.id.mp02cb021)
    EditText mp02cb021;
    @BindView(R.id.mp02cb022)
    EditText mp02cb022;
    @BindView(R.id.mp02cb023)
    RadioGroup mp02cb023;
    @BindView(R.id.mp02cb02301)
    RadioButton mp02cb02301;
    @BindView(R.id.mp02cb02302)
    RadioButton mp02cb02302;
    @BindView(R.id.mp02cb02303)
    RadioButton mp02cb02303;
    @BindView(R.id.mp02cb02304)
    RadioButton mp02cb02304;
    @BindView(R.id.mp02cb024)
    RadioGroup mp02cb024;
    @BindView(R.id.mp02cb02401)
    RadioButton mp02cb02401;
    @BindView(R.id.mp02cb02402)
    RadioButton mp02cb02402;
    @BindView(R.id.mp02cb02403)
    RadioButton mp02cb02403;
    @BindView(R.id.mp02cb02404)
    RadioButton mp02cb02404;
    @BindView(R.id.mp02cb025)
    RadioGroup mp02cb025;
    @BindView(R.id.mp02cb02501)
    RadioButton mp02cb02501;
    @BindView(R.id.mp02cb02502)
    RadioButton mp02cb02502;
    @BindView(R.id.mp02cb02503)
    RadioButton mp02cb02503;
    @BindView(R.id.mp02cb02504)
    RadioButton mp02cb02504;
    @BindView(R.id.mp02cb026)
    RadioGroup mp02cb026;
    @BindView(R.id.mp02cb02601)
    RadioButton mp02cb02601;
    @BindView(R.id.mp02cb02602)
    RadioButton mp02cb02602;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cb);
        ButterKnife.bind(this);

        // =================== Q2 Others ====================


    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
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
                Intent seccc = new Intent(this, SectionCCActivity.class);
                startActivity(seccc);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
/*        MP02DBHelper db = new MP02DBHelper(this);

        int updcount = db.updateSCB();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();*/
        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sa = new JSONObject();


        //MPApp.fc.setROW_Scb(String.valueOf(scb));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        //======================= Q 1 ===============


        return true;
    }





}
