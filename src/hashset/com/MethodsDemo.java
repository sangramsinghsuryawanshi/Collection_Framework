package hashset.com;

import java.util.HashSet;
import java.util.Set;

public class MethodsDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Set ob = new HashSet();
		Set ob1 = new HashSet();
		ob1.add("pqr");
		ob.add("nmo");
		System.out.println("Add Method: "+ob);
		ob.addAll(ob1);
		System.out.println("addAll Method: "+ob1);
		System.out.println("contains Method: "+ob.contains("abcd"));
		System.out.println("conatainsAll Method: "+ob.containsAll(ob1));
		
		System.out.println("isEmpty Method: "+ob.isEmpty());
		System.out.println("equals Method: "+ob.equals(ob));
		ob.remove("äbcd");
		System.out.println("remove Method: "+ob);
		ob.removeAll(ob1);
		System.out.println("removeAll Method: "+ob);
		ob.retainAll(ob1);
		System.out.println("retainAll Method: "+ob);
		ob.clear();
		System.out.println("Clear Method: "+ob);
	}

}
