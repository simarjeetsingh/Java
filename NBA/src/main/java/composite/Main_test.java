package composite;

import java.util.ArrayList;

import org.foobarspam.NBA.CompuestoItem;
import org.foobarspam.NBA.Item;
import org.foobarspam.NBA.SimpleItem;

public class Main_test {

	public static void main(String[] args) {

		// crear item simple y testear su nombre
		SimpleItem simpleItem = new SimpleItem("Lakers");

		System.out.println("\n *** crear item simple y testear su nombre *** \n");

		// metodo getNombre());
		System.out.println("Equipo: " + simpleItem.getNombre());

		// crear item compuesto y testear su nombre
		CompuestoItem compuestoItem = new CompuestoItem("Pacific");

		System.out.println("\n *** crear item compuesto y testear su nombre *** \n");

		// metodo getNombre());
		System.out.println("Division: " + compuestoItem.getNombre());

		// añadir item simple a compuesto y comprobar nombre

		System.out.println("\n *** añadir item simple a compuesto y comprobar nombre *** \n");

		// metodo anhadir(equipo);
		compuestoItem.anhadir(simpleItem);
		System.out.println("OK: Se ha añadido equipo: " + compuestoItem.getHijos().get(0).getNombre()
				+ " al item compuesto: " + compuestoItem.getNombre());

		// recorrer un item compuesto mostrando su nombre y el de sus hijos: 1
		// hijo, profundidad 1

		System.out.println(
				"\n *** recorrer un item compuesto mostrando su nombre y el de sus hijos: 1 hijo, profundidad 1 *** \n");

		// metodo iterable();
		compuestoItem.iterable();

		// añadir varios hijos desde array de strings y recorrer un item
		// compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad
		// 1

		System.out.println(
				"\n ***añadir varios hijos desde array de strings y recorrer un item compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad 1 *** \n");

		// crear division "Atlantic"
		CompuestoItem atlantic = new CompuestoItem("Atlantic");

		String[] equiposAtlantic = { "Celtics", "Nets", "Knicks", "76ers", "Raptors" };

		for (String nombre : equiposAtlantic) {
			SimpleItem equipo = new SimpleItem(nombre);
			atlantic.anhadir(equipo);
		}
		System.out.println("Ok, se han añadido " + atlantic.getHijos().size() + " equipos");

		atlantic.iterable();

		// recorrer un item compuesto por otros compuestos, mostrando su nombre
		// y el de sus hijos: n hijos, profundidad n

		System.out.println(
				"\n *** recorrer un item compuesto por otros compuestos, mostrando su nombre y el de sus hijos: n hijos, profundidad n *** \n");
		// crear liga "nba"
		CompuestoItem nba = new CompuestoItem("nba");
		// crear conferencia Este
		CompuestoItem conferenciaEste = new CompuestoItem("ConferenciaEste");
		conferenciaEste.anhadir(atlantic);
		nba.anhadir(conferenciaEste);

		nba.iterable();

		// crear un elemento compuesto de simples a partir de un array de
		// strings

		System.out.println("\n *** crear un elemento compuesto de simples a partir de un array de strings *** \n");

		String[] equiposCentral = { "Bulls", "Cavs", "Pistons", "Pacers", "Bucks" };

		// Crear division Central

		// método composite()

		// crear un elemento compuesto de elementos compuestos a partir de un
		// array de objetos simples
		CompuestoItem divisionCentral = new CompuestoItem("divisionCentral");

		divisionCentral.composite(equiposCentral);
		divisionCentral.iterable();

		System.out.println(
				"\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos simples *** \n");

		String[] equiposSouthEast = { "Heat", "Hawks", "Hornets", "Wizzards", "Magic" };

		// crear un arraylist de equipos SouthEast

		// crear division SouthEast y añadir los equipos SouthEast

		// añadir division SouthEast

		// crear un elemento compuesto de elementos compuestos a partir de un
		// array de objetos compuestos
	
					ArrayList<Item> arraySouthEast = new ArrayList<Item>();
					for(String nombre : equiposSouthEast){
						SimpleItem equipo = new SimpleItem(nombre);
						arraySouthEast.add(equipo);
					}
				
					CompuestoItem southEast = new CompuestoItem("South East");
					southEast.composite(arraySouthEast);
					southEast.iterable();

		System.out.println(
				"\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos compuestos *** \n");

		// crear un ArrayList de divisiones

		// añadirlas a la conferencia este

		// eliminar un hijo entre varios, profundidad 1
		
		ArrayList<Item> divisiones = new ArrayList<Item>();
		divisiones.add(divisionCentral);
		divisiones.add(southEast);
		
		conferenciaEste.composite(divisiones);
		conferenciaEste.iterable();

		System.out.println("\n *** eliminar un hijo a profundidad n *** \n");

		// quitar la division Atlantic
		// metodo quitar("Atlantic"); se busca por el nombre de la división, no
		// por el objeto.

		// Crea la conferencia Oeste completa y añadela a la liga; muestra por
		// pantalla la liga completa
		
		conferenciaEste.quitar("Atlantic");
		conferenciaEste.iterable();

		System.out.println("\n *** Liga NBA completa con sus conferencias, divisiones y equipos *** \n");
		CompuestoItem conferenciaOeste = new CompuestoItem("Conferencia Oeste");
		CompuestoItem noroeste = new CompuestoItem("Noroeste");
		CompuestoItem suroeste = new CompuestoItem("Suroeste");
		CompuestoItem pacifico = new CompuestoItem("Pacifico");
		String[] equiposNoroeste = {"Nuggets", "Timberwolves", "Thunder", "Blazers", "Jazz"};
		noroeste.composite(equiposNoroeste);
		String[] equiposSuroeste = {"Mavericks", "Rockets", "Grizzlies", "Pelicans", "Spurs"};
		suroeste.composite(equiposSuroeste);
		String[] equiposPacifico = {"Warriors", "Clippers", "Lakers", "Suns", "Kings"};
		pacifico.composite(equiposPacifico);
		divisiones = new ArrayList<Item>();
		divisiones.add(noroeste);
		divisiones.add(suroeste);
		divisiones.add(pacifico);
		conferenciaOeste.composite(divisiones);
		nba.anhadir(conferenciaOeste);
		conferenciaEste.anhadir(atlantic);
		nba.iterable();

	}
}