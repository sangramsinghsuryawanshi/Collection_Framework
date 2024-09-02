/*
 * 11. Write a Java program to rotate the stack elements to the 
 * right direction.

 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class RotateStackElementToRightDirection {

	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size: ");
		int size = sc.nextInt();
		System.out.println("Enter given list: ");
		for(int i=0;i<size;i++)
		{
			s.push(sc.nextInt());
		}
		System.out.println("Given stack element is: "+s);
		int temp=s.get(size-1);
		s.remove(s.size()-1);
		s.add(0, temp);
		System.out.println(s);
	}
}
