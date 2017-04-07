package org.foobarspam.figurasGeometricas;

public class Cuadrado extends FigurasGeometricas implements Drawable{
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
	
	@Override
	public void draw(){
		System.out.println("Esto es un: " + this.getNombre());
	}
	
	
	@Override
	public void applyTheme(){
		System.out.println("Aplicado un tema a: " + this.getNombre());
	}

}
