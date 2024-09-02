package consumerInterface.com;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiconsumerClassDemo {

	public static void main(String[] args) 
	{
//		BiConsumer<Integer, String> bi = (k,v)->System.out.println(k+" "+v);
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		hm.put(1, "Java");
//		hm.put(2, "C");
//		hm.put(3, "C#");
//		hm.forEach(bi);
		
		//BiConsumer<Integer, String> bi = (k,v)->System.out.println(k+" "+v);
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Java");
		hm.put(2, "C");
		hm.put(3, "C#");
		hm.forEach((k,v)->System.out.println(k+"::"+v));
	}

}
