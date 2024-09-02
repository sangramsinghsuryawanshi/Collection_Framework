package treeSet.com;

import java.util.Scanner;
import java.util.TreeSet;

public class FindNumLessThanSeven 
{

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
		System.out.println("Given treeSet: "+tre);
		System.out.println("Enter an element: ");
		int ele = sc.nextInt();
		System.out.println("Enter an last element: ");
		int ele1 = sc.nextInt();
		System.out.println("remove method: "+tre.remove(ele));
		System.out.println("After remove method: "+tre);
		System.out.println("remove method: "+tre.remove(ele1));
		System.out.println("After last remove method: "+tre);
		System.out.println("Given element is: "+tre.ceiling(ele));
		System.out.println("Given element is: "+tre.floor(ele));
		System.out.println("Given low element is: "+tre.lower(ele));
		System.out.println("Given high element is: "+tre.higher(ele));
		System.out.println("Number less than 7");
		for(int i:tre)
		{
			if(i<7)
			{
				System.out.println(i);
			}
		}
	}

}
