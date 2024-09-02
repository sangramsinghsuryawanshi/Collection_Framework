/*
 * 15. Write a Java program to get the nth element from the top of
 *  the stack.

 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class GetNthEle 
{

	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stack size: ");
		int size = sc.nextInt();
		System.out.println("Enter stack element: ");
		for(int i=0;i<size;i++)
		{
			s.push(sc.nextInt());
		}
		System.out.println("Enter index to get top of the stack: ");
		int top = sc.nextInt();
		System.out.println("Given Stack is: "+s.get(s.search(top)-1));
	}

}
