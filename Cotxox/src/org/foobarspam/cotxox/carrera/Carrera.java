package org.foobarspam.cotxox.carrera;

import org.foobarspam.cotxox.conductores.PoolConductores;
import org.foobarspam.cotxox.tarifa.Tarifa;
import org.foobarspam.cotxox.conductores.Conductor;

public class Carrera {
	// Propiedades
	private double tiempoEsperado = 0.0d;
	private double tiempoCarrera = 0.0d;
	private double costeTotal = 0.0d;
	
	private String tarjetaCredito = null;
	private String origen = null;
	private String destino = null;
	private double distancia = 0.0d;
	private int propina = 0;
	private Conductor conductor = null;
			
	// Constructores
	
			
	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	
	// getters y setters
	
	public String getTarjetaCredito() {
		return tarjetaCredito;
	}
	
	public double getTiempoEsperado() {
		return tiempoEsperado;
	}
	public void setTiempoEsperado(int tiempoEsperado) {
		this.tiempoEsperado = tiempoEsperado;
	}
	
	public double getTiempoCarrera(){
		return tiempoCarrera;
		
	}
	public void setTiempoCarrera(int tiempoCarrera){
		this.tiempoCarrera = tiempoCarrera; 
	}
	
	public double getCosteTotal(){
		return costeTotal;
	}
	public void setCosteTotal(double costeTotal){
		this.costeTotal = costeTotal;
	}
		
	public Conductor getConductor(){
		return this.conductor;
	}
	public void setConductor(Conductor conductor){
		this.conductor = conductor;
	}
	
			
	public String getOrigen(){
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
		
	}
	public double getDistancia() {
		return distancia;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public int getPropina(){
		return this.propina;
	}
	
	// Metodos
	
	public double getCosteEsperado(){
		return Tarifa.getCosteTotalEsperado(this);
	}
	
			
	public void asignarConductor(PoolConductores conductores){
		setConductor(conductores.asignarConductor());
	}
	
	public void realizarPago(double pago){
		setCosteTotal(pago);
	}
	
	public void recibirPropina(int propina){
		this.propina = propina;
	}
	
	public void liberarConductor(){
		getConductor().setOcupado(false);
	}
}
