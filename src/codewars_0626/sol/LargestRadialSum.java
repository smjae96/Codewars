package codewars_0626.sol;

public class LargestRadialSum {
	public static int largest(int[] arr, int d) {
		int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < d; j++) {
                int index = (i + j * (n / d)) % n;
                sum += arr[index];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
	}
}
