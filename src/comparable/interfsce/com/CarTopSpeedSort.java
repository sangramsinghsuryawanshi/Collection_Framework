/*
 * Create a Car class that implements Comparable and compares cars based
 *  on their top speed.
 */
package comparable.interfsce.com;

import java.util.ArrayList;
import java.util.Collections;

class TopSpeed implements Comparable<TopSpeed>
{
	private String carName;
	private int speed;
	public TopSpeed(String carName, int speed) 
	{
		super();
		this.carName = carName;
		this.speed = speed;
	}
	public String getCarName() 
	{
		return carName;
	}
	public int getSpeed() 
	{
		return speed;
	}
	@Override
	public int compareTo(TopSpeed o) 
	{
		if(this.speed==o.speed)
		{
			return 0;
		}
		else if(this.speed>o.speed)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class CarTopSpeedSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TopSpeed t = new TopSpeed("Audi    ",370);
		TopSpeed t1 = new TopSpeed("BMW      ",470);
		TopSpeed t2 = new TopSpeed("Thar    ",270);
		TopSpeed t3 = new TopSpeed("Mustag   ",350);
		ArrayList<TopSpeed> a1 = new ArrayList<TopSpeed>();
		a1.add(t);
		a1.add(t1);
		a1.add(t2);
		a1.add(t3);
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println("Car Name\tCar Speed");
		System.out.println("-----------------------------");
		for(TopSpeed e:a1)
		{
			System.out.println(e.getCarName()+"\t"+e.getSpeed());
		}
		System.out.println("-----------------------------");
		Collections.sort(a1);
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("Car Name\tCar Speed");
		System.out.println("-----------------------------");
		for(TopSpeed e:a1)
		{
			System.out.println(e.getCarName()+"\t"+e.getSpeed());
		}
		System.out.println("-----------------------------");
	}

}
