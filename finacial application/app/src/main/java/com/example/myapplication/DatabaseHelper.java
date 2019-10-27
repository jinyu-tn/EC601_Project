package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(@Nullable Context context) {
        super(context, "pfapp", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREAT TABLE IF NOT EXISTS pfapp("+
            "ID INTEGER PRIMARY KEY,"+
            "COST_TITLE VARCHAR,"+
            "COST_DACE VARCHAR,"+
            "COST_MONEY VARCHAR,)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
