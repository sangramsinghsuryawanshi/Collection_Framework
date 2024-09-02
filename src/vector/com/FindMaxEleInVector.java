package vector.com;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class FindMaxEleInVector 
{

	public int isMax(Vector<Integer> v1)
	{
		Scanner sc = new Scanner(System.in);
		int max=0;
		System.out.println("Enter element: ");
		for(int i=0;i<5;i++)
		{
			v1.add(sc.nextInt());
		}
		for(int i=0;i<v1.size();i++)
		{
			if(v1.get(i)>max)
			{
				max=v1.get(i);
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Vector<Integer> v1 = new Vector<Integer>();
		FindMaxEleInVector p = new FindMaxEleInVector();
		int c=p.isMax(v1);
		System.out.println("Given max element is:"+c);
	}

}