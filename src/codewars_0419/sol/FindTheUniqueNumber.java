package codewars_0419.sol;

import java.util.Arrays;

public class FindTheUniqueNumber {

	public static double findUniq(double arr[]) {

		Arrays.sort(arr);
		if(arr[0] != arr[1]) {
			return arr[0];
		} else {
			return arr[arr.length-1];
		}
	}
}
