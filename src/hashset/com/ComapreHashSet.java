/*
 * 10. Write a Java program to compare two hash set.

11. Write a Java program to compare two sets and retain elements that are the same.

12. Write a Java program to remove all elements from a hash set.
 */
package hashset.com;

import java.util.HashSet;
import java.util.Scanner;

public class ComapreHashSet 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		h.add(2);
		h.add(1);
		h.add(18);
		h.add(19);
		System.out.println("First HashSet: "+h);
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(21);
		h1.add(11);
		h1.add(18);
		h1.add(19);
		System.out.println("Second HashSet: "+h1);
		if(h1.retainAll(h))
		{
			System.out.println("Hashset are present");
		}
		else
		{
			System.out.println("Hashset are not present");
		}
		h1.retainAll(h);
		System.out.println("RetainAll Elements: "+h1);
		h.removeAll(h);
		System.out.println("RemovedAll Element from HashSet: "+h);
	}

}
