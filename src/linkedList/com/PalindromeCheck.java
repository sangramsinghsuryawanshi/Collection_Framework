/*
 * Write a program to check if a LinkedList is a palindrome.
 */
package linkedList.com;

import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<Integer>();
		System.out.println("Enter size: ");
		int s = sc.nextInt();
		System.out.println("Enter element: ");
		for(int i=0;i<s;i++)
		{
			l.add(sc.nextInt());
		}
		boolean b=true;
		int front =0;
		int back=l.size()-1;
		while(front<back)
		{
			if(!l.get(front).equals(l.get(back)))
			{
				b=false;
				break;
			}
			front++;
			back--;
		}
		if(b)
		{
			System.out.println("LinkedList is a palindrome");
		}
		else
		{
			System.out.println("LinkedList is a not palindrome");
		}
	}
}