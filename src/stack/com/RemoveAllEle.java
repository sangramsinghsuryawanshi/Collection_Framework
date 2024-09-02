/*
 * 6. Write a Java program to remove all elements from a stack.

 */
package stack.com;

import java.util.Stack;

public class RemoveAllEle {

	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(12);
		s.push(2);
		s.push(15);
		s.push(52);
		s.push(92);
		s.push(1);
		System.out.println("Before removing stack elements: "+s);
		s.removeAll(s);
		System.out.println("Remove all elements from stack: "+s);
	}

}
