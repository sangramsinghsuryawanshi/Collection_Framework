/*
 * 2. Custom Comparator:
Create a custom Comparator to sort a list of Strings based on
 their lengths in ascending order.
 */
package comparator.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Lenght
{
	private String name;

	public Lenght(String name) 
	{
		super();
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
}
class NameLenght implements Comparator<Lenght>
{

	@Override
	public int compare(Lenght o1, Lenght o2) 
	{
		if(o1.getName().length()==o2.getName().length())
		{
			return 0;
		}
		else if(o1.getName().length()>o2.getName().length())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class LenghtWiseStrinSort 
{

	public static void main(String[] args) 
	{
		ArrayList<Lenght> a1 = new ArrayList<Lenght>();
		a1.add(new Lenght("sangram suryawanshi"));
		a1.add(new Lenght("Raj suryawanshi"));
		a1.add(new Lenght("Aditya Jadhav"));
		a1.add(new Lenght("Omkar Yadav"));
		a1.add(new Lenght("Harshavardhan Pawar"));
		System.out.println("Before length wise sort:\n----------------------------- ");
		System.out.println("<--Name-->");
		System.out.println("********************************");
		for(Lenght e : a1)
		{
			System.out.println(e.getName());
		}
		System.out.println("********************************");
		System.out.println("---------------------------------");
		Collections.sort(a1, new NameLenght());
		System.out.println("After length wise sort:\n----------------------------- ");
		System.out.println("<--Name-->");
		System.out.println("********************************");
		for(Lenght e : a1)
		{
			System.out.println(e.getName());
		}
		System.out.println("********************************");
	}

}
