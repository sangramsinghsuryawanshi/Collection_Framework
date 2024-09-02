package consumerInterface.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerInterDemo 
{
	public static void main(String[] args) 
	{
//		Consumer<String> ob = (t)->
//		{
//			System.out.println("Consumer interface: "+t);
//		};
//		ob.accept("Java");
		
		Consumer<Integer> ob = (t)->System.out.println(t);
		ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		a1.forEach(ob);
	}

}
