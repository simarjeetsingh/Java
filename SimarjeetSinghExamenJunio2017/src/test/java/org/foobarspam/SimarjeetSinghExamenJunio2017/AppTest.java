package org.foobarspam.SimarjeetSinghExamenJunio2017;

import java.util.ArrayList;

import org.foobarspam.proxyPattern.mrMeeseeks.MrMeeseeks;
import org.foobarspam.proxyPattern.mrMeeseeks.ProxyMrMeeseeks;

import org.junit.Test;
import junit.framework.TestCase;


public class AppTest extends TestCase {
	
	public static ArrayList<MrMeeseeks> setMrMe = new ArrayList<MrMeeseeks>();
	public static ArrayList<Integer> ids = new ArrayList<Integer>();

	
	@Test
	public void addTresMeesseks() {
		ProxyMrMeeseeks box = new ProxyMrMeeseeks();

		box.pushButton(setMrMe);

		box.pushButton(setMrMe);
	
		box.pushButton(setMrMe);
		
		for (MrMeeseeks mrme : setMrMe) {
			ids.add(mrme.getId());
		}

		assertEquals(3, setMrMe.size());
		assertEquals(3, ids.size());
	}

	
	@Test
	public void borrarMeeseeks() {
		for (Integer id : ids) {
			for (MrMeeseeks mrMe : setMrMe) {
				setMrMe.remove(mrMe);
				break;
			}
		}
		assertEquals(0, setMrMe.size());

	}
}
