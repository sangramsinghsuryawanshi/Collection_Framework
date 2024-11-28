/*
 * Input: exp = “[()]{}{[()()]()}” 
Output: Balanced
Explanation: all the brackets are well-formed

Input: exp = “[(])” 
Output: Not Balanced 
Explanation: 1 and 4 brackets are not balanced because 
there is a closing ‘]’ before the closing ‘(‘ (Solved using Stack)
 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackaets 
{
	public static boolean isBal(String str)
	{
		Stack s = new Stack();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
			{
				s.push(str.charAt(i));
				System.out.println(s);
			}
			else
			{
				if(s.isEmpty())
				{
					return false;
				}
				else
				{
					char top=(char) s.pop();
					if((str.charAt(i)==')' && top!='(') || (str.charAt(i)=='}' && top!='{') || (str.charAt(i)==']' && top!='[') )
					{
						return false;
					}
				}
			}
		}
		return s.empty();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given character: ");
		String str = sc.nextLine();
		BalanceBrackaets b = new BalanceBrackaets();
		if(isBal(str))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
