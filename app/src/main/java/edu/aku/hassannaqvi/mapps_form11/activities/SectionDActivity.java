package edu.aku.hassannaqvi.mapps_form11.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import edu.aku.hassannaqvi.mapps_form11.R;
import edu.aku.hassannaqvi.mapps_form11.core.AppMain;
import edu.aku.hassannaqvi.mapps_form11.core.DatabaseHelper;

public class SectionDActivity extends Activity {


    private static final String TAG = SectionDActivity.class.getSimpleName();

    @BindView(R.id.activity_section_e)
    RelativeLayout activitySectionE;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02e001)
    EditText mp02e001;
    @BindView(R.id.mp02e002)
    RadioGroup mp02e002;
    @BindView(R.id.mp02e00201)
    RadioButton mp02e00201;
    @BindView(R.id.mp02e00202)
    RadioButton mp02e00202;
    /*@BindView(R.id.mp02e00301)
    CheckBox mp02e00301;
    @BindView(R.id.mp02e00302)
    CheckBox mp02e00302;
    @BindView(R.id.mp02e00303)
    CheckBox mp02e00303;
    @BindView(R.id.mp02e00304)
    CheckBox mp02e00304;
    @BindView(R.id.mp02e00305)
    CheckBox mp02e00305;
    @BindView(R.id.mp02e00388)
    CheckBox mp02e00388;
    @BindView(R.id.mp02e00388x)
    EditText mp02e00388x;
    @BindView(R.id.fldGrpmp02e004)
    LinearLayout fldGrpmp02e004;
    @BindView(R.id.mp02e00401)
    CheckBox mp02e00401;
    @BindView(R.id.mp02e00402)
    CheckBox mp02e00402;
    @BindView(R.id.mp02e00402x)
    EditText mp02e00402x;
    @BindView(R.id.mp02e00488)
    CheckBox mp02e00488;
    @BindView(R.id.mp02e00488x)
    EditText mp02e00488x;
    @BindView(R.id.mp02e00301x)
    EditText mp02e00301x;

*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        ButterKnife.bind(this);

        //DecimalFormat df = new DecimalFormat("##.#");

        //mp02e001.setText(df.format(mp02e001.getText().toString()));

        /*mp02e00388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02e00388x.setVisibility(View.VISIBLE);
                } else {
                    mp02e00388x.setVisibility(View.GONE);
                    mp02e00388x.setText(null);
                }
            }
        });

        mp02e00402.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02e00402x.setVisibility(View.VISIBLE);
                } else {
                    mp02e00402x.setVisibility(View.GONE);
                    mp02e00402x.setText(null);
                }
            }
        });

        mp02e00488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02e00488x.setVisibility(View.VISIBLE);
                } else {
                    mp02e00488x.setVisibility(View.GONE);
                    mp02e00488x.setText(null);
                }
            }
        });


        mp02e00305.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02e00301.setEnabled(false);
                    mp02e00301.setChecked(false);
                    mp02e00302.setEnabled(false);
                    mp02e00302.setChecked(false);
                    mp02e00303.setEnabled(false);
                    mp02e00303.setChecked(false);
                    mp02e00304.setEnabled(false);
                    mp02e00304.setChecked(false);
                    mp02e00388.setEnabled(false);
                    mp02e00388.setChecked(false);
                    mp02e00388x.setText(null);
                    fldGrpmp02e004.setVisibility(View.GONE);
                    mp02e00401.setChecked(false);
                    mp02e00402.setChecked(false);
                    mp02e00402x.setText(null);
                    mp02e00488.setChecked(false);
                    mp02e00488x.setText(null);
                } else {
                    fldGrpmp02e004.setVisibility(View.VISIBLE);
                    mp02e00301.setEnabled(true);
                    mp02e00302.setEnabled(true);
                    mp02e00303.setEnabled(true);
                    mp02e00304.setEnabled(true);
                    mp02e00388.setEnabled(true);
                }
            }
        });

        mp02e00301.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mp02e00301x.setVisibility(View.VISIBLE);
                } else {
                    mp02e00301x.setVisibility(View.GONE);
                    mp02e00301x.setText(null);
                }
            }
        });*/




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
    void onBtnContineClick() {
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();
                Intent end = new Intent(this, SectionEActivity.class);
                end.putExtra("complete", true);
                startActivity(end);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }


    }

    public boolean ValidateForm() {

//        1
        if (mp02e001.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mp02e001), Toast.LENGTH_SHORT).show();
            mp02e001.setError("This data is Required!");

            Log.i(TAG, "mp02e001: This Data is Required!");


            return false;
        } else {
            mp02e001.setError(null);
        }
        if ((Double.parseDouble(mp02e001.getText().toString().isEmpty() ? "0" : mp02e001.getText().toString()) < 4)
                || Double.parseDouble(mp02e001.getText().toString()) > 20.0) {
            Toast.makeText(this, "Range:" + getString(R.string.mp02e001), Toast.LENGTH_SHORT).show();
            mp02e001.setError("Range: 4.0 to 20.0 ");

            Log.i(TAG, "mp02e001: Range: 4.0 to 20.0!");
            return false;
        } else {
            mp02e001.setError(null);
        }

        if (!mp02e001.getText().toString().contains(".")) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d002), Toast.LENGTH_SHORT).show();
            mp02e001.setError("Invalid: Decimal value is Required!");
            Log.i(TAG, "mp02e001: Invalid Decimal value is Required!");
            return false;
        } else {
            mp02e001.setError(null);
        }


//        2
        if (mp02e002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02e002), Toast.LENGTH_SHORT).show();
            mp02e00202.setError("This data is Required!");

            Log.i(TAG, "mp02e002: This Data is Required!");
            return false;
        } else {
            mp02e00202.setError(null);
        }

        /*if (!(mp02e00301.isChecked() || mp02e00302.isChecked() || mp02e00303.isChecked() || mp02e00304.isChecked()
                || mp02e00305.isChecked() || mp02e00388.isChecked())) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02e003), Toast.LENGTH_SHORT).show();
            mp02e00388.setError("This data is Required!");

            Log.i(TAG, "mp02e004: This Data is Required!");
            return false;
        } else {
            mp02e00388.setError(null);
        }

        if (mp02e00301.isChecked() && mp02e00301x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02e003), Toast.LENGTH_SHORT).show();
            mp02e00301x.setError("This data is Required!");

            Log.i(TAG, "mp02e00301x: This Data is Required!");
            return false;
        } else {
            mp02e00301x.setError(null);
        }

        if (mp02e00388.isChecked() && mp02e00388x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02e003) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            mp02e00388x.setError("This data is Required!");

            Log.i(TAG, "mp02e00388x: This data is Required!");
            return false;
        } else {
            mp02e00388x.setError(null);
        }

        if (!mp02e00305.isChecked()) {
            if (!(mp02e00401.isChecked() || mp02e00402.isChecked() || mp02e00488.isChecked())) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02e004), Toast.LENGTH_SHORT).show();
                mp02e00488.setError("This data is Required!");

                Log.i(TAG, "mp02e004: This Data is Required!");
                return false;
            } else {
                mp02e00488.setError(null);
            }

            if (mp02e00402.isChecked() && mp02e00402x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02e00403), Toast.LENGTH_SHORT).show();
                mp02e00402x.setError("This data is Required!");

                Log.i(TAG, "mp02e00402x: This data is Required!");
                return false;
            } else {
                mp02e00402x.setError(null);
            }

            if (mp02e00488.isChecked() && mp02e00488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.mp02e004) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                mp02e00488x.setError("This data is Required!");

                Log.i(TAG, "mp02e00488x: This data is Required!");
                return false;
            } else {
                mp02e00488x.setError(null);
            }

        }
*/


        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sE = new JSONObject();

        sE.put("mp03q160", mp02e001.getText().toString());

        sE.put("mp03q161", mp02e00201.isChecked() ? "1" : mp02e00202.isChecked() ? "2" : "0");

        /*sE.put("mp02e00301", mp02e00301.isChecked() ? "1" : "0");
        sE.put("mp02e00302", mp02e00302.isChecked() ? "2" : "0");
        sE.put("mp02e00303", mp02e00303.isChecked() ? "3" : "0");
        sE.put("mp02e00304", mp02e00304.isChecked() ? "4" : "0");
        sE.put("mp02e00305", mp02e00305.isChecked() ? "5" : "0");
        sE.put("mp02e00388", mp02e00388.isChecked() ? "88" : "0");
        sE.put("mp02e00301x", mp02e00301x.getText().toString());
        sE.put("mp02e00388x", mp02e00388x.getText().toString());

        sE.put("mp02e00401", mp02e00401.isChecked() ? "1" : "0");
        sE.put("mp02e00402", mp02e00402.isChecked() ? "2" : "0");
        sE.put("mp02e00488", mp02e00488.isChecked() ? "88" : "0");
        sE.put("mp02e00488x", mp02e00488x.getText().toString());
        sE.put("mp02e00402x", mp02e00402x.getText().toString());*/

        AppMain.fc.setsD(String.valueOf(sE));


    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateD();

        if (updcount == 1) {

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
