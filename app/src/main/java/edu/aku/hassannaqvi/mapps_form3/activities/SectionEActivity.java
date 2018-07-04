package edu.aku.hassannaqvi.mapps_form3.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form3.R;
import edu.aku.hassannaqvi.mapps_form3.core.AppMain;
import edu.aku.hassannaqvi.mapps_form3.core.DatabaseHelper;

public class SectionEActivity extends Activity {

    private static final String TAG = SectionEActivity.class.getSimpleName();

    @BindView(R.id.activity_section_d)
    RelativeLayout activitySectionD;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mp02d001)
    EditText mp02d001;
    @BindView(R.id.mp02d001id1)
    Spinner mp02d001id1;
    @BindView(R.id.mp02d002)
    EditText mp02d002;
    @BindView(R.id.mp02d002id2)
    Spinner mp02d002id2;
    //    @BindView(R.id.mp02d003)
//    RadioGroup mp02d003;
//    @BindView(R.id.mp02d00301)
//    RadioButton mp02d00301;
//    @BindView(R.id.mp02d00302)
//    RadioButton mp02d00302;
    @BindView(R.id.mp02d004)
    EditText mp02d004;
    @BindView(R.id.mp02d004id3)
    Spinner mp02d004id3;
    @BindView(R.id.mp02d005)
    EditText mp02d005;
    @BindView(R.id.mp02d005id1)
    Spinner mp02d005id1;
    @BindView(R.id.mp02d006)
    EditText mp02d006;
    @BindView(R.id.mp02d006id2)
    Spinner mp02d006id2;
    //    @BindView(R.id.mp02d007)
//    RadioGroup mp02d007;
//    @BindView(R.id.mp02d00701)
//    RadioButton mp02d00701;
//    @BindView(R.id.mp02d00702)
//    RadioButton mp02d00702;
    @BindView(R.id.mp02d008)
    EditText mp02d008;
    @BindView(R.id.mp02d008id3)
    Spinner mp02d008id3;
    @BindView(R.id.mp02d009)
    EditText mp02d009;
    @BindView(R.id.mp02d009id1)
    Spinner mp02d009id1;
    @BindView(R.id.mp02d010)
    EditText mp02d010;
    @BindView(R.id.mp02d010id2)
    Spinner mp02d010id2;
    //    @BindView(R.id.mp02d011)
//    RadioGroup mp02d011;
//    @BindView(R.id.mp02d01101)
//    RadioButton mp02d01101;
//    @BindView(R.id.mp02d01102)
//    RadioButton mp02d01102;
    @BindView(R.id.mp02d012)
    EditText mp02d012;
    @BindView(R.id.mp02d012id3)
    Spinner mp02d012id3;

    @BindView(R.id.fldGrpmp02d004)
    LinearLayout fldGrpmp02d004;
    @BindView(R.id.fldGrpmp02d008)
    LinearLayout fldGrpmp02d008;
    @BindView(R.id.fldGrpmp02d012)
    LinearLayout fldGrpmp02d012;

    //    Skip Questions Variables
    boolean flag_q4 = false, flag_q8 = false, flag_q12 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_e);
        ButterKnife.bind(this);

        appHeader.setText(" وڏي آوا ز ۾ پڙهو ؛ هاڻ اسين قد، وزن ۽ ٻانهن جي ماپ ڪنداسين. اهو عمل گھٽ ۾ گھٽ ٻه دفعا ٿيندو ");

//        mp02d00302.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (b) {
//                    fldGrpmp02d004.setVisibility(View.GONE);
//                    mp02d004.setText(null);
//                    mp02d004id3.setSelection(0);
//                } else {
//                    fldGrpmp02d004.setVisibility(View.VISIBLE);
//                }
//            }
//        });
//
//        mp02d00702.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (b) {
//                    fldGrpmp02d008.setVisibility(View.GONE);
//                    mp02d008.setText(null);
//                    mp02d008id3.setSelection(0);
//                } else {
//                    fldGrpmp02d008.setVisibility(View.VISIBLE);
//                }
//            }
//        });
//
//        mp02d01102.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (b) {
//                    fldGrpmp02d012.setVisibility(View.GONE);
//                    mp02d012.setText(null);
//                    mp02d012id3.setSelection(0);
//                } else {
//                    fldGrpmp02d012.setVisibility(View.VISIBLE);
//                }
//            }
//        });


        mp02d001id1.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp02d002id2.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp02d004id3.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp02d005id1.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp02d006id2.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp02d008id3.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp02d009id1.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp02d010id2.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp02d012id3.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));

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
                Intent sece = new Intent(this, EndingActivity.class);
                sece.putExtra("complete", true);
                startActivity(sece);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public boolean ValidateForm() {

//        1
        if (mp02d001.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d001), Toast.LENGTH_SHORT).show();
            mp02d001.setError("This data is Required!");
            Log.i(TAG, "mp02d001: This data is Required!");
            return false;
        } else {
            mp02d001.setError(null);
            if (!mp02d001.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d001), Toast.LENGTH_SHORT).show();
                mp02d001.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "mp02d001: Invalid Decimal value is Required!");
                return false;
            } else {
                mp02d001.setError(null);
                if (Double.parseDouble(mp02d001.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d001), Toast.LENGTH_SHORT).show();
                    mp02d001.setError("Invalid: Greater then 0");
                    Log.i(TAG, "mp02d001: Invalid Greater then 0");
                    return false;
                } else {
                    mp02d001.setError(null);
                    if (Double.parseDouble(mp02d001.getText().toString()) < 50 || Double.parseDouble(mp02d001.getText().toString()) > 200) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d001), Toast.LENGTH_SHORT).show();
                        mp02d001.setError("Invalid: Range 50-200");
                        Log.i(TAG, "mp02d001: Invalid Range 50-200");
                        return false;
                    } else {
                        mp02d001.setError(null);
                    }
                }
            }
        }

        TextView mp02d001id1_txt = (TextView) mp02d001id1.getSelectedView();
        if (mp02d001id1.getSelectedItemId() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d001), Toast.LENGTH_SHORT).show();
            mp02d001id1_txt.setTextColor(Color.RED);
            mp02d001id1_txt.setError("This data is Required!");
            Log.i(TAG, "mp02d001id1: This data is Required!");
            return false;
        } else {
            mp02d001id1_txt.setError(null);
        }

//        2
        if (mp02d002.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d002), Toast.LENGTH_SHORT).show();
            mp02d002.setError("This data is Required!");
            Log.i(TAG, "mp02d002: This data is Required!");
            return false;
        } else {
            mp02d002.setError(null);
            if (!mp02d002.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d002), Toast.LENGTH_SHORT).show();
                mp02d002.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "mp02d002: Invalid Decimal value is Required!");
                return false;
            } else {
                mp02d002.setError(null);
                if (Double.parseDouble(mp02d002.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d002), Toast.LENGTH_SHORT).show();
                    mp02d002.setError("Invalid: Greater then 0");
                    Log.i(TAG, "mp02d002: Invalid Greater then 0");
                    return false;
                } else {
                    mp02d002.setError(null);
                    if (Double.parseDouble(mp02d002.getText().toString()) < 50 || Double.parseDouble(mp02d002.getText().toString()) > 200) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d002), Toast.LENGTH_SHORT).show();
                        mp02d002.setError("Invalid: Range between 50-200");
                        Log.i(TAG, "mp02d002: Invalid Range between 50-200");
                        return false;
                    } else {
                        mp02d002.setError(null);
                    }
                }
            }
        }

        TextView mp02d002id2_txt = (TextView) mp02d002id2.getSelectedView();
        if (mp02d002id2.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d002), Toast.LENGTH_SHORT).show();
            mp02d002id2_txt.setTextColor(Color.RED);
            mp02d002id2_txt.setText("This data is Required!");
            mp02d002id2_txt.setError("This data is Required!");
            Log.i(TAG, "mp02d002id2: This data is Required!");
            return false;
        } else {
            mp02d002id2_txt.setError(null);
        }

        if (mp02d001id1.getSelectedItem().toString().contains(mp02d002id2.getSelectedItem().toString())) {
            Toast.makeText(this, "ERROR(invalid) Users same: " + getString(R.string.mp02d001), Toast.LENGTH_SHORT).show();
            mp02d001id1_txt.setError("Users Same");
            mp02d002id2_txt.setError("Users Same");
            Log.i(TAG, "mp02d001id1: Users Same");
            return false;
        } else {
            mp02d001id1_txt.setError(null);
            mp02d002id2_txt.setError(null);
        }

//        Skip

//        Question 4 Checking

        double q4 = Double.parseDouble(mp02d001.getText().toString()) - Double.parseDouble(mp02d002.getText().toString());

        if (Math.signum(q4) == -1) {
            q4 = q4 * -1;
        }

        if (!flag_q4) {
            if (q4 > 1.0) {
                flag_q4 = true;

                fldGrpmp02d004.setVisibility(View.VISIBLE);
                mp02d001.setEnabled(false);
                mp02d002.setEnabled(false);

                mp02d001id1.setEnabled(false);
                mp02d002id2.setEnabled(false);

                Toast.makeText(this, "ERROR(invalid): Difference in Measurement", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "mp02d001 & mp02d002: Difference in Measurement");

                return false;
            }
        }

//            4
        if (flag_q4) {
            if (mp02d004.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d004), Toast.LENGTH_SHORT).show();
                mp02d004.setError("This data is Required!");
                Log.i(TAG, "mp02d004: This data is Required!");
                return false;
            } else {
                mp02d004.setError(null);
                if (!mp02d004.getText().toString().contains(".")) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d004), Toast.LENGTH_SHORT).show();
                    mp02d004.setError("Invalid: Decimal value is Required!");
                    Log.i(TAG, "mp02d004: Invalid Decimal value is Required!");
                    return false;
                } else {
                    mp02d004.setError(null);
                    if (Double.parseDouble(mp02d004.getText().toString()) < 1) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d004), Toast.LENGTH_SHORT).show();
                        mp02d004.setError("Invalid: Greater then 0");
                        Log.i(TAG, "mp02d004: Invalid Greater then 0");
                        return false;
                    } else {
                        mp02d004.setError(null);
                        if (Double.parseDouble(mp02d004.getText().toString()) < 50 || Double.parseDouble(mp02d004.getText().toString()) > 200) {
                            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d004), Toast.LENGTH_SHORT).show();
                            mp02d004.setError("Invalid: Range 50-200");
                            Log.i(TAG, "mp02d004: Invalid Range 50-200");
                            return false;
                        } else {
                            mp02d004.setError(null);
                        }
                    }
                }
            }

            TextView mp02d004id3_txt = (TextView) mp02d004id3.getSelectedView();
            if (mp02d004id3.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d004), Toast.LENGTH_SHORT).show();
                mp02d004id3_txt.setError("This data is Required!");
                mp02d004id3_txt.setText("This data is Required!");
                Log.i(TAG, "mp02d004id3: This data is Required!");
                return false;
            } else {
                mp02d004id3_txt.setError(null);
            }
        }

//        5
        if (mp02d005.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d005), Toast.LENGTH_SHORT).show();
            mp02d005.setError("This data is Required!");
            Log.i(TAG, "mp02d005: This data is Required!");
            return false;
        } else {
            mp02d005.setError(null);
            if (!mp02d005.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d005), Toast.LENGTH_SHORT).show();
                mp02d005.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "mp02d005: Invalid Decimal value is Required!");
                return false;
            } else {
                mp02d005.setError(null);
                if (Double.parseDouble(mp02d005.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d005), Toast.LENGTH_SHORT).show();
                    mp02d005.setError("Invalid: Greater then 0");
                    Log.i(TAG, "mp02d005: Invalid Greater then 0");
                    return false;
                } else {
                    mp02d005.setError(null);
                    if (Double.parseDouble(mp02d005.getText().toString()) < 5 || Double.parseDouble(mp02d005.getText().toString()) > 170) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d005), Toast.LENGTH_SHORT).show();
                        mp02d005.setError("Invalid: Range 5-170");
                        Log.i(TAG, "mp02d005: Invalid Range 5-170");
                        return false;
                    } else {
                        mp02d005.setError(null);
                    }
                }
            }
        }

        TextView mp02d005id1_txt = (TextView) mp02d005id1.getSelectedView();
        if (mp02d005id1.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d005), Toast.LENGTH_SHORT).show();
            mp02d005id1_txt.setError("This data is Required!");
            mp02d005id1_txt.setText("This data is Required!");
            Log.i(TAG, "mp02d005id1: This data is Required!");
            return false;
        } else {
            mp02d005id1_txt.setError(null);
        }

//        6
        if (mp02d006.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d006), Toast.LENGTH_SHORT).show();
            mp02d006.setError("This data is Required!");
            Log.i(TAG, "mp02d006: This data is Required!");
            return false;
        } else {
            mp02d006.setError(null);
            if (!mp02d006.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d006), Toast.LENGTH_SHORT).show();
                mp02d006.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "mp02d006: Invalid Decimal value is Required!");
                return false;
            } else {
                mp02d006.setError(null);
                if (Double.parseDouble(mp02d006.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d006), Toast.LENGTH_SHORT).show();
                    mp02d006.setError("Invalid: Greater then 0");
                    Log.i(TAG, "mp02d006: Invalid Greater then 0");
                    return false;
                } else {
                    mp02d006.setError(null);
                    if (Double.parseDouble(mp02d006.getText().toString()) < 5 || Double.parseDouble(mp02d006.getText().toString()) > 170) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d006), Toast.LENGTH_SHORT).show();
                        mp02d006.setError("Invalid: Range 5-170");
                        Log.i(TAG, "mp02d006: Invalid Range 5-170");
                        return false;
                    } else {
                        mp02d006.setError(null);
                    }
                }
            }
        }

        TextView mp02d006id2_txt = (TextView) mp02d006id2.getSelectedView();
        if (mp02d006id2.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d006), Toast.LENGTH_SHORT).show();
            mp02d006id2_txt.setError("This data is Required!");
            mp02d006id2_txt.setText("This data is Required!");
            Log.i(TAG, "mp02d006id1: This data is Required!");
            return false;
        } else {
            mp02d006id2_txt.setError(null);
        }
        if (mp02d005id1.getSelectedItem().toString().contains(mp02d006id2.getSelectedItem().toString())) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d005), Toast.LENGTH_SHORT).show();
            mp02d006id2_txt.setError("Users Same");
            mp02d005id1_txt.setError("Users Same");
            Log.i(TAG, "mp02d005id1: Users Same");
            return false;
        } else {
            mp02d006id2_txt.setError(null);
            mp02d005id1_txt.setError(null);
        }

//        Skip

        //        Question 8 Checking

        double q8 = Double.parseDouble(mp02d005.getText().toString()) - Double.parseDouble(mp02d006.getText().toString());

        if (Math.signum(q8) == -1) {
            q8 = q8 * -1;
        }

        if (!flag_q8) {
            if (q8 > 0.5) {
                flag_q8 = true;

                fldGrpmp02d008.setVisibility(View.VISIBLE);
                mp02d005.setEnabled(false);
                mp02d006.setEnabled(false);

                mp02d005id1.setEnabled(false);
                mp02d006id2.setEnabled(false);

                Toast.makeText(this, "ERROR(invalid): Difference in Measurement", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "mp02d005 & mp02d006: Difference in Measurement");

                return false;
            }
        }

        if (flag_q8) {

//            8

            if (mp02d008.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d008), Toast.LENGTH_SHORT).show();
                mp02d008.setError("This data is Required!");
                Log.i(TAG, "mp02d008: This data is Required!");
                return false;
            } else {
                mp02d008.setError(null);
                if (!mp02d008.getText().toString().contains(".")) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d008), Toast.LENGTH_SHORT).show();
                    mp02d008.setError("Invalid: Decimal value is Required!");
                    Log.i(TAG, "mp02d008: Invalid Decimal value is Required!");
                    return false;
                } else {
                    mp02d008.setError(null);
                    if (Double.parseDouble(mp02d008.getText().toString()) < 1) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d008), Toast.LENGTH_SHORT).show();
                        mp02d008.setError("Invalid: Greater then 0");
                        Log.i(TAG, "mp02d008: Invalid Greater then 0");
                        return false;
                    } else {
                        mp02d008.setError(null);
                        if (Double.parseDouble(mp02d008.getText().toString()) < 5 || Double.parseDouble(mp02d008.getText().toString()) > 170) {
                            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d008), Toast.LENGTH_SHORT).show();
                            mp02d008.setError("Invalid: Range 5-170");
                            Log.i(TAG, "mp02d008: Invalid Range 5-170");
                            return false;
                        } else {
                            mp02d008.setError(null);
                        }
                    }
                }
            }

            TextView mp02d008id3_txt = (TextView) mp02d008id3.getSelectedView();
            if (mp02d008id3.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d008), Toast.LENGTH_SHORT).show();
                mp02d008id3_txt.setError("This data is Required!");
                mp02d008id3_txt.setText("This data is Required!");
                Log.i(TAG, "mp02d008id3: This data is Required!");
                return false;
            } else {
                mp02d008id3_txt.setError(null);
            }

        }

//        9
        if (mp02d009.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d009), Toast.LENGTH_SHORT).show();
            mp02d009.setError("This data is Required!");
            Log.i(TAG, "mp02d009: This data is Required!");
            return false;
        } else {
            mp02d009.setError(null);
            if (!mp02d009.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d009), Toast.LENGTH_SHORT).show();
                mp02d009.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "mp02d009: Invalid Decimal value is Required!");
                return false;
            } else {
                mp02d009.setError(null);
                if (Double.parseDouble(mp02d009.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d009), Toast.LENGTH_SHORT).show();
                    mp02d009.setError("Invalid: Greater then 0");
                    Log.i(TAG, "mp02d009: Invalid Greater then 0");
                    return false;
                } else {
                    mp02d009.setError(null);
                    if (Double.parseDouble(mp02d009.getText().toString()) < 8 || Double.parseDouble(mp02d009.getText().toString()) > 99.9) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d009), Toast.LENGTH_SHORT).show();
                        mp02d009.setError("Invalid: Range 8-99.9");
                        Log.i(TAG, "mp02d009: Invalid Range 8-99.9");
                        return false;
                    } else {
                        mp02d009.setError(null);
                    }
                }
            }
        }

        TextView mp02d009id1_txt = (TextView) mp02d009id1.getSelectedView();
        if (mp02d009id1.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d009), Toast.LENGTH_SHORT).show();
            mp02d009id1_txt.setError("This data is Required!");
            mp02d009id1_txt.setText("This data is Required!");
            Log.i(TAG, "mp02d009id1: This data is Required!");
            return false;
        } else {
            mp02d009id1_txt.setError(null);
        }

//        10
        if (mp02d010.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d010), Toast.LENGTH_SHORT).show();
            mp02d010.setError("This data is Required!");
            Log.i(TAG, "mp02d010: This data is Required!");
            return false;
        } else {
            mp02d010.setError(null);
            if (!mp02d010.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d010), Toast.LENGTH_SHORT).show();
                mp02d010.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "mp02d010: Invalid Decimal value is Required!");
                return false;
            } else {
                mp02d010.setError(null);
                if (Double.parseDouble(mp02d010.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d010), Toast.LENGTH_SHORT).show();
                    mp02d010.setError("Invalid: Greater then 0");
                    Log.i(TAG, "mp02d010: Invalid Greater then 0");
                    return false;
                } else {
                    mp02d010.setError(null);
                    if (Double.parseDouble(mp02d010.getText().toString()) < 8 || Double.parseDouble(mp02d010.getText().toString()) > 99.9) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d010), Toast.LENGTH_SHORT).show();
                        mp02d010.setError("Invalid: Range 8-99.9");
                        Log.i(TAG, "mp02d010: Invalid Range 8-99.9");
                        return false;
                    } else {
                        mp02d010.setError(null);
                    }
                }
            }
        }

        TextView mp02d010id2_txt = (TextView) mp02d010id2.getSelectedView();
        if (mp02d010id2.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d010), Toast.LENGTH_SHORT).show();
            mp02d010id2_txt.setError("This data is Required!");
            mp02d010id2_txt.setText("This data is Required!");
            Log.i(TAG, "mp02d010id2: This data is Required!");
            return false;
        } else {
            mp02d010id2_txt.setError(null);
        }
        if (mp02d009id1.getSelectedItem().toString().contains(mp02d010id2.getSelectedItem().toString())) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d009), Toast.LENGTH_SHORT).show();
            mp02d009id1_txt.setError("Users Same");
            mp02d010id2_txt.setError("Users Same");
            Log.i(TAG, "mp02d009id1: Users Same");
            return false;
        } else {
            mp02d009id1_txt.setError(null);
            mp02d010id2_txt.setError(null);
        }

//        Skip
        //        Question 12 Checking

        double q12 = Double.parseDouble(mp02d009.getText().toString()) - Double.parseDouble(mp02d010.getText().toString());

        if (Math.signum(q12) == -1) {
            q12 = q12 * -1;
        }

        if (!flag_q12) {
            if (q12 > 0.5) {
                flag_q12 = true;

                fldGrpmp02d012.setVisibility(View.VISIBLE);
                mp02d009.setEnabled(false);
                mp02d010.setEnabled(false);

                mp02d009id1.setEnabled(false);
                mp02d010id2.setEnabled(false);

                Toast.makeText(this, "ERROR(invalid): Difference in Measurement", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "mp02d009 & mp02d010: Difference in Measurement");

                return false;
            }
        }

        if (flag_q12) {
//            12
            if (mp02d012.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d012), Toast.LENGTH_SHORT).show();
                mp02d012.setError("This data is Required!");
                Log.i(TAG, "mp02d012: This data is Required!");
                return false;
            } else {
                mp02d012.setError(null);
                if (!mp02d012.getText().toString().contains(".")) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d012), Toast.LENGTH_SHORT).show();
                    mp02d012.setError("Invalid: Decimal value is Required!");
                    Log.i(TAG, "mp02d012: Decimal value is Required!");
                    return false;
                } else {
                    mp02d012.setError(null);
                    if (Double.parseDouble(mp02d012.getText().toString()) < 1) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d012), Toast.LENGTH_SHORT).show();
                        mp02d012.setError("Invalid: Greater then 0");
                        Log.i(TAG, "mp02d012: Greater then 0");
                        return false;
                    } else {
                        mp02d012.setError(null);
                        if (Double.parseDouble(mp02d012.getText().toString()) < 8 || Double.parseDouble(mp02d012.getText().toString()) > 99.9) {
                            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp02d012), Toast.LENGTH_SHORT).show();
                            mp02d012.setError("Invalid: Range 8-99.9");
                            Log.i(TAG, "mp02d012: Range 8-99.9");
                            return false;
                        } else {
                            mp02d012.setError(null);
                        }
                    }
                }
            }

            TextView mp02d012id3_txt = (TextView) mp02d012id3.getSelectedView();
            if (mp02d012id3.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp02d012), Toast.LENGTH_SHORT).show();
                mp02d012id3_txt.setError("This data is Required!");
                mp02d012id3_txt.setText("This data is Required!");
                Log.i(TAG, "mp02d012id3: This data is Required!");
                return false;
            } else {
                mp02d012id3_txt.setError(null);
            }
        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sD = new JSONObject();

        sD.put("mp03q162", mp02d001.getText().toString());
        sD.put("mp03q162id1", mp02d001id1.getSelectedItem().toString());

        sD.put("mp03q163", mp02d002.getText().toString());
        sD.put("mp03q163id2", mp02d002id2.getSelectedItem().toString());

        sD.put("mp03q164", flag_q4 ? "1" : "2");

        sD.put("mp03q165", mp02d004.getText().toString());
        sD.put("mp03q165id3", mp02d004id3.getSelectedItem().toString());

        sD.put("mp03q166", mp02d005.getText().toString());
        sD.put("mp03q166id1", mp02d005id1.getSelectedItem().toString());

        sD.put("mp03q167", mp02d006.getText().toString());
        sD.put("mp03q167id2", mp02d006id2.getSelectedItem().toString());

        sD.put("mp03q168", flag_q8 ? "1" : "2");

        sD.put("mp03q169", mp02d008.getText().toString());
        sD.put("mp03q169id3", mp02d008id3.getSelectedItem().toString());

        sD.put("mp03q170", mp02d009.getText().toString());
        sD.put("mp03q170id1", mp02d009id1.getSelectedItem().toString());

        sD.put("mp03q171", mp02d010.getText().toString());
        sD.put("mp03q171id2", mp02d010id2.getSelectedItem().toString());

        sD.put("mp03q172", flag_q12 ? "1" : "2");

        sD.put("mp03q173", mp02d012.getText().toString());
        sD.put("mp03q173id3", mp02d012id3.getSelectedItem().toString());

        AppMain.fc.setsE(String.valueOf(sD));

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
