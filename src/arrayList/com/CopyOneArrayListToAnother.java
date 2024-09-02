package arrayList.com;

import java.util.ArrayList;
import java.util.Scanner;

public class CopyOneArrayListToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(211);
		i.add(3);
		i.add(24);
		i.add(52);
		i.add(63);
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		 i1.addAll(i);
	        
	        // Print both ArrayLists to verify the copy
	        System.out.println("Original ArrayList: " + i);
	        System.out.println("Copied ArrayList: " + i1);
	        
	}

}
