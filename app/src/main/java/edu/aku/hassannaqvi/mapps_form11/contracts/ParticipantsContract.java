package edu.aku.hassannaqvi.mapps_form11.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

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
    /*private String sCF = "";
    private String sCG = "";
    private String sCH = "";*/
    private String sCFA = "";
    private String sCFB = "";
    private String sCFC = "";
    private String sD = "";
    private String sE = "";
    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsTime = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String tagID = "";
    private String app_version = "";
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

    /*public String getsCF() {
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

    public String getsCH() {
        return sCH;
    }

    public void setsCH(String sCH) {
        this.sCH = sCH;
    }
*/
    public String getsCFA() {
        return sCFA;
    }

    public void setsCFA(String sCFA) {
        this.sCFA = sCFA;
    }

    public String getsCFB() {
        return sCFB;
    }

    public void setsCFB(String sCFB) {
        this.sCFB = sCFB;
    }

    public String getsCFC() {
        return sCFC;
    }

    public void setsCFC(String sCFC) {
        this.sCFC = sCFC;
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

    public String getTagID() {
        return tagID;
    }

    public void setTagID(String tagID) {
        this.tagID = tagID;
    }

    public ParticipantsContract Sync(JSONObject jsonObject) throws JSONException {
        this.projectName = jsonObject.getString(ParticipantsTable.COLUMN_PROJECTNAME);
        this.surveyType = jsonObject.getString(ParticipantsTable.COLUMN_SURVEYTYPE);
        this._ID = jsonObject.getLong(ParticipantsTable.COLUMN__ID);
        this.UID = jsonObject.getString(ParticipantsTable.COLUMN_UID);
        this.UUID = jsonObject.getString(ParticipantsTable.COLUMN_UUID);
        this.LUID = jsonObject.getString(ParticipantsTable.COLUMN_LUID);
        this.formDate = jsonObject.getString(ParticipantsTable.COLUMN_FORMDATE);
        this.interviewer01 = jsonObject.getString(ParticipantsTable.COLUMN_INTERVIEWER01);
        this.interviewer02 = jsonObject.getString(ParticipantsTable.COLUMN_INTERVIEWER02);
        this.istatus = jsonObject.getString(ParticipantsTable.COLUMN_ISTATUS);
        this.clustercode = jsonObject.getString(ParticipantsTable.COLUMN_CLUSTERCODE);
        this.household = jsonObject.getString(ParticipantsTable.COLUMN_HOUSEHOLD);
        this.lhwCode = jsonObject.getString(ParticipantsTable.COLUMN_LHWCODE);
        this.sCB = jsonObject.getString(ParticipantsTable.COLUMN_SCB);
        this.sCC = jsonObject.getString(ParticipantsTable.COLUMN_SCC);
        this.sCD = jsonObject.getString(ParticipantsTable.COLUMN_SCD);
        this.sCE = jsonObject.getString(ParticipantsTable.COLUMN_SCE);
        /*this.sCF = jsonObject.getString(ParticipantsTable.COLUMN_SCF);
        this.sCG = jsonObject.getString(ParticipantsTable.COLUMN_SCG);
        this.sCH = jsonObject.getString(ParticipantsTable.COLUMN_SCH);*/
        this.sCFA = jsonObject.getString(ParticipantsTable.COLUMN_SCFA);
        this.sCFB = jsonObject.getString(ParticipantsTable.COLUMN_SCFB);
        this.sCFC = jsonObject.getString(ParticipantsTable.COLUMN_SCFC);
        this.sD = jsonObject.getString(ParticipantsTable.COLUMN_SD);
        this.sE = jsonObject.getString(ParticipantsTable.COLUMN_SE);
        this.deviceID = jsonObject.getString(ParticipantsTable.COLUMN_DEVICEID);
        this.tagID = jsonObject.getString(ParticipantsTable.COLUMN_DEVICETAGID);
        this.app_version = jsonObject.getString(ParticipantsTable.COLUMN_APP_VERSION);
        this.synced = jsonObject.getString(ParticipantsTable.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(ParticipantsTable.COLUMN_SYNCED_DATE);

        return this;

    }

    public ParticipantsContract Hydrate(Cursor cursor) {
        this.projectName = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_PROJECTNAME));
        this.surveyType = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SURVEYTYPE));
        this._ID = cursor.getLong(cursor.getColumnIndex(ParticipantsTable.COLUMN__ID));
        this.UID = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_UID));
        this.UUID = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_UUID));
        this.LUID = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_LUID));
        this.formDate = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_FORMDATE));
        this.interviewer01 = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_INTERVIEWER01));
        this.interviewer02 = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_INTERVIEWER02));
        this.clustercode = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_CLUSTERCODE));
        this.household = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_HOUSEHOLD));
        this.lhwCode = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_LHWCODE));
        this.istatus = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_ISTATUS));
        this.sCB = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SCB));
        this.sCC = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SCC));
        this.sCD = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SCD));
        this.sCE = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SCE));
        /*this.sCF = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SCF));
        this.sCG = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SCG));
        this.sCH = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SCH));*/
        this.sCFA = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SCFA));
        this.sCFB = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SCFB));
        this.sCFC = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SCFC));
        this.sD = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SD));
        this.sE = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SE));
        this.deviceID = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_DEVICEID));
        this.tagID = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_DEVICETAGID));
        this.app_version = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_APP_VERSION));
        this.synced = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(ParticipantsTable.COLUMN_SYNCED_DATE));


        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(ParticipantsTable.COLUMN_PROJECTNAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(ParticipantsTable.COLUMN_SURVEYTYPE, this.surveyType == null ? JSONObject.NULL : this.surveyType);
        json.put(ParticipantsTable.COLUMN__ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(ParticipantsTable.COLUMN_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(ParticipantsTable.COLUMN_UUID, this.UUID == null ? JSONObject.NULL : this.UUID);
        json.put(ParticipantsTable.COLUMN_LUID, this.LUID == null ? JSONObject.NULL : this.LUID);
        json.put(ParticipantsTable.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(ParticipantsTable.COLUMN_INTERVIEWER01, this.interviewer01 == null ? JSONObject.NULL : this.interviewer01);
        json.put(ParticipantsTable.COLUMN_INTERVIEWER02, this.interviewer02 == null ? JSONObject.NULL : this.interviewer02);
        json.put(ParticipantsTable.COLUMN_CLUSTERCODE, this.clustercode == null ? JSONObject.NULL : this.clustercode);
        json.put(ParticipantsTable.COLUMN_HOUSEHOLD, this.household == null ? JSONObject.NULL : this.household);
        json.put(ParticipantsTable.COLUMN_LHWCODE, this.lhwCode == null ? JSONObject.NULL : this.lhwCode);
        json.put(ParticipantsTable.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);

        try {
        if (!this.sCB.equals("")) {
            json.put(ParticipantsTable.COLUMN_SCB, this.sCB == null ? JSONObject.NULL : new JSONObject(this.sCB));
        }
        } catch (Exception e) {

        }

        try {
        if (!this.sCC.equals("")) {
            json.put(ParticipantsTable.COLUMN_SCC, this.sCC == null ? JSONObject.NULL : new JSONObject(this.sCC));
        }
        } catch (Exception e) {

        }
        try {
            if (!this.sCD.equals("")) {
                json.put(ParticipantsTable.COLUMN_SCD, this.sCD == null ? JSONObject.NULL : new JSONObject(this.sCD));
            }
        } catch (Exception e) {

        }

        try {
        if (!this.sCE.equals("")) {
            json.put(ParticipantsTable.COLUMN_SCE, this.sCE == null ? JSONObject.NULL : new JSONObject(this.sCE));
        }
        } catch (Exception e) {

        }

       /* try {
        if (!this.sCF.equals("")) {
            json.put(ParticipantsTable.COLUMN_SCF, this.sCF == null ? JSONObject.NULL : new JSONObject(this.sCF));
        }
        } catch (Exception e) {

        }

        try {
        if (!this.sCG.equals("")) {
            json.put(ParticipantsTable.COLUMN_SCG, this.sCG == null ? JSONObject.NULL : new JSONObject(this.sCG));
        }
        } catch (Exception e) {

        }

        try {
        if (!this.sCH.equals("")) {
            json.put(ParticipantsTable.COLUMN_SCH, this.sCH == null ? JSONObject.NULL : new JSONObject(this.sCH));
        }
        } catch (Exception e) {

        }
*/
        try {
            if (!this.sCFA.equals("")) {
                json.put(ParticipantsTable.COLUMN_SCFA, this.sCFA == null ? JSONObject.NULL : new JSONObject(this.sCFA));
        }
        } catch (Exception e) {

        }

        try {
            if (!this.sCFB.equals("")) {
                json.put(ParticipantsTable.COLUMN_SCFB, this.sCFB == null ? JSONObject.NULL : new JSONObject(this.sCFB));
        }
        } catch (Exception e) {

        }

        try {
            if (!this.sCFC.equals("")) {
                json.put(ParticipantsTable.COLUMN_SCFC, this.sCFC == null ? JSONObject.NULL : new JSONObject(this.sCFC));
        }
        } catch (Exception e) {

        }

        try {
        if (!this.sD.equals("")) {
        json.put(ParticipantsTable.COLUMN_SD, this.sD == null ? JSONObject.NULL : new JSONObject(this.sD));
        }
        } catch (Exception e) {

        }

        try {
        if (!this.sE.equals("")) {
        json.put(ParticipantsTable.COLUMN_SE, this.sE == null ? JSONObject.NULL : new JSONObject(this.sE));
        }
        } catch (Exception e) {

        }

        json.put(ParticipantsTable.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(ParticipantsTable.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(ParticipantsTable.COLUMN_GPSTIME, this.gpsTime == null ? JSONObject.NULL : this.gpsTime);
        json.put(ParticipantsTable.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(ParticipantsTable.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(ParticipantsTable.COLUMN_DEVICETAGID, this.tagID == null ? JSONObject.NULL : this.tagID);
        json.put(ParticipantsTable.COLUMN_APP_VERSION, this.app_version == null ? JSONObject.NULL : this.app_version);
        json.put(ParticipantsTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(ParticipantsTable.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);


        return json;
    }

    public static abstract class ParticipantsTable implements BaseColumns {

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
        /*public static final String COLUMN_SCF = "scf";
        public static final String COLUMN_SCG = "scg";
        public static final String COLUMN_SCH = "sch";
        */public static final String COLUMN_SCFA = "scfa";
        public static final String COLUMN_SCFB = "scfb";
        public static final String COLUMN_SCFC = "scfc";
        public static final String COLUMN_SD = "sd";
        public static final String COLUMN_SE = "se";
        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSTIME = "gpstime";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_APP_VERSION = "app_version";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "tagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";


    }
}
