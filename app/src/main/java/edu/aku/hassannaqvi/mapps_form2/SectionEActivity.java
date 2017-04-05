package edu.aku.hassannaqvi.mapps_form2;

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

public class SectionEActivity extends Activity {


    private static final String TAG = SectionEActivity.class.getSimpleName();

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_e);
        ButterKnife.bind(this);

        //DecimalFormat df = new DecimalFormat("##.#");

        //mp02e001.setText(df.format(mp02e001.getText().toString()));







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
                Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, SectionCActivity.class);
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
                Intent end = new Intent(this, SectionCActivity.class);
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
        if ((Double.parseDouble(mp02e001.getText().toString().isEmpty() ? "0" : mp02e001.getText().toString()) < 8)
                || Double.parseDouble(mp02e001.getText().toString()) > 15.5) {
            Toast.makeText(this, "Range:" + getString(R.string.mp02e001), Toast.LENGTH_SHORT).show();
            mp02e001.setError("Range: 8.0 to 15.5 ");

            Log.i(TAG, "mp02e001: Range: 8.0 to 15.5!");
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
            Toast.makeText(this, "" + getString(R.string.mp02e002), Toast.LENGTH_SHORT).show();
            mp02e00202.setError("This data is Required!");

            Log.i(TAG, "mp02e002: This Data is Required!");
            return false;
        } else {
            mp02e00202.setError(null);
        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sE = new JSONObject();

        sE.put("mp02e001", mp02e001.getText().toString());

        sE.put("mp02e002", mp02e00201.isChecked() ? "1" : mp02e00202.isChecked() ? "2" : "0");

        AppMain.pc.setsE(String.valueOf(sE));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateE();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
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
