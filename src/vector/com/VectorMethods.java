package vector.com;

import java.util.Scanner;
import java.util.Vector;

public class VectorMethods 
{
	public void isadd(Vector<Integer> v)
	{
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		v.add(16);
		System.out.println("add method: "+v);
	}
	public void isaddElement(Vector<Integer> v)
	{
		v.addElement(17);
		System.out.println("addElement method: "+v);
	}
	public void isaddAll(Vector<Integer> v)
	{
		v.addAll(v);
		System.out.println("addAll method: "+v);
	}
	public void isget(Vector<Integer> v)
	{
		v.get(1);
		System.out.println("get(index) method: "+v);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("add()		:1\r\n"
				+ "addElement()	:2\r\n"
				+ "addAll()	:31\r\n"
				+ "get(index) 	:3\r\n"
				+ "contains()	:4\r\n"
				+ "clear()		:5\r\n"
				+ "clone()		:6\r\n"
				+ "elementAt()	:7\r\n"
				+ "equals()	:8\r\n"
				+ "firstElement	:9\r\n"
				+ "indexOf()	:10\r\n"
				+ "lastIndexOf()	:11\r\n"
				+ "\r\n"
				+ "insertElementAt():12\r\n"
				+ "isEmpty()	:13\r\n"
				+ "lastElement	:14\r\n"
				+ "remove()	:15\r\n"
				+ "removeAll()	:16\r\n"
				+ "removeAllElements():17\r\n"
				+ "replaceAll()	:18\r\n"
				+ "retailAll()	:19\r\n"
				+ "set()		:20\r\n"
				+ "setElementAt()	:21\r\n"
				+ "subList()	:22\r\n"
				+ "toArray() 	:23\r\n"
				+ "trimToSize()	:24\r\n"
				+ " sort()		:25");
		System.out.println("---------------------------------------\nEnter cases:");
		int ch=1;
		VectorMethods v1 = new VectorMethods();
		while(ch!=0)
		{
			 ch=sc.nextInt();
			switch(ch)
			{
			case 1: v1.isadd(v);
			break;
			case 2: v1.isaddElement(v);
			break;
			case 3: v1.isaddAll(v);
			break;
			case 4: v1.isget(v);
			break;
			}
		}
	}
}
