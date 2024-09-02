package arrayList.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RemoveThirdEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(211);
		i.add(3);
		i.add(24);
		i.add(52);
		i.add(63);
		System.out.println("\nOriginal ArrayList : "+i.toString());
		System.out.println("Enter third index to remove element: ");
		int n=sc.nextInt();
		i.remove(n-1);
		System.out.println("\nA3fter deletion ArrayList : "+i.toString());
		
	}
}
