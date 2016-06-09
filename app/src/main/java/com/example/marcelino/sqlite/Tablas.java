package com.example.marcelino.sqlite;

/**
 * Created by tec00mg1 on 09/06/2016.
 */
public class Tabla {
    interface ColumnasLista{
        String ID = "id";
        String TITULO = "titulo";
    }

    interface ColumnasElemento {
        String ID = "id";
        String ID_LISTA = "id_lista";
        String TEXTO = "texto";
        String VERIFICADO = "verificado";
    }
}
