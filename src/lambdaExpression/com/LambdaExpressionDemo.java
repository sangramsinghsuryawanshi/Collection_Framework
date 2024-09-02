package lambdaExpression.com;

import java.util.Scanner;

@FunctionalInterface
interface lamDem
{
	public void disp(int a,int b);
}
public class LambdaExpressionDemo 
{
	public static void main(String[] args) 
	{
		lamDem l = (int a,int b)->
		{
			System.out.println("Addition of two numbers: "+(a+b));
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		l.disp(a1, a2);
	}
}
