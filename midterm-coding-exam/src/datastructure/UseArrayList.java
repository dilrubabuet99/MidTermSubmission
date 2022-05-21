package datastructure;
import java.util.ArrayList;
import java.util.ListIterator;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList <String> list =new ArrayList<String>();

		list.add("Mon");
		list.add("Tues");
		list.add("invalid entry");
		list.add("Wed");
		list.add("Thurs");
		list.add("Fri");
		list.add("Sat");
		list.add("Sun");
		list.add("no invalid entry");
		System.out.println("use of ArrayList to view elements :"+list);
		list.remove(2);
		System.out.println("use of ArrayList to remove elements at index two  :"+list);
		System.out.println("use of ArrayList to get elements at index 1 is  :"+ list.get(1));


		for (String str: list)
		{
			System.out.println(str);
		}


		ListIterator<String > itString = list.listIterator ();

            while  (itString.hasNext()) {
				System.out.println(itString.next());
			}




	}

}
