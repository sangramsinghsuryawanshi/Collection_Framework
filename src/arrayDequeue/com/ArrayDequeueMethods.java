package arrayDequeue.com;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueMethods 
{
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> ob = new ArrayDeque<>();
		ob.add(90);
		ob.add(70);
		ob.add(90);
		ob.add(67);
		ob.add(67);
		System.out.println("add(): "+ob);
		System.out.println("contains(): "+ob.contains(12));
		System.out.println("After: "+ob);
		System.out.println("containsAll(): "+ob.containsAll(ob));
		System.out.println("After: "+ob);
		System.out.println("element(): "+ob.element());
		System.out.println("After: "+ob);
		System.out.println("getFirst(): "+ob.getFirst());
		System.out.println("After: "+ob);
		System.out.println("getLast(): "+ob.getLast());
		System.out.println("After: "+ob);
		System.out.println("offer(): "+ob.offer(23));
		System.out.println("After: "+ob);
		System.out.println("offerFirst(): "+ob.offerFirst(21));
		System.out.println("After: "+ob);
		System.out.println("offerLast(): "+ob.offerLast(43));
		System.out.println("After: "+ob);
		System.out.println("peek(): "+ob.peek());
		System.out.println("After: "+ob);
		System.out.println("peekFirst(): "+ob.peekFirst());
		System.out.println("After: "+ob);
		System.out.println("peekLast(): "+ob.peekLast());
		System.out.println("After: "+ob);
		System.out.println("poll(): "+ob.poll());
		System.out.println("After: "+ob);
		System.out.println("pollFirst(): "+ob.pollFirst());
		System.out.println("After: "+ob);
		System.out.println("pollLast(): "+ob.pollLast());
		System.out.println("After: "+ob);
		System.out.println("pop(): "+ob.pop());
		System.out.println("After: "+ob);
		System.out.println("remove(): "+ob.remove());
		System.out.println("After: "+ob);
		System.out.println("removeFirst(): "+ob.removeFirst());
		System.out.println("After: "+ob);
		System.out.println("removeLast(): "+ob.removeLast());
		System.out.println("After: "+ob);
	}
}
