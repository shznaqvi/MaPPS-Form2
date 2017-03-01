package edu.aku.hassannaqvi.mapps_form2;

/**
 * Created by Ali on 01-Mar-17.
 */

public class EligibleParticipants {

    String uid,wname;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public EligibleParticipants(String uid, String wname) {
        this.uid = uid;
        this.wname = wname;
    }
}
