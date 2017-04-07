package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
	
	private String nombre = null;
	private String modelo = null;
	private String matricula = null;
	private double valoracionMedia = 0d;	
	private ArrayList<Byte> valoraciones = new ArrayList<>();
	private boolean ocupado = false;
		
	public Conductor(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getValoracion() {
		return this.valoracionMedia;
	}
	
	public int getNumeroValoraciones(){
		return this.valoraciones.size();
	}

	public void setValoracion(byte valoracion) {		
		this.valoraciones.add(valoracion);
		this.calcularValoracionMedia();
	}
	
	private double calcularValoracionMedia(){
		int sumaValoraciones = 0;
		for(byte valoracion : this.valoraciones){
			sumaValoraciones += valoracion;
		}
		this.valoracionMedia = (double) sumaValoraciones / this.valoraciones.size();
		return this.valoracionMedia;
	}
	
	public void setOcupado(boolean ocupado){
		this.ocupado = ocupado;
	}
	
	public boolean isOcupado(){
		return this.ocupado;
	}

}
