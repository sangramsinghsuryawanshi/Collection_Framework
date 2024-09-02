package arrayList.com;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAllMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(211);
		i.add(3);
		i.add(24);
		i.add(52);
		i.add(63);
		i.add(121);
		System.out.println("i[]= "+i.clone());
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		i1.add(21);
		i1.add(31);
		i1.add(24);
		i1.add(521);
		i1.add(63);
		i1.add(12);
		System.out.println("i1[]= "+i1.clone());
		i.removeAll(i1);
		System.out.println("i.removeAll(i1) invoked");
		System.out.println("i[]= "+i.clone());
		System.out.println(i1.retainAll(i));
	}
}
