package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		HashMap<Integer, String> mapHollywood = new HashMap<>();
		mapHollywood.put(1, "john");
		mapHollywood.put(2, "tom");
		mapHollywood.put(3, "angelina");
		mapHollywood.put(4, "hanks");
		mapHollywood.put(5, "brad");

		System.out.println("in a line to view the elements :" + mapHollywood);
		System.out.println("to view the element at index two :" + mapHollywood.get(2));

		System.out.println("to view the element at index one :" + mapHollywood.remove(1));
		System.out.println("in a line to view the elements :" + mapHollywood);

		for (Map.Entry<Integer,String> entry: mapHollywood.entrySet()){
		System.out.println(entry.getKey() + " :" + entry.getValue());
		}




		Iterator itMap = mapHollywood.entrySet().iterator();
            while  (itMap.hasNext()){
				Map.Entry pair = (Map.Entry)itMap.next();
				System.out.println(pair.getKey() + " = " + pair.getValue());
        }

			


	}
}



