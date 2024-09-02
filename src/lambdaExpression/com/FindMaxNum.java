package lambdaExpression.com;

import java.util.ArrayList;

@FunctionalInterface
interface Max
{
	public void isMax(ArrayList<Integer> a);
		
}
public class FindMaxNum {

	public static void main(String[] args) 
	{
		Max m = (ArrayList<Integer> a)->
		{
			int max=0;
			for(int i=0;i<a.size();i++)
			{
				if(a.get(i)>max)
				{
					max=a.get(i);
				}
			}
			System.out.println("Max value in list is: "+max);
		};
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(123);
		a.add(11);
		a.add(19);
		a.add(112);
		a.add(111);
		System.out.println("Given array list: "+a);
		m.isMax(a);
	}

}
