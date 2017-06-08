package org.foobarspam.main;

import java.util.ArrayList;

import org.foobarspam.proxyPattern.mrMeeseeks.MrMeeseeks;
import org.foobarspam.proxyPattern.mrMeeseeks.ProxyMrMeeseeks;

public class App {
	
	//public App(){}
	
	public static void main( String[] args ){
		//System.out.println( "Hello World!" );
				
		// Crea una estructura de datos llamada setMrMe donde almacenar los Mr Meeseeks creados
		ArrayList<MrMeeseeks> setMrMe = new ArrayList<MrMeeseeks>();		
		
		// Crea una estructura de datos llamada ids donde almacenar los ids de los Mr Meeseeks creados
		
		ArrayList<Integer> ids = new ArrayList<Integer>();	
		        
		ProxyMrMeeseeks box = new ProxyMrMeeseeks();
		       
		box.pushButton(setMrMe);
		System.out.println("Open Jerry's stupid mayonnaise jar");
		box.getMrMe().formulateRequest("Open", "stupid jar");
		System.out.println();
		
		box.pushButton(setMrMe);    
		System.out.println("I wanna be popular at school!");
		box.getMrMe().formulateRequest("Be", "popular at school");
		System.out.println();
		
		box.pushButton(setMrMe);
		System.out.println("I wanna be a more complete woman!");
		box.getMrMe().formulateRequest("Be", "a more complete woman");
		System.out.println();
		
		System.out.println("Estos son los Mr Meeseeks creados:");
		listMrMeeseeks(setMrMe);
		System.out.println();
		
		collectIds(setMrMe, ids);
		
		System.out.println("Adios, Mr Meeseeks...");
		for(Integer id : ids){
			explodeMrMeeseeks(setMrMe, id);   
		}
		
	    }
		
		
		/* collectIds(setMrMe, ids)
		 * Almacena en un array los ids de los Mr Meeseeks creados
		 */
		public static void collectIds(ArrayList<MrMeeseeks> setMrMe, ArrayList<Integer> ids) {
		}
		
		/* listMrMeeseeks(setMrMe)
		 * Lista los ids de todos los Mr Meeseeks creados
		 */
		public static void listMrMeeseeks(ArrayList<MrMeeseeks> setMrMe) {

		}

		/* explodeMrMeeseeks(setMrMe, id)
		 * elimna del conjunto de Mr Meeseeks creados el que ya ha completado su cometido
		 */	
		public static void explodeMrMeeseeks(ArrayList<MrMeeseeks> setMrMe, Integer id) {
			
		}

}
