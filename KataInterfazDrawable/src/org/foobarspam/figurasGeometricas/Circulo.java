package org.foobarspam.figurasGeometricas;

public class Circulo extends FigurasGeometricas{
	
	private double radio;
	private final double PI = Math.PI;

	public Circulo() {
		super(); /* invocamos al constructor sin parámetro de la superclase FiguraGeometrica */
		}
			
	public Circulo(double radio){
		super();
		this.radio = radio;
			
	}
		
	public Circulo(String nombre, double radio){
		super(nombre); /* invocamos al constructor con parámetro String nombre de la superclase */
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
		return getRadio() * PI;	
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
