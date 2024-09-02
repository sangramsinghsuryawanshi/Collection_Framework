/*
 * 1. Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.

2. Write a Java program to iterate through all elements in the priority queue.

3. Write a Java program to add all the elements of a priority queue to another priority queue.

4. Write a Java program to insert a given element into a priority queue.

5. Write a Java program to remove all elements from a priority queue.

6. Write a Java program to count the number of elements in a priority queue.

7. Write a Java program to compare two priority queues.

8. Write a Java program to retrieve the first element of the priority queue.

9. Write a Java program to retrieve and remove the first element.

10. Write a Java program to convert a priority queue to an array containing all its elements.

11. Write a Java program to convert a Priority Queue element to string representations.

12. Write a Java program to change priorityQueue to maximum priority queue.
 */
package priorityQueue.com;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;

public class PriorityQueueQuations 
{
	public static void main(String[] args) 
	{
		Deque ob = new ArrayDeque();
		ob.add("Red");
		ob.add("Blue");
		ob.add("Yellow");
		ob.add("Orange");
		ob.add("White");
		System.out.println("Add(): "+ob);
		Deque ob1 = new ArrayDeque(ob);
		System.out.println("Insert element: "+ob1.add("Black"));
		System.out.println("priority queue to another priority queue: "+ob1);
		Iterator<String> it = ob.iterator();
		int cnt=0;
		System.out.print("\nIterate through all elements in the priority queue: ");
		while(it.hasNext())
		{
			cnt++;
			System.out.print(it.next()+" ");
		}
		System.out.println("\nCount of  priority queue: "+cnt);
		System.out.println("\nremoveAll: "+ob1.removeAll(ob));
		System.out.println("After removeAll"+ob1);
		System.out.println("priority queue: ");
		if(ob1.equals(ob))
		{
			System.out.println("Given element is present");
		}
		else
		{
			System.out.println("Given element is not present");
		}
		System.out.println("retrieve the first element of the priority queue: "+ob.peekFirst());
		System.out.println("retrieve and remove the first element: "+ob.pollFirst());
		System.out.println("After: "+ob);
		Iterator<String> it1 = ob.iterator();
		String s[]=new String[ob.size()];
		cnt=0;
		while(it1.hasNext())
		{
			s[cnt++]=it1.next();
			
		}
		System.err.println("Converting to array: "+Arrays.toString(s));
		System.out.println("Priority Queue element to string representations: "+ob);
		
	}
}
