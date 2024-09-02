/*
 * 18. Write a Java program to merge two stacks into one

 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class MergeStack 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> s1 = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of stack: ");
		int size = sc.nextInt();
		System.out.println("Enter 1 stack element: ");
		for(int i=0;i<size;i++)
		{
			s.push(sc.nextInt());
		}
		System.out.println("Enter 2 stack element: ");
		for(int i=0;i<size;i++)
		{
			s1.push(sc.nextInt());
		}
		s.addAll(s1);
		System.out.println("Merge element is: "+s);
	}

}
