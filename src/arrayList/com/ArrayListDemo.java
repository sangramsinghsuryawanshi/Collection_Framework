package arrayList.com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("10");
		a1.add("ABC");
		a1.add(true);
		a1.add(12.33);
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
	}

}
