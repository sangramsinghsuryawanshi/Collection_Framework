package vector.com;

import java.util.Scanner;
import java.util.Vector;

public class Deletion 
{
	public Vector<Integer> isDeleted(Vector<Integer> v1)
	{
		Scanner sc = new Scanner(System.in);
		int max=0;
		System.out.println("Enter element: ");
		for(int i=0;i<5;i++)
		{
			v1.add(sc.nextInt());
		}
		v1.remove(2);
		return v1;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Vector<Integer> v1 = new Vector<Integer>();
		Deletion p = new Deletion();
		Vector<Integer> c=p.isDeleted(v1);
		System.out.println("Given deleted element is:"+c);
	}

}