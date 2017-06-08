package org.foobarspam.proxyPattern.mrMeeseeks;
import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeksAlumnado {
	
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
			
	public MrMeeseeksAlumnado(){
		this.id = ID_GENERATOR.incrementAndGet();
	}

	/* generateMessageOnRequest()
	 * elige al azar uno de los tres mensajes
         * que lanza Mr Meeseeks cuando se le formula
	 * la peticion:
	 * "Oooh yeah! Can do!"; "Yes sireee!"; "Oh, yeah! Yes, ma'am!"
         */	
}
