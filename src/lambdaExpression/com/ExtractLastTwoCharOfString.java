/*
 * Write a lambda function to extract the last character of a string.

 */
package lambdaExpression.com;
@FunctionalInterface
interface TwoChar
{
	public void isTwoChar(String s);
}
public class ExtractLastTwoCharOfString 
{

	public static void main(String[] args) 
	{
		TwoChar t = (String s)->
		{
			System.out.println(s.toString());
			System.out.println("Last two character of given string is: "+s.charAt(3)+","+s.charAt(4));
		};
		t.isTwoChar("Hello");
	}

}
