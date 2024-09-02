package lambdaExpression.com;

import java.util.ArrayList;

@FunctionalInterface
interface Avg
{
	public int isAvg(ArrayList<Integer> a);
}
public class FindAverageOfList 
{

	public static void main(String[] args) 
	{
		Avg n  = (ArrayList<Integer> a)->
		{
			int sum=0;
			for(int i=0;i<a.size();i++)
			{
				sum+=a.get(i);
			}
			int avg=sum/a.size();
			return avg;
		};
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(-12);
		a.add(123);
		a.add(11);
		a.add(-19);
		a.add(112);
		a.add(111);
		System.out.println("Given array list: "+a);
		int a1 =n.isAvg(a);
		System.out.println("Average of list: "+a1);
	}

}
