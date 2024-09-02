/*
 * 10. Write a Java program to find 
 * the top and bottom elements of a given stack.
 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class TopAndBottomOfStack 
{

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
		if(!s.isEmpty())
		{
			System.out.println("Bottom of stack is: "+s.firstElement());
			System.out.println("Top of stack is: "+s.peek());
		}
	}
}
