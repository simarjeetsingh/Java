package org.foobarspam.draw;

import java.util.ArrayList;

public class Drawables {
public static void dibujarDrawables(ArrayList<Drawable> lista){
		
		for(Drawable elemento: lista){
			elemento.draw();
		}
		
	}
	
	public static void aplicarTema(ArrayList<Drawable> lista){

		for(Drawable elemento: lista){
			try {
				elemento.applyTheme();
			}
			catch(UnsupportedOperationException excepcion){
				

				FigurasGeometricas figura = (FigurasGeometricas) elemento;
				System.out.println(excepcion.getMessage() + " para la figura: " + figura.getNombre());
			}
		}
		
	}
}
