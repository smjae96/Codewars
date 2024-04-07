package codewars_0407.sol;

import java.util.ArrayList;

public class FindTheOddInt {
	public static int findIt(int[] a) {
		
		for(int i=0; i<a.length; i++) {
			int num = a[i];
			int count = 0;
			for(int j=0; j<a.length; j++) {
				if(a[j] == num) {
					count++;
				}
			}
			if(count % 2 == 1) {
				return num;
			}
		}
		return 0;
	}
}
