package org.foobarspam.puntoDeSilla;

public class Matriz {

	private int[][] matriz;
	private int numeroElementos = 0;

	public Matriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public int getNumeroElementos() {
		return this.numeroElementos;
	}

	public void recorrerMatriz() {
		for(int fila=0; fila<this.matriz.length; fila++){
            for(int columna=0; columna<this.matriz.length; columna++){
                this.numeroElementos++;                
            }
		}
	}
		  
}
