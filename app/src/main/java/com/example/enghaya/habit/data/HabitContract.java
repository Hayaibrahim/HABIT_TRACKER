package com.example.enghaya.habit.data;

import android.provider.BaseColumns;

/**
 * Created by ENG.HAYA on 10/6/2017 AD.
 */

public class HabitContract {

     public static final class EntryHabit implements BaseColumns {
         public static final String TABLE_NAME = "biking";
         public static final String _ID = BaseColumns._ID;
         public static final String COLUMN_SIZE = " SIZE";
         public static final String COLUMN_SHAPE = "SHAPE";

    }

}
