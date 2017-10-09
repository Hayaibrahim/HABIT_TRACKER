package com.example.enghaya.habit;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.enghaya.habit.data.HabitContract;
import com.example.enghaya.habit.data.HabitDbHelper;

public class MainActivity extends AppCompatActivity {
    private HabitDbHelper mDbHelper;
    private int size = 12;
    private String sheap = "rectangle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDbHelper = new HabitDbHelper(this);
    }

    //  insert Db
    private void insert() {
        SQLiteDatabase db = mDbHelper.getWritableDatabase();
        // Create a ContentValues
        ContentValues contentValues = new ContentValues();
        contentValues.put(HabitContract.EntryHabit.COLUMN_SIZE, size);
        contentValues.put(HabitContract.EntryHabit.COLUMN_SHAPE, sheap);
        // Insert Db
        db.insert(HabitContract.EntryHabit.TABLE_NAME, null, contentValues);
    }

    // Read the table
    private Cursor read() {
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        String[] projection = {
                HabitContract.EntryHabit._ID,
                HabitContract.EntryHabit.COLUMN_SIZE,
                HabitContract.EntryHabit.COLUMN_SHAPE};

        // on the table
        Cursor cursor = db.query(
                HabitContract.EntryHabit.TABLE_NAME,
                projection, null, null, null, null, null);
        // get columns
        int mPoint;
        int mSize;
        int mShape;
        mPoint = cursor.getColumnIndex(HabitContract.EntryHabit._ID);
        mSize = cursor.getColumnIndex(HabitContract.EntryHabit.COLUMN_SIZE);
        mShape = cursor.getColumnIndex(HabitContract.EntryHabit.COLUMN_SHAPE);

        while (cursor.moveToNext()) {
            int point ;
                  point = cursor.getInt(mPoint);
            int size ;
                  size = cursor.getInt(mSize);
            String this_shape ;
                 this_shape = cursor.getString(mShape);

        }
        // close
        cursor.close();
        return cursor;
    }
}


