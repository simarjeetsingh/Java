package Bisiesto;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnyoBisietoTest {

	@Test
	public void test_esBisiesto_cuatro() {
	AnyoBisiesto any = new AnyoBisiesto(1904);
	assertEquals("test año bisiesto acabado en 4", true, any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_seis(){
	AnyoBisiesto any = new AnyoBisiesto(2016);
	assertEquals("test año bisiesto acabado en 4", true, any.esBisiesto());
	}
	@Test
	public void test_esBisiesto_veinte(){
	AnyoBisiesto any = new AnyoBisiesto(2020);
	assertEquals("test año bisiesto acabado en 4", true, any.esBisiesto());
	}
}