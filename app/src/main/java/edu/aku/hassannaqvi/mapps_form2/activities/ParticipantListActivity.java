package edu.aku.hassannaqvi.mapps_form2.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participant_list);
        ButterKnife.bind(this);

        Ewomens = new ArrayList<>();

        Log.d("Size", "" + AppMain.Eparticipant.size());

        for (int i = 0; i < AppMain.Eparticipant.size(); i++) {
            Ewomens.add((AppMain.Eparticipant.get(i).getWname()).toUpperCase());
        }

        listAdapter partcipantAdapter = new listAdapter(this,android.R.layout.simple_list_item_1,Ewomens);

//        participantList.setAdapter(new ArrayAdapter<>(this, R.layout.lstview, Ewomens));
        participantList.setAdapter(partcipantAdapter);

//        participantList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//                AppMain.currentParticipantName = (String) participantList.getItemAtPosition(position);
//
//                participantList.getChildAt(position).setEnabled(false);
//                participantList.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.gray));
//
////                Toast.makeText(getApplicationContext(),AppMain.currentParticipantName,Toast.LENGTH_LONG).show();
////                Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_LONG).show();
//
//                startActivity(new Intent(getApplicationContext(), SectionCBActivity.class));
//            }
//        });
    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

        if (AppMain.Eparticipant.size() == AppMain.partiFlag) {
            finish();
            Intent endSec = new Intent(this, EndingActivity.class);
            endSec.putExtra("complete", false);
            startActivity(endSec);
        }else {
            Toast.makeText(getApplicationContext(),"Fill all Participants",Toast.LENGTH_LONG).show();
        }

    }

    public class listAdapter extends ArrayAdapter{

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

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    AppMain.currentParticipantName = (String) participantList.getItemAtPosition(position);

                    participantList.getChildAt(position).setEnabled(false);
                    participantList.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.gray));

//                Toast.makeText(getApplicationContext(),AppMain.currentParticipantName,Toast.LENGTH_LONG).show();
//                Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_LONG).show();

                    Intent cb = new Intent(getApplicationContext(), SectionCBActivity.class);
                    cb.putExtra("l_uid",AppMain.Eparticipant.get(position).getL_uid());
                    startActivity(cb);
                }
            });

            return v;
        }
    }

}
