package com.example.enghaya.habit.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ENG.HAYA on 10/6/2017 AD.
 */

public class HabitDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "habitTracker.db";
    private static final int DATABASE_VERSION = 1;
     public HabitDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
         String CREATE_TABLE = "CREATE TABLE " + HabitContract.EntryHabit.TABLE_NAME + " ("
                + HabitContract.EntryHabit._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + HabitContract.EntryHabit.COLUMN_SIZE + " INTEGER NOT NULL, "
                + HabitContract.EntryHabit.COLUMN_SHAPE + " TEXT NOT NULL);";

        // Execute sqLiteDatabase
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    // Db for upgraded.
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        //not need
     }
}
