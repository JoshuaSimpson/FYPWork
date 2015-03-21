package com.simpson.josh.lost;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by Josh on 23/01/2015.
 */
public class DatabaseHelper extends SQLiteAssetHelper {

    //private static final String DATABASE_NAME = "LocationDatabase";
    private static final String DATABASE_NAME = "LOSTANDFOUND";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public Cursor getLocNames() {
        SQLiteDatabase db = getReadableDatabase();

        //return db.query("Locations", new String[]{"LocName", "MACOne", "MACTwo", "MACThree", "LocID"}, null, null, null, null, null);
        return db.query("LocNode", new String[]{"LocName", "MACOne", "MACTwo", "MACThree", "LocID"}, null, null, null, null, null);
    }

    public Cursor getEdges()
    {
        SQLiteDatabase db = getReadableDatabase();
        //return db.query("Edges", new String[]{"EdgeID", "StartVertex", "EndVertex", "Weight", "Method"}, null, null, null, null, null);
        return db.query("LocEdge", new String[]{"EdgeID", "StartVertex", "EndVertex", "Weight", "Method"}, null, null, null, null, null);
    }
}
