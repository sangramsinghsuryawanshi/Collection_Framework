package lambdaExpression.com;

import java.util.Scanner;

@FunctionalInterface
interface EvenOdd
{
	public String name(int a);
		
}
public class CheckEvenAndOdd 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EvenOdd e = (int a)->
		{
			if(a%2==0)
			{
				return "Given number is even";
			}
			else
			{
				return "Given number is odd";
			}
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number: ");
		int a1 = sc.nextInt();
		String s=e.name(a1);
		System.out.println(s);
	}

}
