package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class LeftDirection 
{

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
		int temp=s.firstElement();
		s.remove(s.firstElement());
		s.add(s.size(), temp);
		System.out.println("Left direction: "+s);
	}
}
