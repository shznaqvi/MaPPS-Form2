package edu.aku.hassannaqvi.mapps_form2.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mapps_form2.AppMain;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class ParticipantsContract {
    private static final String TAG = "PARTICIPANTS_CONTRACT";

    private String projectName = "MaPPS Study";
    private String surveyType = "Form 02: Enrolment and Baseline Assessment";
    private Long _ID;
    private String UID = "";
    private String UUID = ""; // UID of main form (fc)
    private String LUID = ""; // UID of main form (fc)
    private String formDate = ""; // Date of main form (fc)
    private String interviewer01 = ""; // Interviewer 01 from main form
    private String interviewer02 = ""; // Interviewer 02 from main form
    private String istatus = ""; // Interview Status
    private String clustercode = "0000"; // Area Code
    private String household = ""; // Household number
    private String lhwCode = ""; // lhwcode

    private String sCB = "";
    private String sCC = "";
    private String sCD = "";
    private String sCE = "";
    private String sCF = "";
    private String sCG = "";
    private String sCHA = "";
    private String sCHB = "";
    private String sCHC = "";
    private String sD = "";
    private String sE = "";
    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsTime = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String app_version = AppMain.versionName + "." + AppMain.versionCode;
    private String synced = "";
    private String synced_date = "";

    public ParticipantsContract() {
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSurveyType() {
        return surveyType;
    }

    public void setSurveyType(String surveyType) {
        this.surveyType = surveyType;
    }

    public Long getID() {
        return _ID;
    }

    public void setID(Long _ID) {
        this._ID = _ID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getLUID() {
        return LUID;
    }

    public void setLUID(String LUID) {
        this.LUID = LUID;
    }

    public String getFormDate() {
        return formDate;
    }

    public void setFormDate(String formDate) {
        this.formDate = formDate;
    }

    public String getInterviewer01() {
        return interviewer01;
    }

    public void setInterviewer01(String interviewer01) {
        this.interviewer01 = interviewer01;
    }

    public String getInterviewer02() {
        return interviewer02;
    }

    public void setInterviewer02(String interviewer02) {
        this.interviewer02 = interviewer02;
    }

    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }

    public String getsCB() {
        return sCB;
    }

    public void setsCB(String sCB) {
        this.sCB = sCB;
    }

    public String getsCC() {
        return sCC;
    }

    public void setsCC(String sCC) {
        this.sCC = sCC;
    }

    public String getsCD() {
        return sCD;
    }

    public void setsCD(String sCD) {
        this.sCD = sCD;
    }

    public String getsCE() {
        return sCE;
    }

    public void setsCE(String sCE) {
        this.sCE = sCE;
    }

    public String getsCF() {
        return sCF;
    }

    public void setsCF(String sCF) {
        this.sCF = sCF;
    }

    public String getsCG() {
        return sCG;
    }

    public void setsCG(String sCG) {
        this.sCG = sCG;
    }

    public String getsCHA() {
        return sCHA;
    }

    public void setsCHA(String sCHA) {
        this.sCHA = sCHA;
    }

    public String getsCHB() {
        return sCHB;
    }

    public void setsCHB(String sCHB) {
        this.sCHB = sCHB;
    }

    public String getsCHC() {
        return sCHC;
    }

    public void setsCHC(String sCHC) {
        this.sCHC = sCHC;
    }

    public String getsD() {
        return sD;
    }

    public void setsD(String sD) {
        this.sD = sD;
    }

    public String getsE() {
        return sE;
    }

    public void setsE(String sE) {
        this.sE = sE;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;
    }

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }

    public String getClustercode() {
        return clustercode;
    }

    public void setClustercode(String clustercode) {
        this.clustercode = clustercode;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getLhwCode() {
        return lhwCode;
    }

    public void setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
    }

    public ParticipantsContract Sync(JSONObject jsonObject) throws JSONException {
        this.projectName = jsonObject.getString(ParticipantColumns.COLUMN_PROJECTNAME);
        this.surveyType = jsonObject.getString(ParticipantColumns.COLUMN_SURVEYTYPE);
        this._ID = jsonObject.getLong(ParticipantColumns.COLUMN__ID);
        this.UID = jsonObject.getString(ParticipantColumns.COLUMN_UID);
        this.UUID = jsonObject.getString(ParticipantColumns.COLUMN_UUID);
        this.LUID = jsonObject.getString(ParticipantColumns.COLUMN_LUID);
        this.formDate = jsonObject.getString(ParticipantColumns.COLUMN_FORMDATE);
        this.interviewer01 = jsonObject.getString(ParticipantColumns.COLUMN_INTERVIEWER01);
        this.interviewer02 = jsonObject.getString(ParticipantColumns.COLUMN_INTERVIEWER02);
        this.istatus = jsonObject.getString(ParticipantColumns.COLUMN_ISTATUS);
        this.clustercode = jsonObject.getString(ParticipantColumns.COLUMN_CLUSTERCODE);
        this.household = jsonObject.getString(ParticipantColumns.COLUMN_HOUSEHOLD);
        this.lhwCode = jsonObject.getString(ParticipantColumns.COLUMN_LHWCODE);
        this.sCB = jsonObject.getString(ParticipantColumns.COLUMN_SCB);
        this.sCC = jsonObject.getString(ParticipantColumns.COLUMN_SCC);
        this.sCD = jsonObject.getString(ParticipantColumns.COLUMN_SCD);
        this.sCE = jsonObject.getString(ParticipantColumns.COLUMN_SCE);
        this.sCF = jsonObject.getString(ParticipantColumns.COLUMN_SCF);
        this.sCG = jsonObject.getString(ParticipantColumns.COLUMN_SCG);
        this.sCHA = jsonObject.getString(ParticipantColumns.COLUMN_SCHA);
        this.sCHB = jsonObject.getString(ParticipantColumns.COLUMN_SCHB);
        this.sCHC = jsonObject.getString(ParticipantColumns.COLUMN_SCHC);
        this.sD = jsonObject.getString(ParticipantColumns.COLUMN_SD);
        this.sE = jsonObject.getString(ParticipantColumns.COLUMN_SE);
        this.deviceID = jsonObject.getString(ParticipantColumns.COLUMN_DEVICEID);
        this.app_version = jsonObject.getString(ParticipantColumns.COLUMN_APP_VERSION);
        this.synced = jsonObject.getString(ParticipantColumns.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(ParticipantColumns.COLUMN_SYNCED_DATE);

        return this;

    }

    public ParticipantsContract Hydrate(Cursor cursor) {
        this.projectName = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_PROJECTNAME));
        this.surveyType = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SURVEYTYPE));
        this._ID = cursor.getLong(cursor.getColumnIndex(ParticipantColumns.COLUMN__ID));
        this.UID = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_UID));
        this.UUID = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_UUID));
        this.LUID = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_LUID));
        this.formDate = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_FORMDATE));
        this.interviewer01 = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_INTERVIEWER01));
        this.interviewer02 = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_INTERVIEWER02));
        this.clustercode = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_CLUSTERCODE));
        this.household = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_HOUSEHOLD));
        this.lhwCode = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_LHWCODE));
        this.istatus = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_ISTATUS));
        this.sCB = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SCB));
        this.sCC = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SCC));
        this.sCD = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SCD));
        this.sCE = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SCE));
        this.sCF = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SCF));
        this.sCG = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SCG));
        this.sCHA = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SCHA));
        this.sCHB = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SCHB));
        this.sCHC = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SCHC));
        this.sD = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SD));
        this.sE = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SE));
        this.deviceID = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_DEVICEID));
        this.app_version = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_APP_VERSION));
        this.synced = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(ParticipantColumns.COLUMN_SYNCED_DATE));


        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(ParticipantColumns.COLUMN_PROJECTNAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(ParticipantColumns.COLUMN_SURVEYTYPE, this.surveyType == null ? JSONObject.NULL : this.surveyType);
        json.put(ParticipantColumns.COLUMN__ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(ParticipantColumns.COLUMN_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(ParticipantColumns.COLUMN_UUID, this.UUID == null ? JSONObject.NULL : this.UUID);
        json.put(ParticipantColumns.COLUMN_LUID, this.LUID == null ? JSONObject.NULL : this.LUID);
        json.put(ParticipantColumns.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(ParticipantColumns.COLUMN_INTERVIEWER01, this.interviewer01 == null ? JSONObject.NULL : this.interviewer01);
        json.put(ParticipantColumns.COLUMN_INTERVIEWER02, this.interviewer02 == null ? JSONObject.NULL : this.interviewer02);
        json.put(ParticipantColumns.COLUMN_CLUSTERCODE, this.clustercode == null ? JSONObject.NULL : this.clustercode);
        json.put(ParticipantColumns.COLUMN_HOUSEHOLD, this.household == null ? JSONObject.NULL : this.household);
        json.put(ParticipantColumns.COLUMN_LHWCODE, this.lhwCode == null ? JSONObject.NULL : this.lhwCode);
        json.put(ParticipantColumns.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);
        json.put(ParticipantColumns.COLUMN_SCB, this.sCB == null ? JSONObject.NULL : new JSONObject(this.sCB));
        json.put(ParticipantColumns.COLUMN_SCC, this.sCC == null ? JSONObject.NULL : new JSONObject(this.sCC));
        json.put(ParticipantColumns.COLUMN_SCD, this.sCD == null ? JSONObject.NULL : new JSONObject(this.sCD));
        json.put(ParticipantColumns.COLUMN_SCE, this.sCE == null ? JSONObject.NULL : new JSONObject(this.sCE));
        json.put(ParticipantColumns.COLUMN_SCF, this.sCF == null ? JSONObject.NULL : new JSONObject(this.sCF));
        json.put(ParticipantColumns.COLUMN_SCG, this.sCG == null ? JSONObject.NULL : new JSONObject(this.sCG));
        json.put(ParticipantColumns.COLUMN_SCHA, this.sCHA == null ? JSONObject.NULL : new JSONObject(this.sCHA));
        json.put(ParticipantColumns.COLUMN_SCHB, this.sCHB == null ? JSONObject.NULL : new JSONObject(this.sCHB));
        json.put(ParticipantColumns.COLUMN_SCHC, this.sCHC == null ? JSONObject.NULL : new JSONObject(this.sCHC));
        json.put(ParticipantColumns.COLUMN_SD, this.sD == null ? JSONObject.NULL : new JSONObject(this.sD));
        json.put(ParticipantColumns.COLUMN_SE, this.sE == null ? JSONObject.NULL : new JSONObject(this.sE));
        json.put(ParticipantColumns.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(ParticipantColumns.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(ParticipantColumns.COLUMN_GPSTIME, this.gpsTime == null ? JSONObject.NULL : this.gpsTime);
        json.put(ParticipantColumns.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(ParticipantColumns.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(ParticipantColumns.COLUMN_APP_VERSION, this.app_version == null ? JSONObject.NULL : this.app_version);
        json.put(ParticipantColumns.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(ParticipantColumns.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);


        return json;
    }

    public static abstract class ParticipantColumns implements BaseColumns {

        public static final String TABLE_NAME = "participants";
        public static final String _URL = "participants.php";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";

        public static final String COLUMN_PROJECTNAME = "projectname";
        public static final String COLUMN_SURVEYTYPE = "surveytype";
        public static final String COLUMN__ID = "_id";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_UUID = "uuid";
        public static final String COLUMN_LUID = "l_uid";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_INTERVIEWER01 = "interviewer01";
        public static final String COLUMN_INTERVIEWER02 = "interviewer02";
        public static final String COLUMN_CLUSTERCODE = "clustercode";
        public static final String COLUMN_HOUSEHOLD = "household";
        public static final String COLUMN_LHWCODE = "lhwcode";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_SCB = "scb";
        public static final String COLUMN_SCC = "scc";
        public static final String COLUMN_SCD = "scd";
        public static final String COLUMN_SCE = "sce";
        public static final String COLUMN_SCF = "scf";
        public static final String COLUMN_SCG = "scg";
        public static final String COLUMN_SCHA = "scha";
        public static final String COLUMN_SCHB = "schb";
        public static final String COLUMN_SCHC = "schc";
        public static final String COLUMN_SD = "sd";
        public static final String COLUMN_SE = "se";
        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSTIME = "gpstime";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_APP_VERSION = "app_version";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";


    }
}
