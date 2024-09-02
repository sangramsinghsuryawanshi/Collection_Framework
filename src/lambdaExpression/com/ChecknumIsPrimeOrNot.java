/*
 * Write a lambda expression to check given number is prime or not

 */
package lambdaExpression.com;

import java.util.Scanner;

@FunctionalInterface
interface PrimeCheck
{
	public void isPrime(int a);
}
public class ChecknumIsPrimeOrNot 
{

	public static void main(String[] args) 
	{
		PrimeCheck p = (int a)->
		{
			int cnt=0;
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println("Given number is prime");
			}
			else
			{
				System.out.println("Given number is not prime");
			}
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number: ");
		int n= sc.nextInt();
		p.isPrime(n);
	}

}
