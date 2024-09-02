/*
 * 1. Write a Java program to implement a stack with push and pop 
 * operations. Find the top element of the stack and check if it 
 * is empty or not.

 */
package stack.com;

import java.util.Stack;

public class StackMethodsDemo 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(11);
		s.push(12);
		s.push(13);
		s.push(14);
		s.push(15);
		System.out.println("Stack push method: "+s);
		System.out.println("Stack top most element: "+s.peek());
		System.out.println("Stack pop method: "+s.pop());
		if(s.empty())
		{
			System.out.println("Given stack is empty");
		}
		else
		{
			System.out.println("Given stack is not empty");
		}
	}
}
