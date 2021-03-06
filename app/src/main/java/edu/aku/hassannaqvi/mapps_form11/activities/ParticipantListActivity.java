package edu.aku.hassannaqvi.mapps_form11.activities;

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

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form11.R;
import edu.aku.hassannaqvi.mapps_form11.core.AppMain;

public class ParticipantListActivity extends Activity {

    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.participantList)
    ListView participantList;

    ArrayList<String> Ewomens;
    ArrayList<Integer> bloodSample;

    listAdapter partcipantAdapter;

    Boolean flag = false;

    List<Integer> lastPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participant_list);
        ButterKnife.bind(this);

        Ewomens = new ArrayList<String>();
        bloodSample = new ArrayList<Integer>();

        lastPos = new ArrayList<Integer>();

        Log.d("Size", "" + AppMain.Eparticipant.size());

        for (int i = 0; i < AppMain.Eparticipant.size(); i++) {
            //Ewomens.add((AppMain.Eparticipant.get(i).getWname()).toUpperCase());

        }


        partcipantAdapter = new listAdapter(this, android.R.layout.simple_list_item_1, Ewomens);

//        participantList.setAdapter(new ArrayAdapter<>(this, R.layout.lstview, Ewomens));
        participantList.setAdapter(partcipantAdapter);

    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

        if (AppMain.formType.equals("2")) {
            AppMain.partiFlag = 0;
            finish();
            Intent endSec = new Intent(this, MainActivity.class);
            startActivity(endSec);
        } else if (AppMain.formType.equals("1") && AppMain.Eparticipant.size() == AppMain.partiFlag) {
            AppMain.partiFlag = 0;
            finish();
            Intent endSec = new Intent(this, EndingActivity.class);
            endSec.putExtra("complete", true);
            startActivity(endSec);
        } else {
            Toast.makeText(getApplicationContext(), "Fill all Participants", Toast.LENGTH_LONG).show();
        }

    }

    @OnClick(R.id.btn_addNew)
    void onBtnAddNewClick() {
        //TODO implement

        /*if (AppMain.Eparticipant.size() == AppMain.partiFlag) {
            finish();
            Intent endSec = new Intent(this, EndingActivity.class);
            endSec.putExtra("complete", true);
            startActivity(endSec);
        } else {
            Toast.makeText(getApplicationContext(), "Fill all Participants", Toast.LENGTH_LONG).show();
        }*/

        flag = true;

        lastPos.add(AppMain.Eparticipant.size());

        Intent cb = new Intent(getApplicationContext(), SectionCAActivity.class);
        cb.putExtra("flag", true);
        cb.putExtra("pos", AppMain.Eparticipant.size());
        startActivity(cb);

    }

    @Override
    protected void onResume() {
        super.onResume();

        if (flag) {
            Ewomens.add(AppMain.currentParticipantName);
            partcipantAdapter.notifyDataSetChanged();

            flag = false;
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
            TextView textView = v.findViewById(R.id.txtView);
            textView.setText(list.get(position));

            for (int i = 0; i < bloodSample.size(); i++) {
                if (bloodSample.get(i) == position) {
                    v.setBackground(getContext().getDrawable(R.drawable.listview_border));
                }
            }

            for (int i = 0; i < lastPos.size(); i++) {
                if (lastPos.get(i) == position) {
                    v.setBackgroundColor(getResources().getColor(R.color.gray));
                    v.setEnabled(false);
                }
            }

            Log.i("count", String.valueOf(position));

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

/*                    AppMain.currentParticipantName = (String) participantList.getItemAtPosition(position);*/

                    participantList.getChildAt(position).setEnabled(false);
                    participantList.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.gray));

                    for (int pos : bloodSample) {
                        if (pos == position) {
                            participantList.getChildAt(position).setBackground(getContext().getDrawable(R.drawable.listview_border_back));
                        }
                    }

                    lastPos.add(position);

//                Toast.makeText(getApplicationContext(),AppMain.currentParticipantName,Toast.LENGTH_LONG).show();
//                Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_LONG).show();

                    Intent cb = new Intent(getApplicationContext(), SectionCAActivity.class);
                    cb.putExtra("pos", position);
                    startActivity(cb);
                }
            });

            return v;
        }
    }
}
