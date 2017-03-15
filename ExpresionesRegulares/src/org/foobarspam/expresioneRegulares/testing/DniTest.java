package org.foobarspam.expresioneRegulares.testing;

import static org.junit.Assert.*;

import org.foobarspam.expresionesRegulares.Dni;
import org.junit.Before;
import org.junit.Test;

public class DniTest {
	Dni dni;
	
	@Before
	public void setUp() {
		dni = new Dni();
	}

	@Test
	public void formatoValidoTest() {
				
		dni = new Dni("23456789R");
		assertEquals("23456789R", dni.getNumeroId());
		assertEquals(9, dni.getNumeroId().length());
		assertTrue(dni.formatoValido());
	}
	
	@Test
	public void formatoValidoTestAutomatico() {
		String[] numDniValidos = {"78484464T","72376173A","01817200Q","95882054E","63587725Q",
		"26861694V","21616083Q","26868974Y","40135330P","89044648X"};
		
		for (String numDni : numDniValidos) {
			Dni dni = new Dni(numDni);
			assertTrue(dni.formatoValido());
		}
		
	}
	
	@Test
	public void formatoNoValidoTestAutomatico() {
		String[] numDniNoValido = {"78484464TT","2376173Abc","A082217200Q","95882054eE","Q63587725",
		"Z6861694V","21616083I","2686897400","U40135330","89044648Ñ",};
		
		for (String numDni : numDniNoValido) {
			Dni dni = new Dni(numDni);
			assertFalse(dni.formatoValido());
		}
		
	}
	
	

}
