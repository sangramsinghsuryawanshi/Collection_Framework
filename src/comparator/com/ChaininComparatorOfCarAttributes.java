/*
 * 6. Chaining Comparators:
Create a class representing a Car with attributes like make,
 model, and year. Implement multiple comparators, one for each 
 attribute, and then use them to sort a list of Cars based on 
 make, model, and year in that order.
 */
package comparator.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class carAttributes
{
	private String carName;
	private int carModel;
	private int carModelYear;
	public carAttributes(String carName, int carModel, int carModelYear) 
	{
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.carModelYear = carModelYear;
	}
	public String getCarName() 
	{
		return carName;
	}
	public int getCarModel() 
	{
		return carModel;
	}
	public int getCarModelYear() 
	{
		return carModelYear;
	}
}
class CarModelSort implements Comparator<carAttributes>
{

	@Override
	public int compare(carAttributes o1, carAttributes o2) 
	{
		if(o1.getCarModel()==o2.getCarModel())
		{
			return 0;
		}
		else if(o1.getCarModel()>o2.getCarModel())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
class CarYearSort implements Comparator<carAttributes>
{

	@Override
	public int compare(carAttributes o1, carAttributes o2) 
	{
		if(o1.getCarModelYear()==o2.getCarModelYear())
		{
			return 0;
		}
		else if(o1.getCarModelYear()>o2.getCarModelYear())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}


	
}
public class ChaininComparatorOfCarAttributes 
{

	public static void main(String[] args) 
	{
		ArrayList<carAttributes> a1 = new ArrayList<carAttributes>();
		a1.add(new carAttributes("BMW        ",121,2024));
		a1.add(new carAttributes("Audi       ",101,2023));
		a1.add(new carAttributes("Thar       ",111,2014));
		a1.add(new carAttributes("Mustag     ",11,1994));
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Car Name\t Car Model\t Car Year");
		System.out.println("--------------------------------------------");
		for(carAttributes e:a1)
		{
			System.out.println(e.getCarName()+"\t"+e.getCarModel()+"\t"+e.getCarModelYear());
		}
		System.out.println("--------------------------------------------");
		Collections.sort(a1, new CarModelSort());
		System.out.println("");
		System.out.println("After CarModelSort sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Car Name\tCar Model\tCar Year");
		System.out.println("--------------------------------------------");
		for(carAttributes e:a1)
		{
			System.out.println(e.getCarName()+"\t"+e.getCarModel()+"\t        "+e.getCarModelYear());
		}
		System.out.println("--------------------------------------------");
		
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Car Name\tCar Model\tCar Year");
		System.out.println("--------------------------------------------");
		for(carAttributes e:a1)
		{
			System.out.println(e.getCarName()+"\t"+e.getCarModel()+"\t        "+e.getCarModelYear());
		}
		System.out.println("--------------------------------------------");
		Collections.sort(a1, new CarYearSort());
		System.out.println("");
		System.out.println("After CarYearSort sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Car Name\tCar Model\tCar Year");
		System.out.println("--------------------------------------------");
		for(carAttributes e:a1)
		{
			System.out.println(e.getCarName()+"\t"+e.getCarModel()+"\t        "+e.getCarModelYear());
		}
		System.out.println("--------------------------------------------");
	}

}
