package vector.com;

import java.util.Scanner;
import java.util.Vector;

public class IntersectionOfTwoVectors 
{

	public int isIntesect(Vector<Integer> v1,Vector<Integer> v2)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		System.out.println("Enter 1 element: ");
		for(int i=0;i<5;i++)
		{
			v1.add(sc.nextInt());
		}
		System.out.println("Enter 2 element: ");
		for(int i=0;i<5;i++)
		{
			v2.add(sc.nextInt());
		}
		for(int i=0;i<v1.size();i++)
		{
			for(int j=0;j<v2.size();j++)
			{
				if(v1.get(i).equals(v2.get(j)))
				{
					sum=v2.get(j);
				}
			}
		}
		Vector<Integer> v3 = (Vector<Integer>) v1.clone();
		v1.retainAll(v2);
		v2.removeAll(v3);
		v3.removeAll(v1);
		v2.addAll(v3);
		System.out.println("Union:"+v2);
		
		return sum;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		IntersectionOfTwoVectors p = new IntersectionOfTwoVectors();
		int c=p.isIntesect(v1,v2);
		System.out.println("Given intersection of two vectors is:"+c);
	}

}