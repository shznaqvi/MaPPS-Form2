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
import edu.aku.hassannaqvi.mapps_form11.databinding.ActivitySectionFBinding;



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

            Intent c2 = new Intent(this, A4251.class);
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

        json.put("A4206", bi.A4206a.isChecked() ? "1"
                : bi.A4206b.isChecked() ? "2"
                : bi.A420698.isChecked() ? "98"
                : bi.A420699.isChecked() ? "99"
                : "0");

        json.put("A42061", bi.A42061a.isChecked() ? "1"
                : bi.A42061b.isChecked() ? "2"
                : bi.A4206198.isChecked() ? "98"
                : bi.A4206199.isChecked() ? "99"
                : "0");

        json.put("A42062", bi.A42062a.isChecked() ? "1"
                : bi.A42062b.isChecked() ? "2"
                : bi.A42062c.isChecked() ? "3"
                : bi.A42062d.isChecked() ? "4"
                : bi.A42062e.isChecked() ? "5"
                : bi.A4206296.isChecked() ? "96"
                : bi.A4206298.isChecked() ? "98"
                : bi.A4206299.isChecked() ? "99"
                : "0");

        json.put("A42063", bi.A42063a.isChecked() ? "1"
                : bi.A42063b.isChecked() ? "2"
                : bi.A42063c.isChecked() ? "3"
                : bi.A42063d.isChecked() ? "4"
                : bi.A42063e.isChecked() ? "5"
                : bi.A42063f.isChecked() ? "6"
                : bi.A4206396.isChecked() ? "96"
                : bi.A4206398.isChecked() ? "98"
                : bi.A4206399.isChecked() ? "99"
                : "0");

        json.put("A42064", bi.A42064a.isChecked() ? "1"
                : bi.A42064b.isChecked() ? "2"
                : bi.A4206498.isChecked() ? "98"
                : bi.A4206499.isChecked() ? "99"
                : "0");

        json.put("A42065", bi.A42065a.isChecked() ? "1"
                : bi.A42065b.isChecked() ? "2"
                : bi.A4206598.isChecked() ? "98"
                : bi.A4206599.isChecked() ? "99"
                : "0");

        json.put("A42066", bi.A42066a.isChecked() ? "1"
                : bi.A42066b.isChecked() ? "2"
                : bi.A4206698.isChecked() ? "98"
                : bi.A4206699.isChecked() ? "99"
                : "0");

        json.put("A42067", bi.A42067a.isChecked() ? "1"
                : bi.A42067b.isChecked() ? "2"
                : bi.A4206798.isChecked() ? "98"
                : bi.A4206799.isChecked() ? "99"
                : "0");

        json.put("A42068", bi.A42068a.isChecked() ? "1"
                : bi.A42068b.isChecked() ? "2"
                : bi.A4206898.isChecked() ? "98"
                : bi.A4206899.isChecked() ? "99"
                : "0");

        json.put("A42069", bi.A42069a.isChecked() ? "1"
                : bi.A42069b.isChecked() ? "2"
                : bi.A4206998.isChecked() ? "98"
                : bi.A4206999.isChecked() ? "99"
                : "0");

        json.put("A420610", bi.A420610a.isChecked() ? "1"
                : bi.A420610b.isChecked() ? "2"
                : bi.A420610c.isChecked() ? "3"
                : bi.A42061096.isChecked() ? "96"
                : bi.A42061098.isChecked() ? "98"
                : bi.A42061099.isChecked() ? "99"
                : "0");

        json.put("A420611", bi.A420611a.isChecked() ? "1"
                : bi.A420611b.isChecked() ? "2"
                : bi.A42061198.isChecked() ? "98"
                : bi.A42061199.isChecked() ? "99"
                : "0");

        json.put("A420612", bi.A420612a.isChecked() ? "1"
                : bi.A420612b.isChecked() ? "2"
                : bi.A42061298.isChecked() ? "98"
                : bi.A42061299.isChecked() ? "99"
                : "0");

        json.put("A420613", bi.A420613a.isChecked() ? "1"
                : bi.A420613b.isChecked() ? "2"
                : bi.A42061398.isChecked() ? "98"
                : bi.A42061399.isChecked() ? "99"
                : "0");

        json.put("A420614", bi.A420614a.isChecked() ? "1"
                : bi.A420614b.isChecked() ? "2"
                : bi.A42061498.isChecked() ? "98"
                : bi.A42061499.isChecked() ? "99"
                : "0");

        json.put("A420615", bi.A420615a.isChecked() ? "1"
                : bi.A420615b.isChecked() ? "2"
                : bi.A42061598.isChecked() ? "98"
                : bi.A42061599.isChecked() ? "99"
                : "0");

        json.put("A420616", bi.A420616a.isChecked() ? "1"
                : bi.A420616b.isChecked() ? "2"
                : bi.A42061698.isChecked() ? "98"
                : bi.A42061699.isChecked() ? "99"
                : "0");

        json.put("A420617", bi.A420617a.isChecked() ? "1"
                : bi.A420617b.isChecked() ? "2"
                : bi.A42061798.isChecked() ? "98"
                : bi.A42061799.isChecked() ? "99"
                : "0");

        json.put("A420618", bi.A420618a.isChecked() ? "1"
                : bi.A420618b.isChecked() ? "2"
                : bi.A42061898.isChecked() ? "98"
                : bi.A42061899.isChecked() ? "99"
                : "0");

        json.put("A420619", bi.A420619a.isChecked() ? "1"
                : bi.A420619b.isChecked() ? "2"
                : bi.A42061998.isChecked() ? "98"
                : bi.A42061999.isChecked() ? "99"
                : "0");

        json.put("A420620", bi.A420620a.isChecked() ? "1"
                : bi.A420620b.isChecked() ? "2"
                : bi.A42062098.isChecked() ? "98"
                : bi.A42062099.isChecked() ? "99"
                : "0");

        json.put("A420621", bi.A420621a.isChecked() ? "1"
                : bi.A420621b.isChecked() ? "2"
                : bi.A42062198.isChecked() ? "98"
                : bi.A42062199.isChecked() ? "99"
                : "0");

        json.put("A420622", bi.A420622a.isChecked() ? "1"
                : bi.A420622b.isChecked() ? "2"
                : bi.A42062298.isChecked() ? "98"
                : bi.A42062299.isChecked() ? "99"
                : "0");

        json.put("A4207", bi.A4207H.getText().toString().trim().length() > 0 ? bi.A4207H.getText().toString()
                : bi.A4207D.getText().toString().trim().length() > 0 ? bi.A4207D.getText().toString()
                : bi.A420798.isChecked() ? "98"
                : "0");

        json.put("A4207H", bi.A4207H.getText().toString().trim().length() > 0 ? bi.A4207H.getText().toString() : "0");
        json.put("A4207D", bi.A4207D.getText().toString().trim().length() > 0 ? bi.A4207D.getText().toString() : "0");

        json.put("A420798", bi.A420798.isChecked() ? "98" : "0");

//        MyPreferences.setsA4206(String.valueOf(json));

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
        if (Gothrough.IamHiden(bi.llmp02f) == false) {
            return false;
        }

        return Gothrough.IamHiden(bi.llA4206) != false;
    }

}
