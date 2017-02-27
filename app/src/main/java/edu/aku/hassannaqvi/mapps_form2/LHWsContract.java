package edu.aku.hassannaqvi.mapps_form2;

import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class LHWsContract {

    private static final String TAG = "Lhws_CONTRACT";
    Long _ID;
    String lhwId;
    String lhwName;
    String clusterName;
    String clusterCode;


    public LHWsContract() {
        // Default Constructor
    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(singleLhw._ID, this._ID == null ? JSONObject.NULL : this._ID);


        return json;
    }


    public static abstract class singleLhw implements BaseColumns {

        public static final String TABLE_NAME = "lhws";
        public static final String _ID = "id";


        public static final String _URI = "getlhws.php";
    }
}
