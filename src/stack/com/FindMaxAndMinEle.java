/*
 * 5. Write a Java program to find the maximum and minimum 
 * elements in a stack.

 */
package stack.com;

import java.util.Collections;
import java.util.Stack;

public class FindMaxAndMinEle 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(11);
		s.push(10);
		s.push(13);
		s.push(14);
		s.push(1);
		int cnt=0;
		System.out.println("Stack element: "+s);
		int max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<s.size();i++)
		{
			cnt++;
			if(s.get(i)>max)
			{
				max=s.get(i);
			}
			else if(s.get(i)<min)
			{
				min=s.get(i);
			}
		}
		System.out.println("Minimum element is: "+min);
		System.out.println("Maximum element is: "+max);
		System.out.println("Count of stack element is: "+cnt);
	}
}