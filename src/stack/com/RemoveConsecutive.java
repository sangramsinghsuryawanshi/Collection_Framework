/*
 * 5. Delete consecutive same words in a sequence

Input : ab aa aa bcd ab
Output : 3
As aa, aa destroys each other so, 
ab bcd ab is the new sequence.

Input :  tom jerry jerry tom
Output : 0

As first both jerry will destroy each other.
Then sequence will be tom, tom they will also destroy
each other. So, the final sequence doesn’t contain any
word.
 */
package stack.com;

import java.util.Scanner;
import java.util.Stack;

public class RemoveConsecutive 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter given string: ");
	    String str = sc.nextLine();
	    String [] s1 = str.split(" ");
	    Stack s = new Stack();
	    s.add(s1[0]);
	    for(int i=1;i<s1.length;i++)
	    {
	    	if(s.peek().equals(s1[i]))//
	    	{
	    		s.pop();
	    	}
	    	else
	    	{
	    		s.push(s1[i]);//[]
	    	}
	    }
	    System.out.println(s.size()+" "+s);
	}
}
//ab aa aa bcd ab
