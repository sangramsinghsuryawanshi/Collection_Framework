package arrayList.com;

import java.util.ArrayList;
import java.util.Scanner;

public class CloneMethod 
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
		System.out.println("Clone method: "+i.clone());
		i.clear();
		System.out.println("a.clear invoked: "+i.clone());
	}
}
