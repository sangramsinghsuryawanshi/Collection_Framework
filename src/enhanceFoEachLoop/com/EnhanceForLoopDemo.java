package enhanceFoEachLoop.com;

import java.util.ArrayList;

public class EnhanceForLoopDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(211);
		i.add(3);
		i.add(24);
		i.add(52);
		i.add(63);
		i.add(121);
		System.out.print("Inhance for loop: ");
		for(Integer i1:i)
		{
			System.out.print(i1+" ");
		}
	}
}
