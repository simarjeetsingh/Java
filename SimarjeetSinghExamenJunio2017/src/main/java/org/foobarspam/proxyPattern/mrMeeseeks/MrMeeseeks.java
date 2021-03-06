package org.foobarspam.proxyPattern.mrMeeseeks;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

import org.foobarspam.interfaces.Doable;

import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks implements Doable{
	//Propiedades
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
	private String[] messageOnRequest = {"Oooh yeah! Can do!", "Yes sireee!", "Oh, yeah! Yes, ma'am!"};	
	private String messageOnDone = "All Done!"; 	
	private String messageOnExplode = "Pooooof"; 
	
	//Constructor
	public MrMeeseeks(){
		this.id = ID_GENERATOR.incrementAndGet();
	}

	
	// getter
	public Integer getId() {
		return id;
	}
	//Metodos
	public void sayMessageOnCreate(){
		System.out.println("I'm Mr Meeseeks " +this.id + ". look at meeee!");
	}
	
	public void sayMessageOnRequest(){
		System.out.println(generateMessageOnRequest());
	}
	
	/* generateMessageOnRequest()
	 * elige al azar uno de los tres mensajes
         * que lanza Mr Meeseeks cuando se le formula la peticion:
	 * "Oooh yeah! Can do!"; "Yes sireee!"; "Oh, yeah! Yes, ma'am!"
         */	

	private String generateMessageOnRequest(){
		Integer mensajeRandom = ThreadLocalRandom.current().nextInt(0, messageOnRequest.length);
		return  messageOnRequest[mensajeRandom];
		
	}
	
	public void sayMessageOnDone(){
		System.out.println(this.messageOnDone);
	}
	public void sayMessageOnExplode(){
		stopExisting();
		
	}
	
	public void formulateRequest(String string1, String string2){
		sayMessageOnRequest();		
		System.out.println(doRequest(string1, string2));
		sayMessageOnDone();
	}
	//public void doRequest(String String, String string){}
	public void stopExisting(){
		System.out.println(this.messageOnExplode +" "+ this.id);
	}
	
	public String doRequest(String accion, String objeto) {		
		return accion +" "+ objeto;
	}
}
