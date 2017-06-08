package org.foobarspam.proxyPattern.mrMeeseeks;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

import org.foobarspam.interfaces.Doable;

import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks implements Doable{
	//Propiedades
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
	private String[] messageOnRequest = {"Yes sireee!", "Oooh yeah! Can do!",  "Oh, yeah! Yes, ma'am!"};	
	private String messageOnDone; 	
	private String messageOnExplode; 
	
	//Constructor
	public MrMeeseeks(){
		this.id = ID_GENERATOR.incrementAndGet();
	}

	/* generateMessageOnRequest()
	 * elige al azar uno de los tres mensajes
         * que lanza Mr Meeseeks cuando se le formula la peticion:
	 * "Oooh yeah! Can do!"; "Yes sireee!"; "Oh, yeah! Yes, ma'am!"
         */	

	
	// getter
	public Integer getId() {
		return id;
	}
	//Metodos
	public void sayMessageOnCreate(){
		System.out.println("I'm Mr Meeseeks" +this.id + "look at meeee!");//\n
	}
	
	public void sayMessageOnRequest(){
		System.out.println(messageOnRequest);
	}
	
	public String generateMessageOnRequest(){
		Integer mensajeRandom = ThreadLocalRandom.current().nextInt(messageOnRequest.length);//+1
		String mensaje = messageOnRequest[mensajeRandom];
		return mensaje;
		
	}
	
	public void sayMessageOnDone(){
		System.out.println(messageOnRequest);
	}
	public void sayMessageOnExplode(){
		System.out.println(messageOnExplode);
	}
	
	public void formulateRequest(String String, String string){}
	public void doRequest(String String, String string){}
	public void stopExisting(){}

	public Object doRequest(Object accion, Object objeto) {
		// TODO Auto-generated method stub
		return null;
	}
}
