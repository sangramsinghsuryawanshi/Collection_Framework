package treeSet.com;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetAddString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSet<String> tre = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int s = sc.nextInt();
		System.out.println("addMethod: ");
		for(int i=0;i<s;i++)
		{
			tre.add(sc.next());
		}
		Iterator<String> i1 = tre.iterator();
		System.out.println("iterate through all elements in a tree set");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		TreeSet<String> tre1 = new TreeSet<String>(tre);
		tre1.add("java");
		tre1.add("C#");
		System.out.println("Specified element of another tree set: \n"+tre1);
	}

}
