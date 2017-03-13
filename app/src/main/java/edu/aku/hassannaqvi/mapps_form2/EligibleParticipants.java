package edu.aku.hassannaqvi.mapps_form2;

/**
 * Created by Ali on 01-Mar-17.
 */

public class EligibleParticipants {

    String l_uid,wname;

    public String getL_uid() {
        return l_uid;
    }

    public void setL_uid(String l_uid) {
        this.l_uid = l_uid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public EligibleParticipants(String l_uid, String wname) {
        this.l_uid = l_uid;
        this.wname = wname;
    }
}
