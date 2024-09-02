/*
 * 8. Write a Java program to implement a stack that checks 
 * if a given element is present or not in the stack.

 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class CheckGivenElementIsPresentOrNot 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(11);
		s.push(12);
		s.push(13);
		s.push(14);
		s.push(15);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number: ");
		int e=sc.nextInt();
		if(s.search(e)!=-1)
		{
			System.out.println("Given stack element is present");
		}
		else
		{
			System.out.println("Given stack element is not present");
		}
	}
}
