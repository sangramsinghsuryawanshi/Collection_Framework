/*
 * Create a lambda function to filter out all the negative numbers 
 * from a list.

 */
package lambdaExpression.com;

import java.util.ArrayList;
@FunctionalInterface
interface neg
{
	public ArrayList<Integer> isNeg(ArrayList<Integer> a);
}
public class FilterOutNegativeNumberFromList 
{
	public static void main(String[] args) 
	{
		neg n  = (ArrayList<Integer> a)->
		{
			for(int i=0;i<a.size();i++)
			{
				if(a.get(i)<0)
				{
					a.remove(i);
				}
			}
			return a;
		};
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(-12);
		a.add(123);
		a.add(11);
		a.add(-19);
		a.add(112);
		a.add(111);
		System.out.println("Given array list: "+a);
		ArrayList<Integer> a1 =n.isNeg(a);
		System.out.println("Removed negative list: "+a1);
	}

}
