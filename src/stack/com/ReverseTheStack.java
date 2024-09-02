/*
 * 4. Write a Java program to reverse the elements of a 
 * stack.

 */
package stack.com;

import java.util.Collections;
import java.util.Stack;

public class ReverseTheStack 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(11);
		s.push(10);
		s.push(13);
		s.push(14);
		s.push(1);
		System.out.println("before reverse: "+s);
		Collections.reverse(s);
		System.out.println("Stack elements in reverse order: "+s);
	}
}