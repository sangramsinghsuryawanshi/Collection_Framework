package treeSet.com;

import java.util.Scanner;
import java.util.TreeSet;

public class CompareTwoSets {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSet<Integer> tre = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int s = sc.nextInt();
		System.out.println("addMethod: ");
		for(int i=0;i<s;i++)
		{
			tre.add(sc.nextInt());
		}
		TreeSet<Integer> tre1 = new TreeSet<Integer>();
		System.out.println("Enter the size: ");
		int s1 = sc.nextInt();
		System.out.println("addMethod: ");
		for(int i=0;i<s1;i++)
		{
			tre1.add(sc.nextInt());
		}
		if(tre.containsAll(tre1))
		{
			System.out.println("tree set are equal");
		}
		else
		{
			System.out.println("tree set are not equal");
		}
	}

}
