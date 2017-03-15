package org.foobarspam.expresioneRegulares.testing;

import static org.junit.Assert.*;
import org.foobarspam.expresionesRegulares.Nie;
import org.junit.Before;
import org.junit.Test;

public class NieTest {
	Nie nie;
	
	@Before
	public void setUp() {
		nie = new Nie();
	}	
	@Test
	public void formatoValidoTest() {
		
		nie = new Nie("X1234567P");
		assertEquals("X1234567P", nie.getNumeroId());
		assertEquals(9, nie.getNumeroId().length());
		assertTrue(nie.formatoValido());
	}
	
	@Test
	public void formatoValidoTestAutomatico() {
		String[] formatoValido = {"X8484464T","Y2376173A","Z1817200Q","Z5882054E","Y3587725Q",
		"X6861694V","X1616083Q","Y6868974Y","Y0135330P","Z9044648X"};
		
		for (String numNie : formatoValido) {
			Nie nie = new Nie(numNie);
			assertTrue(nie.formatoValido());
		}		
	}
	
	@Test
	public void formatoNoValidoTestAutomatico() {
		String[] formatoNoValido = {"7484464TT","2376173Abc","A08221720Q","Q5882054eE","63587725",
		"Z6861694V","21616083I","2686897400","U40135330","B9044648Ñ"};
		
		for (String numNie : formatoNoValido) {
			Nie nie = new Nie(numNie);
			assertFalse(nie.formatoValido());
		}		
	}
	
}
