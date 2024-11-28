/*
 * 12. Write a Java program to change priorityQueue to maximum priority queue.
 */
package priorityQueue.com;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ChangeToMaxProrityQueue {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PriorityQueue<Integer> ob = new PriorityQueue<Integer>();
		ob.add(1);
		ob.add(1);
		ob.add(121);
		ob.add(12);
		ob.add(124);
		ob.add(162);
		System.out.println("Before: "+ob);
		TreeSet<Integer> t = new TreeSet<Integer>(ob);
		Iterator<Integer> it = t.descendingIterator();
		System.out.print("\npriorityQueue to maximum priority queue: ");
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}

}
