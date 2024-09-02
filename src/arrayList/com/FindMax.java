/*
 * Write a function to find the maximum element in an ArrayList.(using Lambda Expression)
 */
package arrayList.com;

import java.util.Arrays;
import java.util.List;

interface Max {
	Integer Maximum(List<Integer> l);
}

public class FindMax {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(200,500,2000,6000);
		Max m = (al)->{
			int max=0;
			for(Integer a:al) {
				if(a>max) {
					max=a;
				}
			}
			return max;
		};
		System.out.println(m.Maximum(l));
	}
}
