package org.foobarspam.figurasGeometricas;

public class Circulo extends FigurasGeometricas{
	
	private double radio;
	private final double PI = Math.PI;

	public Circulo() {
		super(); /* invocamos al constructor sin par�metro de la superclase FiguraGeometrica */
		}
			
	public Circulo(double radio){
		super();
		this.radio = radio;
			
	}
		
	public Circulo(String nombre, double radio){
		super(nombre); /* invocamos al constructor con par�metro String nombre de la superclase */
		this.radio =radio;
	}
		
	public double getRadio(){
		return this.radio;
	}
		
	public void setRadio(double radio){
		this.radio = radio;
	}
	
		
	@Override
	public double area() {
		// encapsulaci�n de la informaci�n => acceder a las propiedades mediante get
		return getRadio() * PI;	
	}

}
