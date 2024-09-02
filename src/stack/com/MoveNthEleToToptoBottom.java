/*
 * 17. Write a Java program to implement a stack and
 *  move the nth element from the top of the stack to the top.

 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class MoveNthEleToToptoBottom 
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
		int t=s.size()-bo;
		int temp=s.get(t);
		s.remove(t);
		s.push(temp);
		System.out.println(s);
	}

}
