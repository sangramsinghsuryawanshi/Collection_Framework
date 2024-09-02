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

public class BalancedOrNotBalanced 
{
    public static void main(String[] args) 
    {
    	 Scanner s=new Scanner(System.in);
	     Stack<String> obj=new Stack<String>();
	     System.out.print("Number Of Element:");
	     int n1=s.nextInt();
	     System.out.print("Enter Element:");
	     for(int i=1;i<=n1;i++) 
	     {
	    	 obj.push(s.next());
	     }
	     StringBuffer ob=new StringBuffer(obj.get(0));
	     String strtemp="Balanced";
	     for(int i=0;i<ob.length();i++) 
	     {
	    	 if(ob.charAt(i)=='[') 
	    	 {
	    		 for(int j=0;j<ob.length();j++) 
	    		 {
	    			 if(ob.charAt(j)==']') 
	    			 {
		    			 ob.deleteCharAt(j);
		    			 ob.deleteCharAt(i);
		    			 i--;
		    			 break;
	    			 }
	    	     }
	    	 }
	    	 else if(ob.charAt(i)=='{') 
	    	 {
	    		 for(int j=0;j<ob.length();j++) 
	    		 {
	    			 if(ob.charAt(j)=='}') 
	    			 {
		    			 ob.deleteCharAt(j);
		    			 ob.deleteCharAt(i);
		    			 i--;
		    			 break;
	    			 }
	    	     }
	    	 }
	    	 else if(ob.charAt(i)=='(') 
	    	 {
	    		 for(int j=0;j<ob.length();j++) 
	    		 {
	    			 if(ob.charAt(j)==')') 
	    			 {
		    			 ob.deleteCharAt(j);
		    			 ob.deleteCharAt(i);
		    			 i--;
		    			 break;
	    			 }
	    	     }
	    	 } 
	     }
	     if(ob.isEmpty())
	     {
	    	 System.out.println("Balanced");
	     }
	     else
	     {
	    	 System.out.println("Not balanced");
	     }
    }
}
