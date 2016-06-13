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
            "CREATE TABLE " + Tabla.ColumnasLista.NAME_TABLE +
                    " (" +
                    Tabla.ColumnasLista.ID + INTEGER_KEY + COMMA_SEP +
                    Tabla.ColumnasLista.TITULO + TEXT_TYPE + COMMA_SEP +
                    " )";

    //elementos
    private static final String SQL_CREATE_TABLA_ELEMENTOS =
            "CREATE TABLE " + Tabla.ColumnasLista.NAME_TABLE +
                    " (" +
                    Tabla.ColumnasElemento.ID + INTEGER_KEY + COMMA_SEP +
                    Tabla.ColumnasElemento.ID_LISTA + INTEGER_TYPE + COMMA_SEP +
                    Tabla.ColumnasElemento.TEXTO + TEXT_TYPE + COMMA_SEP +
                    Tabla.ColumnasElemento.VERIFICADO + INTEGER_TYPE + COMMA_SEP +
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
        db.execSQL(DROP_TABLE + Tabla.ColumnasElemento.NAME_TABLE);
        db.execSQL(DROP_TABLE + Tabla.ColumnasLista.NAME_TABLE);
        onCreate(db);
    }
}
