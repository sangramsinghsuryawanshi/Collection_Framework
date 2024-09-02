package treeSet.com;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetMethods 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tre = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int s = sc.nextInt();
		System.out.println("addMethod: ");
		for(int i=0;i<s;i++)
		{
			tre.add(sc.nextInt());
		}
		TreeSet<Integer> tre1 = new TreeSet<Integer>(tre);
		tre1.add(12);
		tre1.addAll(tre);
		System.out.println("addAll method: "+tre1);
		System.out.println("ceiling method: "+tre.ceiling(6));
		System.out.println("floor method: "+tre.floor(3));
		System.out.println("higher method: "+tre.higher(4));
		System.out.println("lower method: "+tre.lower(2));
		System.out.println("pollFirst method: "+tre.pollFirst());
		System.out.println("After pollFirst method: "+tre);
		System.out.println("pollLast method: "+tre.pollLast());
		System.out.println("After pollLast method: "+tre);
		System.out.println("First method: "+tre1.first());
		System.out.println("After First method: "+tre1);
		System.out.println("Last method: "+tre1.last());
		System.out.println("After Last method: "+tre1);
		System.out.println("remove method: "+tre1.remove(12));
		System.out.println("After remove method: "+tre1);
	}
}
