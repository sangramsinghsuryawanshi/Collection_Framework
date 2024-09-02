package vector.com;

import java.util.Scanner;
import java.util.Vector;

public class InsertAnElementAtSpecificPosition {

	public Vector<Integer> isInserted(Vector<Integer> v1)
	{
		Scanner sc = new Scanner(System.in);
		int max=0;
		System.out.println("Enter element: ");
		for(int i=0;i<5;i++)
		{
			v1.add(sc.nextInt());
		}
		v1.add(1, 12);
		return v1;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Vector<Integer> v1 = new Vector<Integer>();
		InsertAnElementAtSpecificPosition p = new InsertAnElementAtSpecificPosition();
		Vector<Integer> c=p.isInserted(v1);
		System.out.println("Given inserted element is:"+c);
	}

}