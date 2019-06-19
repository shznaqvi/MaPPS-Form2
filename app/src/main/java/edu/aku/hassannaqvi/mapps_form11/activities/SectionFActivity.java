package edu.aku.hassannaqvi.mapps_form11.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import edu.aku.hassannaqvi.mapps_form11.R;
import edu.aku.hassannaqvi.mapps_form11.core.AppMain;
import edu.aku.hassannaqvi.mapps_form11.databinding.ActivitySectionFBinding;
import edu.aku.hassannaqvi.mapps_form11.validation.ClearClass;
import edu.aku.hassannaqvi.mapps_form11.validation.ValidatorClass;


public class SectionFActivity extends AppCompatActivity {
    ActivitySectionFBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f);
        bi.setCallback(this);
        setupSkips();

    }


    public void BtnContinue() {
        if (validateField()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Intent c2 = new Intent(this, SectionGActivity.class);
            startActivity(c2);

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }


    public void BtnEnd() {
        finish();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);

    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("mp02f01", bi.mp02f01a.isChecked() ? "1"
                : bi.mp02f01b.isChecked() ? "2"
                : "0");

        json.put("mp02f02", bi.mp02f02a.isChecked() ? "1"
                : bi.mp02f02b.isChecked() ? "2"
                : "0");

        json.put("mp02f03", bi.mp02f03.getText().toString().trim().length() > 0 ? bi.mp02f03.getText().toString() : "0");

        json.put("mp02f04", bi.mp02f04a.isChecked() ? "1"
                : bi.mp02f04b.isChecked() ? "2"
                : "0");

        json.put("mp02f05", bi.mp02f05a.isChecked() ? "1"
                : bi.mp02f05b.isChecked() ? "2"
                : bi.mp02f05c.isChecked() ? "3"
                : bi.mp02f05d.isChecked() ? "4"
                : bi.mp02f05e.isChecked() ? "5"
                : bi.mp02f05f.isChecked() ? "6"
                : bi.mp02f05g.isChecked() ? "7"
                : bi.mp02f05h.isChecked() ? "8"
                : bi.mp02f05i.isChecked() ? "9"
                : bi.mp02f05j.isChecked() ? "10"
                : bi.mp02f0596.isChecked() ? "96"
                : "0");

        json.put("mp02f06", bi.mp02f06a.isChecked() ? "1"
                : bi.mp02f06b.isChecked() ? "2"
                : bi.mp02f06c.isChecked() ? "3"
                : bi.mp02f06d.isChecked() ? "4"
                : bi.mp02f06e.isChecked() ? "5"
                : bi.mp02f06f.isChecked() ? "6"
                : bi.mp02f06g.isChecked() ? "7"
                : bi.mp02f06h.isChecked() ? "8"
                : bi.mp02f0696.isChecked() ? "96"
                : "0");

        json.put("mp02f07", bi.mp02f07a.isChecked() ? "1"
                : bi.mp02f07b.isChecked() ? "2"
                : bi.mp02f0798.isChecked() ? "98"
                : "0");

        json.put("mp02f08", bi.mp02f08a.isChecked() ? "1"
                : bi.mp02f08b.isChecked() ? "2"
                : bi.mp02f08c.isChecked() ? "3"
                : bi.mp02f08d.isChecked() ? "4"
                : bi.mp02f08e.isChecked() ? "5"
                : bi.mp02f08f.isChecked() ? "6"
                : bi.mp02f08g.isChecked() ? "7"
                : bi.mp02f08h.isChecked() ? "8"
                : bi.mp02f0896.isChecked() ? "96"
                : "0");

        AppMain.fc.setsCFC(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


    private void setupSkips() {

        bi.mp02f01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bi.mp02f01a.getId()) {
                    bi.mp02f02cv.setVisibility(View.VISIBLE);
                    bi.mp02f03cv.setVisibility(View.VISIBLE);
                    bi.mp02f04cv.setVisibility(View.VISIBLE);
                    bi.mp02f05cv.setVisibility(View.VISIBLE);
                    bi.mp02f06cv.setVisibility(View.VISIBLE);
                    bi.mp02f07cv.setVisibility(View.VISIBLE);
                    bi.mp02f08cv.setVisibility(View.VISIBLE);
                } else {
                    ClearClass.ClearAllC(bi.mp02f02cv);
                    ClearClass.ClearAllC(bi.mp02f03cv);
                    ClearClass.ClearAllC(bi.mp02f04cv);
                    ClearClass.ClearAllC(bi.mp02f05cv);
                    ClearClass.ClearAllC(bi.mp02f06cv);
                    ClearClass.ClearAllC(bi.mp02f07cv);
                    ClearClass.ClearAllC(bi.mp02f08cv);
                    bi.mp02f02cv.setVisibility(View.GONE);
                    bi.mp02f03cv.setVisibility(View.GONE);
                    bi.mp02f04cv.setVisibility(View.GONE);
                    bi.mp02f05cv.setVisibility(View.GONE);
                    bi.mp02f06cv.setVisibility(View.GONE);
                    bi.mp02f07cv.setVisibility(View.GONE);
                    bi.mp02f08cv.setVisibility(View.GONE);
                }

            }

        });


        bi.mp02f02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bi.mp02f02a.getId()) {
                    bi.mp02f03cv.setVisibility(View.VISIBLE);
                } else {
                    ClearClass.ClearAllC(bi.mp02f03cv);
                    bi.mp02f03cv.setVisibility(View.GONE);
                }

            }

        });


        bi.mp02f04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bi.mp02f04a.getId()) {
                    bi.mp02f05cv.setVisibility(View.VISIBLE);
                    bi.mp02f06cv.setVisibility(View.VISIBLE);
                } else {
                    ClearClass.ClearAllC(bi.mp02f05cv);
                    ClearClass.ClearAllC(bi.mp02f06cv);
                    bi.mp02f05cv.setVisibility(View.GONE);
                    bi.mp02f06cv.setVisibility(View.GONE);
                }

            }

        });


        bi.mp02f07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bi.mp02f07a.getId()) {
                    bi.mp02f08cv.setVisibility(View.VISIBLE);
                } else {
                    ClearClass.ClearAllC(bi.mp02f08cv);
                    bi.mp02f08cv.setVisibility(View.GONE);
                }

            }

        });

    }


    public boolean validateField() {
        /*if (!ValidatorClass.EmptyCheckingContainer(this, bi.llmp02f))
        return false;*/

        //return ValidatorClass.EmptyCheckingContainer(this, bi.llmp02f) != false;

        return ValidatorClass.EmptyCheckingContainer(this, bi.llmp02f);
    }

}
