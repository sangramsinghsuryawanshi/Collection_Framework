package arrayList.com;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(211);
        i.add(3);
        i.add(24);
        i.add(52);
        i.add(63);
        
        System.out.println("Original ArrayList: " + i);
        
        // Reverse the elements in the ArrayList
        Collections.reverse(i);
        
        System.out.println("Reversed ArrayList: " + i);
    }
}
