package priorityQueue.com;

import java.util.PriorityQueue;

public class PriorityQueueDemo 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(12);
		pq.add(0);
		pq.add(0);
		System.out.println(pq);
		System.out.println("peek()->null if element is not present: "+pq.peek());
		System.out.println("element()throw exception if element is not present: "+pq.element());
		System.out.println("remove()throw exception if element is not present: "+pq.remove());
		System.out.println("offer(): "+pq.offer(12));
		System.out.println("poll()null if element is not present: "+pq.poll());
		System.out.println(pq);
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.add("java");
		pq1.add("fava1");
		pq1.add("aava2");
		pq1.add("cava3");
		System.out.println(pq1);
	}
}
