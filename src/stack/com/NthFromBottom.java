/*
 * 16. Write a Java program to get the nth element from the
 *  bottom of the stack.

 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class NthFromBottom 
{

	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of stack: ");
		int size = sc.nextInt();
		System.out.println("Enter given stack element: ");
		for(int i=0;i<size;i++)
		{
			s.push(sc.nextInt());
		}
		System.out.println("Ente nth position from stack: ");
		int bo=sc.nextInt();
		System.out.println("Given nth bottom element is: "+s.get(s.size()-bo));
	}

}
