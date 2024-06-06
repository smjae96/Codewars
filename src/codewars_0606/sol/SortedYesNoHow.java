package codewars_0606.sol;

import java.util.Arrays;

public class SortedYesNoHow {
	public static String isSortedAndHow(int[] array) {
		int asc = 0;
		int desc = 0;
		for(int i=0; i<array.length-1; i++) {
			if(array[i]<array[i+1]) {
				asc++;
			} else if(array[i]>array[i+1]) {
				desc++;
			}
		}
		if(asc == array.length-1) {
			return "yes, ascending";
		} 
		if(desc == array.length-1) {
			return "yes, descending";
		}
		return "no";
	}
}
