package edu.aku.hassannaqvi.mapps_form11.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 12/2/2016.
 */
public class FollowupsContract {
    private static final String TAG = "FOLLOWUPS_CONTRACT";

    private Long _ID;

    // for child level Randomisation

    private String LUID; // Link UID from Source
    private String subAreaCode; // Cluster
    private String lhwCode; // Cluster
    private String houseHold;  // Structure
    private String women_name;
    private String fupdate;
    private String sno;
    private String s1;

    public FollowupsContract() {

    }

    public FollowupsContract(FollowupsContract fc) {

        this.LUID = fc.LUID;
        this.subAreaCode = fc.subAreaCode;
        this.lhwCode = fc.lhwCode;
        this.houseHold = fc.houseHold;
        this.women_name = fc.women_name;
        this.sno = fc.sno;
        this.s1 = fc.s1;

    }


    public FollowupsContract Sync(JSONObject jsonObject) throws JSONException {
        this.LUID = jsonObject.getString(FollowupsTable.COLUMN_NAME_LUID);
        this.subAreaCode = jsonObject.getString(FollowupsTable.COLUMN_NAME_SUBAREACODE);
        this.lhwCode = jsonObject.getString(FollowupsTable.COLUMN_NAME_LHWCODE);
        this.houseHold = jsonObject.getString(FollowupsTable.COLUMN_NAME_HOUSEHOLD);
        this.women_name = jsonObject.getString(FollowupsTable.COLUMN_NAME_WOMEN_NAME);


        this.fupdate = jsonObject.getString(FollowupsTable.COLUMN_NAME_FUP_DATE_F4);


        this.sno = jsonObject.getString(FollowupsTable.COLUMN_NAME_SNO);
        this.s1 = jsonObject.getString(FollowupsTable.COLUMN_NAME_S1);
        return this;

    }

    public FollowupsContract Hydrate(Cursor cursor) {
        this.LUID = cursor.getString(cursor.getColumnIndex(FollowupsTable.COLUMN_NAME_LUID));
        this.subAreaCode = cursor.getString(cursor.getColumnIndex(FollowupsTable.COLUMN_NAME_SUBAREACODE));
        this.lhwCode = cursor.getString(cursor.getColumnIndex(FollowupsTable.COLUMN_NAME_LHWCODE));
        this.houseHold = cursor.getString(cursor.getColumnIndex(FollowupsTable.COLUMN_NAME_HOUSEHOLD));
        this.women_name = cursor.getString(cursor.getColumnIndex(FollowupsTable.COLUMN_NAME_WOMEN_NAME));
        this.fupdate = cursor.getString(cursor.getColumnIndex(FollowupsTable.COLUMN_NAME_FUP_DATE));
        this.sno = cursor.getString(cursor.getColumnIndex(FollowupsTable.COLUMN_NAME_SNO));
        this.s1 = cursor.getString(cursor.getColumnIndex(FollowupsTable.COLUMN_NAME_S1));
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

    public String getSubAreaCode() {
        return subAreaCode;
    }

    public void setSubAreaCode(String subAreaCode) {
        this.subAreaCode = subAreaCode;
    }

    public String getHouseHold() {
        return houseHold;
    }

    public void setHouseHold(String houseHold) {
        this.houseHold = houseHold;
    }

    public String getWomen_name() {
        return women_name;
    }

    public void setWomen_name(String women_name) {
        this.women_name = women_name;
    }

    public String getLhwCode() {
        return lhwCode;
    }

    public void setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
    }

    public String getFupdate() {
        return fupdate;
    }

    public void setFupdate(String fupdate) {
        this.fupdate = fupdate;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FollowupsTable._ID, this._ID);
        json.put(FollowupsTable.COLUMN_NAME_LUID, this.LUID);
        json.put(FollowupsTable.COLUMN_NAME_SUBAREACODE, this.subAreaCode);
        json.put(FollowupsTable.COLUMN_NAME_LHWCODE, this.lhwCode);
        json.put(FollowupsTable.COLUMN_NAME_HOUSEHOLD, this.houseHold);
        json.put(FollowupsTable.COLUMN_NAME_WOMEN_NAME, this.women_name);
        json.put(FollowupsTable.COLUMN_NAME_FUP_DATE, this.fupdate);
        json.put(FollowupsTable.COLUMN_NAME_SNO, this.sno);
        json.put(FollowupsTable.COLUMN_NAME_S1, this.s1);

        return json;
    }

    public static abstract class FollowupsTable implements BaseColumns {

        public static final String _URI = "annual_followups.php";

        public static final String TABLE_NAME = "followups";

        public static final String _ID = "id";
        public static final String COLUMN_NAME_LUID = "uid";
        public static final String COLUMN_NAME_SUBAREACODE = "clustercode";
        public static final String COLUMN_NAME_LHWCODE = "lhwcode";
        public static final String COLUMN_NAME_HOUSEHOLD = "hhno";
        public static final String COLUMN_NAME_WOMEN_NAME = "epname";
        public static final String COLUMN_NAME_FUP_DATE = "fupdt";
        public static final String COLUMN_NAME_FUP_DATE_F4 = "fdate_f4";
        public static final String COLUMN_NAME_SNO = "sno";
        public static final String COLUMN_NAME_S1 = "s1";

        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String _URIGET = "annual_followups.php";

        public static final String _URIGET1 = "getenrolled.php";
    }

}
