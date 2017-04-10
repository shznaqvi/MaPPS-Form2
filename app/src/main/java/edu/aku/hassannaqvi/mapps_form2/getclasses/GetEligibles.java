package edu.aku.hassannaqvi.mapps_form2.getclasses;

/**
 * Created by hassan.naqvi on 12/2/2016.
 */

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

import edu.aku.hassannaqvi.mapps_form2.AppMain;
import edu.aku.hassannaqvi.mapps_form2.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form2.contracts.EligiblesContract;

/**
 * Created by hassan.naqvi on 7/26/2016.
 */
public class GetEligibles extends AsyncTask<String, Void, String> {

    private static final String TAG = "SyncEligibles";
    private Context mContext;
    private ProgressDialog pd;

    public GetEligibles(Context context) {
        mContext = context;
    }

    public static void longInfo(String str) {
        if (str.length() > 4000) {
            Log.i(TAG + "LongInfo", str.substring(0, 4000));
            longInfo(str.substring(4000));
        } else
            Log.i(TAG + "LongInfo", str);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext);
        pd.setTitle("Please wait... Processing Eligibles");
        pd.show();

    }


    @Override
    protected String doInBackground(String... urls) {

        String line = "No Response";
        try {
            return downloadUrl(AppMain._HOST_URL + EligiblesContract.singleWoman._URI);
        } catch (IOException e) {
            return "Unable to upload data. Server may be down.";
        }

    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);

        JSONArray json = null;
        try {
            json = new JSONArray(result);
            DatabaseHelper db = new DatabaseHelper(mContext);
            db.syncEligible(json);
            Toast.makeText(mContext, "Successfully Synced " + json.length() + " Eligibles", Toast.LENGTH_SHORT).show();

            pd.setMessage(json.length() + " eligibles synced.");
            pd.setTitle("Eligibles: Done");
            pd.show();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(mContext, "Failed Sync " + result, Toast.LENGTH_SHORT).show();

            pd.setMessage(result);
            pd.setTitle("Eligibles Sync Failed");
            pd.show();

        }

    }

    private String downloadUrl(String myurl) throws IOException {
        InputStream is = null;
        // Only display the first 500 characters of the retrieved
        // web page content.
        int len = 5000;

        HttpURLConnection conn = null;
        StringBuilder result = null;
        try {
            URL url = new URL(myurl);
            Log.d(TAG, "downloadUrl: " + myurl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(10000 /* milliseconds */);
            conn.setConnectTimeout(15000 /* milliseconds */);
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("charset", "utf-8");
            conn.setUseCaches(false);

            // Starts the query
            conn.connect();
            JSONArray jsonSync = new JSONArray();
            DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
            DatabaseHelper db = new DatabaseHelper(mContext);
                /*ollection<EligiblesContract> eligibles = db.getAllEligibles();
                Log.d(TAG, String.valueOf(eligibles.size()));
                for (EligiblesContract fc : eligibles) {

                    jsonSync.put(fc.toJSONObject());

                }*/
            JSONObject json = new JSONObject();
            try {
                json.put("cluster", AppMain.curCluster);
            } catch (JSONException e1) {
                e1.printStackTrace();
            }
            Log.d(TAG, "downloadUrl: " + json.toString());
            wr.writeBytes(json.toString());
            longInfo(jsonSync.toString().replace("\uFEFF", "") + "\n");
            wr.flush();
            wr.close();

            InputStream in = new BufferedInputStream(conn.getInputStream());
            /*String contentAsString = readIt(in, len);
            return contentAsString;*/

            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            result = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                Log.i(TAG, "Eligible In: " + line);
                result.append(line);
                // Makes sure that the InputStream is closed after the app is
                // finished using it.
            }
        } catch (Exception e) {
            e.printStackTrace();


        } finally {
            conn.disconnect();
        }


        return result.toString();
    }

    public String readIt(InputStream stream, int len) throws IOException {
        Reader reader = null;
        reader = new InputStreamReader(stream, "UTF-8");
        char[] buffer = new char[len];
        reader.read(buffer);
        return new String(buffer);
    }
}