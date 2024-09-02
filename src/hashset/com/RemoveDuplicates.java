package hashset.com;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int s=sc.nextInt();
		System.out.println("Enter elements: ");
		for(int i=0;i<s;i++)
		{
			h.add(sc.nextInt());
		}
		System.out.println("Removed duplicates: "+h);
	}

}
