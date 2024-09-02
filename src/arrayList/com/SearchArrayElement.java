package arrayList.com;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchArrayElement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(211);
		i.add(3);
		i.add(24);
		i.add(52);
		i.add(63);
		System.out.println("Search array element: ");
		int s=sc.nextInt();
		if(i.contains(s))
		{
			 System.out.println("Element " + s + " found in the list.");
        }
		else 
		{
            System.out.println("Element " + s + " not found in the list.");
        }
	}

}
