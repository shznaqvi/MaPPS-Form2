package edu.aku.hassannaqvi.mapps_form2.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
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

import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form2.AppMain;
import edu.aku.hassannaqvi.mapps_form2.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form2.R;
import edu.aku.hassannaqvi.mapps_form2.contracts.ParticipantsContract;

public class SectionCBActivity extends Activity {

    private static final String TAG = SectionCBActivity.class.getSimpleName();

    @BindView(R.id.activity_section_cb)
    RelativeLayout activitySectionCb;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02ca001)
    RadioGroup mp02ca001;
    @BindView(R.id.mp02ca00101)
    RadioButton mp02ca00101;
    @BindView(R.id.mp02ca00102)
    RadioButton mp02ca00102;
    @BindView(R.id.mp02ca002)
    RadioGroup mp02ca002;
    @BindView(R.id.mp02ca00201)
    RadioButton mp02ca00201;
    @BindView(R.id.mp02ca00202)
    RadioButton mp02ca00202;
    @BindView(R.id.fldGrpmp02cb)
    LinearLayout fldGrpmp02cb;
    @BindView(R.id.app_header1)
    TextView appHeader1;
    @BindView(R.id.mp02cb00101)
    EditText mp02cb00101;
    @BindView(R.id.mp02cb00102)
    EditText mp02cb00102;
    @BindView(R.id.mp02cb002)
    EditText mp02cb002;
    @BindView(R.id.mp02cb003)
    RadioGroup mp02cb003;
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
    @BindView(R.id.mp02cb01503)
    RadioButton mp02cb01503;
    @BindView(R.id.mp02cb01504)
    RadioButton mp02cb01504;
    @BindView(R.id.mp02cb016)
    RadioGroup mp02cb016;
    @BindView(R.id.mp02cb01601)
    RadioButton mp02cb01601;
    @BindView(R.id.mp02cb01602)
    RadioButton mp02cb01602;
    @BindView(R.id.mp02cb01699)
    RadioButton mp02cb01699;
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
    @BindView(R.id.mp02cb01899)
    RadioButton mp02cb01899;
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
    EditText mp02cb024;
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
    @BindView(R.id.mp02cb02603)
    RadioButton mp02cb02603;
    @BindView(R.id.mp02cb02604)
    RadioButton mp02cb02604;
    @BindView(R.id.mp02cb027)
    RadioGroup mp02cb027;
    @BindView(R.id.mp02cb02701)
    RadioButton mp02cb02701;
    @BindView(R.id.mp02cb02702)
    RadioButton mp02cb02702;
    @BindView(R.id.mp02cb02703)
    RadioButton mp02cb02703;
    @BindView(R.id.mp02cb02704)
    RadioButton mp02cb02704;
    @BindView(R.id.mp02cb028)
    RadioGroup mp02cb028;
    @BindView(R.id.mp02cb02801)
    RadioButton mp02cb02801;
    @BindView(R.id.mp02cb02802)
    RadioButton mp02cb02802;
    @BindView(R.id.fldGrpmp02cbbutton)
    LinearLayout fldGrpmp02cbbutton;

    Calendar now = Calendar.getInstance();
    int year = now.get(Calendar.YEAR);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cb);
        ButterKnife.bind(this);


        AppMain.partiFlag++;

        mp02ca001.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02ca00101.isChecked() && mp02ca00201.isChecked()) {
                    fldGrpmp02cb.setVisibility(View.VISIBLE);
                    fldGrpmp02cbbutton.setVisibility(View.VISIBLE);

                } else {
                    fldGrpmp02cb.setVisibility(View.GONE);
                    fldGrpmp02cbbutton.setVisibility(View.VISIBLE);
                    mp02cb00101.setText(null);
                    mp02cb00102.setText(null);
                    mp02cb002.setText(null);
                    mp02cb003.clearCheck();
                    mp02cb00388x.setText(null);
                    mp02cb004.clearCheck();
                    mp02cb00488x.setText(null);
                    mp02cb005.clearCheck();
                    mp02cb006.setText(null);
                    mp02cb007.clearCheck();
                    mp02cb008.clearCheck();
                    mp02cb00888x.setText(null);
                    mp02cb009.clearCheck();
                    mp02cb010.setText(null);
                    mp02cb011.clearCheck();
                    mp02cb012.setText(null);
                    mp02cb013.clearCheck();
                    mp02cb014.clearCheck();
                    mp02cb01488x.setText(null);
                    mp02cb015.clearCheck();
                    mp02cb016.clearCheck();
                    mp02cb017.setText(null);
                    mp02cb018.clearCheck();
                    mp02cb019.clearCheck();
                    mp02cb020.clearCheck();
                    mp02cb021.setText(null);
                    mp02cb022.setText(null);
                    mp02cb023.clearCheck();
                    mp02cb024.setText(null);
                    mp02cb025.clearCheck();
                    mp02cb026.clearCheck();
                    mp02cb027.clearCheck();
                    mp02cb028.clearCheck();

                }
            }
        });

        mp02ca002.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02ca00201.isChecked() && mp02ca00101.isChecked()) {
                    fldGrpmp02cb.setVisibility(View.VISIBLE);

                    fldGrpmp02cbbutton.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cb.setVisibility(View.GONE);
                    fldGrpmp02cbbutton.setVisibility(View.VISIBLE);
                    mp02cb00101.setText(null);
                    mp02cb00102.setText(null);
                    mp02cb002.setText(null);
                    mp02cb003.clearCheck();
                    mp02cb00388x.setText(null);
                    mp02cb004.clearCheck();
                    mp02cb00488x.setText(null);
                    mp02cb005.clearCheck();
                    mp02cb006.setText(null);
                    mp02cb007.clearCheck();
                    mp02cb008.clearCheck();
                    mp02cb00888x.setText(null);
                    mp02cb009.clearCheck();
                    mp02cb010.setText(null);
                    mp02cb011.clearCheck();
                    mp02cb012.setText(null);
                    mp02cb013.clearCheck();
                    mp02cb014.clearCheck();
                    mp02cb01488x.setText(null);
                    mp02cb015.clearCheck();
                    mp02cb016.clearCheck();
                    mp02cb017.setText(null);
                    mp02cb018.clearCheck();
                    mp02cb019.clearCheck();
                    mp02cb020.clearCheck();
                    mp02cb021.setText(null);
                    mp02cb022.setText(null);
                    mp02cb023.clearCheck();
                    mp02cb024.setText(null);
                    mp02cb025.clearCheck();
                    mp02cb026.clearCheck();
                    mp02cb027.clearCheck();
                    mp02cb028.clearCheck();


                }
            }
        });


        // =================== Q3 Others ====================

        mp02cb003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cb00388.isChecked()) {
                    mp02cb00388x.setVisibility(View.VISIBLE);
                } else {
                    mp02cb00388x.setVisibility(View.GONE);
                    mp02cb00388x.setText(null);
                }
            }
        });

        // =================== Q4 Others ====================

        mp02cb004.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cb00488.isChecked()) {
                    mp02cb00488x.setVisibility(View.VISIBLE);
                } else {
                    mp02cb00488x.setVisibility(View.GONE);
                    mp02cb00488x.setText(null);
                }
            }
        });

        // =================== Q8 Others ====================

        mp02cb008.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cb00888.isChecked()) {
                    mp02cb00888x.setVisibility(View.VISIBLE);
                } else {
                    mp02cb00888x.setVisibility(View.GONE);
                    mp02cb00888x.setText(null);
                }
            }
        });

        // =================== Q14 Others ====================

        mp02cb014.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cb01488.isChecked()) {
                    mp02cb01488x.setVisibility(View.VISIBLE);
                } else {
                    mp02cb01488x.setVisibility(View.GONE);
                    mp02cb01488x.setText(null);
                }
            }
        });

        //===================== Q 9 Skip Pattern===================

        mp02cb009.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cb00901.isChecked()) {
                    fldGrpmp02cb010.setVisibility(View.VISIBLE);
                    fldGrpmp02cb010a.setVisibility(View.VISIBLE);
                    fldGrpmp02cb012.setVisibility(View.VISIBLE);
                    fldGrpmp02cb017.setVisibility(View.VISIBLE);
                    fldGrpmp02cb019.setVisibility(View.VISIBLE);

                } else if (mp02cb00902.isChecked() || mp02cb00903.isChecked() || mp02cb00904.isChecked()) {
                    fldGrpmp02cb010a.setVisibility(View.GONE);
                    fldGrpmp02cb010.setVisibility(View.VISIBLE);
                    mp02cb010.setText(null);
                    mp02cb011.clearCheck();
                    mp02cb012.setText(null);
                    mp02cb013.clearCheck();
                    mp02cb014.clearCheck();
                    mp02cb015.clearCheck();
                    mp02cb016.clearCheck();
                    mp02cb017.setText(null);
                } else if (mp02cb00905.isChecked()) {
                    fldGrpmp02cb010.setVisibility(View.GONE);
                    mp02cb010.setText(null);
                    mp02cb011.clearCheck();
                    mp02cb012.setText(null);
                    mp02cb013.clearCheck();
                    mp02cb014.clearCheck();
                    mp02cb015.clearCheck();
                    mp02cb016.clearCheck();
                    mp02cb017.setText(null);
                    mp02cb018.clearCheck();
                    mp02cb019.clearCheck();
                    mp02cb020.clearCheck();
                    mp02cb021.setText(null);
                    mp02cb022.setText(null);
                    mp02cb023.clearCheck();

                } else {
                    fldGrpmp02cb010.setVisibility(View.VISIBLE);
                }
            }
        });
        // ====================== Q 11 Skip Pattern =========================
        mp02cb011.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cb01101.isChecked()) {
                    fldGrpmp02cb012.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cb012.setVisibility(View.GONE);
                    mp02cb012.setText(null);
                }
            }
        });
        // ======================= Q 16 Skip pattern ==================
        mp02cb016.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cb01601.isChecked()) {
                    fldGrpmp02cb017.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cb017.setVisibility(View.GONE);
                    mp02cb017.setText(null);
                }
            }
        });

        // ======================== Q 18 Skip pattern ===================
        mp02cb018.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cb01801.isChecked()) {
                    fldGrpmp02cb019.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cb019.setVisibility(View.GONE);
                    mp02cb019.clearCheck();
                }
            }
        });

        // ======================== Q 5 Skip pattern ===================
        mp02cb005.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cb00501.isChecked()) {
                    fldGrpmp02cb006.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02cb006.setVisibility(View.GONE);
                    mp02cb006.setText(null);
                }
            }
        });

        mp02cb00101.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b) {
                    if (!mp02cb00101.getText().toString().isEmpty()) {
                        if (mp02cb00101.length() < 4 || mp02cb00101.length() > 4) {
                            mp02cb00101.setError("Year Length is 4");
                        } else {
                            mp02cb00101.setError(null);
                        }
                    }
                }
            }
        });

        mp02cb002.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!mp02cb00101.getText().toString().isEmpty()) {
                    int currentAge = year - (Integer.parseInt(mp02cb00101.getText().toString().isEmpty() ? "0" : mp02cb00101.getText().toString()));
                    int enteredAge = Integer.parseInt(mp02cb002.getText().toString().isEmpty() ? "0" : mp02cb002.getText().toString());

                    if (currentAge == enteredAge || currentAge + 1 == enteredAge || currentAge - 1 == enteredAge) {

                        mp02cb002.setError(null);
                    } else {

                        mp02cb002.setError("Check Age again!");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                finish();

                Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, SectionCActivity.class);
                endSec.putExtra("complete", false);
                startActivity(endSec);
            }
        }
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

                if (mp02ca00101.isChecked() && mp02ca00201.isChecked()) {
                    Intent seccc = new Intent(this, SectionCCActivity.class);
                    startActivity(seccc);
                } else {
                    Intent endSec = new Intent(this, SectionCActivity.class);
                    endSec.putExtra("complete", false);
                    startActivity(endSec);
                }

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
        Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

        rowId = null;
        rowId = db.addParticipants(AppMain.pc);

        AppMain.pc.setID(rowId);

        if (rowId != null) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            AppMain.pc.setUID(
                    (AppMain.pc.getDeviceID() + AppMain.pc.getID()));
            Toast.makeText(this, "Current Form No: " + AppMain.pc.getUID(), Toast.LENGTH_SHORT).show();

            db.updateParticipantsUID();

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName",MODE_PRIVATE);

        AppMain.pc =new ParticipantsContract();

        AppMain.pc.setTagID(sharedPref.getString("tagName",null));
        AppMain.pc.setFormDate((DateFormat.format("dd-MM-yyyy HH:mm",new Date())).toString());
        AppMain.pc.setInterviewer01(AppMain.loginMem[1]);
        AppMain.pc.setInterviewer02(AppMain.loginMem[2]);
        AppMain.pc.setDeviceID(AppMain.deviceId);
        AppMain.pc.setUUID(AppMain.fc.getUID());
        AppMain.pc.setLUID(getIntent().getExtras().getString("l_uid"));

        AppMain.pc.setHousehold(AppMain.fc.getHousehold());
        AppMain.pc.setClustercode(AppMain.fc.getClustercode());
        AppMain.pc.setLhwCode(AppMain.fc.getLhwCode());

        JSONObject scb = new JSONObject();

        scb.put("mp02ca001", mp02ca00101.isChecked() ? "1" : mp02ca00102.isChecked() ? "2" : "0");
        scb.put("mp02ca002", mp02ca00201.isChecked() ? "1" : mp02ca00202.isChecked() ? "2" : "0");
        scb.put("mp02cb00101", mp02cb00101.getText().toString());
        scb.put("mp02cb00102", mp02cb00102.getText().toString());
        scb.put("mp02cb002", mp02cb002.getText().toString());
        scb.put("mp02cb003", mp02cb00301.isChecked() ? "1" : mp02cb00302.isChecked() ? "2" : mp02cb00303.isChecked() ? "3"
                : mp02cb00304.isChecked() ? "4" : mp02cb00305.isChecked() ? "5" : mp02cb00306.isChecked() ? "6"
                : mp02cb00388.isChecked() ? "88" : "0");
        scb.put("mp02cb00388x", mp02cb00388x.getText().toString());
        scb.put("mp02cb004", mp02cb00401.isChecked() ? "1" : mp02cb00402.isChecked() ? "2" : mp02cb00403.isChecked() ? "3"
                : mp02cb00404.isChecked() ? "4" : mp02cb00488.isChecked() ? "88" : "0");
        scb.put("mp02cb00488x", mp02cb00488x.getText().toString());
        scb.put("mp02cb005", mp02cb00501.isChecked() ? "1" : mp02cb00502.isChecked() ? "2" : "0");
        scb.put("mp02cb006", mp02cb006.getText().toString());
        scb.put("mp02cb007", mp02cb00701.isChecked() ? "1" : mp02cb00702.isChecked() ? "2" : mp02cb00703.isChecked() ? "3"
                : mp02cb00704.isChecked() ? "4" : mp02cb00705.isChecked() ? "5" : mp02cb00706.isChecked() ? "6" : "0");
        scb.put("mp02cb008", mp02cb00801.isChecked() ? "1" : mp02cb00802.isChecked() ? "2" : mp02cb00803.isChecked() ? "3"
                : mp02cb00804.isChecked() ? "4" : mp02cb00805.isChecked() ? "5" : mp02cb00806.isChecked() ? "6"
                : mp02cb00807.isChecked() ? "7" : mp02cb00808.isChecked() ? "8" : mp02cb00888.isChecked() ? "88" : "0");
        scb.put("mp02cb00888x", mp02cb00888x.getText().toString());
        scb.put("mp02cb009", mp02cb00901.isChecked() ? "1" : mp02cb00902.isChecked() ? "2" : mp02cb00903.isChecked() ? "3"
                : mp02cb00904.isChecked() ? "4" : mp02cb00905.isChecked() ? "5" : "0");
        scb.put("mp02cb010", mp02cb010.getText().toString());
        scb.put("mp02cb011", mp02cb01101.isChecked() ? "1" : mp02cb01102.isChecked() ? "2" : "0");
        scb.put("mp02cb012", mp02cb012.getText().toString());
        scb.put("mp02cb013", mp02cb01301.isChecked() ? "1" : mp02cb01302.isChecked() ? "2" : mp02cb01303.isChecked() ? "3"
                : mp02cb01304.isChecked() ? "4" : mp02cb01305.isChecked() ? "5" : mp02cb01306.isChecked() ? "6" : "0");
        scb.put("mp02cb014", mp02cb01401.isChecked() ? "1" : mp02cb01402.isChecked() ? "2" : mp02cb01403.isChecked() ? "3"
                : mp02cb01404.isChecked() ? "4" : mp02cb01405.isChecked() ? "5" : mp02cb01406.isChecked() ? "6"
                : mp02cb01407.isChecked() ? "7" : mp02cb01408.isChecked() ? "8" : mp02cb01488.isChecked() ? "88" : "0");
        scb.put("mp02cb01488x", mp02cb00888x.getText().toString());
        scb.put("mp02cb015", mp02cb01501.isChecked() ? "1" : mp02cb01502.isChecked() ? "2" : mp02cb01503.isChecked() ? "3"
                : mp02cb01504.isChecked() ? "4" : "0");
        scb.put("mp02cb016", mp02cb01601.isChecked() ? "1" : mp02cb01602.isChecked() ? "2" : mp02cb01699.isChecked() ? "99" : "0");
        scb.put("mp02cb017", mp02cb017.getText().toString());
        scb.put("mp02cb018", mp02cb01801.isChecked() ? "1" : mp02cb01802.isChecked() ? "2" : mp02cb01899.isChecked() ? "99" : "0");
        scb.put("mp02cb019", mp02cb01901.isChecked() ? "1" : mp02cb01902.isChecked() ? "2" : mp02cb01903.isChecked() ? "03"
                : mp02cb01904.isChecked() ? "4" : "0");
        scb.put("mp02cb020", mp02cb02001.isChecked() ? "1" : mp02cb02002.isChecked() ? "2" : "0");
        scb.put("mp02cb021", mp02cb021.getText().toString());
        scb.put("mp02cb022", mp02cb022.getText().toString());
        scb.put("mp02cb023", mp02cb02301.isChecked() ? "1" : mp02cb02302.isChecked() ? "2" : mp02cb02303.isChecked() ? "3"
                : mp02cb02304.isChecked() ? "4" : "0");
        scb.put("mp02cb024", mp02cb024.getText().toString());
        scb.put("mp02cb025", mp02cb02501.isChecked() ? "1" : mp02cb02502.isChecked() ? "2" : mp02cb02503.isChecked() ? "3"
                : mp02cb02504.isChecked() ? "4" : "0");
        scb.put("mp02cb026", mp02cb02601.isChecked() ? "1" : mp02cb02602.isChecked() ? "2" : mp02cb02603.isChecked() ? "3"
                : mp02cb02604.isChecked() ? "4" : "0");
        scb.put("mp02cb027", mp02cb02701.isChecked() ? "1" : mp02cb02702.isChecked() ? "2" : mp02cb02703.isChecked() ? "3"
                : mp02cb02704.isChecked() ? "4" : "0");
        scb.put("mp02cb028", mp02cb02801.isChecked() ? "1" : mp02cb02802.isChecked() ? "2" : "0");

/*
        int radioButtonID = mp02cb009.getCheckedRadioButtonId();
        View radioButton = mp02cb009.findViewById(radioButtonID);
        int idx = mp02cb009.indexOfChild(radioButton);
*/
        AppMain.unmarried = mp02cb009.indexOfChild(findViewById(mp02cb009.getCheckedRadioButtonId()));


        AppMain.pc.setsCB(String.valueOf(scb));


        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        //======================= CA Q 1 ===============
        if (mp02ca001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ca001), Toast.LENGTH_LONG).show();
            mp02ca00102.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02ca001: This data is Required!");
            return false;
        } else {
            mp02ca00102.setError(null);
        }
        //======================= CA Q 2 ===============
        if (mp02ca002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ca002), Toast.LENGTH_LONG).show();
            mp02ca00202.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02ca002: This data is Required!");
            return false;
        } else {
            mp02ca00202.setError(null);
        }

        // =========================== Section CB =====================

        if (mp02ca00101.isChecked() && mp02ca00201.isChecked()) {
            //================== Q 1 ==================
            if (mp02cb00101.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb001), Toast.LENGTH_LONG).show();
                mp02cb00101.setError("This data is Required!");
                Log.i(TAG, "mp02cb001: This data is Required!");
                return false;
            } else {
                mp02cb00101.setError(null);
            }
            if (mp02cb00102.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb001), Toast.LENGTH_LONG).show();
                mp02cb00102.setError("This data is Required!"); // Set Error on last radio button
                Log.i(TAG, "mp02cb001: This data is Required!");
                return false;
            } else {
                mp02cb00102.setError(null);
            }


            int currentAge = year - (Integer.parseInt(mp02cb00101.getText().toString()));

            if (currentAge < 15 || currentAge > 23) {
                Toast.makeText(this, "ERROR: " + getString(R.string.mp02cb001), Toast.LENGTH_LONG).show();
                mp02cb00101.setError("Age Limit is from 15 to 24 Years");
                Log.i(TAG, "mp02cb00101: Age Limit is from 15 to 24 Years");
                return false;
            } else {
                mp02cb00101.setError(null);
            }

            if ((Integer.parseInt(mp02cb00102.getText().toString()) < 0) || (Integer.parseInt(mp02cb00102.getText().toString()) > 12)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.mp02cb001), Toast.LENGTH_LONG).show();
                mp02cb00102.setError("Range is 1-12 months");
                Log.i(TAG, "mp02cb00102: Range is 1-12 months");
                return false;
            } else {
                mp02cb00102.setError(null);
            }


            //================== Q 2 ==================
            if (mp02cb002.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb002), Toast.LENGTH_LONG).show();
                mp02cb002.setError("This data is Required!");
                Log.i(TAG, "mp02cb002: This data is Required!");
                return false;
            } else {
                mp02cb002.setError(null);
            }

            if (((Integer.parseInt(mp02cb002.getText().toString()) < 14)) || (Integer.parseInt(mp02cb002.getText().toString()) > 23)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.mp02cb002), Toast.LENGTH_LONG).show();
                mp02cb002.setError("Age Limit is from 14 to 24 Years");
                Log.i(TAG, "mp02cb002: Age Limit is from 14 to 24 Years");
                return false;
            } else {
                mp02cb002.setError(null);
            }

            /*if (currentAge != (Integer.parseInt(mp02cb002.getText().toString()))) {
                Toast.makeText(this, "ERROR: " + getString(R.string.mp02cb002), Toast.LENGTH_LONG).show();
                mp02cb00101.setError("Age mismatch with year of birth... Check Again");
                Log.i(TAG, "mp02cb00101: Age mismatch with year of birth... Check Again");
                return false;
            } else {
                mp02cb00101.setError(null);
            }*/

            //==================== Q3 =====================
            if (mp02cb003.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb003), Toast.LENGTH_LONG).show();
                mp02cb00388.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cb003: This data is Required!");
                return false;
            } else {
                mp02cb00388.setError(null);
            }
            // ================ Q 3 Others =================
            if (mp02cb00388.isChecked() && mp02cb00388x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb003) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                mp02cb00388x.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cb00388x: This data is Required!");
                return false;
            } else {
                mp02cb00388x.setError(null);
            }

            //==================== Q4 =====================
            if (mp02cb004.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb004), Toast.LENGTH_LONG).show();
                mp02cb00488.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cb004: This data is Required!");
                return false;
            } else {
                mp02cb00488.setError(null);
            }
            // ================ Q 4 Others =================
            if (mp02cb00488.isChecked() && mp02cb00488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb004) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                mp02cb00488x.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cb00488x: This data is Required!");
                return false;
            } else {
                mp02cb00488x.setError(null);
            }

            //==================== Q5 =====================
            if (mp02cb005.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb005), Toast.LENGTH_LONG).show();
                mp02cb00502.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cb005: This data is Required!");
                return false;
            } else {
                mp02cb00502.setError(null);
            }

            if (mp02cb00501.isChecked()) {
                // ================ Q6 ==============
                if (mp02cb006.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb006), Toast.LENGTH_LONG).show();
                    mp02cb006.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb006: This data is Required!");
                    return false;
                } else {
                    mp02cb006.setError(null);
                }

                if ((Integer.parseInt(mp02cb006.getText().toString()) < 0) || (Integer.parseInt(mp02cb006.getText().toString()) > 16)) {
                    Toast.makeText(this, "ERROR: " + getString(R.string.mp02cb006), Toast.LENGTH_LONG).show();
                    mp02cb006.setError("Range is 0-16");
                    Log.i(TAG, "mp02cb006: Range is 0-16");
                    return false;
                } else {
                    mp02cb006.setError(null);
                }

                //==================== Q7 ========================
                if (mp02cb007.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb007), Toast.LENGTH_LONG).show();
                    mp02cb00706.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb007: This data is Required!");
                    return false;
                } else {
                    mp02cb00706.setError(null);
                }

                /*if (Integer.valueOf(mp02cb006.getText().toString()) < 1 && !mp02cb00701.isChecked()) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02cb006), Toast.LENGTH_LONG).show();
                    mp02cb006.setError("Please check with highest level of education attended..");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb006: Please check with highest level of education attended..");
                    return false;
                } else {
                    mp02cb006.setError(null);
                }

                if (Integer.valueOf(mp02cb006.getText().toString()) > 1 && !mp02cb00701.isChecked()) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02cb006), Toast.LENGTH_LONG).show();
                    mp02cb006.setError("Please check with highest level of education attended..");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb006: Please check with highest level of education attended..");
                    return false;
                } else {
                    mp02cb006.setError(null);
                }
*/
            }

            // ================== Q8 ====================
            if (mp02cb008.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb008), Toast.LENGTH_LONG).show();
                mp02cb00888.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cb008: This data is Required!");
                return false;
            } else {
                mp02cb00888.setError(null);
            }

            // ================ Q8 Others =================
            if (mp02cb00888.isChecked() && mp02cb00888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb008) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                mp02cb00888x.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cb00888x: This data is Required!");
                return false;
            } else {
                mp02cb00888x.setError(null);
            }

            // ================== Q9 ====================
            if (mp02cb009.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb009), Toast.LENGTH_LONG).show();
                mp02cb00905.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mp02cb009: This data is Required!");
                return false;
            } else {
                mp02cb00905.setError(null);
            }

            // ============ Skip Check till Q 23 ==============
            if (mp02cb00901.isChecked()) {
                    if (mp02cb010.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb010), Toast.LENGTH_LONG).show();
                        mp02cb010.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb010: This data is Required!");
                        return false;
                    } else {
                        mp02cb010.setError(null);
                    }

                    if (mp02cb010.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb010), Toast.LENGTH_LONG).show();
                        mp02cb010.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb010: This data is Required!");
                        return false;
                    } else {
                        mp02cb010.setError(null);
                    }

                    if (Integer.parseInt(mp02cb010.getText().toString()) < 14) {
                        Toast.makeText(this, "ERROR: " + getString(R.string.mp02cb010), Toast.LENGTH_LONG).show();
                        mp02cb010.setError("Age Not less then 14");
                        Log.i(TAG, "mp02cb010: Age Not less then 14");
                        return false;
                    } else {
                        mp02cb010.setError(null);
                    }

                    if (mp02cb011.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb011), Toast.LENGTH_LONG).show();
                        mp02cb01102.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb011: This data is Required!");
                        return false;
                    } else {
                        mp02cb01101.setError(null);
                    }
                    if (mp02cb01101.isChecked()) {
                        if (mp02cb012.getText().toString().isEmpty()) {
                            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb012), Toast.LENGTH_LONG).show();
                            mp02cb012.setError("This data is Required!");    // Set Error on last radio button

                            Log.i(TAG, "mp02cb012: This data is Required!");
                            return false;
                        } else {
                            mp02cb012.setError(null);
                        }

                        if (((Integer.parseInt(mp02cb012.getText().toString()) < 1)) || (Integer.parseInt(mp02cb012.getText().toString()) > 16)) {
                            Toast.makeText(this, "ERROR: " + getString(R.string.mp02cb012), Toast.LENGTH_LONG).show();
                            mp02cb012.setError("Age Limit is from 14 to 24 Years");
                            Log.i(TAG, "mp02cb012: Age Limit is from 14 to 24 Years");
                            return false;
                        } else {
                            mp02cb012.setError(null);
                        }

                        if (mp02cb013.getCheckedRadioButtonId() == -1) {
                            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb013), Toast.LENGTH_LONG).show();
                            mp02cb01306.setError("This data is Required!");    // Set Error on last radio button

                            Log.i(TAG, "mp02cb013: This data is Required!");
                            return false;
                        } else {
                            mp02cb01306.setError(null);
                        }
                    }

                    if (mp02cb014.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb014), Toast.LENGTH_LONG).show();
                        mp02cb01488.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb014: This data is Required!");
                        return false;
                    } else {
                        mp02cb01488.setError(null);
                    }

                    if (mp02cb01488.isChecked() && mp02cb01488x.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb014) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                        mp02cb01488x.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb01488x: This data is Required!");
                        return false;
                    } else {
                        mp02cb01488x.setError(null);
                    }

                    if (mp02cb015.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb015), Toast.LENGTH_LONG).show();
                        mp02cb01502.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb015: This data is Required!");
                        return false;
                    } else {
                        mp02cb01502.setError(null);
                    }

                    if (mp02cb016.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb016), Toast.LENGTH_LONG).show();
                        mp02cb01699.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb016: This data is Required!");
                        return false;
                    } else {
                        mp02cb01699.setError(null);
                    }

                    if (mp02cb01601.isChecked()) {
                        if (mp02cb017.getText().toString().isEmpty()) {
                            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb017), Toast.LENGTH_LONG).show();
                            mp02cb017.setError("This data is Required!");    // Set Error on last radio button

                            Log.i(TAG, "mp02cb017: This data is Required!");
                            return false;
                        } else {
                            mp02cb017.setError(null);
                        }

                        if ((Integer.parseInt(mp02cb017.getText().toString()) < 2) || (Integer.parseInt(mp02cb017.getText().toString()) > 4)) {
                            Toast.makeText(this, "ERROR: " + getString(R.string.mp02cb017), Toast.LENGTH_LONG).show();
                            mp02cb017.setError("Range is 2 to 4");    // Set Error on last radio button
                            Log.i(TAG, "mp02cb0017: Range is 2 to 4");

                        } else {
                            mp02cb017.setError(null);
                        }
                    }

                    if (mp02cb018.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb018), Toast.LENGTH_LONG).show();
                        mp02cb01899.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb018: This data is Required!");
                        return false;
                    } else {
                        mp02cb01899.setError(null);
                    }

                    if (mp02cb01801.isChecked()) {
                        if (mp02cb019.getCheckedRadioButtonId() == -1) {
                            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb019), Toast.LENGTH_LONG).show();
                            mp02cb01904.setError("This data is Required!");    // Set Error on last radio button

                            Log.i(TAG, "mp02cb019: This data is Required!");
                            return false;
                        } else {
                            mp02cb01904.setError(null);
                        }
                    }

                    if (mp02cb020.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb020), Toast.LENGTH_LONG).show();
                        mp02cb02002.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb020: This data is Required!");
                        return false;
                    } else {
                        mp02cb02002.setError(null);
                    }

                    if (mp02cb021.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb021), Toast.LENGTH_LONG).show();
                        mp02cb021.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb021: This data is Required!");
                        return false;
                    } else {
                        mp02cb021.setError(null);
                    }

                    if (mp02cb022.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb022), Toast.LENGTH_LONG).show();
                        mp02cb022.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb022: This data is Required!");
                        return false;
                    } else {
                        mp02cb022.setError(null);
                    }

                    if (mp02cb023.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb023), Toast.LENGTH_LONG).show();
                        mp02cb02304.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb023: This data is Required!");
                        return false;
                    } else {
                        mp02cb02304.setError(null);
                    }

                   } else if (mp02cb00902.isChecked() || mp02cb00903.isChecked() || mp02cb00904.isChecked()) {
                    if (mp02cb018.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb018), Toast.LENGTH_LONG).show();
                        mp02cb01899.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb018: This data is Required!");
                        return false;
                    } else {
                        mp02cb01899.setError(null);
                    }

                    if (mp02cb01801.isChecked()) {
                        if (mp02cb019.getCheckedRadioButtonId() == -1) {
                            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb019), Toast.LENGTH_LONG).show();
                            mp02cb01904.setError("This data is Required!");    // Set Error on last radio button

                            Log.i(TAG, "mp02cb019: This data is Required!");
                            return false;
                        } else {
                            mp02cb01904.setError(null);
                        }
                    }

                    if (mp02cb020.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb020), Toast.LENGTH_LONG).show();
                        mp02cb02002.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb020: This data is Required!");
                        return false;
                    } else {
                        mp02cb02002.setError(null);
                    }

                    if (mp02cb021.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb021), Toast.LENGTH_LONG).show();
                        mp02cb021.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb021: This data is Required!");
                        return false;
                    } else {
                        mp02cb021.setError(null);
                    }

                    if ((Integer.parseInt(mp02cb021.getText().toString()) < 15) || (Integer.parseInt(mp02cb021.getText().toString()) > 99)) {
                        Toast.makeText(this, "ERROR: " + getString(R.string.mp02cb021), Toast.LENGTH_LONG).show();
                        mp02cb021.setError("Age Limit is from 15 to 99 Years");
                        Log.i(TAG, "mp02cb021: Age Limit is from 15 to 99 Years");
                        return false;
                    } else {
                        mp02cb021.setError(null);
                    }

                    if (mp02cb022.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb022), Toast.LENGTH_LONG).show();
                        mp02cb022.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb022: This data is Required!");
                        return false;
                    } else {
                        mp02cb022.setError(null);
                    }

                    if ((Integer.parseInt(mp02cb022.getText().toString()) < 15) || (Integer.parseInt(mp02cb022.getText().toString()) > 99)) {
                        Toast.makeText(this, "ERROR: " + getString(R.string.mp02cb022), Toast.LENGTH_LONG).show();
                        mp02cb022.setError("Age Limit is from 15 to 99 Years");
                        Log.i(TAG, "mp02cb022 : Age Limit is from 15 to 99 Years");
                        return false;
                    } else {
                        mp02cb022.setError(null);
                    }

                    if (mp02cb023.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb023), Toast.LENGTH_LONG).show();
                        mp02cb02304.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb023 : This data is Required!");
                        return false;
                    } else {
                        mp02cb02304.setError(null);
                    }

                }
                 if (mp02cb024.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb024), Toast.LENGTH_LONG).show();
                    mp02cb024.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb024 : This data is Required!");
                    return false;
                } else {
                    mp02cb024.setError(null);
                }

                  if (mp02cb025.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb025), Toast.LENGTH_LONG).show();
                    mp02cb02504.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb025 : This data is Required!");
                    return false;
                } else {
                    mp02cb02504.setError(null);
                }

                if (mp02cb026.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb026), Toast.LENGTH_LONG).show();
                    mp02cb02604.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb025 : This data is Required!");
                    return false;
                } else {
                    mp02cb02604.setError(null);
                }

                if (mp02cb027.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb027), Toast.LENGTH_LONG).show();
                    mp02cb02704.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb027: This data is Required!");
                    return false;
                } else {
                    mp02cb02704.setError(null);
                }

                if (mp02cb028.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb028), Toast.LENGTH_LONG).show();
                    mp02cb02802.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb028: This data is Required!");
                    return false;
                } else {
                    mp02cb02802.setError(null);
                }

            }

        return true;
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
