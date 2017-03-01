package edu.aku.hassannaqvi.mapps_form2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ParticipantListActivity extends Activity  {

    @BindView(R.id.app_header) TextView appHeader;
    @BindView(R.id.participantList) ListView participantList;

    ArrayList<String> Ewomens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participant_list);
        ButterKnife.bind(this);

        Ewomens = new ArrayList<>();

        Log.d("Size",""+AppMain.Eparticipant.size());

        for (int i=0;i<AppMain.Eparticipant.size();i++){
            Ewomens.add((AppMain.Eparticipant.get(i).getWname()).toUpperCase());
        }

        participantList.setAdapter(new ArrayAdapter<>(this,R.layout.lstview, Ewomens));

        participantList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                AppMain.currentParticipantName = (String) participantList.getItemAtPosition(position);

                AppMain.currentParticipantPosition = position;

//                Toast.makeText(getApplicationContext(),AppMain.currentParticipantName,Toast.LENGTH_LONG).show();
//                Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_LONG).show();

                startActivity(new Intent(getApplicationContext(),SectionCBActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (AppMain.currentParticipantName!="") {
            participantList.getChildAt(AppMain.currentParticipantPosition).setClickable(false);
            participantList.getChildAt(AppMain.currentParticipantPosition).setBackgroundColor(getResources().getColor(R.color.gray));
        }
    }

    @OnClick(R.id.btn_End) void onBtnEndClick() {
        //TODO implement
    }
}
