package edu.aku.hassannaqvi.mapps_form3.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
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

public class SectionCBActivity extends Activity {

    private static final String TAG = SectionCBActivity.class.getSimpleName();

    @BindView(R.id.activity_section_cc)
    RelativeLayout activitySectionCc;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02cc001)
    EditText mp02cc001;
    @BindView(R.id.mp02cc002)
    RadioGroup mp02cc002;
    @BindView(R.id.mp02cc00201)
    RadioButton mp02cc00201;
    @BindView(R.id.mp02cc00202)
    RadioButton mp02cc00202;
    @BindView(R.id.mp02cc00203)
    RadioButton mp02cc00203;
    @BindView(R.id.mp02cc00204)
    RadioButton mp02cc00204;
    @BindView(R.id.mp02cc00205)
    RadioButton mp02cc00205;
    @BindView(R.id.mp02cc003)
    RadioGroup mp02cc003;
    @BindView(R.id.mp02cc00301)
    RadioButton mp02cc00301;
    @BindView(R.id.mp02cc00302)
    RadioButton mp02cc00302;
    @BindView(R.id.mp02cc00303)
    RadioButton mp02cc00303;
    @BindView(R.id.mp02cc00304)
    RadioButton mp02cc00304;
    @BindView(R.id.mp02cc004)
    RadioGroup mp02cc004;
    @BindView(R.id.mp02cc00401)
    RadioButton mp02cc00401;
    @BindView(R.id.mp02cc00402)
    RadioButton mp02cc00402;
    @BindView(R.id.mp02cc00403)
    RadioButton mp02cc00403;
    @BindView(R.id.mp02cc00404)
    RadioButton mp02cc00404;
    @BindView(R.id.mp02cc00405)
    RadioButton mp02cc00405;
    @BindView(R.id.mp02cc00406)
    RadioButton mp02cc00406;
    @BindView(R.id.mp02cc00407)
    RadioButton mp02cc00407;
    @BindView(R.id.mp02cc005)
    RadioGroup mp02cc005;
    @BindView(R.id.mp02cc00501)
    RadioButton mp02cc00501;
    @BindView(R.id.mp02cc00502)
    RadioButton mp02cc00502;
    @BindView(R.id.mp02cc00503)
    RadioButton mp02cc00503;
    @BindView(R.id.mp02cc00504)
    RadioButton mp02cc00504;
    @BindView(R.id.mp02cc00505)
    RadioButton mp02cc00505;
    @BindView(R.id.mp02cc00506)
    RadioButton mp02cc00506;
    @BindView(R.id.mp02cc006)
    RadioGroup mp02cc006;
    @BindView(R.id.mp02cc00601)
    RadioButton mp02cc00601;
    @BindView(R.id.mp02cc00602)
    RadioButton mp02cc00602;
    @BindView(R.id.mp02cc00603)
    RadioButton mp02cc00603;
    @BindView(R.id.mp02cc00604)
    RadioButton mp02cc00604;
    @BindView(R.id.mp02cc00677)
    RadioButton mp02cc00677;
    @BindView(R.id.mp02cc007)
    RadioGroup mp02cc007;
    @BindView(R.id.mp02cc00701)
    RadioButton mp02cc00701;
    @BindView(R.id.mp02cc00702)
    RadioButton mp02cc00702;
    @BindView(R.id.mp02cc00703)
    RadioButton mp02cc00703;
    @BindView(R.id.mp02cc00704)
    RadioButton mp02cc00704;
    @BindView(R.id.mp02cc00777)
    RadioButton mp02cc00777;
    @BindView(R.id.fldGrpmp02cc08)
    LinearLayout fldGrpmp02cc08;
    @BindView(R.id.mp02cc008)
    RadioGroup mp02cc008;
    @BindView(R.id.mp02cc00801)
    RadioButton mp02cc00801;
    @BindView(R.id.mp02cc00802)
    RadioButton mp02cc00802;
    @BindView(R.id.mp02cc00803)
    RadioButton mp02cc00803;
    @BindView(R.id.mp02cc00804)
    RadioButton mp02cc00804;
    @BindView(R.id.mp02cc00877)
    RadioButton mp02cc00877;
    @BindView(R.id.mp02cc009)
    RadioGroup mp02cc009;
    @BindView(R.id.mp02cc00901)
    RadioButton mp02cc00901;
    @BindView(R.id.mp02cc00902)
    RadioButton mp02cc00902;
    @BindView(R.id.mp02cc00903)
    RadioButton mp02cc00903;
    @BindView(R.id.mp02cc00904)
    RadioButton mp02cc00904;
    @BindView(R.id.mp02cc00977)
    RadioButton mp02cc00977;
    @BindView(R.id.mp02cc010)
    RadioGroup mp02cc010;
    @BindView(R.id.mp02cc01001)
    RadioButton mp02cc01001;
    @BindView(R.id.mp02cc01002)
    RadioButton mp02cc01002;
    @BindView(R.id.mp02cc01003)
    RadioButton mp02cc01003;
    @BindView(R.id.mp02cc01004)
    RadioButton mp02cc01004;
    @BindView(R.id.mp02cc01005)
    RadioButton mp02cc01005;
    @BindView(R.id.mp02cc011)
    RadioGroup mp02cc011;
    @BindView(R.id.mp02cc01101)
    RadioButton mp02cc01101;
    @BindView(R.id.mp02cc01102)
    RadioButton mp02cc01102;
    @BindView(R.id.mp02cc01103)
    RadioButton mp02cc01103;
    @BindView(R.id.mp02cc01104)
    RadioButton mp02cc01104;
    @BindView(R.id.mp02cc01105)
    RadioButton mp02cc01105;
    @BindView(R.id.mp02cc012)
    RadioGroup mp02cc012;
    @BindView(R.id.mp02cc01201)
    RadioButton mp02cc01201;
    @BindView(R.id.mp02cc01202)
    RadioButton mp02cc01202;
    @BindView(R.id.mp02cc01203)
    RadioButton mp02cc01203;
    @BindView(R.id.mp02cc01204)
    RadioButton mp02cc01204;
    @BindView(R.id.mp02cc01205)
    RadioButton mp02cc01205;
    @BindView(R.id.mp02cc013)
    RadioGroup mp02cc013;
    @BindView(R.id.mp02cc01301)
    RadioButton mp02cc01301;
    @BindView(R.id.mp02cc01302)
    RadioButton mp02cc01302;
    @BindView(R.id.mp02cc01303)
    RadioButton mp02cc01303;
    @BindView(R.id.mp02cc01304)
    RadioButton mp02cc01304;
    @BindView(R.id.mp02cc01305)
    RadioButton mp02cc01305;
    @BindView(R.id.mp02cc014)
    RadioGroup mp02cc014;
    @BindView(R.id.mp02cc01401)
    RadioButton mp02cc01401;
    @BindView(R.id.mp02cc01402)
    RadioButton mp02cc01402;
    @BindView(R.id.mp02cc01403)
    RadioButton mp02cc01403;
    @BindView(R.id.mp02cc01404)
    RadioButton mp02cc01404;
    @BindView(R.id.mp02cc01405)
    RadioButton mp02cc01405;
    @BindView(R.id.mp02cc015)
    RadioGroup mp02cc015;
    @BindView(R.id.mp02cc01501)
    RadioButton mp02cc01501;
    @BindView(R.id.mp02cc01502)
    RadioButton mp02cc01502;
    @BindView(R.id.mp02cc01503)
    RadioButton mp02cc01503;
    @BindView(R.id.mp02cc01504)
    RadioButton mp02cc01504;
    @BindView(R.id.mp02cc01505)
    RadioButton mp02cc01505;
    @BindView(R.id.mp02cc016)
    RadioGroup mp02cc016;
    @BindView(R.id.mp02cc01601)
    RadioButton mp02cc01601;
    @BindView(R.id.mp02cc01602)
    RadioButton mp02cc01602;
    @BindView(R.id.mp02cc01603)
    RadioButton mp02cc01603;
    @BindView(R.id.mp02cc01604)
    RadioButton mp02cc01604;
    @BindView(R.id.mp02cc01605)
    RadioButton mp02cc01605;
    @BindView(R.id.mp02cc017)
    RadioGroup mp02cc017;
    @BindView(R.id.mp02cc01701)
    RadioButton mp02cc01701;
    @BindView(R.id.mp02cc01702)
    RadioButton mp02cc01702;
    @BindView(R.id.mp02cc01703)
    RadioButton mp02cc01703;
    @BindView(R.id.mp02cc01704)
    RadioButton mp02cc01704;
    @BindView(R.id.mp02cc01705)
    RadioButton mp02cc01705;
    @BindView(R.id.mp02cc018)
    RadioGroup mp02cc018;
    @BindView(R.id.mp02cc01801)
    RadioButton mp02cc01801;
    @BindView(R.id.mp02cc01802)
    RadioButton mp02cc01802;
    @BindView(R.id.mp02cc01803)
    RadioButton mp02cc01803;
    @BindView(R.id.mp02cc01804)
    RadioButton mp02cc01804;
    @BindView(R.id.mp02cc01805)
    RadioButton mp02cc01805;
    @BindView(R.id.mp02cc019)
    RadioGroup mp02cc019;
    @BindView(R.id.mp02cc01901)
    RadioButton mp02cc01901;
    @BindView(R.id.mp02cc01902)
    RadioButton mp02cc01902;
    @BindView(R.id.mp02cc01903)
    RadioButton mp02cc01903;
    @BindView(R.id.mp02cc01904)
    RadioButton mp02cc01904;
    @BindView(R.id.mp02cc01905)
    RadioButton mp02cc01905;
    @BindView(R.id.mp02cc020)
    RadioGroup mp02cc020;
    @BindView(R.id.mp02cc02001)
    RadioButton mp02cc02001;
    @BindView(R.id.mp02cc02002)
    RadioButton mp02cc02002;
    @BindView(R.id.mp02cc02003)
    RadioButton mp02cc02003;
    @BindView(R.id.mp02cc02004)
    RadioButton mp02cc02004;
    @BindView(R.id.mp02cc02005)
    RadioButton mp02cc02005;
    @BindView(R.id.mp02cc021)
    RadioGroup mp02cc021;
    @BindView(R.id.mp02cc02101)
    RadioButton mp02cc02101;
    @BindView(R.id.mp02cc02102)
    RadioButton mp02cc02102;
    @BindView(R.id.mp02cc02103)
    RadioButton mp02cc02103;
    @BindView(R.id.mp02cc02104)
    RadioButton mp02cc02104;
    @BindView(R.id.mp02cc02105)
    RadioButton mp02cc02105;
    @BindView(R.id.mp02cc022)
    RadioGroup mp02cc022;
    @BindView(R.id.mp02cc02201)
    RadioButton mp02cc02201;
    @BindView(R.id.mp02cc02202)
    RadioButton mp02cc02202;
    @BindView(R.id.mp02cc02203)
    RadioButton mp02cc02203;
    @BindView(R.id.mp02cc02204)
    RadioButton mp02cc02204;
    @BindView(R.id.mp02cc02205)
    RadioButton mp02cc02205;
    @BindView(R.id.fldGrpmp02cc023)
    LinearLayout fldGrpmp02cc023;
    @BindView(R.id.mp02cc023)
    RadioGroup mp02cc023;
    @BindView(R.id.mp02cc02301)
    RadioButton mp02cc02301;
    @BindView(R.id.mp02cc02302)
    RadioButton mp02cc02302;
    @BindView(R.id.mp02cc02303)
    RadioButton mp02cc02303;
    @BindView(R.id.mp02cc02304)
    RadioButton mp02cc02304;
    @BindView(R.id.mp02cc024)
    RadioGroup mp02cc024;
    @BindView(R.id.mp02cc02401)
    RadioButton mp02cc02401;
    @BindView(R.id.mp02cc02402)
    RadioButton mp02cc02402;
    @BindView(R.id.mp02cc02403)
    RadioButton mp02cc02403;
    @BindView(R.id.mp02cc02404)
    RadioButton mp02cc02404;
    @BindView(R.id.mp02cc02405)
    RadioButton mp02cc02405;
    @BindView(R.id.mp02cc025)
    RadioGroup mp02cc025;
    @BindView(R.id.mp02cc02501)
    RadioButton mp02cc02501;
    @BindView(R.id.mp02cc02502)
    RadioButton mp02cc02502;
    @BindView(R.id.mp02cc02503)
    RadioButton mp02cc02503;
    @BindView(R.id.mp02cc02504)
    RadioButton mp02cc02504;
    @BindView(R.id.mp02cc02505)
    RadioButton mp02cc02505;
    @BindView(R.id.mp02cc026)
    RadioGroup mp02cc026;
    @BindView(R.id.mp02cc02601)
    RadioButton mp02cc02601;
    @BindView(R.id.mp02cc02602)
    RadioButton mp02cc02602;
    @BindView(R.id.mp02cc02603)
    RadioButton mp02cc02603;
    @BindView(R.id.mp02cc02604)
    RadioButton mp02cc02604;
    @BindView(R.id.mp02cc02605)
    RadioButton mp02cc02605;
    @BindView(R.id.fldGrpmp02cc027)
    LinearLayout fldGrpmp02cc027;
    @BindView(R.id.mp02cc027)
    RadioGroup mp02cc027;
    @BindView(R.id.mp02cc02701)
    RadioButton mp02cc02701;
    @BindView(R.id.mp02cc02702)
    RadioButton mp02cc02702;
    @BindView(R.id.mp02cc02703)
    RadioButton mp02cc02703;
    @BindView(R.id.mp02cc02704)
    RadioButton mp02cc02704;
    @BindView(R.id.fldGrpmp02cc028)
    LinearLayout fldGrpmp02cc028;
    @BindView(R.id.mp02cc028)
    RadioGroup mp02cc028;
    @BindView(R.id.mp02cc02801)
    RadioButton mp02cc02801;
    @BindView(R.id.mp02cc02802)
    RadioButton mp02cc02802;
    @BindView(R.id.mp02cc02803)
    RadioButton mp02cc02803;
    @BindView(R.id.mp02cc02901)
    CheckBox mp02cc02901;
    @BindView(R.id.mp02cc02902)
    CheckBox mp02cc02902;
    @BindView(R.id.mp02cc02903)
    CheckBox mp02cc02903;
    @BindView(R.id.mp02cc02904)
    CheckBox mp02cc02904;
    @BindView(R.id.mp02cc02905)
    CheckBox mp02cc02905;
    @BindView(R.id.mp02cc02906)
    CheckBox mp02cc02906;
    @BindView(R.id.mp02cc02907)
    CheckBox mp02cc02907;
    @BindView(R.id.mp02cc02908)
    CheckBox mp02cc02908;
    @BindView(R.id.mp02cc02909)
    CheckBox mp02cc02909;
    @BindView(R.id.mp02cc02988)
    CheckBox mp02cc02988;
    @BindView(R.id.mp02cc02988x)
    EditText mp02cc02988x;
    @BindView(R.id.mp02cc03001)
    CheckBox mp02cc03001;
    @BindView(R.id.mp02cc03002)
    CheckBox mp02cc03002;
    @BindView(R.id.mp02cc03003)
    CheckBox mp02cc03003;
    @BindView(R.id.mp02cc03004)
    CheckBox mp02cc03004;
    @BindView(R.id.mp02cc03005)
    CheckBox mp02cc03005;
    @BindView(R.id.mp02cc03006)
    CheckBox mp02cc03006;
    @BindView(R.id.mp02cc03007)
    CheckBox mp02cc03007;
    @BindView(R.id.mp02cc03088)
    CheckBox mp02cc03088;
    @BindView(R.id.mp02cc03088x)
    EditText mp02cc03088x;
    @BindView(R.id.mp02cc03101)
    CheckBox mp02cc03101;
    @BindView(R.id.mp02cc03102)
    CheckBox mp02cc03102;
    @BindView(R.id.mp02cc03103)
    CheckBox mp02cc03103;
    @BindView(R.id.mp02cc03104)
    CheckBox mp02cc03104;
    @BindView(R.id.mp02cc03105)
    CheckBox mp02cc03105;
    @BindView(R.id.mp02cc03106)
    CheckBox mp02cc03106;
    @BindView(R.id.mp02cc03188)
    CheckBox mp02cc03188;
    @BindView(R.id.mp02cc03188x)
    EditText mp02cc03188x;
    @BindView(R.id.mp02cc03201)
    CheckBox mp02cc03201;
    @BindView(R.id.mp02cc03202)
    CheckBox mp02cc03202;
    @BindView(R.id.mp02cc03203)
    CheckBox mp02cc03203;
    @BindView(R.id.mp02cc03204)
    CheckBox mp02cc03204;
    @BindView(R.id.mp02cc03205)
    CheckBox mp02cc03205;
    @BindView(R.id.mp02cc03206)
    CheckBox mp02cc03206;
    @BindView(R.id.mp02cc03288)
    CheckBox mp02cc03288;
    @BindView(R.id.mp02cc03288x)
    EditText mp02cc03288x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cb);
        ButterKnife.bind(this);


        mp02cc022.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mp02cc02201.isChecked() || mp02cc02202.isChecked() || mp02cc02205.isChecked()) {
                    fldGrpmp02cc023.setVisibility(View.VISIBLE);
                    fldGrpmp02cc027.setVisibility(View.GONE);
                    mp02cc027.clearCheck();
                    mp02cc028.clearCheck();
                    mp02cc02901.setChecked(false);
                    mp02cc02902.setChecked(false);
                    mp02cc02903.setChecked(false);
                    mp02cc02904.setChecked(false);
                    mp02cc02905.setChecked(false);
                    mp02cc02906.setChecked(false);
                    mp02cc02907.setChecked(false);
                    mp02cc02908.setChecked(false);
                    mp02cc02908.setChecked(false);
                    mp02cc02988.setChecked(false);
                    mp02cc02988x.setText(null);
                } else {
                    fldGrpmp02cc023.setVisibility(View.GONE);
                    fldGrpmp02cc027.setVisibility(View.VISIBLE);
                    mp02cc023.clearCheck();
                    mp02cc024.clearCheck();
                    mp02cc025.clearCheck();
                    mp02cc026.clearCheck();
                }
            }
        });

        mp02cc02988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cc02988x.setVisibility(View.VISIBLE);
                } else {
                    mp02cc02988x.setVisibility(View.GONE);
                    mp02cc02988x.setText(null);
                }
            }
        });

        mp02cc027.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mp02cc02702.isChecked()) {
                    fldGrpmp02cc028.setVisibility(View.GONE);
                    mp02cc028.clearCheck();
                } else {
                    fldGrpmp02cc028.setVisibility(View.VISIBLE);
                }
            }
        });

        mp02cc03088.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cc03088x.setVisibility(View.VISIBLE);
                } else {
                    mp02cc03088x.setVisibility(View.GONE);
                    mp02cc03088x.setText(null);
                }
            }
        });

        mp02cc03188.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cc03188x.setVisibility(View.VISIBLE);
                } else {
                    mp02cc03188x.setVisibility(View.GONE);
                    mp02cc03188x.setText(null);
                }
            }
        });

        mp02cc03288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02cc03288x.setVisibility(View.VISIBLE);
                } else {
                    mp02cc03288x.setVisibility(View.GONE);
                    mp02cc03288x.setText(null);
                }
            }
        });


        if (AppMain.maritalStatus == 1) {
            fldGrpmp02cc08.setVisibility(View.VISIBLE);
        } else {
            fldGrpmp02cc08.setVisibility(View.GONE);
            mp02cc008.clearCheck();
            mp02cc009.clearCheck();
        }

        if (AppMain.maritalStatus == 5) {
            mp02cc03004.setEnabled(false);
            mp02cc03004.setChecked(false);
            mp02cc03005.setEnabled(false);
            mp02cc03005.setChecked(false);
            mp02cc03103.setEnabled(false);
            mp02cc03103.setChecked(false);
            mp02cc03104.setEnabled(false);
            mp02cc03104.setChecked(false);
            mp02cc03203.setEnabled(false);
            mp02cc03203.setChecked(false);
            mp02cc03204.setEnabled(false);
            mp02cc03204.setChecked(false);


        } else {
            mp02cc03004.setEnabled(true);
            mp02cc03005.setEnabled(true);
            mp02cc03103.setEnabled(true);
            mp02cc03104.setEnabled(true);
            mp02cc03103.setEnabled(true);
            mp02cc03104.setEnabled(true);

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
                Intent secc = new Intent(this, SectionCCActivity.class);
                startActivity(secc);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateCC();

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

        JSONObject sCC = new JSONObject();

        sCC.put("mp02cc001", mp02cc001.getText().toString());

        sCC.put("mp02cc002", mp02cc00201.isChecked() ? "1" : mp02cc00202.isChecked() ? "2" : mp02cc00203.isChecked() ? "3"
                : mp02cc00204.isChecked() ? "4" : mp02cc00205.isChecked() ? "5" : "0");

        sCC.put("mp02cc003", mp02cc00301.isChecked() ? "1" : mp02cc00302.isChecked() ? "2" : mp02cc00303.isChecked() ? "3"
                : mp02cc00304.isChecked() ? "4" : "0");

        sCC.put("mp02cc004", mp02cc00401.isChecked() ? "1" : mp02cc00402.isChecked() ? "2" : mp02cc00403.isChecked() ? "3"
                : mp02cc00404.isChecked() ? "4" : mp02cc00405.isChecked() ? "5" : mp02cc00406.isChecked() ? "6"
                : mp02cc00407.isChecked() ? "7" : "0");

        sCC.put("mp02cc005", mp02cc00501.isChecked() ? "1" : mp02cc00502.isChecked() ? "2" : mp02cc00503.isChecked() ? "3"
                : mp02cc00504.isChecked() ? "4" : mp02cc00505.isChecked() ? "5" : mp02cc00506.isChecked() ? "6" : "0");

        sCC.put("mp02cc006", mp02cc00601.isChecked() ? "1" : mp02cc00602.isChecked() ? "2" : mp02cc00603.isChecked() ? "3"
                : mp02cc00604.isChecked() ? "4" : mp02cc00677.isChecked() ? "77" : "0");

        sCC.put("mp02cc007", mp02cc00701.isChecked() ? "1" : mp02cc00702.isChecked() ? "2" : mp02cc00703.isChecked() ? "3"
                : mp02cc00704.isChecked() ? "4" : mp02cc00777.isChecked() ? "77" : "0");

        sCC.put("mp02cc008", mp02cc00801.isChecked() ? "1" : mp02cc00802.isChecked() ? "2" : mp02cc00803.isChecked() ? "3"
                : mp02cc00804.isChecked() ? "4" : mp02cc00877.isChecked() ? "77" : "0");

        sCC.put("mp02cc009", mp02cc00901.isChecked() ? "1" : mp02cc00902.isChecked() ? "2" : mp02cc00903.isChecked() ? "3"
                : mp02cc00904.isChecked() ? "4" : mp02cc00977.isChecked() ? "77" : "0");

        sCC.put("mp02cc010", mp02cc01001.isChecked() ? "1" : mp02cc01002.isChecked() ? "2" : mp02cc01003.isChecked() ? "3"
                : mp02cc01004.isChecked() ? "4" : mp02cc01005.isChecked() ? "5" : "0");

        sCC.put("mp02cc011", mp02cc01101.isChecked() ? "1" : mp02cc01102.isChecked() ? "2" : mp02cc01103.isChecked() ? "3"
                : mp02cc01104.isChecked() ? "4" : mp02cc01105.isChecked() ? "5" : "0");

        sCC.put("mp02cc012", mp02cc01201.isChecked() ? "1" : mp02cc01202.isChecked() ? "2" : mp02cc01203.isChecked() ? "3"
                : mp02cc01204.isChecked() ? "4" : mp02cc01205.isChecked() ? "5" : "0");

        sCC.put("mp02cc013", mp02cc01301.isChecked() ? "1" : mp02cc01302.isChecked() ? "2" : mp02cc01303.isChecked() ? "3"
                : mp02cc01304.isChecked() ? "4" : mp02cc01305.isChecked() ? "5" : "0");

        sCC.put("mp02cc014", mp02cc01401.isChecked() ? "1" : mp02cc01402.isChecked() ? "2" : mp02cc01403.isChecked() ? "3"
                : mp02cc01404.isChecked() ? "4" : mp02cc01405.isChecked() ? "5" : "0");

        sCC.put("mp02cc015", mp02cc01501.isChecked() ? "1" : mp02cc01502.isChecked() ? "2" : mp02cc01503.isChecked() ? "3"
                : mp02cc01504.isChecked() ? "4" : mp02cc01505.isChecked() ? "5" : "0");

        sCC.put("mp02cc016", mp02cc01601.isChecked() ? "1" : mp02cc01602.isChecked() ? "2" : mp02cc01603.isChecked() ? "3"
                : mp02cc01604.isChecked() ? "4" : mp02cc01605.isChecked() ? "5" : "0");

        sCC.put("mp02cc017", mp02cc01701.isChecked() ? "1" : mp02cc01702.isChecked() ? "2" : mp02cc01703.isChecked() ? "3"
                : mp02cc01704.isChecked() ? "4" : mp02cc01705.isChecked() ? "5" : "0");

        sCC.put("mp02cc018", mp02cc01801.isChecked() ? "1" : mp02cc01802.isChecked() ? "2" : mp02cc01803.isChecked() ? "3"
                : mp02cc01804.isChecked() ? "4" : mp02cc01805.isChecked() ? "5" : "0");

        sCC.put("mp02cc019", mp02cc01901.isChecked() ? "1" : mp02cc01902.isChecked() ? "2" : mp02cc01903.isChecked() ? "3"
                : mp02cc01904.isChecked() ? "4" : mp02cc01905.isChecked() ? "5" : "0");

        sCC.put("mp02cc020", mp02cc02001.isChecked() ? "1" : mp02cc02002.isChecked() ? "2" : mp02cc02003.isChecked() ? "3"
                : mp02cc02004.isChecked() ? "4" : mp02cc02005.isChecked() ? "5" : "0");

        sCC.put("mp02cc021", mp02cc02101.isChecked() ? "1" : mp02cc02102.isChecked() ? "2" : mp02cc02103.isChecked() ? "3"
                : mp02cc02104.isChecked() ? "4" : mp02cc02105.isChecked() ? "5" : "0");

        sCC.put("mp02cc022", mp02cc02201.isChecked() ? "1" : mp02cc02202.isChecked() ? "2" : mp02cc02203.isChecked() ? "3"
                : mp02cc02204.isChecked() ? "4" : "0");

        sCC.put("mp02cc023", mp02cc02301.isChecked() ? "1" : mp02cc02302.isChecked() ? "2" : mp02cc02303.isChecked() ? "3"
                : mp02cc02304.isChecked() ? "4" : "0");

        sCC.put("mp02cc024", mp02cc02401.isChecked() ? "1" : mp02cc02402.isChecked() ? "2" : mp02cc02403.isChecked() ? "3"
                : mp02cc02404.isChecked() ? "4" : mp02cc02405.isChecked() ? "5" : "0");

        sCC.put("mp02cc025", mp02cc02501.isChecked() ? "1" : mp02cc02502.isChecked() ? "2" : mp02cc02503.isChecked() ? "3"
                : mp02cc02504.isChecked() ? "4" : mp02cc02505.isChecked() ? "5" : "0");

        sCC.put("mp02cc026", mp02cc02601.isChecked() ? "1" : mp02cc02602.isChecked() ? "2" : mp02cc02603.isChecked() ? "3"
                : mp02cc02604.isChecked() ? "4" : mp02cc02605.isChecked() ? "5" : "0");

        sCC.put("mp02cc027", mp02cc02701.isChecked() ? "1" : mp02cc02702.isChecked() ? "2" : mp02cc02703.isChecked() ? "3"
                : mp02cc02704.isChecked() ? "4" : "0");

        sCC.put("mp02cc028", mp02cc02801.isChecked() ? "1" : mp02cc02802.isChecked() ? "2" : mp02cc02803.isChecked() ? "3"
                : "0");

        sCC.put("mp02cc02901", mp02cc02901.isChecked() ? "1" : "0");
        sCC.put("mp02cc02902", mp02cc02902.isChecked() ? "2" : "0");
        sCC.put("mp02cc02903", mp02cc02903.isChecked() ? "3" : "0");
        sCC.put("mp02cc02904", mp02cc02904.isChecked() ? "4" : "0");
        sCC.put("mp02cc02905", mp02cc02905.isChecked() ? "5" : "0");
        sCC.put("mp02cc02906", mp02cc02906.isChecked() ? "6" : "0");
        sCC.put("mp02cc02907", mp02cc02907.isChecked() ? "7" : "0");
        sCC.put("mp02cc02908", mp02cc02908.isChecked() ? "8" : "0");
        sCC.put("mp02cc02909", mp02cc02909.isChecked() ? "9" : "0");
        sCC.put("mp02cc02988", mp02cc02988.isChecked() ? "88" : "0");
        sCC.put("mp02cc02988x", mp02cc02988x.getText().toString());

        sCC.put("mp02cc03001", mp02cc03001.isChecked() ? "1" : "0");
        sCC.put("mp02cc03002", mp02cc03002.isChecked() ? "2" : "0");
        sCC.put("mp02cc03003", mp02cc03003.isChecked() ? "3" : "0");
        sCC.put("mp02cc03004", mp02cc03004.isChecked() ? "4" : "0");
        sCC.put("mp02cc03005", mp02cc03005.isChecked() ? "5" : "0");
        sCC.put("mp02cc03006", mp02cc03006.isChecked() ? "6" : "0");
        sCC.put("mp02cc03007", mp02cc03007.isChecked() ? "7" : "0");
        sCC.put("mp02cc03088", mp02cc03088.isChecked() ? "88" : "0");
        sCC.put("mp02cc03088x", mp02cc03088x.getText().toString());


        sCC.put("mp02cc03101", mp02cc03101.isChecked() ? "1" : "0");
        sCC.put("mp02cc03102", mp02cc03102.isChecked() ? "2" : "0");
        sCC.put("mp02cc03103", mp02cc03103.isChecked() ? "3" : "0");
        sCC.put("mp02cc03104", mp02cc03104.isChecked() ? "4" : "0");
        sCC.put("mp02cc03105", mp02cc03105.isChecked() ? "5" : "0");
        sCC.put("mp02cc03106", mp02cc03106.isChecked() ? "6" : "0");
        sCC.put("mp02cc03188", mp02cc03188.isChecked() ? "88" : "0");
        sCC.put("mp02cc03188x", mp02cc03188x.getText().toString());

        sCC.put("mp02cc03201", mp02cc03201.isChecked() ? "1" : "0");
        sCC.put("mp02cc03202", mp02cc03202.isChecked() ? "2" : "0");
        sCC.put("mp02cc03203", mp02cc03203.isChecked() ? "3" : "0");
        sCC.put("mp02cc03204", mp02cc03204.isChecked() ? "4" : "0");
        sCC.put("mp02cc03205", mp02cc03205.isChecked() ? "5" : "0");
        sCC.put("mp02cc03206", mp02cc03206.isChecked() ? "6" : "0");
        sCC.put("mp02cc03288", mp02cc03288.isChecked() ? "88" : "0");
        sCC.put("mp02cc03288x", mp02cc03288x.getText().toString());


        AppMain.pc.setsCC(String.valueOf(sCC));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

//        1
        if (mp02cc001.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc001), Toast.LENGTH_SHORT).show();
            mp02cc001.setError("This data is Required!");

            Log.i(TAG, "mp02cc001: This data is Required!");
            return false;
        } else {
            mp02cc001.setError(null);
        }
        if (Integer.parseInt(mp02cc001.getText().toString().isEmpty() ? "0" : mp02cc001.getText().toString()) < 0
                || Integer.parseInt(mp02cc001.getText().toString().isEmpty() ? "0" : mp02cc001.getText().toString()) > 7) {
            Toast.makeText(this, "Invalid:" + getString(R.string.mp02cc001), Toast.LENGTH_SHORT).show();
            mp02cc001.setError("Invalid: Range 0-7 days");

            Log.i(TAG, "mp02cc001: Range 0 - 7 days");
            return false;
        } else {
            mp02cc001.setError(null);
        }


//        2
        if (mp02cc002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc002), Toast.LENGTH_SHORT).show();
            mp02cc00205.setError("This data is Required!");

            Log.i(TAG, "mp02cc002: This data is Required!");
            return false;
        } else {
            mp02cc00205.setError(null);
        }

//        3
        if (mp02cc003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc003), Toast.LENGTH_SHORT).show();
            mp02cc00304.setError("This data is Required!");

            Log.i(TAG, "mp02cc003: This data is Required!");
            return false;
        } else {
            mp02cc00304.setError(null);
        }

//        4
        if (mp02cc004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc004), Toast.LENGTH_SHORT).show();
            mp02cc00407.setError("This data is Required!");

            Log.i(TAG, "mp02cc004: This data is Required!");
            return false;
        } else {
            mp02cc00407.setError(null);
        }

//        5
        if (mp02cc005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc005), Toast.LENGTH_SHORT).show();
            mp02cc00506.setError("This data is Required!");

            Log.i(TAG, "mp02cc005: This data is Required!");
            return false;
        } else {
            mp02cc00506.setError(null);
        }

//        6
        if (mp02cc006.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc006), Toast.LENGTH_SHORT).show();
            mp02cc00677.setError("This data is Required!");

            Log.i(TAG, "mp02cc006: This data is Required!");
            return false;
        } else {
            mp02cc00677.setError(null);
        }

//        7
        if (mp02cc007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc007), Toast.LENGTH_SHORT).show();
            mp02cc00777.setError("This data is Required!");

            Log.i(TAG, "mp02cc007: This data is Required!");
            return false;
        } else {
            mp02cc00777.setError(null);
        }

        if (AppMain.maritalStatus == 1) {
//        8
            if (mp02cc008.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc008), Toast.LENGTH_SHORT).show();
                mp02cc00877.setError("This data is Required!");

                Log.i(TAG, "mp02cc008: This data is Required!");
                return false;
            } else {
                mp02cc00877.setError(null);
            }

//        9
            if (mp02cc009.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc009), Toast.LENGTH_SHORT).show();
                mp02cc00977.setError("This data is Required!");

                Log.i(TAG, "mp02cc009: This data is Required!");
                return false;
            } else {
                mp02cc00977.setError(null);
            }
        }


//        10
        if (mp02cc010.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc010), Toast.LENGTH_SHORT).show();
            mp02cc01005.setError("This data is Required!");

            Log.i(TAG, "mp02cc010: This data is Required!");
            return false;
        } else {
            mp02cc01005.setError(null);
        }

//        11
        if (mp02cc011.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc011), Toast.LENGTH_SHORT).show();
            mp02cc01105.setError("This data is Required!");

            Log.i(TAG, "mp02cc011: This data is Required!");
            return false;
        } else {
            mp02cc01105.setError(null);
        }

//        12
        if (mp02cc012.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc012), Toast.LENGTH_SHORT).show();
            mp02cc01205.setError("This data is Required!");

            Log.i(TAG, "mp02cc012: This data is Required!");
            return false;
        } else {
            mp02cc01205.setError(null);
        }


//        13
        if (mp02cc013.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc013), Toast.LENGTH_SHORT).show();
            mp02cc01305.setError("This data is Required!");

            Log.i(TAG, "mp02cc013: This data is Required!");
            return false;
        } else {
            mp02cc01305.setError(null);
        }



//        14
        if (mp02cc014.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc014), Toast.LENGTH_SHORT).show();
            mp02cc01405.setError("This data is Required!");

            Log.i(TAG, "mp02cc014: This data is Required!");
            return false;
        } else {
            mp02cc01405.setError(null);
        }


//        15
        if (mp02cc015.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc015), Toast.LENGTH_SHORT).show();
            mp02cc01505.setError("This data is Required!");

            Log.i(TAG, "mp02cc015: This data is Required!");
            return false;
        } else {
            mp02cc01505.setError(null);
        }


//        16
        if (mp02cc016.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc016), Toast.LENGTH_SHORT).show();
            mp02cc01605.setError("This data is Required!");

            Log.i(TAG, "mp02cc016: This data is Required!");
            return false;
        } else {
            mp02cc01605.setError(null);
        }


//        17
        if (mp02cc017.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc017), Toast.LENGTH_SHORT).show();
            mp02cc01705.setError("This data is Required!");

            Log.i(TAG, "mp02cc017: This data is Required!");
            return false;
        } else {
            mp02cc01705.setError(null);
        }


//        18
        if (mp02cc018.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc018), Toast.LENGTH_SHORT).show();
            mp02cc01805.setError("This data is Required!");

            Log.i(TAG, "mp02cc018: This data is Required!");
            return false;
        } else {
            mp02cc01805.setError(null);
        }


//        19
        if (mp02cc019.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc019), Toast.LENGTH_SHORT).show();
            mp02cc01905.setError("This data is Required!");

            Log.i(TAG, "mp02cc019: This data is Required!");
            return false;
        } else {
            mp02cc01905.setError(null);
        }


//        20
        if (mp02cc020.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc020), Toast.LENGTH_SHORT).show();
            mp02cc02005.setError("This data is Required!");

            Log.i(TAG, "mp02cc020: This data is Required!");
            return false;
        } else {
            mp02cc02005.setError(null);
        }

//        21
        if (mp02cc021.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc021), Toast.LENGTH_SHORT).show();
            mp02cc02105.setError("This data is Required!");

            Log.i(TAG, "mp02cc021: This data is Required!");
            return false;
        } else {
            mp02cc02105.setError(null);
        }

//        22
        if (mp02cc022.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc022), Toast.LENGTH_SHORT).show();
            mp02cc02203.setError("This data is Required!");

            Log.i(TAG, "mp02cc022: This data is Required!");
            return false;
        } else {
            mp02cc02203.setError(null);
        }

//        23
        if (mp02cc02201.isChecked() || mp02cc02202.isChecked() || mp02cc02205.isChecked()) {

            //        23
            if (mp02cc023.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc023), Toast.LENGTH_SHORT).show();
                mp02cc02304.setError("This data is Required!");

                Log.i(TAG, "mp02cc023: This data is Required!");
                return false;
            } else {
                mp02cc02304.setError(null);
            }


            //        24
            if (mp02cc024.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc024), Toast.LENGTH_SHORT).show();
                mp02cc02405.setError("This data is Required!");

                Log.i(TAG, "mp02cc024: This data is Required!");
                return false;
            } else {
                mp02cc02405.setError(null);
            }

            //        25
            if (mp02cc025.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc025), Toast.LENGTH_SHORT).show();
                mp02cc02505.setError("This data is Required!");

                Log.i(TAG, "mp02cc025: This data is Required!");
                return false;
            } else {
                mp02cc02505.setError(null);
            }

            //        26
            if (mp02cc026.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc026), Toast.LENGTH_SHORT).show();
                mp02cc02603.setError("This data is Required!");

                Log.i(TAG, "mp02cc026: This data is Required!");
                return false;
            } else {
                mp02cc02603.setError(null);
            }
        } else {
            if (mp02cc027.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc027), Toast.LENGTH_SHORT).show();
                mp02cc02704.setError("This data is Required!");

                Log.i(TAG, "mp02cc027: This data is Required!");
                return false;
            } else {
                mp02cc02704.setError(null);
            }

            if (!mp02cc02702.isChecked()) {
                if (mp02cc028.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc028), Toast.LENGTH_SHORT).show();
                    mp02cc02803.setError("This data is Required!");

                    Log.i(TAG, "mp02cc028: This data is Required!");
                    return false;
                } else {
                    mp02cc02803.setError(null);
                }
            }

            if (!(mp02cc02901.isChecked() || mp02cc02902.isChecked() || mp02cc02903.isChecked() || mp02cc02904.isChecked()
                    || mp02cc02905.isChecked() || mp02cc02906.isChecked() || mp02cc02907.isChecked() || mp02cc02908.isChecked()
                    || mp02cc02909.isChecked() || mp02cc02988.isChecked())) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc029), Toast.LENGTH_SHORT).show();
                mp02cc02988.setError("This data is Required!");

                Log.i(TAG, "mp02cc029: This data is Required!");
                return false;
            } else {
                mp02cc02988.setError(null);
            }

            if (mp02cc02988.isChecked() && mp02cc02988x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc029) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                mp02cc02988x.setError("This data is Required!");

                Log.i(TAG, "mp02cc02988x: This data is Required!");
                return false;
            } else {
                mp02cc02988x.setError(null);
            }

        }


        if (!(mp02cc03001.isChecked() || mp02cc03002.isChecked() || mp02cc03003.isChecked() || mp02cc03004.isChecked()
                || mp02cc03005.isChecked() || mp02cc03006.isChecked() || mp02cc03007.isChecked() || mp02cc03088.isChecked())) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc030), Toast.LENGTH_SHORT).show();
            mp02cc03088.setError("This data is Required!");

            Log.i(TAG, "mp02cc030: This data is Required!");
            return false;
        } else {
            mp02cc03088.setError(null);
        }

        if (mp02cc03088.isChecked() && mp02cc03088x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc030) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            mp02cc03088x.setError("This data is Required!");

            Log.i(TAG, "mp02cc03088x: This data is Required!");
            return false;
        } else {
            mp02cc03088x.setError(null);
        }

        if (!(mp02cc03101.isChecked() || mp02cc03102.isChecked() || mp02cc03103.isChecked() || mp02cc03104.isChecked()
                || mp02cc03105.isChecked() || mp02cc03106.isChecked() || mp02cc03188.isChecked())) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc031), Toast.LENGTH_SHORT).show();
            mp02cc03188.setError("This data is Required!");

            Log.i(TAG, "mp02cc031: This data is Required!");
            return false;
        } else {
            mp02cc03188.setError(null);
        }

        if (mp02cc03188.isChecked() && mp02cc03188x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc031) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            mp02cc03188x.setError("This data is Required!");

            Log.i(TAG, "mp02cc03188x: This data is Required!");
            return false;
        } else {
            mp02cc03188x.setError(null);

        }

        if (!(mp02cc03201.isChecked() || mp02cc03202.isChecked() || mp02cc03203.isChecked() || mp02cc03204.isChecked()
                || mp02cc03205.isChecked() || mp02cc03206.isChecked() || mp02cc03288.isChecked())) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc032), Toast.LENGTH_SHORT).show();
            mp02cc03288.setError("This data is Required!");

            Log.i(TAG, "mp02cc032: This data is Required!");
            return false;
        } else {
            mp02cc03288.setError(null);
        }

        if (mp02cc03288.isChecked() && mp02cc03288x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02cc032) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            mp02cc03288x.setError("This data is Required!");

            Log.i(TAG, "mp02cc03288x: This data is Required!");
            return false;
        } else {
            mp02cc03288x.setError(null);
        }




        return true;
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
