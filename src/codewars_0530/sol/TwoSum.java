package codewars_0530.sol;

public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[i]+numbers[j] == target) {
					return new int[]{i, j};
				}
			}
		}
		return null; // Do your magic!
	}
}
