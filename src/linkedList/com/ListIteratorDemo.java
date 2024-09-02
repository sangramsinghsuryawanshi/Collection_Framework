package linkedList.com;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		ListIterator<Integer> l1 = l.listIterator();
		System.out.println("Simple Array: ");
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("Reverse array: ");
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
	}

}
