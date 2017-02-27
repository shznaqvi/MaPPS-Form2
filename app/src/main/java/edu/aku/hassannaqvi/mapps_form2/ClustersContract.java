package edu.aku.hassannaqvi.mapps_form2;

import android.database.Cursor;
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

    public ClustersContract Sync(JSONObject jsonObject) throws JSONException {
        this._ID= jsonObject.getLong(singleCluster._ID);
        this.clusterId= jsonObject.getString(singleCluster.CLUSTERID);
        this.clusterName= jsonObject.getString(singleCluster.CLUSTERNAME);

        return this;

    }

    public ClustersContract Hydrate(Cursor cursor) {
        this._ID = cursor.getLong(cursor.getColumnIndex(singleCluster._ID));
        this.clusterId = cursor.getString(cursor.getColumnIndex(singleCluster.CLUSTERID));
        this.clusterName = cursor.getString(cursor.getColumnIndex(singleCluster.CLUSTERNAME));

        return this;
    }

    public Long get_ID() {
        return _ID;
    }

    public void set_ID(Long _ID) {
        this._ID = _ID;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(singleCluster._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(singleCluster.CLUSTERID, this.clusterId == null ? JSONObject.NULL : this.clusterId);
        json.put(singleCluster.CLUSTERNAME, this.clusterName == null ? JSONObject.NULL : this.clusterName);
        return json;
    }


    public static abstract class singleCluster implements BaseColumns {

        public static final String TABLE_NAME = "clusters";
        public static final String _ID = "_id";
        public static final String CLUSTERID = "clusterid";
        public static final String CLUSTERNAME = "clustername";

        public static final String _URI = "getclusters.php";
    }
}
