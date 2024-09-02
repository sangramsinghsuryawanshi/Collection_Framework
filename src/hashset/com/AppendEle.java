/*
 * 1. Write a Java program to append the specified element to the end of a hash set.


10. Write a Java program to compare two hash set.

11. Write a Java program to compare two sets and retain elements that are the same.

12. Write a Java program to remove all elements from a hash set.
 */
package hashset.com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class AppendEle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<Integer>();
		LinkedHashSet<Integer> h1 = new LinkedHashSet<Integer>(h);
		Scanner sc = new Scanner(System.in);
		h.add(12);
		h.add(11);
		h.add(18);
		h.add(19);
		System.out.println("Orignal Hashset: "+h);
		h1.addAll(h);
		System.out.println("Enter element to append at last: ");
		int ap=sc.nextInt();
		h1.add(ap);
		System.out.println("Append Hashset: "+h1);
	}

}
