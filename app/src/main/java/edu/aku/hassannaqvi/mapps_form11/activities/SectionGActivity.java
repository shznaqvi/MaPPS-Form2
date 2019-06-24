package edu.aku.hassannaqvi.mapps_form11.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mapps_form11.R;
import edu.aku.hassannaqvi.mapps_form11.core.AppMain;
import edu.aku.hassannaqvi.mapps_form11.core.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form11.databinding.ActivitySectionGBinding;
import edu.aku.hassannaqvi.mapps_form11.validation.ClearClass;
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

            if (!UpdateDB()) return;

            startActivity(new Intent(this, SectionDActivity.class));

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

    }


    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateG();

        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public void BtnEnd() {
        finish();

        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);

    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("mp02g01a", bi.mp02g01a.getText().toString());
        json.put("mp02g01b", bi.mp02g01b.getText().toString());
        json.put("mp02g0197", bi.mp02g0197.isChecked() ? "97" : "0");

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

        AppMain.fc.setsG(String.valueOf(json));

    }


    private void setupSkips() {

        bi.mp02g0197.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (bi.mp02g0197.isChecked()) {
                    bi.mp02g02cv.setVisibility(View.VISIBLE);
                    bi.mp02g03cv.setVisibility(View.VISIBLE);
                } else {
                    ClearClass.ClearAllC(bi.mp02g02cv);
                    ClearClass.ClearAllC(bi.mp02g03cv);
                    bi.mp02g02cv.setVisibility(View.GONE);
                    bi.mp02g03cv.setVisibility(View.GONE);
                }

            }


        });


        bi.mp02g05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == bi.mp02g05a.getId()) {
                    bi.mp02g06cv.setVisibility(View.VISIBLE);
                } else {
                    ClearClass.ClearAllC(bi.mp02g06cv);
                    bi.mp02g06cv.setVisibility(View.GONE);
                }

            }

        });

    }


    boolean validateField() {
        /*if (!ValidatorClass.EmptyCheckingContainer(this, bi.llmp02g))
        return false;*/

        //return ValidatorClass.EmptyCheckingContainer(this, bi.llmp02g) != false;

        return ValidatorClass.EmptyCheckingContainer(this, bi.llmp02g);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}
