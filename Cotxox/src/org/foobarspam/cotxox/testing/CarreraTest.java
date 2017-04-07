package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.carrera.Carrera;
import org.junit.Before;
import org.junit.Test;

public class CarreraTest {

	Carrera carrera;
	
	@Before
	public void setUp(){
		String tarjetaCredito = "4916119711304546";
		carrera = new Carrera(tarjetaCredito);
	}
	@Test
	public void tiempoEsperadoTest() {
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		
		carrera = new Carrera(tarjetaCredito);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setOrigen(origen);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		
		assertEquals("4916119711304546", carrera.getTarjetaCredito());
		assertEquals("Aeroport Son Sant Joan", carrera.getOrigen());
		assertEquals("Magaluf", carrera.getDestino());
		assertEquals("7.75", carrera.getDistancia(), 0,01);
		assertEquals("10", carrera.getTiempoEsperado(), 0,01);
	}

}
