package codewars_0329.sol;

public class MaximumSubarray {
	public static int sequence(int[] arr) {
		if(arr.length == 0) {
			return 0;
		}
		int sum = arr[0];
		int max = sum;
		for(int i=1; i<arr.length; i++) {
			sum += arr[i];
			if(sum < arr[i]) {
				sum = arr[i];
			}
			max = Math.max(max, sum);
		}
		return max;
	
		
		// -2, 1, -3, 4, -1
	}
}
