package linkedHashSet.com;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetDemo 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int s = sc.nextInt();
		System.out.println("addMethod: ");
		for(int i=0;i<s;i++)
		{
			l.add(sc.nextInt());
		}
		l.add(null);
		System.out.println("add method: "+l);
	}
}
