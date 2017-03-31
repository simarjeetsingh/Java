package org.foobarspam.figurasGeometricas;



public class IniciarPoligonos {

	public static void main(String[] args) {
		/*Rectangulo rectangulo = new Rectangulo();
		Rectangulo rectangulo2 = new Rectangulo(3);
		Rectangulo rectangulo3 = new Rectangulo(3,4);*/
		
		//assertEquals(12);
		//System.out.println(rectangulo,rectangulo2,rectangulo3);
		Cuadrado cuadrado = new Cuadrado();
		//Cuadrado cuadrado2 = new Cuadrado();
		
		if (cuadrado.area() == 4){
			System.out.println("True");
			
		}
		else{
			System.out.println("False");
		}
		
	}



}
