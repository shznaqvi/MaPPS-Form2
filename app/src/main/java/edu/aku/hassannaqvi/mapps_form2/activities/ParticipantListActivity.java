package edu.aku.hassannaqvi.mapps_form2.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form2.AppMain;
import edu.aku.hassannaqvi.mapps_form2.R;

public class ParticipantListActivity extends Activity {

    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.participantList)
    ListView participantList;

    ArrayList<String> Ewomens;
    ArrayList<Integer> bloodSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participant_list);
        ButterKnife.bind(this);

        Ewomens = new ArrayList<>();
        bloodSample = new ArrayList<>();

        Log.d("Size", "" + AppMain.Eparticipant.size());

        for (int i = 0; i < AppMain.Eparticipant.size(); i++) {
            Ewomens.add((AppMain.Eparticipant.get(i).getWname()).toUpperCase());

            if (checkParticipantAge(AppMain.Eparticipant.get(i).getDob())) {
                bloodSample.add(i);
            }
        }


        listAdapter partcipantAdapter = new listAdapter(this, android.R.layout.simple_list_item_1, Ewomens);

//        participantList.setAdapter(new ArrayAdapter<>(this, R.layout.lstview, Ewomens));
        participantList.setAdapter(partcipantAdapter);

    }

    public Boolean checkParticipantAge(String birthDate) {

        try {
            Date currentDate = new Date();
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = null;

            date = (Date) formatter.parse(birthDate);   //birthDate is a String, in format dd-MM-yyyy

            long diff = currentDate.getTime() - date.getTime();
            long d = (1000l * 60 * 60 * 24 * 365);
            long years = Math.round(diff / d);
            return (int) years == 18;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

        if (AppMain.Eparticipant.size() == AppMain.partiFlag) {
            finish();
            Intent endSec = new Intent(this, EndingActivity.class);
            endSec.putExtra("complete", true);
            startActivity(endSec);
        } else {
            Toast.makeText(getApplicationContext(), "Fill all Participants", Toast.LENGTH_LONG).show();
        }

    }

    public class listAdapter extends ArrayAdapter {

        ArrayList<String> list = new ArrayList<>();

        public listAdapter(Context context, int textViewResourceId, ArrayList<String> objects) {
            super(context, textViewResourceId, objects);
            list = objects;
        }

        @Override
        public boolean isEnabled(int position) {
            return false;
        }

        @Override
        public View getView(final int position, View view, ViewGroup viewGroup) {
            View v = view;
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.lstview, null);
            TextView textView = (TextView) v.findViewById(R.id.txtView);
            textView.setText(list.get(position));

            for (int i = 0; i < bloodSample.size(); i++) {

                if (bloodSample.get(i) == position){
                    v.setBackground(getContext().getDrawable(R.drawable.listview_border));
                }
            }


            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    AppMain.currentParticipantName = (String) participantList.getItemAtPosition(position);

                    participantList.getChildAt(position).setEnabled(false);
                    participantList.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.gray));

                    for(int pos: bloodSample){
                        if (pos == position){
                            participantList.getChildAt(position).setBackground(getContext().getDrawable(R.drawable.listview_border_back));
                        }
                    }

//                Toast.makeText(getApplicationContext(),AppMain.currentParticipantName,Toast.LENGTH_LONG).show();
//                Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_LONG).show();

                    Intent cb = new Intent(getApplicationContext(), SectionCBActivity.class);
                    cb.putExtra("l_uid", AppMain.Eparticipant.get(position).getL_uid());
                    startActivity(cb);
                }
            });

            return v;
        }
    }

}
