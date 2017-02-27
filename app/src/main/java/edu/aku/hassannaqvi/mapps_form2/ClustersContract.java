package edu.aku.hassannaqvi.mapps_form2;

import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class ClustersContract {

    private static final String TAG = "Clusters_CONTRACT";
    Long _ID;
    String clusterId;
    String clusterName;


    public ClustersContract() {
        // Default Constructor
    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(singleCluster._ID, this._ID == null ? JSONObject.NULL : this._ID);


        return json;
    }


    public static abstract class singleCluster implements BaseColumns {

        public static final String TABLE_NAME = "clusters";
        public static final String _ID = "id";


        public static final String _URI = "getclusters.php";
    }
}
