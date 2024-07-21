package codewars_0721.sol;

import java.util.Arrays;

public class AreTheNumbersInOrder {
	public static boolean isAscOrder(int[] arr) {
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr2);
		for(int i=0; i<arr.length; i++) {
			if(arr2[i] != arr[i]) {
				return false;
			}
		}
		return true;
	}
}
