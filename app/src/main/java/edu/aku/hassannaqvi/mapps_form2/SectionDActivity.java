package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

public class SectionDActivity extends Activity {

    @BindView(R.id.activity_section_d)
    RelativeLayout activitySectionD;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02d001)
    EditText mp02d001;
    @BindView(R.id.mp02d001id1)
    EditText mp02d001id1;
    @BindView(R.id.mp02d002)
    EditText mp02d002;
    @BindView(R.id.mp02d002id2)
    EditText mp02d002id2;
    @BindView(R.id.mp02d003)
    RadioGroup mp02d003;
    @BindView(R.id.mp02d00301)
    RadioButton mp02d00301;
    @BindView(R.id.mp02d00302)
    RadioButton mp02d00302;
    @BindView(R.id.mp02d004)
    EditText mp02d004;
    @BindView(R.id.mp02d004id3)
    EditText mp02d004id3;
    @BindView(R.id.mp02d005)
    EditText mp02d005;
    @BindView(R.id.mp02d005id1)
    EditText mp02d005id1;
    @BindView(R.id.mp02d006)
    EditText mp02d006;
    @BindView(R.id.mp02d006id1)
    EditText mp02d006id1;
    @BindView(R.id.mp02d007)
    RadioGroup mp02d007;
    @BindView(R.id.mp02d00701)
    RadioButton mp02d00701;
    @BindView(R.id.mp02d00702)
    RadioButton mp02d00702;
    @BindView(R.id.mp02d008)
    EditText mp02d008;
    @BindView(R.id.mp02d008id3)
    EditText mp02d008id3;
    @BindView(R.id.mp02d009)
    EditText mp02d009;
    @BindView(R.id.mp02d009id1)
    EditText mp02d009id1;
    @BindView(R.id.mp02d010)
    EditText mp02d010;
    @BindView(R.id.mp02d010id2)
    EditText mp02d010id2;
    @BindView(R.id.mp02d011)
    RadioGroup mp02d011;
    @BindView(R.id.mp02d01101)
    RadioButton mp02d01101;
    @BindView(R.id.mp02d01102)
    RadioButton mp02d01102;
    @BindView(R.id.mp02d012)
    EditText mp02d012;
    @BindView(R.id.mp02d012id3)
    EditText mp02d012id3;

    @BindView(R.id.fldGrpmp02d004)
    LinearLayout fldGrpmp02d004;
    @BindView(R.id.fldGrpmp02d008)
    LinearLayout fldGrpmp02d008;
    @BindView(R.id.fldGrpmp02d012)
    LinearLayout fldGrpmp02d012;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        ButterKnife.bind(this);

        mp02d00302.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    fldGrpmp02d004.setVisibility(View.GONE);
                    mp02d004.setText(null);
                    mp02d004id3.setText(null);
                } else {
                    fldGrpmp02d004.setVisibility(View.VISIBLE);
                }
            }
        });

        mp02d00702.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    fldGrpmp02d008.setVisibility(View.GONE);
                    mp02d008.setText(null);
                    mp02d008id3.setText(null);
                } else {
                    fldGrpmp02d008.setVisibility(View.VISIBLE);
                }
            }
        });

        mp02d01102.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    fldGrpmp02d012.setVisibility(View.GONE);
                    mp02d012.setText(null);
                    mp02d012id3.setText(null);
                } else {
                    fldGrpmp02d012.setVisibility(View.VISIBLE);
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
                Intent sece = new Intent(this, SectionEActivity.class);
                startActivity(sece);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public boolean ValidateForm() {

//        1
        if (mp02d001.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02d001), Toast.LENGTH_SHORT).show();
            mp02d001.setError("This data is Required!");
            return false;
        } else {
            mp02d001.setError(null);
        }
        if (mp02d001id1.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02d001), Toast.LENGTH_SHORT).show();
            mp02d001id1.setError("This data is Required!");
            return false;
        } else {
            mp02d001id1.setError(null);
        }

//        2
        if (mp02d002.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02d002), Toast.LENGTH_SHORT).show();
            mp02d002.setError("This data is Required!");
            return false;
        } else {
            mp02d002.setError(null);
        }
        if (mp02d002id2.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02d002), Toast.LENGTH_SHORT).show();
            mp02d002id2.setError("This data is Required!");
            return false;
        } else {
            mp02d002id2.setError(null);
        }

//        3
        if (mp02d003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02d003), Toast.LENGTH_SHORT).show();
            mp02d00302.setError("This data is Required!");
            return false;
        } else {
            mp02d00302.setError(null);
        }

//        Skip
        if (mp02d00301.isChecked()) {
//            4
            if (mp02d004.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02d004), Toast.LENGTH_SHORT).show();
                mp02d004.setError("This data is Required!");
                return false;
            } else {
                mp02d004.setError(null);
            }
            if (mp02d004id3.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02d004), Toast.LENGTH_SHORT).show();
                mp02d004id3.setError("This data is Required!");
                return false;
            } else {
                mp02d004id3.setError(null);
            }
        }

//        5
        if (mp02d005.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02d005), Toast.LENGTH_SHORT).show();
            mp02d005.setError("This data is Required!");
            return false;
        } else {
            mp02d005.setError(null);
        }
        if (mp02d005id1.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02d005), Toast.LENGTH_SHORT).show();
            mp02d005id1.setError("This data is Required!");
            return false;
        } else {
            mp02d005id1.setError(null);
        }

//        6
        if (mp02d006.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02d006), Toast.LENGTH_SHORT).show();
            mp02d006.setError("This data is Required!");
            return false;
        } else {
            mp02d006.setError(null);
        }
        if (mp02d006id1.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02d006), Toast.LENGTH_SHORT).show();
            mp02d006id1.setError("This data is Required!");
            return false;
        } else {
            mp02d006id1.setError(null);
        }

//        7
        if (mp02d007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02d007), Toast.LENGTH_SHORT).show();
            mp02d00702.setError("This data is Required!");
            return false;
        } else {
            mp02d00702.setError(null);
        }

//        Skip
        if (mp02d00701.isChecked()) {
//            8
            if (mp02d008.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02d008), Toast.LENGTH_SHORT).show();
                mp02d008.setError("This data is Required!");
                return false;
            } else {
                mp02d008.setError(null);
            }
            if (mp02d008id3.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02d008), Toast.LENGTH_SHORT).show();
                mp02d008id3.setError("This data is Required!");
                return false;
            } else {
                mp02d008id3.setError(null);
            }
        }

//        9
        if (mp02d009.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02d009), Toast.LENGTH_SHORT).show();
            mp02d009.setError("This data is Required!");
            return false;
        } else {
            mp02d009.setError(null);
        }
        if (mp02d009id1.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02d009), Toast.LENGTH_SHORT).show();
            mp02d009id1.setError("This data is Required!");
            return false;
        } else {
            mp02d009id1.setError(null);
        }

//        10
        if (mp02d010.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02d010), Toast.LENGTH_SHORT).show();
            mp02d010.setError("This data is Required!");
            return false;
        } else {
            mp02d010.setError(null);
        }
        if (mp02d010id2.getText().toString().isEmpty()) {
            Toast.makeText(this, "" + getString(R.string.mp02d010), Toast.LENGTH_SHORT).show();
            mp02d010id2.setError("This data is Required!");
            return false;
        } else {
            mp02d010id2.setError(null);
        }

//        11
        if (mp02d011.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp02d011), Toast.LENGTH_SHORT).show();
            mp02d01102.setError("This data is Required!");
            return false;
        } else {
            mp02d01102.setError(null);
        }

//        Skip
        if (mp02d01101.isChecked()) {
//            12
            if (mp02d012.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02d012), Toast.LENGTH_SHORT).show();
                mp02d012.setError("This data is Required!");
                return false;
            } else {
                mp02d012.setError(null);
            }
            if (mp02d012id3.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mp02d012), Toast.LENGTH_SHORT).show();
                mp02d012id3.setError("This data is Required!");
                return false;
            } else {
                mp02d012id3.setError(null);
            }
        }


        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sD = new JSONObject();

        sD.put("mp02d001", mp02d001.getText().toString());
        sD.put("mp02d001id1", mp02d001id1.getText().toString());

        sD.put("mp02d002", mp02d002.getText().toString());
        sD.put("mp02d002id2", mp02d002id2.getText().toString());

        sD.put("mp02d003", mp02d00301.isChecked() ? "1" : mp02d00302.isChecked() ? "2" : "0");

        sD.put("mp02d004", mp02d004.getText().toString());
        sD.put("mp02d004id3", mp02d004id3.getText().toString());

        sD.put("mp02d005", mp02d005.getText().toString());
        sD.put("mp02d005id1", mp02d005id1.getText().toString());

        sD.put("mp02d006", mp02d006.getText().toString());
        sD.put("mp02d006id1", mp02d006id1.getText().toString());

        sD.put("mp02d007", mp02d00701.isChecked() ? "1" : mp02d00702.isChecked() ? "2" : "0");

        sD.put("mp02d008", mp02d008.getText().toString());
        sD.put("mp02d008id3", mp02d008id3.getText().toString());

        sD.put("mp02d009", mp02d009.getText().toString());
        sD.put("mp02d009id1", mp02d009id1.getText().toString());

        sD.put("mp02d010", mp02d010.getText().toString());
        sD.put("mp02d010id1", mp02d010id2.getText().toString());

        sD.put("mp02d011", mp02d01101.isChecked() ? "1" : mp02d01102.isChecked() ? "2" : "0");

        sD.put("mp02d012", mp02d012.getText().toString());
        sD.put("mp02d012id3", mp02d012id3.getText().toString());

        //MPApp.fc.setROW_Sd(String.valueOf(sd));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

//        int updcount = db.updateSD();
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


}
