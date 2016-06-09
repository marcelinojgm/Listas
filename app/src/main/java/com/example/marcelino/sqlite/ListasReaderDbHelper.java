package com.example.marcelino.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ListasReaderDbHelper extends SQLiteOpenHelper {


    private static final String INTEGER_TYPE = " INTEGER";
    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_TABLA_LISTAS =
            "CREATE TABLE " + Tabla.ColumnasLista.NAME_TABLE + " (" +
                    Tabla.ColumnasLista.ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COMMA_SEP +
                    Tabla.ColumnasLista.TITULO + TEXT_TYPE + COMMA_SEP +
                    " )";
    private static final String SQL_CREATE_TABLA_ELEMENTOS =
            "CREATE TABLE " + Tabla.ColumnasLista.NAME_TABLE + " (" +
                    Tabla.ColumnasElemento.ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COMMA_SEP +
                    Tabla.ColumnasElemento.ID_LISTA + TEXT_TYPE + COMMA_SEP +
                    Tabla.ColumnasElemento.TEXTO + TEXT_TYPE + COMMA_SEP +
                    Tabla.ColumnasElemento.VERIFICADO + INTEGER_TYPE + COMMA_SEP +
                    " )";

    public ListasReaderDbHelper(Context context, String name,
                                SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
