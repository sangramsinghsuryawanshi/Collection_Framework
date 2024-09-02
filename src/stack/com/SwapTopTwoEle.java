/*
 * 14. Write a Java program to swap the top two elements of 
 * a given stack.

 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class SwapTopTwoEle {

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
		   int top1 = s.pop();
           int top2 = s.pop();
           s.push(top1);
           s.push(top2);
		System.out.println(s);
	}

}
