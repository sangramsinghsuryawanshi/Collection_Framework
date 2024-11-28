/*
 * Given an expression string exp, 
write a program to examine whether the pairs and 
the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.

Example: 

Input: exp = “[()]{}{[()()]()}” 
Output: Balanced
Explanation: all the brackets are well-formed

Input: exp = “[(])” 
Output: Not Balanced 
Explanation: 1 and 4 brackets are not balanced because 
there is a closing ‘]’ before the closing ‘(‘
 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class BalancedCharacters 
{
	public boolean isBalnce(char ch[])
	{
		Stack s = new Stack();
		int c=ch.length;
		System.out.println(c);
	    for(int i=0;i<ch.length;i++)
	    {
	    	if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
	    	{
	    		s.push(ch[i]);
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
	    			if((ch[i]==')' && top!='(') || (ch[i]=='}' && top!='{') || (ch[i]==']' && top!='['))
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
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter given string: ");
	    String str = sc.nextLine();
	    char ch[]=str.toCharArray();
	    BalancedCharacters b =new BalancedCharacters();
	    boolean cf=b.isBalnce(ch);
	    if(cf)
	    {
	    	System.out.println("Balanced");
	    }
	    else
	    {
	    	System.out.println("Not");
	    }
	}

}
