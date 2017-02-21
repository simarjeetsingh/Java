package org.foobarspam.puntoDeSillaTest;

import static org.junit.Assert.*;

import org.foobarspam.puntoDeSilla.Matriz;

import org.junit.Test;

public class MatrizTest {

    @Test
    public void RecorrerMatriz_test() {
        int[][] matrizTest ={    {1,2,4},
                                {3,0,1},
                                {7,8,9}};
        
        Matriz matriz = new Matriz(matrizTest);
        
        matriz.recorrerMatriz();
        
        assertEquals("test recorrer matriz", 9, matriz.getNumeroElementos());
    }

}







