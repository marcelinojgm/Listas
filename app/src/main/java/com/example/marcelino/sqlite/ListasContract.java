package com.example.marcelino.sqlite;

import android.provider.BaseColumns;

/**
 * define la base de datos
 * sus tablas
 * y columnas de estas
 */
public final class ListasContract  {
    public ListasContract(){}
    /** clase interna que define los contenidos de la tabla**/
    public static abstract class lista implements BaseColumns{
        public static final String TABLE_NAME = "Listas";
        public static final String COLUMN_NAME_ENTRY_ID = "lista_id";
        public static final String COLUMN_NAME_TITULO   = "titulo";

    }

    public static abstract class elementos implements BaseColumns{
        public static final String TABLE_NAME = "Elementos";
        public static final String COLUMN_NAME_LISTA_ID = "lista_id";
        public static final String COLUMN_NAME_ELEMENTO_ID = "elemento_id";
        public static final String COLUMN_NAME_TEXTO   = "texto";
        public static final String COLUMN_NAME_VERIFICADO = "VERIFICADO";

    }
}
