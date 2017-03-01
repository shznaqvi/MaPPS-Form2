package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

public class SectionBBActivity extends Activity {

    @BindView(R.id.activity_section_bb)
    RelativeLayout activitySectionBb;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02bb001)
    RadioGroup mp02bb001;
    @BindView(R.id.mp02bb00101)
    RadioButton mp02bb00101;
    @BindView(R.id.mp02bb00102)
    RadioButton mp02bb00102;
    @BindView(R.id.fldGrpmp02bb002)
    LinearLayout fldGrpmp02bb002;
    @BindView(R.id.mp02bb002)
    RadioGroup mp02bb002;
    @BindView(R.id.mp02bb00201)
    RadioButton mp02bb00201;
    @BindView(R.id.mp02bb00202)
    RadioButton mp02bb00202;
    @BindView(R.id.mp02bb00203)
    RadioButton mp02bb00203;
    @BindView(R.id.mp02bb003)
    RadioGroup mp02bb003;
    @BindView(R.id.mp02bb00301)
    RadioButton mp02bb00301;
    @BindView(R.id.mp02bb00302)
    RadioButton mp02bb00302;
    @BindView(R.id.fldGrpmp02bb004)
    LinearLayout fldGrpmp02bb004;
    @BindView(R.id.mp02bb004)
    RadioGroup mp02bb004;
    @BindView(R.id.mp02bb00401)
    RadioButton mp02bb00401;
    @BindView(R.id.mp02bb00402)
    RadioButton mp02bb00402;
    @BindView(R.id.mp02bb00403)
    RadioButton mp02bb00403;
    @BindView(R.id.mp02bb005)
    RadioGroup mp02bb005;
    @BindView(R.id.mp02bb00501)
    RadioButton mp02bb00501;
    @BindView(R.id.mp02bb00502)
    RadioButton mp02bb00502;
    @BindView(R.id.fldGrpmp02bb006)
    LinearLayout fldGrpmp02bb006;
    @BindView(R.id.mp02bb006)
    RadioGroup mp02bb006;
    @BindView(R.id.mp02bb00601)
    RadioButton mp02bb00601;
    @BindView(R.id.mp02bb00602)
    RadioButton mp02bb00602;
    @BindView(R.id.mp02bb00603)
    RadioButton mp02bb00603;
    @BindView(R.id.mp02bb007)
    RadioGroup mp02bb007;
    @BindView(R.id.mp02bb00701)
    RadioButton mp02bb00701;
    @BindView(R.id.mp02bb00702)
    RadioButton mp02bb00702;
    @BindView(R.id.fldGrpmp02bb008)
    LinearLayout fldGrpmp02bb008;
    @BindView(R.id.mp02bb008)
    RadioGroup mp02bb008;
    @BindView(R.id.mp02bb00801)
    RadioButton mp02bb00801;
    @BindView(R.id.mp02bb00802)
    RadioButton mp02bb00802;
    @BindView(R.id.mp02bb00803)
    RadioButton mp02bb00803;
    @BindView(R.id.mp02bb009)
    RadioGroup mp02bb009;
    @BindView(R.id.mp02bb00901)
    RadioButton mp02bb00901;
    @BindView(R.id.mp02bb00902)
    RadioButton mp02bb00902;
    @BindView(R.id.fldGrpmp02bb010)
    LinearLayout fldGrpmp02bb010;
    @BindView(R.id.mp02bb010)
    RadioGroup mp02bb010;
    @BindView(R.id.mp02bb01001)
    RadioButton mp02bb01001;
    @BindView(R.id.mp02bb01002)
    RadioButton mp02bb01002;
    @BindView(R.id.mp02bb01003)
    RadioButton mp02bb01003;
    @BindView(R.id.mp02bb011)
    RadioGroup mp02bb011;
    @BindView(R.id.mp02bb01101)
    RadioButton mp02bb01101;
    @BindView(R.id.mp02bb01102)
    RadioButton mp02bb01102;
    @BindView(R.id.fldGrpmp02bb012)
    LinearLayout fldGrpmp02bb012;
    @BindView(R.id.mp02bb012)
    RadioGroup mp02bb012;
    @BindView(R.id.mp02bb01201)
    RadioButton mp02bb01201;
    @BindView(R.id.mp02bb01202)
    RadioButton mp02bb01202;
    @BindView(R.id.mp02bb01203)
    RadioButton mp02bb01203;
    @BindView(R.id.mp02bb013)
    RadioGroup mp02bb013;
    @BindView(R.id.mp02bb01301)
    RadioButton mp02bb01301;
    @BindView(R.id.mp02bb01302)
    RadioButton mp02bb01302;
    @BindView(R.id.fldGrpmp02bb014)
    LinearLayout fldGrpmp02bb014;
    @BindView(R.id.mp02bb014)
    RadioGroup mp02bb014;
    @BindView(R.id.mp02bb01401)
    RadioButton mp02bb01401;
    @BindView(R.id.mp02bb01402)
    RadioButton mp02bb01402;
    @BindView(R.id.mp02bb01403)
    RadioButton mp02bb01403;
    @BindView(R.id.mp02bb015)
    RadioGroup mp02bb015;
    @BindView(R.id.mp02bb01501)
    RadioButton mp02bb01501;
    @BindView(R.id.mp02bb01502)
    RadioButton mp02bb01502;
    @BindView(R.id.fldGrpmp02bb016)
    LinearLayout fldGrpmp02bb016;
    @BindView(R.id.mp02bb016)
    RadioGroup mp02bb016;
    @BindView(R.id.mp02bb01601)
    RadioButton mp02bb01601;
    @BindView(R.id.mp02bb01602)
    RadioButton mp02bb01602;
    @BindView(R.id.mp02bb01603)
    RadioButton mp02bb01603;
    @BindView(R.id.mp02bb017)
    RadioGroup mp02bb017;
    @BindView(R.id.mp02bb01701)
    RadioButton mp02bb01701;
    @BindView(R.id.mp02bb01702)
    RadioButton mp02bb01702;
    @BindView(R.id.fldGrpmp02bb018)
    LinearLayout fldGrpmp02bb018;
    @BindView(R.id.mp02bb018)
    RadioGroup mp02bb018;
    @BindView(R.id.mp02bb01801)
    RadioButton mp02bb01801;
    @BindView(R.id.mp02bb01802)
    RadioButton mp02bb01802;
    @BindView(R.id.mp02bb01803)
    RadioButton mp02bb01803;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_bb);
        ButterKnife.bind(this);

        //==================== Q1 Skip Pattern ====================

        mp02bb001.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02bb00101.isChecked()) {
                    fldGrpmp02bb002.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02bb002.setVisibility(View.GONE);
                    mp02bb002.clearCheck();

                }
            }
        });

        //==================== Q3 Skip Pattern ====================

        mp02bb003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02bb00301.isChecked()) {
                    fldGrpmp02bb004.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02bb004.setVisibility(View.GONE);
                    mp02bb004.clearCheck();

                }
            }
        });

        //==================== Q5 Skip Pattern ====================

        mp02bb005.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02bb00501.isChecked()) {
                    fldGrpmp02bb006.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02bb006.setVisibility(View.GONE);
                    mp02bb006.clearCheck();

                }
            }
        });

        //==================== Q7 Skip Pattern ====================

        mp02bb007.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02bb00701.isChecked()) {
                    fldGrpmp02bb008.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02bb008.setVisibility(View.GONE);
                    mp02bb008.clearCheck();

                }
            }
        });

        //==================== Q9 Skip Pattern ====================

        mp02bb009.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02bb00901.isChecked()) {
                    fldGrpmp02bb010.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02bb010.setVisibility(View.GONE);
                    mp02bb010.clearCheck();

                }
            }
        });

        //==================== Q11 Skip Pattern ====================

        mp02bb011.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02bb01101.isChecked()) {
                    fldGrpmp02bb012.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02bb012.setVisibility(View.GONE);
                    mp02bb012.clearCheck();

                }
            }
        });

        //==================== Q13 Skip Pattern ====================

        mp02bb013.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02bb01301.isChecked()) {
                    fldGrpmp02bb014.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02bb014.setVisibility(View.GONE);
                    mp02bb014.clearCheck();

                }
            }
        });

        //==================== Q15 Skip Pattern ====================

        mp02bb015.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02bb01501.isChecked()) {
                    fldGrpmp02bb016.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02bb016.setVisibility(View.GONE);
                    mp02bb016.clearCheck();

                }
            }
        });

        //==================== Q17 Skip Pattern ====================

        mp02bb017.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mp02bb01701.isChecked()) {
                    fldGrpmp02bb018.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmp02bb018.setVisibility(View.GONE);
                    mp02bb018.clearCheck();

                }
            }
        });

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
                Intent secc = new Intent(this, ParticipantListActivity.class);
                startActivity(secc);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
/*        MP02DBHelper db = new MP02DBHelper(this);

        int updcount = db.updateSA();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();*/
        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sbb = new JSONObject();

        sbb.put("mp02bb001", mp02bb00101.isChecked() ? "1" : mp02bb00102.isChecked() ? "2" : "0");
        sbb.put("mp02bb002", mp02bb00201.isChecked() ? "1" : mp02bb00202.isChecked() ? "2" : mp02bb00203.isChecked() ? "3" : "0");
        sbb.put("mp02bb003", mp02bb00301.isChecked() ? "1" : mp02bb00302.isChecked() ? "2" : "0");
        sbb.put("mp02bb004", mp02bb00401.isChecked() ? "1" : mp02bb00402.isChecked() ? "2" : mp02bb00403.isChecked() ? "3" : "0");
        sbb.put("mp02bb005", mp02bb00501.isChecked() ? "1" : mp02bb00502.isChecked() ? "2" : "0");
        sbb.put("mp02bb006", mp02bb00601.isChecked() ? "1" : mp02bb00602.isChecked() ? "2" : mp02bb00603.isChecked() ? "3" : "0");
        sbb.put("mp02bb007", mp02bb00701.isChecked() ? "1" : mp02bb00702.isChecked() ? "2" : "0");
        sbb.put("mp02bb008", mp02bb00801.isChecked() ? "1" : mp02bb00802.isChecked() ? "2" : mp02bb00803.isChecked() ? "3" : "0");
        sbb.put("mp02bb009", mp02bb00901.isChecked() ? "1" : mp02bb00902.isChecked() ? "2" : "0");
        sbb.put("mp02bb010", mp02bb01001.isChecked() ? "1" : mp02bb01002.isChecked() ? "2" : mp02bb01003.isChecked() ? "3" : "0");
        sbb.put("mp02bb011", mp02bb01101.isChecked() ? "1" : mp02bb01102.isChecked() ? "2" : "0");
        sbb.put("mp02bb012", mp02bb01201.isChecked() ? "1" : mp02bb01202.isChecked() ? "2" : mp02bb01203.isChecked() ? "3" : "0");
        sbb.put("mp02bb013", mp02bb01301.isChecked() ? "1" : mp02bb01302.isChecked() ? "2" : "0");
        sbb.put("mp02bb014", mp02bb01401.isChecked() ? "1" : mp02bb01402.isChecked() ? "2" : mp02bb01403.isChecked() ? "3" : "0");
        sbb.put("mp02bb015", mp02bb01501.isChecked() ? "1" : mp02bb01502.isChecked() ? "2" : "0");
        sbb.put("mp02bb016", mp02bb01601.isChecked() ? "1" : mp02bb01602.isChecked() ? "2" : mp02bb00403.isChecked() ? "3" : "0");
        sbb.put("mp02bb017", mp02bb01701.isChecked() ? "1" : mp02bb01702.isChecked() ? "2" : "0");
        sbb.put("mp02bb018", mp02bb01801.isChecked() ? "1" : mp02bb01802.isChecked() ? "2" : mp02bb01803.isChecked() ? "3" : "0");


        //MPApp.fc.setROW_Sbb(String.valueOf(sbb));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        //======================= Q 1 ===============
        if (mp02bb001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02bb001), Toast.LENGTH_SHORT).show();
            mp02bb00102.setError("This data is Required!");
            return false;
        } else {
            mp02bb00102.setError(null);
        }

        if (mp02bb00101.isChecked()) {
            if (mp02bb002.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02bb002), Toast.LENGTH_SHORT).show();
                mp02bb00203.setError("This data is Required!");
                return false;
            } else {
                mp02bb00203.setError(null);
            }
        }

        //======================= Q 3 ===============
        if (mp02bb003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02bb003), Toast.LENGTH_SHORT).show();
            mp02bb00302.setError("This data is Required!");
            return false;
        } else {
            mp02bb00302.setError(null);
        }

        if (mp02bb00301.isChecked()) {
            if (mp02bb004.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02bb004), Toast.LENGTH_SHORT).show();
                mp02bb00403.setError("This data is Required!");
                return false;
            } else {
                mp02bb00403.setError(null);
            }
        }


        //======================= Q 5 ===============
        if (mp02bb005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02bb005), Toast.LENGTH_SHORT).show();
            mp02bb00502.setError("This data is Required!");
            return false;
        } else {
            mp02bb00502.setError(null);
        }

        if (mp02bb00501.isChecked()) {
            if (mp02bb006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02bb006), Toast.LENGTH_SHORT).show();
                mp02bb00603.setError("This data is Required!");
                return false;
            } else {
                mp02bb00603.setError(null);
            }
        }

        //======================= Q 7 ===============
        if (mp02bb007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02bb007), Toast.LENGTH_SHORT).show();
            mp02bb00702.setError("This data is Required!");
            return false;
        } else {
            mp02bb00702.setError(null);
        }

        if (mp02bb00701.isChecked()) {
            if (mp02bb008.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02bb008), Toast.LENGTH_SHORT).show();
                mp02bb00803.setError("This data is Required!");
                return false;
            } else {
                mp02bb00803.setError(null);
            }
        }

        //======================= Q 9 ===============
        if (mp02bb009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02bb009), Toast.LENGTH_SHORT).show();
            mp02bb00902.setError("This data is Required!");
            return false;
        } else {
            mp02bb00902.setError(null);
        }

        if (mp02bb00901.isChecked()) {
            if (mp02bb010.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02bb010), Toast.LENGTH_SHORT).show();
                mp02bb01003.setError("This data is Required!");
                return false;
            } else {
                mp02bb01003.setError(null);
            }
        }

        //======================= Q 11 ===============
        if (mp02bb011.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02bb011), Toast.LENGTH_SHORT).show();
            mp02bb01102.setError("This data is Required!");
            return false;
        } else {
            mp02bb01102.setError(null);
        }

        if (mp02bb01101.isChecked()) {
            if (mp02bb012.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02bb012), Toast.LENGTH_SHORT).show();
                mp02bb01203.setError("This data is Required!");
                return false;
            } else {
                mp02bb01203.setError(null);
            }
        }

        //======================= Q 13 ===============
        if (mp02bb013.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02bb013), Toast.LENGTH_SHORT).show();
            mp02bb01302.setError("This data is Required!");
            return false;
        } else {
            mp02bb01302.setError(null);
        }

        if (mp02bb01301.isChecked()) {
            if (mp02bb014.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02bb014), Toast.LENGTH_SHORT).show();
                mp02bb01403.setError("This data is Required!");
                return false;
            } else {
                mp02bb01403.setError(null);
            }
        }

        //======================= Q 15 ===============
        if (mp02bb015.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02bb015), Toast.LENGTH_SHORT).show();
            mp02bb01502.setError("This data is Required!");
            return false;
        } else {
            mp02bb01502.setError(null);
        }

        if (mp02bb01501.isChecked()) {
            if (mp02bb016.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02bb016), Toast.LENGTH_SHORT).show();
                mp02bb01603.setError("This data is Required!");
                return false;
            } else {
                mp02bb01603.setError(null);
            }
        }

        //======================= Q 17 ===============
        if (mp02bb017.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02bb017), Toast.LENGTH_SHORT).show();
            mp02bb01702.setError("This data is Required!");
            return false;
        } else {
            mp02bb01702.setError(null);
        }

        if (mp02bb01701.isChecked()) {
            if (mp02bb018.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mp02bb018), Toast.LENGTH_SHORT).show();
                mp02bb01803.setError("This data is Required!");
                return false;
            } else {
                mp02bb01803.setError(null);
            }
        }


        return true;
    }




}
