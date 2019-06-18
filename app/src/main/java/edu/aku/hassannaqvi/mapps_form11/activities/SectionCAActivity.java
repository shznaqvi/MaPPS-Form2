package edu.aku.hassannaqvi.mapps_form11.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.text.Editable;
import android.text.TextWatcher;
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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form11.R;
import edu.aku.hassannaqvi.mapps_form11.core.AppMain;
import edu.aku.hassannaqvi.mapps_form11.core.DatabaseHelper;

public class SectionCAActivity extends Activity {

    private static final String TAG = SectionCAActivity.class.getSimpleName();

    @BindView(R.id.activity_section_cb)
    RelativeLayout activitySectionCb;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.fldGrpmp02cb)
    LinearLayout fldGrpmp02cb;
    @BindView(R.id.app_header1)
    TextView appHeader1;
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
    @BindView(R.id.mp02cb00809)
    RadioButton mp02cb00809;
    @BindView(R.id.mp02cb00810)
    RadioButton mp02cb00810;
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
    @BindView(R.id.fldGrpmp02cbbutton)
    LinearLayout fldGrpmp02cbbutton;
    /* @BindView(R.id.mp02cbName)
     EditText mp02cbName;
     @BindView(R.id.addParticipantReason)
     Spinner addParticipantReason;
     @BindView(R.id.fldGrpRsn)
     LinearLayout fldGrpRsn;
 */
    Calendar now = Calendar.getInstance();
    int year = now.get(Calendar.YEAR);

    int pos;
    Boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_ca);
        ButterKnife.bind(this);

        /*ArrayList<String> rsnValues = new ArrayList<>();
        rsnValues.add(0, "...");
        rsnValues.add(1, "Migration in");
        rsnValues.add(2, "Dont know");

        addParticipantReason.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, rsnValues));

        flag = getIntent().getBooleanExtra("flag",false);
        pos = getIntent().getExtras().getInt("pos");
        if (!flag) {
            //mp02cbName.setText(AppMain.Eparticipant.get(pos).getWname());
            fldGrpRsn.setVisibility(View.GONE);
        } else {
            fldGrpRsn.setVisibility(View.VISIBLE);
        }

        AppMain.partiFlag++;*/

        /*mp02ca001.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
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
*/

        // =================== Q3 Others ====================

        /*mp02cb003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cb00388.isChecked()) {
                    mp02cb00388x.setVisibility(View.VISIBLE);
                } else {
                    mp02cb00388x.setVisibility(View.GONE);
                    mp02cb00388x.setText(null);
                }
            }
        });*/

        // =================== Q4 Others ====================

       /* mp02cb004.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02cb00488.isChecked()) {
                    mp02cb00488x.setVisibility(View.VISIBLE);
                } else {
                    mp02cb00488x.setVisibility(View.GONE);
                    mp02cb00488x.setText(null);
                }
            }
        });*/

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
                    mp02cb01406.setEnabled(true);
                    mp02cb01407.setEnabled(true);

                } else {
                    fldGrpmp02cb012.setVisibility(View.GONE);
                    mp02cb012.setText(null);
                    mp02cb013.clearCheck();
                    mp02cb01406.setEnabled(false);
                    mp02cb01406.setChecked(false);
                    mp02cb01407.setEnabled(false);
                    mp02cb01407.setChecked(false);

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
                    mp02cb00806.setEnabled(true);
                    mp02cb00807.setEnabled(true);
                } else {
                    fldGrpmp02cb006.setVisibility(View.GONE);
                    mp02cb006.setText(null);
                    mp02cb007.clearCheck();
                    mp02cb00806.setEnabled(false);
                    mp02cb00806.setChecked(false);
                    mp02cb00807.setEnabled(false);
                    mp02cb00807.setChecked(false);

                }
            }
        });

        /*mp02cb00101.setOnFocusChangeListener(new View.OnFocusChangeListener() {
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
        });*/

        /*mp02cb002.addTextChangedListener(new TextWatcher() {
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
*/
        mp02cb006.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (Integer.valueOf(mp02cb006.getText().toString().isEmpty() ? "0" : mp02cb006.getText().toString()) == 0) {
                    mp02cb00701.setEnabled(true);
                    mp02cb00702.setEnabled(false);
                    mp02cb00703.setEnabled(false);
                    mp02cb00704.setEnabled(false);
                    mp02cb00705.setEnabled(false);
                    mp02cb00706.setEnabled(false);

                } else if (Integer.valueOf(mp02cb006.getText().toString().isEmpty() ? "0" : mp02cb006.getText().toString()) > 1
                        && Integer.valueOf(mp02cb006.getText().toString()) <= 5) {
                    mp02cb00701.setEnabled(false);
                    mp02cb00702.setEnabled(true);
                    mp02cb00703.setEnabled(false);
                    mp02cb00704.setEnabled(false);
                    mp02cb00705.setEnabled(false);
                    mp02cb00706.setEnabled(false);

                } else if (Integer.valueOf(mp02cb006.getText().toString().isEmpty() ? "0" : mp02cb006.getText().toString()) > 5
                        && Integer.valueOf(mp02cb006.getText().toString()) <= 10) {
                    mp02cb00701.setEnabled(false);
                    mp02cb00702.setEnabled(true);
                    mp02cb00703.setEnabled(true);
                    mp02cb00704.setEnabled(false);
                    mp02cb00705.setEnabled(true);
                    mp02cb00706.setEnabled(false);
                } else if (Integer.valueOf(mp02cb006.getText().toString().isEmpty() ? "0" : mp02cb006.getText().toString()) > 10
                        && Integer.valueOf(mp02cb006.getText().toString()) <= 12) {
                    mp02cb00701.setEnabled(false);
                    mp02cb00702.setEnabled(true);
                    mp02cb00703.setEnabled(true);
                    mp02cb00704.setEnabled(true);
                    mp02cb00705.setEnabled(true);
                    mp02cb00706.setEnabled(false);
                } else if (Integer.valueOf(mp02cb006.getText().toString().isEmpty() ? "0" : mp02cb006.getText().toString()) > 12
                        && Integer.valueOf(mp02cb006.getText().toString()) <= 16) {
                    mp02cb00701.setEnabled(false);
                    mp02cb00702.setEnabled(true);
                    mp02cb00703.setEnabled(true);
                    mp02cb00704.setEnabled(true);
                    mp02cb00705.setEnabled(true);
                    mp02cb00706.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mp02cb012.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (Integer.valueOf(mp02cb012.getText().toString().isEmpty() ? "0" : mp02cb012.getText().toString()) == 0) {
                    mp02cb01301.setEnabled(true);
                    mp02cb01302.setEnabled(false);
                    mp02cb01303.setEnabled(false);
                    mp02cb01304.setEnabled(false);
                    mp02cb01305.setEnabled(false);
                    mp02cb01306.setEnabled(false);

                } else if (Integer.valueOf(mp02cb012.getText().toString().isEmpty() ? "0" : mp02cb012.getText().toString()) > 1
                        && Integer.valueOf(mp02cb012.getText().toString()) <= 5) {
                    mp02cb01301.setEnabled(false);
                    mp02cb01302.setEnabled(true);
                    mp02cb01303.setEnabled(false);
                    mp02cb01304.setEnabled(false);
                    mp02cb01305.setEnabled(false);
                    mp02cb01306.setEnabled(false);

                } else if (Integer.valueOf(mp02cb012.getText().toString().isEmpty() ? "0" : mp02cb012.getText().toString()) > 5
                        && Integer.valueOf(mp02cb012.getText().toString()) <= 10) {
                    mp02cb01301.setEnabled(false);
                    mp02cb01302.setEnabled(true);
                    mp02cb01303.setEnabled(true);
                    mp02cb01304.setEnabled(false);
                    mp02cb01305.setEnabled(true);
                    mp02cb01306.setEnabled(false);
                } else if (Integer.valueOf(mp02cb012.getText().toString().isEmpty() ? "0" : mp02cb012.getText().toString()) > 10
                        && Integer.valueOf(mp02cb012.getText().toString()) <= 12) {
                    mp02cb01301.setEnabled(false);
                    mp02cb01302.setEnabled(true);
                    mp02cb01303.setEnabled(true);
                    mp02cb01304.setEnabled(true);
                    mp02cb01305.setEnabled(true);
                    mp02cb01306.setEnabled(false);
                } else if (Integer.valueOf(mp02cb012.getText().toString().isEmpty() ? "0" : mp02cb012.getText().toString()) > 12
                        && Integer.valueOf(mp02cb012.getText().toString()) <= 16) {
                    mp02cb01301.setEnabled(false);
                    mp02cb01302.setEnabled(true);
                    mp02cb01303.setEnabled(true);
                    mp02cb01304.setEnabled(true);
                    mp02cb01305.setEnabled(true);
                    mp02cb01306.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mp02cb007.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mp02cb00701.isChecked() || mp02cb00702.isChecked()) {
                    mp02cb00806.setEnabled(false);
                    mp02cb00806.setChecked(false);
                    mp02cb00807.setEnabled(false);
                    mp02cb00807.setChecked(false);
                } else {
                    mp02cb00806.setEnabled(true);
                    mp02cb00807.setEnabled(true);
                }
            }
        });



        mp02cb013.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mp02cb01301.isChecked() || mp02cb01302.isChecked()) {
                    mp02cb01406.setEnabled(false);
                    mp02cb01406.setChecked(false);
                    mp02cb01407.setEnabled(false);
                    mp02cb01407.setChecked(false);
                } else {
                    mp02cb01406.setEnabled(true);
                    mp02cb01407.setEnabled(true);
                }
            }
        });



    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();

        /*if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                */
                finish();
                Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("complete", false);
                startActivity(endSec);
        /*    }
        }*/
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

                Intent seccc = new Intent(this, SectionCBActivity.class);
                startActivity(seccc);

                /*if (mp02ca00101.isChecked() && mp02ca00201.isChecked()) {

                } else {
                    Intent endSec = new Intent(this, SectionCActivity.class);
                    endSec.putExtra("complete", false);
                    startActivity(endSec);
                }*/

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateCA();

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

        JSONObject scb = new JSONObject();


        //scb.put("mp03name", mp02cbName.getText().toString());
        //scb.put("sno", AppMain.Eparticipant.get(pos).getSno());

        scb.put("mp03q034", mp02cb00501.isChecked() ? "1"
                : mp02cb00502.isChecked() ? "2"
                : "0");

        scb.put("mp03q035", mp02cb006.getText().toString());

        scb.put("mp03q036", mp02cb00701.isChecked() ? "1"
                : mp02cb00702.isChecked() ? "2"
                : mp02cb00703.isChecked() ? "3"
                : mp02cb00704.isChecked() ? "4"
                : mp02cb00705.isChecked() ? "5"
                : mp02cb00706.isChecked() ? "6"
                : "0");

        scb.put("mp03q037", mp02cb00801.isChecked() ? "1"
                : mp02cb00802.isChecked() ? "2"
                : mp02cb00803.isChecked() ? "3"
                : mp02cb00804.isChecked() ? "4"
                : mp02cb00805.isChecked() ? "5"
                : mp02cb00806.isChecked() ? "6"
                : mp02cb00807.isChecked() ? "7"
                : mp02cb00808.isChecked() ? "8"
                : mp02cb00809.isChecked() ? "9"
                : mp02cb00810.isChecked() ? "10"
                : mp02cb00888.isChecked() ? "88" : "0");
        scb.put("mp03q03788x", mp02cb00888x.getText().toString());

        scb.put("mp03q038", mp02cb00901.isChecked() ? "1"
                : mp02cb00902.isChecked() ? "2"
                : mp02cb00903.isChecked() ? "3"
                : mp02cb00904.isChecked() ? "4"
                : mp02cb00905.isChecked() ? "5"
                : "0");

        scb.put("mp03q039", mp02cb010.getText().toString());

        scb.put("mp03q040", mp02cb01101.isChecked() ? "1"
                : mp02cb01102.isChecked() ? "2"
                : "0");

        scb.put("mp03q041", mp02cb012.getText().toString());

        scb.put("mp03q042", mp02cb01301.isChecked() ? "1"
                : mp02cb01302.isChecked() ? "2"
                : mp02cb01303.isChecked() ? "3"
                : mp02cb01304.isChecked() ? "4"
                : mp02cb01305.isChecked() ? "5"
                : mp02cb01306.isChecked() ? "6"
                : "0");

        scb.put("mp03q043", mp02cb01401.isChecked() ? "1"
                : mp02cb01402.isChecked() ? "2"
                : mp02cb01403.isChecked() ? "3"
                : mp02cb01404.isChecked() ? "4"
                : mp02cb01405.isChecked() ? "5"
                : mp02cb01406.isChecked() ? "6"
                : mp02cb01407.isChecked() ? "7"
                : mp02cb01408.isChecked() ? "8"
                : mp02cb01488.isChecked() ? "88"
                : "0");
        scb.put("mp03q04388x", mp02cb01488x.getText().toString());

        scb.put("mp03q044", mp02cb01501.isChecked() ? "1"
                : mp02cb01502.isChecked() ? "2"
                : mp02cb01503.isChecked() ? "3"
                : mp02cb01504.isChecked() ? "4"
                : "0");

        scb.put("mp03q045", mp02cb01601.isChecked() ? "1"
                : mp02cb01602.isChecked() ? "2"
                : mp02cb01699.isChecked() ? "99"
                : "0");

        scb.put("mp03q046", mp02cb017.getText().toString());

        scb.put("mp03q047", mp02cb01801.isChecked() ? "1"
                : mp02cb01802.isChecked() ? "2"
                : mp02cb01899.isChecked() ? "99"
                : "0");

        scb.put("mp03q048", mp02cb01901.isChecked() ? "1"
                : mp02cb01902.isChecked() ? "2"
                : mp02cb01903.isChecked() ? "03"
                : mp02cb01904.isChecked() ? "4"
                : "0");

        scb.put("mp03q049", mp02cb02001.isChecked() ? "1"
                : mp02cb02002.isChecked() ? "2"
                : "0");

        scb.put("mp03q050", mp02cb021.getText().toString());

        scb.put("mp03q051", mp02cb022.getText().toString());

        scb.put("mp03q052", mp02cb02301.isChecked() ? "1"
                : mp02cb02302.isChecked() ? "2"
                : mp02cb02303.isChecked() ? "3"
                : mp02cb02304.isChecked() ? "4"
                : "0");

        scb.put("mp03q053", mp02cb024.getText().toString());

        AppMain.maritalStatus = mp02cb009.indexOfChild(findViewById(mp02cb009.getCheckedRadioButtonId())) + 1;

        AppMain.fc.setsCA(String.valueOf(scb));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }


    public boolean ValidateForm() {

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

                if ((Integer.valueOf(mp02cb006.getText().toString().isEmpty() ? "0" : mp02cb006.getText().toString()) < 0)
                        || (Integer.valueOf(mp02cb006.getText().toString().isEmpty() ? "0" : mp02cb006.getText().toString()) > 16)) {
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

                if (Integer.valueOf(mp02cb010.getText().toString().isEmpty() ? "0" : mp02cb010.getText().toString()) < 13) {
                        Toast.makeText(this, "ERROR: " + getString(R.string.mp02cb010), Toast.LENGTH_LONG).show();
                    mp02cb010.setError("Age Not less then 13");
                    Log.i(TAG, "mp02cb010: Age Not less then 13");
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

                        if (((Integer.valueOf(mp02cb012.getText().toString().isEmpty() ? "0" : mp02cb012.getText().toString()) < 1))
                                || (Integer.valueOf(mp02cb012.getText().toString().isEmpty() ? "0" : mp02cb012.getText().toString()) > 16)) {
                            Toast.makeText(this, "ERROR: " + getString(R.string.mp02cb012), Toast.LENGTH_LONG).show();
                            mp02cb012.setError("Range is 0 to 16");
                            Log.i(TAG, "mp02cb012: Range is 0 to 16");
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

                        if ((Integer.valueOf(mp02cb017.getText().toString().isEmpty() ? "0" : mp02cb017.getText().toString()) < 2)
                                || ((Integer.valueOf(mp02cb017.getText().toString().isEmpty() ? "0" : mp02cb017.getText().toString()) > 4)
                                && Integer.valueOf(mp02cb017.getText().toString().isEmpty() ? "0" : mp02cb017.getText().toString()) != 99)) {
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

                if ((Integer.valueOf(mp02cb021.getText().toString().isEmpty() ? "0" : mp02cb021.getText().toString()) < 13)
                        && Integer.valueOf(mp02cb021.getText().toString().isEmpty() ? "0" : mp02cb021.getText().toString()) != 99) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02cb021), Toast.LENGTH_LONG).show();
                    mp02cb021.setError("Can not be less than 13 years and greater than current age");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb021: Can not be less than 13 years and greater than current age");
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

                if (Integer.valueOf(mp02cb021.getText().toString().isEmpty() ? "0" : mp02cb021.getText().toString()) != 99) {
                    if ((Integer.valueOf(mp02cb022.getText().toString().isEmpty() ? "0" : mp02cb022.getText().toString())
                            < Integer.valueOf(mp02cb021.getText().toString().isEmpty() ? "0" : mp02cb021.getText().toString()))
                            && Integer.valueOf(mp02cb022.getText().toString().isEmpty() ? "0" : mp02cb022.getText().toString()) != 99) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02cb022), Toast.LENGTH_LONG).show();
                        mp02cb021.setError("Check again");    // Set Error on last radio button
                        mp02cb022.setError("Check again");

                        Log.i(TAG, "mp02cb022: Check again");
                        return false;
                    } else {
                        mp02cb021.setError(null);
                        mp02cb022.setError(null);
                    }
                } else {
                    if ((Integer.valueOf(mp02cb022.getText().toString().isEmpty() ? "0" : mp02cb022.getText().toString()) < 13)
                            && Integer.valueOf(mp02cb022.getText().toString().isEmpty() ? "0" : mp02cb022.getText().toString()) != 99) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02cb022), Toast.LENGTH_LONG).show();
                        mp02cb022.setError("Can not be less than 13 years and greater than current age");    // Set Error on last radio button

                        Log.i(TAG, "mp02cb022: Can not be less than 13 years and greater than current age");
                        return false;
                    } else {
                        mp02cb022.setError(null);
                    }

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

                if ((Integer.valueOf(mp02cb021.getText().toString().isEmpty() ? "0" : mp02cb021.getText().toString()) < 15)
                        || (Integer.valueOf(mp02cb021.getText().toString().isEmpty() ? "0" : mp02cb021.getText().toString()) > 99)) {
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

                if ((Integer.valueOf(mp02cb022.getText().toString().isEmpty() ? "0" : mp02cb022.getText().toString()) < 15)
                        || (Integer.valueOf(mp02cb022.getText().toString().isEmpty() ? "0" : mp02cb022.getText().toString()) > 99)) {
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

            if (Integer.valueOf(mp02cb024.getText().toString().isEmpty() ? "0" : mp02cb024.getText().toString()) < 13
                    || Integer.valueOf(mp02cb024.getText().toString().isEmpty() ? "0" : mp02cb024.getText().toString()) > 35) {
                Toast.makeText(this, "ERROR(range): " + getString(R.string.mp02cb024), Toast.LENGTH_LONG).show();
                mp02cb024.setError("Range is 13 to 35 years");    // Set Error on last radio button

                Log.i(TAG, "mp02cb024 : Range is 13 to 35 Years");
                return false;
            } else {
                mp02cb024.setError(null);
            }


                  /*if (mp02cb025.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb025), Toast.LENGTH_LONG).show();
                      mp02cb02577.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb025 : This data is Required!");
                    return false;
                } else {
                      mp02cb02577.setError(null);
                }

                if (mp02cb026.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb026), Toast.LENGTH_LONG).show();
                    mp02cb02677.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb025 : This data is Required!");
                    return false;
                } else {
                    mp02cb02677.setError(null);
                }

                if (mp02cb027.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb027), Toast.LENGTH_LONG).show();
                    mp02cb02777.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb027: This data is Required!");
                    return false;
                } else {
                    mp02cb02777.setError(null);
                }

                if (mp02cb028.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02cb028), Toast.LENGTH_LONG).show();
                    mp02cb02802.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mp02cb028: This data is Required!");
                    return false;
                } else {
                    mp02cb02802.setError(null);
                }
*/
        //}

        return true;
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

    public Date getDateFrom(String dateStr) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = df.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


}
