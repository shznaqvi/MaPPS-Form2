package edu.aku.hassannaqvi.mapps_form2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.mapps_form2.EligiblesContract.singleWoman;
import edu.aku.hassannaqvi.mapps_form2.FormsContract.FormColumns;
import edu.aku.hassannaqvi.mapps_form2.ParticipantsContract.ParticipantColumns;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    /**
     * CREATE STRINGS
     */
    public static final String SQL_CREATE_USERS = "CREATE TABLE " + UsersContract.singleUser.TABLE_NAME + "("
            + UsersContract.singleUser._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersContract.singleUser.ROW_USERNAME + " TEXT,"
            + UsersContract.singleUser.ROW_PASSWORD + " TEXT );";
    private static final String DATABASE_NAME = "mapps_f2.db";
    private static final int DATABASE_VERSION = 1;
    private static final String SQL_CREATE_FORMS = "CREATE TABLE "
            + FormColumns.TABLE_NAME + "(" +
            FormColumns.COLUMN__ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            FormColumns.COLUMN_PROJECTNAME + " TEXT," +
            FormColumns.COLUMN_SURVEYTYPE + " TEXT," +
            FormColumns.COLUMN_UID + " TEXT," +
            FormColumns.COLUMN_FORMDATE + " TEXT," +
            FormColumns.COLUMN_INTERVIEWER01 + " TEXT," +
            FormColumns.COLUMN_INTERVIEWER02 + " TEXT," +
            FormColumns.COLUMN_CLUSTERCODE + " TEXT," +
            FormColumns.COLUMN_VILLAGEACODE + " TEXT," +
            FormColumns.COLUMN_HOUSEHOLD + " TEXT," +
            FormColumns.COLUMN_ISTATUS + " TEXT," +
            FormColumns.COLUMN_SA + " TEXT," +
            FormColumns.COLUMN_SBA + " TEXT," +
            FormColumns.COLUMN_SBB + " TEXT," +
            FormColumns.COLUMN_GPSLAT + " TEXT," +
            FormColumns.COLUMN_GPSLNG + " TEXT," +
            FormColumns.COLUMN_GPSTIME + " TEXT," +
            FormColumns.COLUMN_GPSACC + " TEXT," +
            FormColumns.COLUMN_DEVICEID + " TEXT," +
            FormColumns.COLUMN_SYNCED + " TEXT," +
            FormColumns.COLUMN_SYNCED_DATE + " TEXT"
            + " );";
    private static final String SQL_CREATE_PARTICIPANTS = "CREATE TABLE "
            + ParticipantColumns.TABLE_NAME + "("
            + ParticipantColumns.COLUMN_PROJECTNAME + " TEXT,"
            + ParticipantColumns.COLUMN_SURVEYTYPE + " TEXT,"
            + ParticipantColumns.COLUMN__ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ParticipantColumns.COLUMN_UID + " TEXT,"
            + ParticipantColumns.COLUMN_UUID + " TEXT,"
            + ParticipantColumns.COLUMN_FORMDATE + " TEXT,"
            + ParticipantColumns.COLUMN_INTERVIEWER01 + " TEXT,"
            + ParticipantColumns.COLUMN_INTERVIEWER02 + " TEXT,"
            + ParticipantColumns.COLUMN_ISTATUS + " TEXT,"
            + ParticipantColumns.COLUMN_SCA + " TEXT,"
            + ParticipantColumns.COLUMN_SCB + " TEXT,"
            + ParticipantColumns.COLUMN_SCC + " TEXT,"
            + ParticipantColumns.COLUMN_SCD + " TEXT,"
            + ParticipantColumns.COLUMN_SCE + " TEXT,"
            + ParticipantColumns.COLUMN_SCF + " TEXT,"
            + ParticipantColumns.COLUMN_SCG + " TEXT,"
            + ParticipantColumns.COLUMN_SCHA + " TEXT,"
            + ParticipantColumns.COLUMN_SCHB + " TEXT,"
            + ParticipantColumns.COLUMN_SCHBC + " TEXT,"
            + ParticipantColumns.COLUMN_SD + " TEXT,"
            + ParticipantColumns.COLUMN_SE + " TEXT,"
            + ParticipantColumns.COLUMN_GPSLAT + " TEXT,"
            + ParticipantColumns.COLUMN_GPSLNG + " TEXT,"
            + ParticipantColumns.COLUMN_GPSTIME + " TEXT,"
            + ParticipantColumns.COLUMN_GPSACC + " TEXT,"
            + ParticipantColumns.COLUMN_DEVICEID + " TEXT,"
            + ParticipantColumns.COLUMN_SYNCED + " TEXT,"
            + ParticipantColumns.COLUMN_SYNCED_DATE + " TEXT"
            + " );";
    private static final String SQL_CREATE_ELIGIBLES = "CREATE TABLE "
            + singleWoman.TABLE_NAME + "(" +
            singleWoman._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            singleWoman.COLUMN_NAME_LUID + " TEXT," +
            singleWoman.COLUMN_NAME_SUBAREACODE + " TEXT," +
            singleWoman.COLUMN_NAME_LHWCODE + " TEXT," +
            singleWoman.COLUMN_NAME_HOUSEHOLD + " TEXT," +
            singleWoman.COLUMN_NAME_WOMEN_NAME + " TEXT" +
            " );";
    private static final String SQL_CREATE_LHWS = "CREATE TABLE "
            + LHWsContract.singleLhw.TABLE_NAME + "(" +
            LHWsContract.singleLhw._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            LHWsContract.singleLhw.COLUMN_LHWID + " TEXT," +
            LHWsContract.singleLhw.COLUMN_LHWNAME + " TEXT," +
            LHWsContract.singleLhw.COLUMN_CLUSTERNAME + " TEXT," +
            LHWsContract.singleLhw.COLUMN_CLUSTERCODE + " TEXT" +
            " );";
    private static final String SQL_CREATE_CLUSTERS = "CREATE TABLE "
            + ClustersContract.singleCluster.TABLE_NAME + "(" +
            ClustersContract.singleCluster._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            ClustersContract.singleCluster.COLUMN_CLUSTERNAME + " TEXT," +
            ClustersContract.singleCluster.COLUMN_CLUSTERCODE + " TEXT" +
            " );";
    /**
     * DELETE STRINGS
     */
    private static final String SQL_DELETE_USERS =
            "DROP TABLE IF EXISTS " + UsersContract.singleUser.TABLE_NAME;
    private static final String SQL_DELETE_LHWS =
            "DROP TABLE IF EXISTS " + LHWsContract.singleLhw.TABLE_NAME;
    private static final String SQL_DELETE_CLUSTERS =
            "DROP TABLE IF EXISTS " + ClustersContract.singleCluster.TABLE_NAME;
    private static final String SQL_DELETE_ELIGIBLES =
            "DROP TABLE IF EXISTS " + singleWoman.TABLE_NAME;
    private static final String SQL_DELETE_FORMS =
            "DROP TABLE IF EXISTS " + FormsContract.FormColumns.TABLE_NAME;
    private static final String SQL_DELETE_PARTICIPANTS =
            "DROP TABLE IF EXISTS " + ParticipantColumns.TABLE_NAME;
    private final String TAG = "DatabaseHelper";
    public String spDateT = new SimpleDateFormat("dd-MM-yy").format(new Date().getTime());


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_ELIGIBLES);
        db.execSQL(SQL_CREATE_LHWS);
        db.execSQL(SQL_CREATE_CLUSTERS);
        db.execSQL(SQL_CREATE_FORMS);
        db.execSQL(SQL_CREATE_PARTICIPANTS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_USERS);
        db.execSQL(SQL_DELETE_ELIGIBLES);
        db.execSQL(SQL_DELETE_LHWS);
        db.execSQL(SQL_DELETE_CLUSTERS);
        db.execSQL(SQL_DELETE_FORMS);
        db.execSQL(SQL_DELETE_PARTICIPANTS);
    }

    public void syncUser(JSONArray userlist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UsersContract.singleUser.TABLE_NAME, null, null);
        try {
            JSONArray jsonArray = userlist;
            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jsonObjectUser = jsonArray.getJSONObject(i);

                UsersContract user = new UsersContract();
                user.Sync(jsonObjectUser);
                ContentValues values = new ContentValues();

                values.put(UsersContract.singleUser.ROW_USERNAME, user.getUserName());
                values.put(UsersContract.singleUser.ROW_PASSWORD, user.getPassword());
                db.insert(UsersContract.singleUser.TABLE_NAME, null, values);
            }


        } catch (Exception e) {
            Log.d(TAG, "syncUser(e): " + e);
        } finally {
            db.close();
        }
    }

    public void syncEligible(JSONArray eligibleslist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(EligiblesContract.singleWoman.TABLE_NAME, null, null);
        try {
            JSONArray jsonArray = eligibleslist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectEC = jsonArray.getJSONObject(i);

                EligiblesContract ec = new EligiblesContract();
                ec.Sync(jsonObjectEC);

                ContentValues values = new ContentValues();

                values.put(singleWoman.COLUMN_NAME_LUID, ec.getLUID());
                values.put(singleWoman.COLUMN_NAME_SUBAREACODE, ec.getSubAreaCode());
                values.put(singleWoman.COLUMN_NAME_LHWCODE, ec.getLhwCode());
                values.put(singleWoman.COLUMN_NAME_HOUSEHOLD, ec.getHouseHold());
                values.put(singleWoman.COLUMN_NAME_WOMEN_NAME, ec.getWomen_name());

                db.insert(singleWoman.TABLE_NAME, null, values);
            }


        } catch (Exception e) {
        } finally {
            db.close();
        }
    }

    public void syncLHWs(JSONArray lhwslist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(LHWsContract.singleLhw.TABLE_NAME, null, null);
        try {
            JSONArray jsonArray = lhwslist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectLC = jsonArray.getJSONObject(i);

                LHWsContract lc = new LHWsContract();
                lc.Sync(jsonObjectLC);

                ContentValues values = new ContentValues();

                values.put(LHWsContract.singleLhw.COLUMN_LHWID, lc.getLhwId());
                values.put(LHWsContract.singleLhw.COLUMN_LHWNAME, lc.getLhwName());
                values.put(LHWsContract.singleLhw.COLUMN_CLUSTERCODE, lc.getClusterCode());
                values.put(LHWsContract.singleLhw.COLUMN_CLUSTERNAME, lc.getClusterName());

                db.insert(LHWsContract.singleLhw.TABLE_NAME, null, values);
            }


        } catch (Exception e) {
        } finally {
            db.close();
        }
    }

    public void syncClusters(JSONArray Clusterslist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(ClustersContract.singleCluster.TABLE_NAME, null, null);
        try {
            JSONArray jsonArray = Clusterslist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectCC = jsonArray.getJSONObject(i);

                ClustersContract cc = new ClustersContract();
                cc.Sync(jsonObjectCC);

                ContentValues values = new ContentValues();

                values.put(ClustersContract.singleCluster.COLUMN_CLUSTERCODE, cc.getClusterCode());
                values.put(ClustersContract.singleCluster.COLUMN_CLUSTERNAME, cc.getClusterName());


                db.insert(ClustersContract.singleCluster.TABLE_NAME, null, values);
            }


        } catch (Exception e) {
        } finally {
            db.close();
        }
    }

    public ArrayList<UsersContract> getAllUsers() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<UsersContract> userList = null;
        try {
            userList = new ArrayList<UsersContract>();
            String QUERY = "SELECT * FROM " + UsersContract.singleUser.TABLE_NAME;
            Cursor cursor = db.rawQuery(QUERY, null);
            int num = cursor.getCount();
            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    UsersContract user = new UsersContract();
                    user.setId(cursor.getInt(0));
                    user.setUserName(cursor.getString(1));
                    user.setPassword(cursor.getString(2));
                    userList.add(user);
                }
            }

        } catch (Exception e) {
        } finally {
            db.close();
        }
        return userList;
    }

    public boolean Login(String username, String password) throws SQLException {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor mCursor = db.rawQuery("SELECT * FROM " + UsersContract.singleUser.TABLE_NAME + " WHERE " + UsersContract.singleUser.ROW_USERNAME + "=? AND " + UsersContract.singleUser.ROW_PASSWORD + "=?", new String[]{username, password});

        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }

    public Long addForm(FormsContract fc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FormColumns.COLUMN_PROJECTNAME, fc.getProjectName());
        values.put(FormColumns.COLUMN_SURVEYTYPE, fc.getSurveyType());
        //values.put(FormColumns.COLUMN__ID, fc.getID()); // WONT BE SET AT 'INSERT'
        values.put(FormColumns.COLUMN_UID, fc.getUID());
        values.put(FormColumns.COLUMN_FORMDATE, fc.getFormDate());
        values.put(FormColumns.COLUMN_INTERVIEWER01, fc.getInterviewer01());
        values.put(FormColumns.COLUMN_INTERVIEWER02, fc.getInterviewer02());
        values.put(FormColumns.COLUMN_CLUSTERCODE, fc.getClustercode());
        values.put(FormColumns.COLUMN_VILLAGEACODE, fc.getVillageacode());
        values.put(FormColumns.COLUMN_HOUSEHOLD, fc.getHousehold());
        values.put(FormColumns.COLUMN_ISTATUS, fc.getIstatus());
        values.put(FormColumns.COLUMN_SA, fc.getsA());
        values.put(FormColumns.COLUMN_GPSLAT, fc.getGpsLat());
        values.put(FormColumns.COLUMN_GPSLNG, fc.getGpsLng());
        values.put(FormColumns.COLUMN_GPSTIME, fc.getGpsTime());
        values.put(FormColumns.COLUMN_GPSACC, fc.getGpsAcc());
        values.put(FormColumns.COLUMN_DEVICEID, fc.getDeviceID());
        
        /* * * * * NO NEED TO USE THESE IN 'INSERT' * * * * */
        /*
        values.put(FormColumns.COLUMN_SYNCED, fc.getSynced());
        values.put(FormColumns.COLUMN_SYNCED_DATE, fc.getSynced_date());
        */


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormColumns.TABLE_NAME,
                FormColumns.COLUMN_NAME_NULLABLE,
                values);
        db.close();
        return newRowId;
    }

    public void updateSyncedForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormColumns.COLUMN_SYNCED, true);
        values.put(FormColumns.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormColumns._ID + " LIKE ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormColumns.TABLE_NAME,
                values,
                where,
                whereArgs);
        db.close();
    }

    public Long addParticipants(ParticipantsContract pc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(ParticipantColumns.COLUMN_PROJECTNAME, pc.getProjectName());
        values.put(ParticipantColumns.COLUMN_SURVEYTYPE, pc.getSurveyType());
        //values.put(ParticipantColumns.COLUMN__ID, pc.getID());
        values.put(ParticipantColumns.COLUMN_UID, pc.getUID());
        values.put(ParticipantColumns.COLUMN_UUID, pc.getUUID());
        values.put(ParticipantColumns.COLUMN_FORMDATE, pc.getFormDate());
        values.put(ParticipantColumns.COLUMN_INTERVIEWER01, pc.getInterviewer01());
        values.put(ParticipantColumns.COLUMN_INTERVIEWER02, pc.getInterviewer02());
        values.put(ParticipantColumns.COLUMN_ISTATUS, pc.getIstatus());
        values.put(ParticipantColumns.COLUMN_SCA, pc.getsCA());
        values.put(ParticipantColumns.COLUMN_SCB, pc.getsCB());
        values.put(ParticipantColumns.COLUMN_SCC, pc.getsCC());
        values.put(ParticipantColumns.COLUMN_SCD, pc.getsCD());
        values.put(ParticipantColumns.COLUMN_SCE, pc.getsCE());
        values.put(ParticipantColumns.COLUMN_SCF, pc.getsCF());
        values.put(ParticipantColumns.COLUMN_SCG, pc.getsCG());
        values.put(ParticipantColumns.COLUMN_SCHA, pc.getsCHA());
        values.put(ParticipantColumns.COLUMN_SCHB, pc.getsCHB());
        values.put(ParticipantColumns.COLUMN_SCHBC, pc.getsCHBC());
        values.put(ParticipantColumns.COLUMN_SD, pc.getsD());
        values.put(ParticipantColumns.COLUMN_SE, pc.getsE());
        values.put(ParticipantColumns.COLUMN_GPSLAT, pc.getGpsLat());
        values.put(ParticipantColumns.COLUMN_GPSLNG, pc.getGpsLng());
        values.put(ParticipantColumns.COLUMN_GPSTIME, pc.getGpsTime());
        values.put(ParticipantColumns.COLUMN_GPSACC, pc.getGpsAcc());
        values.put(ParticipantColumns.COLUMN_DEVICEID, pc.getDeviceID());
        values.put(ParticipantColumns.COLUMN_SYNCED, pc.getSynced());
        values.put(ParticipantColumns.COLUMN_SYNCED_DATE, pc.getSynced_date());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                ParticipantColumns.TABLE_NAME,
                ParticipantColumns.COLUMN_NAME_NULLABLE,
                values);
        db.close();
        return newRowId;
    }

    public void updatesSyncedParticipants(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(ParticipantColumns.COLUMN_SYNCED, true);
        values.put(ParticipantColumns.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = ParticipantColumns._ID + " LIKE ?";
        String[] whereArgs = {id};

        int count = db.update(
                ParticipantColumns.TABLE_NAME,
                values,
                where,
                whereArgs);
        db.close();
    }

    public int updateBA() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormColumns.COLUMN_SBA, AppMain.fc.getsBA());
        values.put(FormColumns.COLUMN_UID, AppMain.fc.getUID());


// Which row to update, based on the ID
        String selection = FormColumns._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormColumns.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateBB() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormColumns.COLUMN_SBB, AppMain.fc.getsBB());
        values.put(FormColumns.COLUMN_UID, AppMain.fc.getUID());


// Which row to update, based on the ID
        String selection = FormColumns._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormColumns.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateCC() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(ParticipantColumns.COLUMN_SCC, AppMain.pc.getsCC());
        values.put(ParticipantColumns.COLUMN_UID, AppMain.pc.getUID());


// Which row to update, based on the ID
        String selection = ParticipantColumns._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.pc.getID())};

        int count = db.update(ParticipantColumns.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateCD() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(ParticipantColumns.COLUMN_SCD, AppMain.pc.getsCD());
        values.put(ParticipantColumns.COLUMN_UID, AppMain.pc.getUID());


// Which row to update, based on the ID
        String selection = ParticipantColumns._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.pc.getID())};

        int count = db.update(ParticipantColumns.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateCE() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(ParticipantColumns.COLUMN_SCE, AppMain.pc.getsCE());
        values.put(ParticipantColumns.COLUMN_UID, AppMain.pc.getUID());


// Which row to update, based on the ID
        String selection = ParticipantColumns._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.pc.getID())};

        int count = db.update(ParticipantColumns.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateCF() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(ParticipantColumns.COLUMN_SCF, AppMain.pc.getsCF());
        values.put(ParticipantColumns.COLUMN_UID, AppMain.pc.getUID());


// Which row to update, based on the ID
        String selection = ParticipantColumns._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.pc.getID())};

        int count = db.update(ParticipantColumns.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateCG() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(ParticipantColumns.COLUMN_SCG, AppMain.pc.getsCG());
        values.put(ParticipantColumns.COLUMN_UID, AppMain.pc.getUID());


// Which row to update, based on the ID
        String selection = ParticipantColumns._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.pc.getID())};

        int count = db.update(ParticipantColumns.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateCHA() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(ParticipantColumns.COLUMN_SCHA, AppMain.pc.getsCHA());
        values.put(ParticipantColumns.COLUMN_UID, AppMain.pc.getUID());


// Which row to update, based on the ID
        String selection = ParticipantColumns._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.pc.getID())};

        int count = db.update(ParticipantColumns.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateCHB() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(ParticipantColumns.COLUMN_SCHB, AppMain.pc.getsCHB());
        values.put(ParticipantColumns.COLUMN_UID, AppMain.pc.getUID());


// Which row to update, based on the ID
        String selection = ParticipantColumns._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.pc.getID())};

        int count = db.update(ParticipantColumns.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateCHC() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(ParticipantColumns.COLUMN_SCHBC, AppMain.pc.getsCHBC());
        values.put(ParticipantColumns.COLUMN_UID, AppMain.pc.getUID());


// Which row to update, based on the ID
        String selection = ParticipantColumns._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.pc.getID())};

        int count = db.update(ParticipantColumns.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateE() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(ParticipantColumns.COLUMN_SCE, AppMain.pc.getsCE());
        values.put(ParticipantColumns.COLUMN_UID, AppMain.pc.getUID());


// Which row to update, based on the ID
        String selection = ParticipantColumns._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.pc.getID())};

        int count = db.update(ParticipantColumns.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateD() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(ParticipantColumns.COLUMN_SCD, AppMain.pc.getsCD());
        values.put(ParticipantColumns.COLUMN_UID, AppMain.pc.getUID());


// Which row to update, based on the ID
        String selection = ParticipantColumns._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.pc.getID())};

        int count = db.update(ParticipantColumns.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }


    public Collection<ClustersContract> getAllClusters() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                ClustersContract.singleCluster.COLUMN_CLUSTERCODE,
                ClustersContract.singleCluster.COLUMN_CLUSTERNAME,
                ClustersContract.singleCluster._ID,
        };

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                ClustersContract.singleCluster._ID + " ASC";

        Collection<ClustersContract> allCC = new ArrayList<>();
        try {
            c = db.query(
                    ClustersContract.singleCluster.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                ClustersContract cc = new ClustersContract();
                allCC.add(cc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allCC;
    }

    public Collection<LHWsContract> getLHWsByCluster(String clusterCode) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                LHWsContract.singleLhw.COLUMN_LHWID,
                LHWsContract.singleLhw.COLUMN_LHWNAME,
                LHWsContract.singleLhw._ID
        };
        String whereClause = LHWsContract.singleLhw.COLUMN_CLUSTERCODE + " = ?";
        String[] whereArgs = new String[]{clusterCode};
        String groupBy = null;
        String having = null;

        String orderBy =
                LHWsContract.singleLhw._ID + " ASC";

        Collection<LHWsContract> allCC = new ArrayList<>();
        try {
            c = db.query(
                    LHWsContract.singleLhw.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                LHWsContract cc = new LHWsContract();
                allCC.add(cc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allCC;
    }

    public Collection<EligiblesContract> getEligiblesByHousehold(String clusterCode, String lhwCode, String hhno) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                singleWoman.COLUMN_NAME_LUID,
                singleWoman.COLUMN_NAME_WOMEN_NAME
        };

        String whereClause = singleWoman.COLUMN_NAME_SUBAREACODE + " = ? AND " +
                singleWoman.COLUMN_NAME_LHWCODE + " = ? AND " +
                singleWoman.COLUMN_NAME_HOUSEHOLD + " = ?";
        String[] whereArgs = new String[]{clusterCode, lhwCode, hhno};
        String groupBy = null;
        String having = null;

        String orderBy =
                singleWoman.COLUMN_NAME_WOMEN_NAME + " ASC";

        Collection<EligiblesContract> allEC = new ArrayList<>();
        try {
            c = db.query(
                    singleWoman.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                EligiblesContract ec = new EligiblesContract();
                allEC.add(ec.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allEC;
    }

    public Collection<FormsContract> getAllForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormColumns.COLUMN_PROJECTNAME,
                FormColumns.COLUMN_SURVEYTYPE,
                FormColumns.COLUMN__ID,
                FormColumns.COLUMN_UID,
                FormColumns.COLUMN_FORMDATE,
                FormColumns.COLUMN_INTERVIEWER01,
                FormColumns.COLUMN_INTERVIEWER02,
                FormColumns.COLUMN_CLUSTERCODE,
                FormColumns.COLUMN_VILLAGEACODE,
                FormColumns.COLUMN_HOUSEHOLD,
                FormColumns.COLUMN_ISTATUS,
                FormColumns.COLUMN_SA,
                FormColumns.COLUMN_SBA,
                FormColumns.COLUMN_SBB,
                FormColumns.COLUMN_GPSLAT,
                FormColumns.COLUMN_GPSLNG,
                FormColumns.COLUMN_GPSTIME,
                FormColumns.COLUMN_GPSACC,
                FormColumns.COLUMN_DEVICEID,
                FormColumns.COLUMN_SYNCED,
                FormColumns.COLUMN_SYNCED_DATE,
        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                FormColumns._ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormColumns.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<ParticipantsContract> getAllParticipants() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                ParticipantColumns.COLUMN_PROJECTNAME,
                ParticipantColumns.COLUMN_SURVEYTYPE,
                ParticipantColumns.COLUMN__ID,
                ParticipantColumns.COLUMN_UID,
                ParticipantColumns.COLUMN_UUID,
                ParticipantColumns.COLUMN_FORMDATE,
                ParticipantColumns.COLUMN_INTERVIEWER01,
                ParticipantColumns.COLUMN_INTERVIEWER02,
                ParticipantColumns.COLUMN_ISTATUS,
                ParticipantColumns.COLUMN_SCA,
                ParticipantColumns.COLUMN_SCB,
                ParticipantColumns.COLUMN_SCC,
                ParticipantColumns.COLUMN_SCD,
                ParticipantColumns.COLUMN_SCE,
                ParticipantColumns.COLUMN_SCF,
                ParticipantColumns.COLUMN_SCG,
                ParticipantColumns.COLUMN_SCHA,
                ParticipantColumns.COLUMN_SCHB,
                ParticipantColumns.COLUMN_SCHBC,
                ParticipantColumns.COLUMN_SD,
                ParticipantColumns.COLUMN_SE,
                ParticipantColumns.COLUMN_GPSLAT,
                ParticipantColumns.COLUMN_GPSLNG,
                ParticipantColumns.COLUMN_GPSTIME,
                ParticipantColumns.COLUMN_GPSACC,
                ParticipantColumns.COLUMN_DEVICEID,
                ParticipantColumns.COLUMN_SYNCED,
                ParticipantColumns.COLUMN_SYNCED_DATE,

        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                ParticipantColumns._ID + " ASC";

        Collection<ParticipantsContract> allPC = new ArrayList<>();
        try {
            c = db.query(
                    ParticipantColumns.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                ParticipantsContract pc = new ParticipantsContract();
                allPC.add(pc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allPC;
    }


    public Collection<FormsContract> getTodayForms() {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.FormColumns._ID,
                FormColumns.COLUMN_CLUSTERCODE,
                FormColumns.COLUMN_VILLAGEACODE,
                FormColumns.COLUMN_HOUSEHOLD,
        };

        String whereClause = FormColumns.COLUMN_CLUSTERCODE + " LIKE ?";
        String[] whereArgs = {spDateT};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormColumns._ID + " ASC";

        Collection<FormsContract> formList = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormColumns.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                formList.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }


        // return contact list
        return formList;
    }

    public List<FormsContract> getFormsByCluster(String psu) {
        List<FormsContract> formList = new ArrayList<FormsContract>();
        // Select All Unsynced Query
        String selectQuery = "SELECT * FROM " + FormColumns.TABLE_NAME + " WHERE " + FormColumns.COLUMN_CLUSTERCODE + "='" + psu + "' ORDER BY " + FormColumns._ID + " desc";
        //String selectQuery = "SELECT  * FROM " + singleForm.TABLE_NAME;
        Log.d(TAG, selectQuery);
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                FormsContract form = new FormsContract();
                form.setFormDate(cursor.getString(cursor.getColumnIndex(FormColumns.COLUMN_FORMDATE)));
                form.setIstatus(cursor.getString(cursor.getColumnIndex(FormColumns.COLUMN_ISTATUS)));
                form.setHousehold(cursor.getString(cursor.getColumnIndex(FormColumns.COLUMN_HOUSEHOLD)));

                // Adding contact to list
                formList.add(form);
            } while (cursor.moveToNext());
        }

        // return contact list
        return formList;
    }

    // ANDROID DATABASE MANAGER
    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {

            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }
}