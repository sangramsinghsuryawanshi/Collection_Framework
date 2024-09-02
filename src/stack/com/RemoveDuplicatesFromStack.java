/*
 * 9. Write a Java program to remove duplicates from a given stack.

 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class RemoveDuplicatesFromStack 
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
		System.out.println("Before Remove duplicate"+s);
		for(int i=0;i<s.size();i++)
		{
			for(int j=i+1;j<s.size();j++)
			{
				if(s.get(i)==s.get(j))
				{
					s.remove(j);
				}
			}
		}
		System.out.println("After Remove duplicate"+s);
	}
}
