package com.example.john.appandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by John on 6/07/2017.
 */

public class BDAlumnos extends SQLiteOpenHelper {


    String sqlCreate= "CREATE TABLE Alumnos (codigo INTEGER, nombre TEXT)";

    public BDAlumnos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(sqlCreate);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        db.execSQL("DROP TABLE IF EXIST Alumnos ");

        db.execSQL(sqlCreate);

    }
}
