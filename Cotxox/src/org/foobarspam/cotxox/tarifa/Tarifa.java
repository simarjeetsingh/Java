package org.foobarspam.cotxox.tarifa;

import org.foobarspam.cotxox.carrera.Carrera;

public class Tarifa {
	
	private final static double costeMilla = 1.35;
	private final static double costeMinuto = 0.35;
	private final double porcentajeComision = 20;
	private final static int costeMinimo = 5;

	//constructor
	public Tarifa(){};
	
	
	public static double getCosteMilla() {
		return costeMilla;
	}
	
	public static double getCosteMinuto() {
		return costeMinuto;
	}

	public double getPorcentajeComision() {
		return this.porcentajeComision;
	}
	public static int getCosteMinimo(){
		return costeMinimo;
	}

	//Metodos
	public static double getCosteDistancia(double distancia) {
		return distancia * getCosteMilla();
	}

	public static double getCosteTiempo(double minutos) {
		return minutos * getCosteMinuto();
	}

	public static double getCosteTotalEsperado(Carrera carrera){
		double costeTotalEsperado = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
			
		return costeTotalEsperado;
	}		
}
