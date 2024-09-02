package vector.com;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class SortEleInAsecneding 
{
	public Vector<Integer> isSort(Vector<Integer> v1)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter element: ");
		for(int i=0;i<5;i++)
		{
			v1.add(sc.nextInt());
		}
		Collections.sort(v1);
		return v1;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Vector<Integer> v1 = new Vector<Integer>();
		SortEleInAsecneding p = new SortEleInAsecneding();
		Vector<Integer> c=p.isSort(v1);
		System.out.println("Given sort element is:"+c);
	}

}