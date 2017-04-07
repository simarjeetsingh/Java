package org.foobarspam.figurasGeometricas;

public class Rectangulo extends FigurasGeometricas  implements Drawable{

	private double altura 	= 0d;
	private double anchura 	= 0d;

	
	
	public Rectangulo(){
		super(); 
	}
		
	public Rectangulo(double altura, double anchura){
		super();
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public Rectangulo(String nombre, double altura, double anchura){
		super(nombre); 
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getAnchura(){
		return this.anchura;
	}
	
	public void setAnchura(double anchura){
		this.altura = anchura;
	}
	
	@Override
	public double area() {
		return getAltura() * getAnchura();
	}
	@Override
	public void draw() {
			System.out.println("Esto es un: " + this.getNombre());
	}
	
		
	@Override
	public void applyTheme(){
		System.out.println("Aplicado un tema a: " + this.getNombre());
	}
	

}
