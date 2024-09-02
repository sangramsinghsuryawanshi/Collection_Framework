/*
 * Create a lambda function to check if a given string
 *  is pallindrome or not
 */
package lambdaExpression.com;

import java.util.Scanner;

@FunctionalInterface
interface StringPalindrome
{
	public void isPalindrome(String s);
}
public class CheckGivenStringIsPalindromeOrNot 
{

	public static void main(String[] args) 
	{
		StringPalindrome s1 =(String s)->
		{
			StringBuffer str = new StringBuffer(s);
			str.reverse();
			if(s.equals(str.toString()))
			{
				System.out.println("Given string is palindrome");
			}
			else
			{
				System.out.println("Given string is not palindrome");
			}
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		s1.isPalindrome(sc.next());
	}

}
