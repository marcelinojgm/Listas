package com.example.marcelino.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ListasReaderDbHelper extends SQLiteOpenHelper {

    //base de datos
    private static final String NAME_BBDD = "listas.db";
    private static final int VERSION = 1;

    //eleemntos de sentencias sql
    private static final String INTEGER_TYPE = " INTEGER NOT NULL CHECK";
    private static final String INTEGER_KEY = " INTEGER PRIMARY KEY AUTOINCREMENT";
    private static final String TEXT_TYPE = " TEXT NOT NULL";
    private static final String COMMA_SEP = " ,";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS ";

    //sentencias SQL

    //listas
    private static final String SQL_CREATE_TABLA_LISTAS =
            "CREATE TABLE " + Tabla.TablaLista.NAME_TABLE +
                    " (" +
                    Tabla.TablaLista.ID + INTEGER_KEY + COMMA_SEP +
                    Tabla.TablaLista.TITULO + TEXT_TYPE + COMMA_SEP +
                    " )";

    //elementos
    private static final String SQL_CREATE_TABLA_ELEMENTOS =
            "CREATE TABLE " + Tabla.TablaLista.NAME_TABLE +
                    " (" +
                    Tabla.TablaElemento.ID + INTEGER_KEY + COMMA_SEP +
                    Tabla.TablaElemento.ID_LISTA + INTEGER_TYPE + COMMA_SEP +
                    Tabla.TablaElemento.TEXTO + TEXT_TYPE + COMMA_SEP +
                    Tabla.TablaElemento.VERIFICADO + INTEGER_TYPE + COMMA_SEP +
                    " )";

    public ListasReaderDbHelper(Context context, String name,
                                SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_TABLA_LISTAS);
        db.execSQL(SQL_CREATE_TABLA_ELEMENTOS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE + Tabla.TablaElemento.NAME_TABLE);
        db.execSQL(DROP_TABLE + Tabla.TablaLista.NAME_TABLE);
        onCreate(db);
    }
}
