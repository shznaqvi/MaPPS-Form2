package edu.aku.hassannaqvi.mapps_form11.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
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

public class SectionCDActivity extends Activity {

    private static final String TAG = SectionCDActivity.class.getSimpleName();

    @BindView(R.id.activity_section_ce)
    RelativeLayout activitySectionCe;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02ce00101)
    CheckBox mp02ce00101;
    @BindView(R.id.mp02ce00102)
    CheckBox mp02ce00102;
    @BindView(R.id.mp02ce00103)
    CheckBox mp02ce00103;
    @BindView(R.id.mp02ce00104)
    CheckBox mp02ce00104;
    @BindView(R.id.mp02ce00177)
    CheckBox mp02ce00177;
    @BindView(R.id.mp02ce00106)
    CheckBox mp02ce00106;
    @BindView(R.id.mp02ce00188)
    CheckBox mp02ce00188;
    @BindView(R.id.mp02ce00188x)
    EditText mp02ce00188x;
    @BindView(R.id.mp02ce00201)
    CheckBox mp02ce00201;
    @BindView(R.id.mp02ce00202)
    CheckBox mp02ce00202;
    @BindView(R.id.mp02ce00203)
    CheckBox mp02ce00203;
    @BindView(R.id.mp02ce00204)
    CheckBox mp02ce00204;
    @BindView(R.id.mp02ce00277)
    CheckBox mp02ce00277;
    @BindView(R.id.mp02ce00206)
    CheckBox mp02ce00206;
    @BindView(R.id.mp02ce00288)
    CheckBox mp02ce00288;
    @BindView(R.id.mp02ce00288x)
    EditText mp02ce00288x;
    @BindView(R.id.mp02ce00301)
    CheckBox mp02ce00301;
    @BindView(R.id.mp02ce00302)
    CheckBox mp02ce00302;
    @BindView(R.id.mp02ce00303)
    CheckBox mp02ce00303;
    @BindView(R.id.mp02ce00304)
    CheckBox mp02ce00304;
    @BindView(R.id.mp02ce00377)
    CheckBox mp02ce00377;
    @BindView(R.id.mp02ce00306)
    CheckBox mp02ce00306;
    @BindView(R.id.mp02ce00388)
    CheckBox mp02ce00388;
    @BindView(R.id.mp02ce00388x)
    EditText mp02ce00388x;
    @BindView(R.id.mp02ce00401)
    CheckBox mp02ce00401;
    @BindView(R.id.mp02ce00402)
    CheckBox mp02ce00402;
    @BindView(R.id.mp02ce00403)
    CheckBox mp02ce00403;
    @BindView(R.id.mp02ce00404)
    CheckBox mp02ce00404;
    @BindView(R.id.mp02ce00477)
    CheckBox mp02ce00477;
    @BindView(R.id.mp02ce00406)
    CheckBox mp02ce00406;
    @BindView(R.id.mp02ce00488)
    CheckBox mp02ce00488;
    @BindView(R.id.mp02ce00488x)
    EditText mp02ce00488x;
    @BindView(R.id.mp02ce00501)
    CheckBox mp02ce00501;
    @BindView(R.id.mp02ce00502)
    CheckBox mp02ce00502;
    @BindView(R.id.mp02ce00503)
    CheckBox mp02ce00503;
    @BindView(R.id.mp02ce00504)
    CheckBox mp02ce00504;
    @BindView(R.id.mp02ce00577)
    CheckBox mp02ce00577;
    @BindView(R.id.mp02ce00506)
    CheckBox mp02ce00506;
    @BindView(R.id.mp02ce00588)
    CheckBox mp02ce00588;
    @BindView(R.id.mp02ce00588x)
    EditText mp02ce00588x;
    @BindView(R.id.mp02ce00601)
    CheckBox mp02ce00601;
    @BindView(R.id.mp02ce00602)
    CheckBox mp02ce00602;
    @BindView(R.id.mp02ce00603)
    CheckBox mp02ce00603;
    @BindView(R.id.mp02ce00604)
    CheckBox mp02ce00604;
    @BindView(R.id.mp02ce00677)
    CheckBox mp02ce00677;
    @BindView(R.id.mp02ce00606)
    CheckBox mp02ce00606;
    @BindView(R.id.mp02ce00688)
    CheckBox mp02ce00688;
    @BindView(R.id.mp02ce00688x)
    EditText mp02ce00688x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cd);
        ButterKnife.bind(this);


        mp02ce00188.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ce00188x.setVisibility(View.VISIBLE);
                }else {
                    mp02ce00188x.setVisibility(View.GONE);
                    mp02ce00188x.setText(null);
                }
            }
        });

        mp02ce00288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ce00288x.setVisibility(View.VISIBLE);
                }else {
                    mp02ce00288x.setVisibility(View.GONE);
                    mp02ce00288x.setText(null);
                }
            }
        });

        mp02ce00388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ce00388x.setVisibility(View.VISIBLE);
                }else {
                    mp02ce00388x.setVisibility(View.GONE);
                    mp02ce00388x.setText(null);
                }
            }
        });

        mp02ce00488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ce00488x.setVisibility(View.VISIBLE);
                }else {
                    mp02ce00488x.setVisibility(View.GONE);
                    mp02ce00488x.setText(null);
                }
            }
        });

        mp02ce00588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ce00588x.setVisibility(View.VISIBLE);
                }else {
                    mp02ce00588x.setVisibility(View.GONE);
                    mp02ce00588x.setText(null);
                }
            }
        });

        mp02ce00688.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mp02ce00688x.setVisibility(View.VISIBLE);
                }else {
                    mp02ce00688x.setVisibility(View.GONE);
                    mp02ce00688x.setText(null);
                }
            }
        });

        if (AppMain.maritalStatus == 5) {
            mp02ce00103.setEnabled(false);
            mp02ce00103.setChecked(false);
            mp02ce00104.setEnabled(false);
            mp02ce00104.setChecked(false);
            mp02ce00203.setEnabled(false);
            mp02ce00203.setChecked(false);
            mp02ce00204.setEnabled(false);
            mp02ce00204.setChecked(false);
            mp02ce00303.setEnabled(false);
            mp02ce00303.setChecked(false);
            mp02ce00304.setEnabled(false);
            mp02ce00304.setChecked(false);
            mp02ce00403.setEnabled(false);
            mp02ce00403.setChecked(false);
            mp02ce00404.setEnabled(false);
            mp02ce00404.setChecked(false);
            mp02ce00503.setEnabled(false);
            mp02ce00503.setChecked(false);
            mp02ce00504.setEnabled(false);
            mp02ce00504.setChecked(false);
            mp02ce00603.setEnabled(false);
            mp02ce00603.setChecked(false);
            mp02ce00604.setEnabled(false);
            mp02ce00604.setChecked(false);


        } else {
            mp02ce00103.setEnabled(true);
            mp02ce00104.setEnabled(true);
            mp02ce00203.setEnabled(true);
            mp02ce00204.setEnabled(true);
            mp02ce00303.setEnabled(true);
            mp02ce00304.setEnabled(true);
            mp02ce00403.setEnabled(true);
            mp02ce00404.setEnabled(true);
            mp02ce00503.setEnabled(true);
            mp02ce00504.setEnabled(true);
            mp02ce00603.setEnabled(true);
            mp02ce00604.setEnabled(true);
        }
    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {


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


        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {


                finish();

                Intent seccf = new Intent(this, SectionCEActivity.class);
                startActivity(seccf);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void SaveDraft() throws JSONException {


        JSONObject sCE = new JSONObject();


        sCE.put("mp03q096a", mp02ce00101.isChecked() ? "1" : "0");
        sCE.put("mp03q096b", mp02ce00102.isChecked() ? "2" : "0");
        sCE.put("mp03q096c", mp02ce00103.isChecked() ? "3" : "0");
        sCE.put("mp03q096d", mp02ce00104.isChecked() ? "4" : "0");
        sCE.put("mp03q09677", mp02ce00177.isChecked() ? "77" : "0");
        sCE.put("mp03q096f", mp02ce00106.isChecked() ? "6" : "0");
        sCE.put("mp03q09688", mp02ce00188.isChecked() ? "88" : "0");
        sCE.put("mp03q09688x", mp02ce00188x.getText().toString());

        sCE.put("mp03q097a", mp02ce00201.isChecked() ? "1" : "0");
        sCE.put("mp03q097b", mp02ce00202.isChecked() ? "2" : "0");
        sCE.put("mp03q097c", mp02ce00203.isChecked() ? "3" : "0");
        sCE.put("mp03q097d", mp02ce00204.isChecked() ? "4" : "0");
        sCE.put("mp03q09777", mp02ce00277.isChecked() ? "77" : "0");
        sCE.put("mp03q097f", mp02ce00206.isChecked() ? "6" : "0");
        sCE.put("mp03q09788", mp02ce00288.isChecked() ? "88" : "0");
        sCE.put("mp03q09788x", mp02ce00288x.getText().toString());

        sCE.put("mp03q098a", mp02ce00301.isChecked() ? "1" : "0");
        sCE.put("mp03q098b", mp02ce00302.isChecked() ? "2" : "0");
        sCE.put("mp03q098c", mp02ce00303.isChecked() ? "3" : "0");
        sCE.put("mp03q098d", mp02ce00304.isChecked() ? "4" : "0");
        sCE.put("mp03q09877", mp02ce00377.isChecked() ? "77" : "0");
        sCE.put("mp03q098f", mp02ce00306.isChecked() ? "6" : "0");
        sCE.put("mp03q09888", mp02ce00388.isChecked() ? "88" : "0");
        sCE.put("mp03q09888x", mp02ce00388x.getText().toString());

        sCE.put("mp03q099a", mp02ce00401.isChecked() ? "1" : "0");
        sCE.put("mp03q099b", mp02ce00402.isChecked() ? "2" : "0");
        sCE.put("mp03q099c", mp02ce00403.isChecked() ? "3" : "0");
        sCE.put("mp03q099d", mp02ce00404.isChecked() ? "4" : "0");
        sCE.put("mp03q09977", mp02ce00477.isChecked() ? "77" : "0");
        sCE.put("mp03q099f", mp02ce00406.isChecked() ? "6" : "0");
        sCE.put("mp03q09988", mp02ce00488.isChecked() ? "88" : "0");
        sCE.put("mp03q09988x", mp02ce00488x.getText().toString());

        sCE.put("mp03q100a", mp02ce00501.isChecked() ? "1" : "0");
        sCE.put("mp03q100b", mp02ce00502.isChecked() ? "2" : "0");
        sCE.put("mp03q100c", mp02ce00503.isChecked() ? "3" : "0");
        sCE.put("mp03q100d", mp02ce00504.isChecked() ? "4" : "0");
        sCE.put("mp03q10077", mp02ce00577.isChecked() ? "77" : "0");
        sCE.put("mp03q100f", mp02ce00506.isChecked() ? "6" : "0");
        sCE.put("mp03q10088", mp02ce00588.isChecked() ? "88" : "0");
        sCE.put("mp03q10088x", mp02ce00588x.getText().toString());

        sCE.put("mp03q101a", mp02ce00601.isChecked() ? "1" : "0");
        sCE.put("mp03q101b", mp02ce00602.isChecked() ? "2" : "0");
        sCE.put("mp03q101c", mp02ce00603.isChecked() ? "3" : "0");
        sCE.put("mp03q101d", mp02ce00604.isChecked() ? "4" : "0");
        sCE.put("mp03q10177", mp02ce00677.isChecked() ? "77" : "0");
        sCE.put("mp03q101f", mp02ce00606.isChecked() ? "6" : "0");
        sCE.put("mp03q10188", mp02ce00688.isChecked() ? "88" : "0");
        sCE.put("mp03q10188x", mp02ce00688x.getText().toString());

        AppMain.fc.setsCD(String.valueOf(sCE));


    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateCD();

        if (updcount == 1) {

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public boolean ValidateForm() {

//      1
        if (!(mp02ce00101.isChecked() || mp02ce00102.isChecked() || mp02ce00103.isChecked() || mp02ce00104.isChecked()
                || mp02ce00177.isChecked() || mp02ce00106.isChecked() || mp02ce00188.isChecked()
        )) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ce001), Toast.LENGTH_LONG).show();
            mp02ce00188.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02ce001: This data is Required!");
            return false;
        } else {
            mp02ce00188.setError(null);
        }

        if (mp02ce00188.isChecked() && mp02ce00188x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ce001), Toast.LENGTH_SHORT).show();
            mp02ce00188x.setError("This data is Required!");

            Log.i(TAG, "mp02ce00188x: This data is Required!");
            return false;
        } else {
            mp02ce00388x.setError(null);
        }

//      2
        if (!(mp02ce00201.isChecked() || mp02ce00202.isChecked() || mp02ce00203.isChecked() || mp02ce00204.isChecked()
                || mp02ce00277.isChecked() || mp02ce00206.isChecked() || mp02ce00288.isChecked()
        )) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ce002), Toast.LENGTH_LONG).show();
            mp02ce00288.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02ce002: This data is Required!");
            return false;
        } else {
            mp02ce00288.setError(null);
        }

        if (mp02ce00288.isChecked() && mp02ce00288x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ce002), Toast.LENGTH_SHORT).show();
            mp02ce00288x.setError("This data is Required!");

            Log.i(TAG, "mp02ce00288x: This data is Required!");
            return false;
        } else {
            mp02ce00288x.setError(null);
        }

//      3
        if (!(mp02ce00301.isChecked() || mp02ce00302.isChecked() || mp02ce00303.isChecked() || mp02ce00304.isChecked()
                || mp02ce00377.isChecked() || mp02ce00306.isChecked() || mp02ce00388.isChecked()
        )) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ce003), Toast.LENGTH_LONG).show();
            mp02ce00388.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02ce003: This data is Required!");
            return false;
        } else {
            mp02ce00388.setError(null);
        }

        if (mp02ce00388.isChecked() && mp02ce00388x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ce003), Toast.LENGTH_SHORT).show();
            mp02ce00388x.setError("This data is Required!");

            Log.i(TAG, "mp02ce00388x: This data is Required!");
            return false;
        } else {
            mp02ce00388x.setError(null);
        }

//      4
        if (!(mp02ce00401.isChecked() || mp02ce00402.isChecked() || mp02ce00403.isChecked() || mp02ce00404.isChecked()
                || mp02ce00477.isChecked() || mp02ce00406.isChecked() || mp02ce00488.isChecked()
        )) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ce004), Toast.LENGTH_LONG).show();
            mp02ce00488.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02ce004: This data is Required!");
            return false;
        } else {
            mp02ce00488.setError(null);
        }

        if (mp02ce00488.isChecked() && mp02ce00488x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ce004), Toast.LENGTH_SHORT).show();
            mp02ce00488x.setError("This data is Required!");

            Log.i(TAG, "mp02ce00488x: This data is Required!");
            return false;
        } else {
            mp02ce00488x.setError(null);
        }

//      5
        if (!(mp02ce00501.isChecked() || mp02ce00502.isChecked() || mp02ce00503.isChecked() || mp02ce00504.isChecked()
                || mp02ce00577.isChecked() || mp02ce00506.isChecked() || mp02ce00588.isChecked()
        )) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ce005), Toast.LENGTH_LONG).show();
            mp02ce00588.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02ce005: This data is Required!");
            return false;
        } else {
            mp02ce00588.setError(null);
        }

        if (mp02ce00588.isChecked() && mp02ce00588x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ce005), Toast.LENGTH_SHORT).show();
            mp02ce00588x.setError("This data is Required!");

            Log.i(TAG, "mp02ce00588x: This data is Required!");
            return false;
        } else {
            mp02ce00588x.setError(null);
        }

//      6
        if (!(mp02ce00601.isChecked() || mp02ce00602.isChecked() || mp02ce00603.isChecked() || mp02ce00604.isChecked()
                || mp02ce00677.isChecked() || mp02ce00606.isChecked() || mp02ce00688.isChecked()
        )) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02ce006), Toast.LENGTH_LONG).show();
            mp02ce00688.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mp02ce006: This data is Required!");
            return false;
        } else {
            mp02ce00688.setError(null);
        }

        if (mp02ce00688.isChecked() && mp02ce00688x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02ce006), Toast.LENGTH_SHORT).show();
            mp02ce00688x.setError("This data is Required!");

            Log.i(TAG, "mp02ce00688x: This data is Required!");
            return false;
        } else {
            mp02ce00688x.setError(null);
        }


        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
