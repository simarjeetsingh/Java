package org.foobarspam.test;

import static org.junit.Assert.*;

import org.foobarspam.NumerosRomanos.App;
import org.junit.Test;

public class AppTest {
	@Test
	public void testNumeroSumatorios() {
		String numeroRomano1 = "MDCCCLXXXVIII";
		int valor = App.convert(numeroRomano1);
		assertEquals(1888, valor);

	}
	
	@Test
	public void testNumeroSubstractivos() {
		String numeroRomano1 = "CDXLIV";
		int valor = App.convert(numeroRomano1);
		assertEquals(444, valor);
	}
	
	@Test
	public void testNumeroVariado() {
	String numeroRomano3 = "MDIX";
	int valor = App.convert(numeroRomano3);
	assertEquals(1509, valor);
	}
	
	
	@Test
	public void testNumeroVariado2() {
		String numeroRomano1 = "CDXXXIX";
		int valor = App.convert(numeroRomano1);
		assertEquals(439, valor);
	}
	
	@Test
	public void testNumeroVariado3() {
		String numeroRomano1 = "MM";
		int valor = App.convert(numeroRomano1);
		assertEquals(2000, valor);
	}
}