package treeSet.com;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ReverseOrder 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tre = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int s = sc.nextInt();
		System.out.println("addMethod: ");
		int cnt=0;
		for(int i=0;i<s;i++)
		{
			cnt++;
			tre.add(sc.nextInt());
		}
		System.out.println("Number of elements: "+cnt);
		Iterator i1 = tre.iterator();
		System.out.println("iterate through all elements in Reverse order a tree set");
		i1 = tre.descendingIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("First method: "+tre.first());
		System.out.println("Last method: "+tre.last());
		TreeSet<Integer> tre1 = (TreeSet<Integer>) tre.clone();
		System.out.println(tre1);
	}
}
