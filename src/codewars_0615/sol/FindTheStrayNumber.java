package codewars_0615.sol;

import java.util.Arrays;

public class FindTheStrayNumber {
	public static int stray(int[] numbers) {
		Arrays.sort(numbers);
		if(numbers[0] == numbers[1]) {
			return numbers[numbers.length-1];
		}
		return numbers[0];
	}
}
