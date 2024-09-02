package arrayList.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShuffleArrayElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(211);
        i.add(3);
        i.add(24);
        i.add(52);
        i.add(63);
        
        System.out.println("Original ArrayList: " + i);
        
        // Shuffle the elements in the ArrayList
        Collections.shuffle(i);
        
        System.out.println("Shuffled ArrayList: " + i);
    }
}
