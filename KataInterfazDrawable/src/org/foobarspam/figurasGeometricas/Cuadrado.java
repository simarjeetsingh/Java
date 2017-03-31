package org.foobarspam.figurasGeometricas;

public class Cuadrado extends FigurasGeometricas{
	private double lados; 

	public Cuadrado () {
		super();
		this.lados = 1;
	}
	public Cuadrado (double lados) {
		super();
		this.lados = lados;
	}
	
	public double getLados(){
		return this.lados;
	}
	
	
	
	@Override
	public double area(){
		
		return getLados()*4;
	} 

}
