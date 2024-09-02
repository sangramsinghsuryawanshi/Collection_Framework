package hashset.com;

import java.util.HashSet;
import java.util.Scanner;

public class UnionAndIntersection {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size 1: ");
		int s=sc.nextInt();
		System.out.println("Enter elements 1: ");
		for(int i=0;i<s;i++)
		{
			h.add(sc.nextInt());
		}
		HashSet<Integer> h1 = new HashSet<Integer>();
		System.out.println("Enter size 2: ");
		int s1=sc.nextInt();
		System.out.println("Enter elements 1: ");
		for(int i=0;i<s1;i++)
		{
			h1.add(sc.nextInt());
		}
		HashSet<Integer> in = new HashSet<Integer>(h);
		in.retainAll(h1);
		System.out.println("Intersection: "+in);
		
		HashSet<Integer> un = new HashSet<Integer>(h);
		un.addAll(h1);
		System.out.println("Union: "+un);
	}

}
