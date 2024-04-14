package codewars_0414.sol;

public class SumOfDigits {
	public static int digital_root(int n) {
		String num = String.valueOf(n);
		int result = 0;
		
		String[] arr = num.split("");
		
		
		for(int i=0; i<arr.length; i++) {
			result += Integer.parseInt(arr[i]);
		}
		if(result > 9) {
			return digital_root(result);
		} else {
			return result;
		}
		
		
	}
}
