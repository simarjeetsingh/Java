package org.foobarspam.NBA;

import java.util.ArrayList;
import java.util.Iterator;

import org.foobarspam.interfaces.Componible;

public class Item implements Componible, Iterable{
	
	
	private String nombre = null;
	private boolean compuesto = false;
	private ArrayList<Item> hijos = new ArrayList<Item>();
	
	// Constructor
	public Item(String nombre){
		this.nombre = nombre;
	}
	
	// Setters y getters
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public boolean isCompuesto(){
		return this.compuesto;
	}
	public void setCompuesto(boolean compuesto){
		this.compuesto = compuesto;
	}
	public ArrayList<Item> getHijos(){
		return this.hijos;
	}
	
	// Métodos
	public void anhadir(Item item){
		ArrayList<Item> hijos = getHijos();
		hijos.add(item);
	}
	
	public void quitar(String nombre){
		ArrayList<Item> hijos = getHijos();
		for (Item hijo : hijos){
			if (hijo.getNombre().equals(nombre)){
				getHijos().remove(hijo);
				break;
			}
		}
	}
	
	// Método de la interfaz Iterable
	public void iterable() {
		System.out.println(getNombre());
		ArrayList<Item> hijos = getHijos();
		for (Item hijo : hijos){
			if(hijo.isCompuesto()){
				System.out.println("");
				hijo.iterable();
			} else{
				System.out.println("---------- " + hijo.getNombre());
			}
		}
	}
	
	// Método de la interfaz Componible
	public void composite(String[] nombres){
		for (String nombre : nombres){
			SimpleItem equipo = new SimpleItem(nombre);
			getHijos().add(equipo);
		}
	}
	
	public void composite(ArrayList<Item> equipos){
		for (Item equipo : equipos){
			getHijos().add(equipo);
		}
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public void composite(Item[] divisiones) {
		// TODO Auto-generated method stub
		
	}
	
}
