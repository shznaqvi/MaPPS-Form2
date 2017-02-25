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

import edu.aku.hassannaqvi.mapps_form2.FormsContract.FormColumns;
import edu.aku.hassannaqvi.mapps_form2.ParticipantsContract.ParticipantColumns;
import edu.aku.hassannaqvi.mapps_form2.WomensContrat.singleWoman;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String SQL_CREATE_USERS = "CREATE TABLE " + UsersContract.singleUser.TABLE_NAME + "("
            + UsersContract.singleUser._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersContract.singleUser.ROW_USERNAME + " TEXT,"
            + UsersContract.singleUser.ROW_PASSWORD + " TEXT );";
    private static final String DATABASE_NAME = "mapps_f2.db";
    private static final int DATABASE_VERSION = 1;
    private static final String SQL_CREATE_FORMS = "CREATE TABLE "
            + FormColumns.TABLE_NAME + "(" +
            FormColumns.COLUMN_PROJECTNAME + " TEXT," +
            FormColumns.COLUMN_SURVEYTYPE + " TEXT," +
            FormColumns.COLUMN__ID + " TEXT," +
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
            + ParticipantColumns.COLUMN__ID + " TEXT,"
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
    private static final String SQL_CREATE_ELEGIBLES = "CREATE TABLE "
            + ParticipantColumns.TABLE_NAME + "(" +
            singleWoman.COLUMN_NAME_LUID + " TEXT," +
            singleWoman.COLUMN_NAME_SUBAREACODE + " TEXT," +
            singleWoman.COLUMN_NAME_LHWCODE + " TEXT," +
            singleWoman.COLUMN_NAME_HOUSEHOLD + " TEXT," +
            singleWoman.COLUMN_NAME_WOMEN_NAME + " TEXT," +
            " );";
    private static final String SQL_DELETE_USERS =
            "DROP TABLE IF EXISTS " + UsersContract.singleUser.TABLE_NAME;
    private static final String SQL_DELETE_FORMS =
            "DROP TABLE IF EXISTS " + FormsContract.FormColumns.TABLE_NAME;
    private final String TAG = "DatabaseHelper";
    public String spDateT = new SimpleDateFormat("dd-MM-yy").format(new Date().getTime());


    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_FORMS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public void syncUser(JSONArray userlist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UsersContract.singleUser.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = userlist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUser = jsonArray.getJSONObject(i);
                String userName = jsonObjectUser.getString("username");
                String password = jsonObjectUser.getString("password");


                ContentValues values = new ContentValues();

                values.put(UsersContract.singleUser.ROW_USERNAME, userName);
                values.put(UsersContract.singleUser.ROW_PASSWORD, password);
                db.insert(UsersContract.singleUser.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {
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
            db.close();
        } catch (Exception e) {
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
    }

    public Long addParticipants(ParticipantsContract pc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(ParticipantColumns.COLUMN_PROJECTNAME, pc.getProjectName());
        values.put(ParticipantColumns.COLUMN_SURVEYTYPE, pc.getSurveyType());
        values.put(ParticipantColumns.COLUMN__ID, pc.getID());
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
    }
    public void updateBA(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormColumns.COLUMN_SBA, true);

        // Which row to update, based on the title
        String where = FormColumns._ID + " LIKE ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormColumns.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateBB(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormColumns.COLUMN_SBB, true);

        // Which row to update, based on the title
        String where = FormColumns._ID + " LIKE ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormColumns.TABLE_NAME,
                values,
                where,
                whereArgs);
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

    // ANDROID DATABASE MANAGER
    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"mesage"};
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