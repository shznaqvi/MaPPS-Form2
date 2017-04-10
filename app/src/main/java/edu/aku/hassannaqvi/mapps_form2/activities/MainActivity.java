package edu.aku.hassannaqvi.mapps_form2.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.mapps_form2.AndroidDatabaseManager;
import edu.aku.hassannaqvi.mapps_form2.AppMain;
import edu.aku.hassannaqvi.mapps_form2.R;
import edu.aku.hassannaqvi.mapps_form2.getclasses.GetEligibles;
import edu.aku.hassannaqvi.mapps_form2.otherclasses.FormsList;
import edu.aku.hassannaqvi.mapps_form2.syncclasses.SyncForms;
import edu.aku.hassannaqvi.mapps_form2.syncclasses.SyncParticipants;


public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    @BindView(R.id.adminsec)
    LinearLayout adminsec;
    @BindView(R.id.recordSummary)
    TextView recordSummary;
    @BindView(R.id.areaCode)
    EditText areaCode;
    private String rSumText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        // Reset working variables
        AppMain.child_name = "Test";


//        if (AppMain.admin) {
//            adminsec.setVisibility(View.VISIBLE);
//        } else {
//            adminsec.setVisibility(View.GONE);
//        }


//        DatabaseHelper db = new DatabaseHelper(this);
//        Collection<FormsContract> todaysForms = new ArrayList<>();
//
//        todaysForms = db.getTodayForms();
//
//        rSumText += "TODAY'S RECORDS SUMMARY\r\n";
//        rSumText += "=======================";
//        rSumText += "\r\n\r\n";
//        rSumText += "Total Forms Today: " + todaysForms.size();
//        rSumText += "\r\n";
//        rSumText += "    Forms List: \r\n";
//        String iStatus = "";
//        for (FormsContract fc : todaysForms) {
//
//            switch (fc.getIstatus()) {
//                case "1":
//                    iStatus = "Complete";
//                    break;
//                case "2":
//                    iStatus = "House Locked";
//                    break;
//                case "3":
//                    iStatus = "Refused";
//                    break;
//                case "4":
//                    iStatus = "Refused";
//                    break;
//            }
//
//            rSumText += fc.getSubareacode() + " " + fc.getHousehold() + " " + iStatus;
//            rSumText += "\r\n";
//
//        }
//
//        rSumText += "--------------------------------------------------\r\n";
//        if (AppMain.admin) {
//            adminsec.setVisibility(View.VISIBLE);
//            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
//            rSumText += "Last Update: " + syncPref.getString("LastUpdate", "Never Updated");
//            rSumText += "\r\n";
//            rSumText += "Last Synced(DB): " + syncPref.getString("LastSyncDB", "Never Synced");
//            rSumText += "\r\n";
//        }
//        recordSummary.setText(rSumText);


    }

    public void openForm(View v) {
        Intent oF = new Intent(MainActivity.this, SectionAActivity.class);
        startActivity(oF);
    }

    public void openMembers(View v) {
        //Intent iMem = new Intent(this, FamilyMembersActivity.class);
        //startActivity(iMem);
    }

    public void openA(View v) {
        Intent iA = new Intent(this, SectionAActivity.class);
        startActivity(iA);
    }

    public void openD(View v) {
        Intent iD = new Intent(this, SectionDActivity.class);
        startActivity(iD);
    }


    public void openDB(View v) {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }

    public void CheckCluster(View v) {
        if (!areaCode.getText().toString().isEmpty()) {

            areaCode.setError(null);

            Intent Clist = new Intent(this, FormsList.class);
            Clist.putExtra("areaCode", areaCode.getText().toString());
            startActivity(Clist);
        } else {
            Toast.makeText(this, "Error(Empty): Data Required", Toast.LENGTH_SHORT).show();
            areaCode.setError("Error(Empty): Data Required");
        }
    }

    public void syncServer(View view) {
        Log.e(TAG, "syncServer: 1");
        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        Log.e(TAG, "syncServer: 2");
        if (networkInfo != null && networkInfo.isConnected()) {
            Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
            new SyncForms(this).execute();

            Toast.makeText(getApplicationContext(), "Syncing Participants", Toast.LENGTH_SHORT).show();
            new SyncParticipants(this).execute();

            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastUpSyncServer", dtToday);

            editor.apply();

        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }

    }

    public void syncDevice(View view) {

        //String usersUrl = AppMain._HOST_URL + "virband/api/users.php";
        //String randsUrl = AppMain._HOST_URL + "virband/api/random.php"; // url to sync randomise data
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {

            // Sync Randomization
            Toast.makeText(getApplicationContext(), "Getting Eligibleomization", Toast.LENGTH_SHORT).show();
            new GetEligibles(this).execute();


            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastDownSyncServer", dtToday);

            editor.apply();
        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }
    }
}