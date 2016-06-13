package com.example.marcelino.sqlite;

/**
 * Created by tec00mg1 on 09/06/2016.
 */
public class Tabla {
    interface TablaLista {
        String NAME_TABLE = "listas";
        static String ID = "id";
        String TITULO = "titulo";

    }

    interface TablaElemento {
        static String NAME_TABLE = "elementos";
        static String ID = "id";
        static String ID_LISTA = "id_lista";
        static String TEXTO = "texto";
        static String VERIFICADO = "verificado";
    }
}
