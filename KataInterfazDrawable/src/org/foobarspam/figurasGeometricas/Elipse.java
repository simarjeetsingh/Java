package org.foobarspam.figurasGeometricas;

public class Elipse extends FigurasGeometricas {

	private double semiEjeMayor;
	private double semiEjeMenor;
	private final double PI = Math.PI;
	
	public Elipse() {
		super();
		
	}
	
	public Elipse(double semiEjeMayor, double semiEjeMenor) {
		super();
		this.semiEjeMayor = semiEjeMayor;
		this.semiEjeMenor = semiEjeMenor;
	}
	
	
	public Elipse (String nombre, double semiEjeMayor, double semiEjeMenor) {
		super(nombre);
		this.semiEjeMayor = semiEjeMayor;
		this.semiEjeMenor = semiEjeMenor;
	}
	
	public void setSemiEjeMayor (double semiEjeMayor) {
		this.semiEjeMayor = semiEjeMayor;
	}

	public double getSemiEjeMayor () {
		return this.semiEjeMayor;
	}
	
	public void setSemiEjeMenor (double semiEjeMenor) {
		this.semiEjeMenor = semiEjeMenor;
	}
	
	public double getSemiEjeMenor () {
		return this.semiEjeMenor;
	}
	
	@Override
	public double area(){
		return getSemiEjeMayor() * getSemiEjeMenor() * PI;
		
	}

}
