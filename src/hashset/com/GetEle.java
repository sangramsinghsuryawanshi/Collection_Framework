/*
 * 3. Write a Java program to get the number of elements in a hash set.

4. Write a Java program to empty an hash set.

5. Write a Java program to test if a hash set is empty or not.

6. Write a Java program to clone a hash set to another hash set.
7. Write a Java program to convert a hash set to an array.
 */
package hashset.com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class GetEle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<Integer>();
		LinkedHashSet<Integer> h1 = new LinkedHashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		h.add(12);
		h.add(11);
		h.add(18);
		h.add(19);
		System.out.println("Orignal Hashset: "+h);
		System.out.println("Empty Hashset: "+h.isEmpty());
		if(h.isEmpty())
		{
			System.out.println("Given hashset is empty");
		}
		else
		{
			System.out.println("Given hashset is not empty");
		}
		h1.addAll(h);
		System.out.println("Clone of hashset: "+h1.clone());
		h1.toArray();
		System.out.println("Hashset to array: "+h1);
	}

}
