package edu.aku.hassannaqvi.mapps_form11.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class FormsContract {

    private String projectName = "MaPPS Study";
    private String surveyType = "Form 11: Annual Follow-up Form - Year 1 (Preconception)";
    private Long _ID;
    private String UID = "";
    private String formDate = ""; // Date
    private String interviewer01 = ""; // Interviewer 01
    private String interviewer02 = ""; // Interviewer 02
    private String clustercode = "0000"; // Area Code
    private String villageacode = ""; // Sub-Area Code
    private String household = ""; // Household number
    private String istatus = ""; // Interview Status
    private String lhwCode = ""; // lhwcode
    private String sA = "";
    private String sBA = "";
    /*private String sBB = "";*/
    private String sCA = "";
    private String sCB = "";
    private String sCC = "";
    private String sCD = "";
    private String sCE = "";
    private String sCFA = "";
    private String sCFB = "";
    private String sCFC = "";
    private String sD = "";
    private String sE = "";
    private String sF = "";
    private String sG = "";
    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsTime = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String tagID = "";
    private String app_version = "";
    private String synced = "";
    private String synced_date = "";

    public FormsContract() {
    }

    public FormsContract(String formDate, String household, String istatus) {
        this.formDate = formDate;
        this.household = household;
        this.istatus = istatus;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getSurveyType() {
        return surveyType;
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

    public String getClustercode() {
        return clustercode;
    }

    public void setClustercode(String clustercode) {
        this.clustercode = clustercode;
    }

    public String getVillageacode() {
        return villageacode;
    }

    public void setVillageacode(String villageacode) {
        this.villageacode = villageacode;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }

    public String getsA() {
        return sA;
    }

    public void setsA(String sA) {
        this.sA = sA;
    }

    public String getsBA() {
        return sBA;
    }

    public void setsBA(String sBA) {
        this.sBA = sBA;
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

    public String getsCA() {
        return sCA;
    }

    public void setsCA(String sCA) {
        this.sCA = sCA;
    }

    /*public String getsBB() {
                return sBB;
            }

            public void setsBB(String sBB) {
                this.sBB = sBB;
            }
        */
    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }

    public String getGpsTime() {
        return gpsTime;
    }

    public void setGpsTime(String gpsTime) {
        this.gpsTime = gpsTime;
    }

    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
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

    public String getsF() {
        return sF;
    }

    public void setsF(String sF) {
        this.sF = sF;
    }

    public String getsG() {
        return sG;
    }

    public void setsG(String sG) {
        this.sG = sG;
    }

    public FormsContract Sync(JSONObject jsonObject) throws JSONException {
        this.projectName = jsonObject.getString(FormsTable.COLUMN_PROJECTNAME);
        this.surveyType = jsonObject.getString(FormsTable.COLUMN_SURVEYTYPE);
        this._ID = jsonObject.getLong(FormsTable.COLUMN__ID);
        this.UID = jsonObject.getString(FormsTable.COLUMN_UID);
        this.formDate = jsonObject.getString(FormsTable.COLUMN_FORMDATE);
        this.interviewer01 = jsonObject.getString(FormsTable.COLUMN_INTERVIEWER01);
        this.interviewer02 = jsonObject.getString(FormsTable.COLUMN_INTERVIEWER02);
        this.clustercode = jsonObject.getString(FormsTable.COLUMN_CLUSTERCODE);
        this.villageacode = jsonObject.getString(FormsTable.COLUMN_VILLAGEACODE);
        this.household = jsonObject.getString(FormsTable.COLUMN_HOUSEHOLD);
        this.lhwCode = jsonObject.getString(FormsTable.COLUMN_LHWCODE);
        this.istatus = jsonObject.getString(FormsTable.COLUMN_ISTATUS);
        this.sA = jsonObject.getString(FormsTable.COLUMN_SA);
        this.sBA = jsonObject.getString(FormsTable.COLUMN_SBA);
        this.sCA = jsonObject.getString(FormsTable.COLUMN_SCA);
        this.sCB = jsonObject.getString(FormsTable.COLUMN_SCB);
        this.sCC = jsonObject.getString(FormsTable.COLUMN_SCC);
        this.sCD = jsonObject.getString(FormsTable.COLUMN_SCD);
        this.sCE = jsonObject.getString(FormsTable.COLUMN_SCE);
        this.sCFA = jsonObject.getString(FormsTable.COLUMN_SCFA);
        this.sCFB = jsonObject.getString(FormsTable.COLUMN_SCFB);
        this.sCFC = jsonObject.getString(FormsTable.COLUMN_SCFC);
        this.sD = jsonObject.getString(FormsTable.COLUMN_SD);
        this.sE = jsonObject.getString(FormsTable.COLUMN_SE);
        this.sF = jsonObject.getString(FormsTable.COLUMN_SF);
        this.sG = jsonObject.getString(FormsTable.COLUMN_SG);
        //this.sBB = jsonObject.getString(FormsTable.COLUMN_SBB);
        this.gpsLat = jsonObject.getString(FormsTable.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(FormsTable.COLUMN_GPSLNG);
        this.gpsTime = jsonObject.getString(FormsTable.COLUMN_GPSTIME);
        this.gpsAcc = jsonObject.getString(FormsTable.COLUMN_GPSACC);
        this.deviceID = jsonObject.getString(FormsTable.COLUMN_DEVICEID);
        this.tagID = jsonObject.getString(FormsTable.COLUMN_DEVICETAGID);
        this.app_version = jsonObject.getString(FormsTable.COLUMN_APP_VERSION);
        this.synced = jsonObject.getString(FormsTable.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);

        return this;

    }

    public FormsContract Hydrate(Cursor cursor) {
        this.projectName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_PROJECTNAME));
        this.surveyType = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SURVEYTYPE));
        this._ID = cursor.getLong(cursor.getColumnIndex(FormsTable.COLUMN__ID));
        this.UID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UID));
        this.formDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_FORMDATE));
        this.interviewer01 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_INTERVIEWER01));
        this.interviewer02 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_INTERVIEWER02));
        this.clustercode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_CLUSTERCODE));
        this.villageacode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_VILLAGEACODE));
        this.household = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HOUSEHOLD));
        this.lhwCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_LHWCODE));
        this.istatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.sA = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SA));
        this.sBA = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SBA));
        this.sCA = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SCA));
        this.sCB = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SCB));
        this.sCC = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SCC));
        this.sCD = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SCD));
        this.sCE = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SCE));
        this.sCFA = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SCFA));
        this.sCFB = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SCFB));
        this.sCFC = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SCFC));
        this.sD = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SD));
        this.sE = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SE));
        this.sF = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SF));
        this.sG = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SG));
        //this.sBB = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SBB));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLNG));
        this.gpsTime = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSTIME));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.tagID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.app_version = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_APP_VERSION));
        this.synced = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED_DATE));

        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_PROJECTNAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(FormsTable.COLUMN_SURVEYTYPE, this.surveyType == null ? JSONObject.NULL : this.surveyType);
        json.put(FormsTable.COLUMN__ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(FormsTable.COLUMN_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(FormsTable.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(FormsTable.COLUMN_INTERVIEWER01, this.interviewer01 == null ? JSONObject.NULL : this.interviewer01);
        json.put(FormsTable.COLUMN_INTERVIEWER02, this.interviewer02 == null ? JSONObject.NULL : this.interviewer02);
        json.put(FormsTable.COLUMN_CLUSTERCODE, this.clustercode == null ? JSONObject.NULL : this.clustercode);
        json.put(FormsTable.COLUMN_VILLAGEACODE, this.villageacode == null ? JSONObject.NULL : this.villageacode);
        json.put(FormsTable.COLUMN_HOUSEHOLD, this.household == null ? JSONObject.NULL : this.household);
        json.put(FormsTable.COLUMN_LHWCODE, this.lhwCode == null ? JSONObject.NULL : this.lhwCode);
        json.put(FormsTable.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);

        try {
            if (!this.sA.equals("")) {
                json.put(FormsTable.COLUMN_SA, this.sA == null ? JSONObject.NULL : new JSONObject(this.sA));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sBA.equals("")) {
                json.put(FormsTable.COLUMN_SBA, this.sBA == null ? JSONObject.NULL : new JSONObject(this.sBA));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sCA.equals("")) {
                json.put(FormsTable.COLUMN_SCA, this.sCA == null ? JSONObject.NULL : new JSONObject(this.sCA));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sCB.equals("")) {
                json.put(FormsTable.COLUMN_SCB, this.sCB == null ? JSONObject.NULL : new JSONObject(this.sCB));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sCC.equals("")) {
                json.put(FormsTable.COLUMN_SCC, this.sCC == null ? JSONObject.NULL : new JSONObject(this.sCC));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sCD.equals("")) {
                json.put(FormsTable.COLUMN_SCD, this.sCD == null ? JSONObject.NULL : new JSONObject(this.sCD));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sCE.equals("")) {
                json.put(FormsTable.COLUMN_SCE, this.sCE == null ? JSONObject.NULL : new JSONObject(this.sCE));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sCFA.equals("")) {
                json.put(FormsTable.COLUMN_SCFA, this.sCFA == null ? JSONObject.NULL : new JSONObject(this.sCFA));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sCFB.equals("")) {
                json.put(FormsTable.COLUMN_SCFB, this.sCFB == null ? JSONObject.NULL : new JSONObject(this.sCFB));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sCFC.equals("")) {
                json.put(FormsTable.COLUMN_SCFC, this.sCFC == null ? JSONObject.NULL : new JSONObject(this.sCFC));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sD.equals("")) {
                json.put(FormsTable.COLUMN_SD, this.sD == null ? JSONObject.NULL : new JSONObject(this.sD));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sE.equals("")) {
                json.put(FormsTable.COLUMN_SE, this.sE == null ? JSONObject.NULL : new JSONObject(this.sE));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sF.equals("")) {
                json.put(FormsTable.COLUMN_SF, this.sF == null ? JSONObject.NULL : new JSONObject(this.sF));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sG.equals("")) {
                json.put(FormsTable.COLUMN_SG, this.sG == null ? JSONObject.NULL : new JSONObject(this.sG));
            }
        } catch (Exception e) {

        }

        json.put(FormsTable.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(FormsTable.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(FormsTable.COLUMN_GPSTIME, this.gpsTime == null ? JSONObject.NULL : this.gpsTime);
        json.put(FormsTable.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.tagID == null ? JSONObject.NULL : this.tagID);
        json.put(FormsTable.COLUMN_APP_VERSION, this.app_version == null ? JSONObject.NULL : this.app_version);
        json.put(FormsTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(FormsTable.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);


        return json;
    }

    public static abstract class FormsTable implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String _URL = "forms11b.php";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";

        public static final String COLUMN_PROJECTNAME = "projectname";
        public static final String COLUMN_SURVEYTYPE = "surveytype";
        public static final String COLUMN__ID = "_id";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_INTERVIEWER01 = "interviewer01";
        public static final String COLUMN_INTERVIEWER02 = "interviewer02";
        public static final String COLUMN_CLUSTERCODE = "clustercode";
        public static final String COLUMN_VILLAGEACODE = "villageacode";
        public static final String COLUMN_HOUSEHOLD = "household";
        public static final String COLUMN_LHWCODE = "lhwcode";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_SA = "sa";
        public static final String COLUMN_SBA = "sba";
        public static final String COLUMN_SCA = "sca";
        public static final String COLUMN_SCB = "scb";
        public static final String COLUMN_SCC = "scc";
        public static final String COLUMN_SCD = "scd";
        public static final String COLUMN_SCE = "sce";
        public static final String COLUMN_SCFA = "scfa";
        public static final String COLUMN_SCFB = "scfb";
        public static final String COLUMN_SCFC = "scfc";
        public static final String COLUMN_SD = "sd";
        public static final String COLUMN_SE = "se";
        public static final String COLUMN_SF = "sf";
        public static final String COLUMN_SG = "sg";
        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSTIME = "gpstime";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "tagid";
        public static final String COLUMN_APP_VERSION = "app_version";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
    }
}
