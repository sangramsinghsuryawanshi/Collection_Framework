/*21. Write a Java program that implements a stack 
 * and finds common elements between two stacks.
 * 
 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class CommonEleFromStack {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> s1 = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 size of stack: ");
		int size = sc.nextInt();
		System.out.println("Enter 1 stack element: ");
		for(int i=0;i<size;i++)
		{
			s.push(sc.nextInt());
		}
		System.out.println("Enter 2 size of stack: ");
		int size1 = sc.nextInt();
		System.out.println("Enter 2 stack element: ");
		for(int i=0;i<size1;i++)
		{
			s1.push(sc.nextInt());
		}
		s.retainAll(s1);
		System.out.println("Common element: "+s);

	}

}
