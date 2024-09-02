package comparable.interfsce.com;

import java.util.ArrayList;
import java.util.Collections;

class CityPop implements Comparable<CityPop>
{
	private String cName;
	private int CPop;
	public CityPop(String cName, int cPop) 
	{
		super();
		this.cName = cName;
		CPop = cPop;
	}
	public String getcName() 
	{
		return cName;
	}
	public int getCPop() 
	{
		return CPop;
	}
	@Override
	public int compareTo(CityPop o) 
	{
		if(this.CPop==o.CPop)
		{
			return 0;
		}
		else if(this.CPop>o.CPop)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class CityPopSort 
{
	public static void main(String[] args) 
	{
		CityPop b = new CityPop("Mumbai     ",1200000);
		CityPop b1 = new CityPop("Delhi     ",12100000);
		CityPop b2 = new CityPop("Pune     ",3400000);
		CityPop b3 = new CityPop("Banglore ",500000);
		ArrayList<CityPop> a1 = new ArrayList<CityPop>();
		a1.add(b);
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("City Name\t City Population");
		System.out.println("--------------------------------------------");
		for(CityPop e:a1)
		{
			System.out.println(e.getcName()+"\t"+e.getCPop());
		}
		System.out.println("--------------------------------------------");
		Collections.sort(a1);
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("City Name\t City Population");
		System.out.println("--------------------------------------------");
		for(CityPop e:a1)
		{
			System.out.println(e.getcName()+"\t"+e.getCPop());
		}
		System.out.println("--------------------------------------------");
	}

}
