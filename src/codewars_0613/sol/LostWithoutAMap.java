package codewars_0613.sol;

public class LostWithoutAMap {
	public static int[] map(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i]*2;
		}
		return arr;
	}
}
