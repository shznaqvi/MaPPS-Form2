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
import edu.aku.hassannaqvi.mapps_form11.databinding.ActivitySectionGBinding;
import edu.aku.hassannaqvi.mapps_form11.validation.ValidatorClass;

public class SectionGActivity extends AppCompatActivity {
    ActivitySectionGBinding bi;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g);
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

            Intent c2 = new Intent(this, MainActivity.class);
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

        json.put("mp02g01a", bi.mp02g0197.isChecked() ? "97" : bi.mp02g01a.getText().toString());
        json.put("mp02g01b", bi.mp02g0197.isChecked() ? "97" : bi.mp02g01b.getText().toString());

        json.put("mp02g02", bi.mp02g02a.isChecked() ? "1"
                : bi.mp02g02b.isChecked() ? "2"
                : bi.mp02g02c.isChecked() ? "3"
                : bi.mp02g02d.isChecked() ? "4"
                : bi.mp02g02e.isChecked() ? "5"
                : bi.mp02g0296.isChecked() ? "96"
                : "0");
        json.put("mp02g0296x", bi.mp02g0296x.getText().toString().trim().length() > 0 ? bi.mp02g0296x.getText().toString() : "0");

        json.put("mp02g03", bi.mp02g03a.isChecked() ? "1"
                : bi.mp02g03b.isChecked() ? "2"
                : bi.mp02g03c.isChecked() ? "3"
                : bi.mp02g03d.isChecked() ? "4"
                : bi.mp02g03e.isChecked() ? "5"
                : bi.mp02g03f.isChecked() ? "6"
                : bi.mp02g03g.isChecked() ? "7"
                : bi.mp02g03h.isChecked() ? "8"
                : bi.mp02g0396.isChecked() ? "96"
                : "0");
        json.put("mp02g0396x", bi.mp02g0396x.getText().toString().trim().length() > 0 ? bi.mp02g0396x.getText().toString() : "0");

        json.put("mp02g04", bi.mp02g04a.isChecked() ? "1"
                : bi.mp02g04b.isChecked() ? "2"
                : bi.mp02g04c.isChecked() ? "3"
                : bi.mp02g0497.isChecked() ? "97"
                : "0");

        json.put("mp02g05", bi.mp02g05a.isChecked() ? "1"
                : bi.mp02g05b.isChecked() ? "2"
                : "0");

        json.put("mp02g06", bi.mp02g06a.isChecked() ? "1"
                : bi.mp02g06b.isChecked() ? "2"
                : bi.mp02g06c.isChecked() ? "3"
                : bi.mp02g06d.isChecked() ? "4"
                : "0");

        AppMain.fc.setsCFC(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


    private void setupSkips() {

        bi.A4206.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bi.A4206b.getId()) {
                    bi.A42061cv.setVisibility(View.VISIBLE);
                    bi.A42062cv.setVisibility(View.VISIBLE);
                    bi.A42063cv.setVisibility(View.VISIBLE);
                    bi.A42064cv.setVisibility(View.VISIBLE);
                    bi.A42065cv.setVisibility(View.VISIBLE);
                    bi.A42066cv.setVisibility(View.VISIBLE);
                    bi.A42067cv.setVisibility(View.VISIBLE);
                    bi.A42068cv.setVisibility(View.VISIBLE);
                    bi.A42069cv.setVisibility(View.VISIBLE);
                    bi.A420610cv.setVisibility(View.VISIBLE);
                    bi.A420611cv.setVisibility(View.VISIBLE);
                    bi.A420612cv.setVisibility(View.VISIBLE);
                    bi.A420613cv.setVisibility(View.VISIBLE);
                    bi.A420614cv.setVisibility(View.VISIBLE);
                    bi.A420615cv.setVisibility(View.VISIBLE);
                    bi.A420616cv.setVisibility(View.VISIBLE);
                    bi.A420617cv.setVisibility(View.VISIBLE);
                    bi.A420618cv.setVisibility(View.VISIBLE);
                    bi.A420619cv.setVisibility(View.VISIBLE);
                    bi.A420620cv.setVisibility(View.VISIBLE);
                    bi.A420621cv.setVisibility(View.VISIBLE);
                    bi.A420622cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bi.A42061cv);
                    ClearAllcontrol.ClearAllC(bi.A42062cv);
                    ClearAllcontrol.ClearAllC(bi.A42063cv);
                    ClearAllcontrol.ClearAllC(bi.A42064cv);
                    ClearAllcontrol.ClearAllC(bi.A42065cv);
                    ClearAllcontrol.ClearAllC(bi.A42066cv);
                    ClearAllcontrol.ClearAllC(bi.A42067cv);
                    ClearAllcontrol.ClearAllC(bi.A42068cv);
                    ClearAllcontrol.ClearAllC(bi.A42069cv);
                    ClearAllcontrol.ClearAllC(bi.A420610cv);
                    ClearAllcontrol.ClearAllC(bi.A420611cv);
                    ClearAllcontrol.ClearAllC(bi.A420612cv);
                    ClearAllcontrol.ClearAllC(bi.A420613cv);
                    ClearAllcontrol.ClearAllC(bi.A420614cv);
                    ClearAllcontrol.ClearAllC(bi.A420615cv);
                    ClearAllcontrol.ClearAllC(bi.A420616cv);
                    ClearAllcontrol.ClearAllC(bi.A420617cv);
                    ClearAllcontrol.ClearAllC(bi.A420618cv);
                    ClearAllcontrol.ClearAllC(bi.A420619cv);
                    ClearAllcontrol.ClearAllC(bi.A420620cv);
                    ClearAllcontrol.ClearAllC(bi.A420621cv);
                    ClearAllcontrol.ClearAllC(bi.A420622cv);
                    bi.A42061cv.setVisibility(View.GONE);
                    bi.A42062cv.setVisibility(View.GONE);
                    bi.A42063cv.setVisibility(View.GONE);
                    bi.A42064cv.setVisibility(View.GONE);
                    bi.A42065cv.setVisibility(View.GONE);
                    bi.A42066cv.setVisibility(View.GONE);
                    bi.A42067cv.setVisibility(View.GONE);
                    bi.A42068cv.setVisibility(View.GONE);
                    bi.A42069cv.setVisibility(View.GONE);
                    bi.A420610cv.setVisibility(View.GONE);
                    bi.A420611cv.setVisibility(View.GONE);
                    bi.A420612cv.setVisibility(View.GONE);
                    bi.A420613cv.setVisibility(View.GONE);
                    bi.A420614cv.setVisibility(View.GONE);
                    bi.A420615cv.setVisibility(View.GONE);
                    bi.A420616cv.setVisibility(View.GONE);
                    bi.A420617cv.setVisibility(View.GONE);
                    bi.A420618cv.setVisibility(View.GONE);
                    bi.A420619cv.setVisibility(View.GONE);
                    bi.A420620cv.setVisibility(View.GONE);
                    bi.A420621cv.setVisibility(View.GONE);
                    bi.A420622cv.setVisibility(View.GONE);
                }

            }

        });


        bi.A42061.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bi.A42061a.getId()) {
                    bi.A42062cv.setVisibility(View.VISIBLE);
                    bi.A42063cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bi.A42062cv);
                    ClearAllcontrol.ClearAllC(bi.A42063cv);
                    bi.A42062cv.setVisibility(View.GONE);
                    bi.A42063cv.setVisibility(View.GONE);
                }

            }

        });


        bi.A42068.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bi.A42068a.getId()) {
                    bi.A42069cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bi.A42069cv);
                    bi.A42069cv.setVisibility(View.GONE);
                }

            }

        });


        bi.A42069.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bi.A42069a.getId()) {
                    bi.A420610cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bi.A420610cv);
                    bi.A420610cv.setVisibility(View.GONE);
                }

            }

        });


        bi.A420621.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != bi.A420621a.getId()) {
                    bi.A420622cv.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(bi.A420622cv);
                    bi.A420622cv.setVisibility(View.GONE);
                }

            }

        });

    }


    boolean validateField() {
        /*if (!ValidatorClass.EmptyCheckingContainer(this, bi.llmp02g))
        return false;*/

        return ValidatorClass.EmptyCheckingContainer(this, bi.llmp02g) != false;
    }
    

}
