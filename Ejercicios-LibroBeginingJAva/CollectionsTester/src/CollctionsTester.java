import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollctionsTester {

	public static void main(String[] args) {
		ArrayList<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("first item");
		listOfStrings.add("second item");
		listOfStrings.add("third item");
		listOfStrings.add("fourth item");
		listOfStrings.remove(0); // Remove the first item
		HashSet<Integer> setOfIntegers = new HashSet<Integer>();
		setOfIntegers.add(2);
		setOfIntegers.add(4);
		setOfIntegers.add(2);
		setOfIntegers.remove(2);
		HashMap<String,Integer> mapOfStringToInteger =
		new HashMap<String,Integer>();
		mapOfStringToInteger.put("Alice", 4);
		mapOfStringToInteger.put("Bob", 3);
		mapOfStringToInteger.remove("Alice");
		}

}
