/*
 * Write a Java program to insert an element 
 * into the array list at the given index
 */
package arrayList.com;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayIndexEle {

	public static void main(String[] args) 
	{
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		i.add(6);
		System.out.println("\nOriginal ArrayList : "+i.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter element : ");
		int d=sc.nextInt();
		i.add(d);
		for(int j=0;j<i.size();j++)
		{
			if(j==d)
			System.out.print(i.get(j)+", ");
		}
	}

}
