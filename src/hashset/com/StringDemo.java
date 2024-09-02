package hashset.com;

import java.util.HashSet;
import java.util.Set;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Set<String> s1 = new HashSet<String>();
		s1.add("Apple");
		
		System.out.println("Formula"+(s1.hashCode()%16));
		System.out.println(s1);
	}

}
