/*
 * Write a lambda expression to capitalize the first letter of a string.
aaa bbbb
Aaa
Baa
 */
package lambdaExpression.com;

import java.util.Scanner;

@FunctionalInterface
interface CapFirLe
{
	public void isCap(String s);
}
public class CapitalizeFirstLetterOfString 
{

	public static void main(String[] args) 
	{
		CapFirLe c =(String s)->
		{
			String str[]=s.split(" ");
			String s1 = "";
			for(int i=0;i<str.length;i++)
			{
				System.out.print(Character.toUpperCase(str[i].charAt(0))+str[i].substring(1, str[i].length())+" ");
		
			}
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String s1 = sc.nextLine();
		c.isCap(s1);
	}

}
