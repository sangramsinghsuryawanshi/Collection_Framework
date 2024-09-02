/*
 * Write a lambda function to calculate the area of a rectangle 
 * given its length and width.

 */
package lambdaExpression.com;

import java.util.Scanner;

@FunctionalInterface
interface AreaOfRec
{
	public void isArea(int l,int w);
}
public class CalculateAreaOfRectangle 
{

	public static void main(String[] args) 
	{
		AreaOfRec a = (int l,int w)->
		{
			int area=l*w;
			System.out.println("Area of rectangle is: "+area);
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given length and width: ");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		a.isArea(a1, a2);
	}

}
