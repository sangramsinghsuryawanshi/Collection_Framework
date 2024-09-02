/*
 * 1. Write a program to create a vector of integers and print its elements.

 */
package vector.com;

import java.util.Scanner;
import java.util.Vector;

public class PrintVectorEle 
{
	public Vector<Integer> isEle(Vector<Integer> v1)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter element: ");
		for(int i=0;i<5;i++)
		{
			v1.add(sc.nextInt());
			sum+=v1.get(i);
		}
		System.out.println("Sum of the vector element is: "+sum);
		return v1;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Vector<Integer> v1 = new Vector<Integer>();
		PrintVectorEle p = new PrintVectorEle();
		Vector<Integer> c=p.isEle(v1);
		System.out.println("Given element is:"+c);
	}

}
