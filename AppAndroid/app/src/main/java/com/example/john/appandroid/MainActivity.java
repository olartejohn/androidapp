package com.example.john.appandroid;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BDAlumnos alumnos = new BDAlumnos(this, "BDAlumnos", null, 1);

        SQLiteDatabase db =alumnos.getWritableDatabase();

        if(db!=null)
        {


            db.execSQL("INSERT INTO Alumnos (codigo, nombre) VALUES ("+1+", "+"'Alumno 1'"+")");
            db.execSQL("INSERT INTO Alumnos (codigo, nombre) VALUES ("+2+", "+"'Alumno 2'"+")");
            db.close();

        }

    }
}
