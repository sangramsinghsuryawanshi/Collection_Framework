package linkedList.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckValue {

	public static void main(String[] args) 
	{
		HashMap<Integer, List<String>> li = new HashMap<>();
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("java");
		l1.add("C#");
		l1.add("PHP");
		li.put(1, l1);
		String s = li.get(1).get(2);
		System.out.println(s);
	}

}
