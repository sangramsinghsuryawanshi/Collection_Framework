package vector.com;

import java.util.Scanner;
import java.util.Vector;

public class RemoveDuplicate 
{

	public Vector<Integer> isDuplicate(Vector<Integer> v1)
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v2 = new Vector<Integer>();
		System.out.println("Enter element: ");
		for(int i=0;i<5;i++)
		{
			v1.add(sc.nextInt());
		}
		for(int i=0;i<v1.size();i++)
		{
			for(int j=i+1;j<v1.size();j++)
			{
				if(v1.get(i).equals(v1.get(j)))
				{
					v1.remove(j);
					j--;
				}
			}
		}
		return v1;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Vector<Integer> v1 = new Vector<Integer>();
		RemoveDuplicate p = new RemoveDuplicate();
		Vector<Integer> c=p.isDuplicate(v1);
		System.out.println("Duplicate element removed:"+c);
	}

}