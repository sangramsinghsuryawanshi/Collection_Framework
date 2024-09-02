/*
 * Sorting Dates:
Define a class representing an Event with attributes like name and date. 
Implement a custom Comparator to sort a list of Events based on their dates
 in ascending order.
 */
package comparator.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Date
{
	private String name;
	private String date;
	public Date(String name, String date) 
	{
		super();
		this.name = name;
		this.date = date;
	}
	public String getName() 
	{
		return name;
	}
	public String getDate() 
	{
		return date;
	}
	
}
class DatesE implements Comparator<Date>
{

	@Override
	public int compare(Date o1, Date o2) 
	{
		if(o1.getName().equals(o2.getName()))
		{
			if(o1.getName().compareTo(o2.getName())==0)
			{
				return 0;
			}
			else if(o1.getName().compareTo(o2.getName())>0)
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			if(o1.getDate().compareTo(o2.getDate())==0)
			{
				return 0;
			}
			else if(o1.getDate().compareTo(o2.getDate())>0)
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
	}
	
}
public class SortingDates 
{

	public static void main(String[] args) 
	{
		ArrayList<Date> a1 = new ArrayList<Date>();
		a1.add(new Date("Sangram","       Suraywanshi"));
		a1.add(new Date("Omkar    ","Yadav"));
		a1.add(new Date("Pawar    ","Pawar"));
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("First Name \tLast Name");
		System.out.println("-------------------------");
		for(Date e:a1)
		{
			System.out.println(e.getName()+"\t"+e.getDate());
		}
		System.out.println("-------------------------");
		Collections.sort(a1, new DatesE());
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("First Name \tLast Name");
		System.out.println("-------------------------");
		for(Date e:a1)
		{
			System.out.println(e.getName()+"\t"+e.getDate());
		}
		System.out.println("-------------------------");
	}

}
