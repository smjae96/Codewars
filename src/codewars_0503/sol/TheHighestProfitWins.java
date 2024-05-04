package codewars_0503.sol;

import java.util.Arrays;

public class TheHighestProfitWins {
	public static int[] minMax(int[] arr) {

		Arrays.sort(arr);

		int[] result = { arr[0], arr[arr.length - 1] };
		return result;
	}

}
