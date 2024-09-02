package arrayList.com;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertFirstPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		i.add(6);
		System.out.println("\nOriginal ArrayList : "+i.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter element : ");
		int n = sc.nextInt();
		System.out.print("Enter index : ");
		int ind =sc.nextInt();
		
		i.add(ind,n);
		
		System.out.println("\nModified ArrayList : "+i.toString());

	}

}