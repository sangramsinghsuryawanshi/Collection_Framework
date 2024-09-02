package comparator.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class OBJ
{
	private String proType;
	private String proName;
	private int price;
	public OBJ(String proType, String proName, int price) 
	{
		super();
		this.proType = proType;
		this.proName = proName;
		this.price = price;
	}
	public String getProType() 
	{
		return proType;
	}
	public String getProName() 
	{
		return proName;
	}
	public int getPrice() 
	{
		return price;
	}
}
class ProductName implements Comparator<OBJ>
{

	@Override
	public int compare(OBJ o1, OBJ o2) 
	{
		if(o1.getProName().compareTo(o2.getProName())==0)
		{
			return 0;
		}
		else if(o1.getProName().compareTo(o2.getProName())>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class ProductSort 
{

	public static void main(String[] args) 
	{
		ArrayList<OBJ> a1 = new ArrayList<OBJ>();
		a1.add(new OBJ("Grocery    ","     Oil   ",125));
		a1.add(new OBJ("Bekary     ","     Cake   ",255));
		a1.add(new OBJ("Dairy      ","     Milk   ",25));
		a1.add(new OBJ("Vegitables ","     Potato ",50));
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Product Type\t Product Name\t Product Price");
		System.out.println("--------------------------------------------");
		for(OBJ e:a1)
		{
			System.out.println(e.getProType()+"\t"+e.getProName()+"\t"+e.getPrice());
		}
		System.out.println("--------------------------------------------");
		Collections.sort(a1, new ProductName());
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Product Type\t Product Name\t Product Price");
		System.out.println("--------------------------------------------");
		for(OBJ e:a1)
		{
			System.out.println(e.getProType()+"\t"+e.getProName()+"\t"+e.getPrice());
		}
		System.out.println("--------------------------------------------");
	}

}
