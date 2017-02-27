package edu.aku.hassannaqvi.mapps_form2;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import org.json.*;

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

    public Long get_ID() {
        return _ID;
    }

    public void set_ID(Long _ID) {
        this._ID = _ID;
    }

    public String getLhwId() {
        return lhwId;
    }

    public void setLhwId(String lhwId) {
        this.lhwId = lhwId;
    }

    public String getLhwName() {
        return lhwName;
    }

    public void setLhwName(String lhwName) {
        this.lhwName = lhwName;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getClusterCode() {
        return clusterCode;
    }

    public void setClusterCode(String clusterCode) {
        this.clusterCode = clusterCode;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(singleLhw._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(singleLhw.LHWID, this.lhwId == null ? JSONObject.NULL : this.lhwId);
        json.put(singleLhw.LHWNAME, this.lhwName == null ? JSONObject.NULL : this.lhwName);
        json.put(singleLhw.CLUSTERNAME, this.clusterName == null ? JSONObject.NULL : this.clusterName);
        json.put(singleLhw.CLUSTERCODE, this.clusterCode == null ? JSONObject.NULL : this.clusterCode);
        return json;
    }

    public LHWsContract Sync(JSONObject jsonObject) throws JSONException {
        this._ID= jsonObject.getLong(singleLhw._ID);
        this.lhwId= jsonObject.getString(singleLhw.LHWID);
        this.lhwName= jsonObject.getString(singleLhw.LHWNAME);
        this.clusterName= jsonObject.getString(singleLhw.CLUSTERNAME);
        this.clusterCode= jsonObject.getString(singleLhw.CLUSTERCODE);

        return this;

    }

    public LHWsContract Hydrate(Cursor cursor) {
        this._ID = cursor.getLong(cursor.getColumnIndex(singleLhw._ID));
        this.lhwId = cursor.getString(cursor.getColumnIndex(singleLhw.LHWID));
        this.lhwName = cursor.getString(cursor.getColumnIndex(singleLhw.LHWNAME));
        this.clusterName = cursor.getString(cursor.getColumnIndex(singleLhw.CLUSTERNAME));
        this.clusterCode = cursor.getString(cursor.getColumnIndex(singleLhw.CLUSTERCODE));

        return this;
    }


    public static abstract class singleLhw implements BaseColumns {

        public static final String TABLE_NAME = "lhws";
        public static final String _ID = "id";
        public static final String LHWID = "lhwid";
        public static final String LHWNAME = "lhwname";
        public static final String CLUSTERNAME = "clustername";
        public static final String CLUSTERCODE = "clustercode";


        public static final String _URI = "getlhws.php";
    }
}
