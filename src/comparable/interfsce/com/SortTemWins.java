package comparable.interfsce.com;

import java.util.ArrayList;
import java.util.Collections;

class Team implements Comparable<Team>
{
	private String T_Name;
	private int T_Won;
	public Team(String cName, int cPop) 
	{
		super();
		this.T_Name = cName;
		T_Won = cPop;
	}
	public String getT_Name() 
	{
		return T_Name;
	}
	public int getT_Won() 
	{
		return T_Won;
	}
	@Override
	public int compareTo(Team o) 
	{
		if(this.T_Won==o.T_Won)
		{
			return 0;
		}
		else if(this.T_Won>o.T_Won)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class SortTemWins 
{
	public static void main(String[] args) 
	{
		Team b = new Team("Mumbai    ",5);
		Team b1 = new Team("Haydrabad",0);
		Team b2 = new Team("Chennai  ",5);
		Team b3 = new Team("Kolkata  ",3);
		ArrayList<Team> a1 = new ArrayList<Team>();
		a1.add(b);
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Team Name\tTeam Won");
		System.out.println("--------------------------------------------");
		for(Team e:a1)
		{
			System.out.println(e.getT_Name()+"\t"+e.getT_Won());
		}
		System.out.println("--------------------------------------------");
		Collections.sort(a1);
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Team Name\tTeam Won");
		System.out.println("--------------------------------------------");
		for(Team e:a1)
		{
			System.out.println(e.getT_Name()+"\t"+e.getT_Won());
		}
		System.out.println("--------------------------------------------");
	}

}

