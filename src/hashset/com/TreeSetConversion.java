/*
 * 8. Write a Java program to convert a hash set to a tree set.

9. Write a Java program to find numbers less than 7 in a tree set.
 */
package hashset.com;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetConversion 
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
		TreeSet<Integer> t = new TreeSet<Integer>(h);
		System.out.println("Orignal Hashset Converting to TreeSet: "+t);
		System.out.print("Number less than 7 in tree set: ");
		for(int i:t)
		{
			if(i<7)
			{
				System.out.print(i+" ");
			}
		}
	}

}
