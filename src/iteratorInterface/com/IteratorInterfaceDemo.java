package iteratorInterface.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IteratorInterfaceDemo 
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
		System.out.println("Before iterate: "+i.clone());
		Iterator itr = i.iterator();
		Integer ob=211;
		while(itr.hasNext())
		{
			Integer currentElement = (Integer) itr.next();
			if(currentElement%2!=0)
			{
				itr.remove();
				System.out.println("Removed odd element: "+currentElement);
			}
		}
		System.out.println("After Iterate: "+i);
	}
}
