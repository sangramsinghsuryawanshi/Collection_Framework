/*
 * 1. Write a Java program to create an array list, 
 * add some colors (strings) and print out the collection.
 */
package arrayList.com;

import java.util.ArrayList;

public class PrintColors {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Red");
		a1.add("Orange");
		a1.add("Blue");
		a1.add("Black");
		a1.add("Purpale");
		a1.add("Velvate");
		a1.add("Green");
		System.out.print("Colors: ");
		for(int i=0;i<a1.size();i++)
		{
			System.out.print(a1.get(i)+", ");
		}
	}

}
