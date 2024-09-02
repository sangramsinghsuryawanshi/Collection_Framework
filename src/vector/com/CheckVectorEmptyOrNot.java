package vector.com;

import java.util.Scanner;
import java.util.Vector;

public class CheckVectorEmptyOrNot {

	public String isEmpty(Vector<Integer> v1)
	{
		Scanner sc = new Scanner(System.in);
		int max=0;
		System.out.println("Enter element: ");
		for(int i=0;i<v1.size();i++)
		{
			v1.add(sc.nextInt());
		}
		if(v1.isEmpty())
		{
			return "Vector is empty";
		}
		else
		{
			return "Vector is not empty";
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Vector<Integer> v1 = new Vector<Integer>();
		CheckVectorEmptyOrNot p = new CheckVectorEmptyOrNot();
		String c=p.isEmpty(v1);
		System.out.println(c);
	}

}