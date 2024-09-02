/*
 * 3. Write a Java program to sort the elements of the 
 * stack in descending order.

 */
package stack.com;

import java.util.Collections;
import java.util.Stack;

public class DescendingStack 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(11);
		s.push(10);
		s.push(13);
		s.push(14);
		s.push(1);
		Collections.sort(s, Collections.reverseOrder());
		System.out.println("Stack elements in descending order: "+s);
	}
}