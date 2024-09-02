/*
 * 13. Write a Java program to remove a specific element from a stack.

 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class RemoveSpecficEle {

	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size: ");
		int size = sc.nextInt();
		System.out.println("Enter given list: ");
		for(int i=0;i<size;i++)
		{
			s.push(sc.nextInt());
		}
		System.out.println("Given stack element is: "+s);
		System.out.println("Enter index to remove element: ");
		int l = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(i==l)
			{
				s.remove(i);
			}
		}
		System.out.println("After remove element: "+s);
	}
}
