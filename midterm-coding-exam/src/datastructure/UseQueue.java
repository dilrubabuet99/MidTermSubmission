package datastructure;

import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queueFood=new PriorityQueue<>();
		queueFood.add("Chickehbiriyani");
		queueFood.add("kofte");
		queueFood.add("sandwich");
		queueFood.add("pizza");
		System.out.println("to add in the queue :"+queueFood);

		System.out.println("to check first element :"+queueFood.peek());

		//queueFood.pool(0);
		System.out.println(queueFood);
		//System.out.println("to remove first element "+queueFood.remove(1);

	}
}
