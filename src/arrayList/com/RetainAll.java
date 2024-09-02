package arrayList.com;

import java.util.ArrayList;
import java.util.Scanner;

public class RetainAll 
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
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		i1.add(21);
		i1.add(31);
		i1.add(24);
		i1.add(521);
		i1.add(63);
		i1.add(12);
		i.retainAll(i1);
		System.out.println("RetainAll(): "+i.clone());
		i.trimToSize();
		System.out.println("SizeTrim: "+i);
	}
}
