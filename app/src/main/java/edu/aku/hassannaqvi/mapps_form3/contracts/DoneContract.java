package edu.aku.hassannaqvi.mapps_form3.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 12/2/2016.
 */
public class DoneContract
{
    private static final String TAG = "DONE_CONTRACT";

    private Long _ID;

    // for child level Randomisation

    private String UID;
    private String LUID; // Link UID from Source


    public DoneContract Sync(JSONObject jsonObject) throws JSONException {
        this.UID = jsonObject.getString(DoneTable.COLUMN_NAME_UID);
        this.LUID = jsonObject.getString(DoneTable.COLUMN_NAME_LUID);
        return this;

    }

    public DoneContract Hydrate(Cursor cursor) {
        this.UID = cursor.getString(cursor.getColumnIndex(DoneTable.COLUMN_NAME_UID));
        this.LUID = cursor.getString(cursor.getColumnIndex(DoneTable.COLUMN_NAME_LUID));
        return this;
    }

    public Long get_ID() {
        return _ID;
    }

    public void set_ID(Long _ID) {
        this._ID = _ID;
    }

    public String getLUID() {
        return LUID;
    }

    public void setLUID(String LUID) {
        this.LUID = LUID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(DoneTable._ID, this._ID);
        json.put(DoneTable.COLUMN_NAME_UID, this.UID);
        json.put(DoneTable.COLUMN_NAME_LUID, this.LUID);


        return json;
    }

    public static abstract class DoneTable implements BaseColumns
    {

        public static final String _URI = "notdone.php";

        public static final String TABLE_NAME = "not_done";

        public static final String _ID = "id";
        public static final String COLUMN_NAME_UID = "uid";
        public static final String COLUMN_NAME_LUID = "l_uid";
        public static final String COLUMN_NAME_CLUSTER = "clustercode";

        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String _URIGET = "getnotdone.php";
    }

}
