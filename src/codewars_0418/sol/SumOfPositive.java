package codewars_0418.sol;

public class SumOfPositive {
	public static int sum(int[] arr) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				count += arr[i];
			}
		}
		return count;
	}
}
