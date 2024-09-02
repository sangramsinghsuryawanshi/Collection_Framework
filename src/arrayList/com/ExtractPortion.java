package arrayList.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtractPortion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(211);
        list.add(3);
        list.add(24);
        list.add(52);
        list.add(63);
        list.add(85);
        list.add(99);

        System.out.println("Original ArrayList: " + list);

        // Define the start and end indices
        System.out.println("Enter first and last index: ");
        int fromIndex = sc.nextInt();
        int toIndex = sc.nextInt();

        // Extract a portion of the ArrayList
        List<Integer> subList = list.subList(fromIndex, toIndex);

        System.out.println("Extracted portion of ArrayList: " + subList);
    }
}
