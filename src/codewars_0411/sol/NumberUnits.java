package codewars_0411.sol;

public class NumberUnits {
	public static boolean isNarcissistic(int number) {
		String num = String.valueOf(number);
		String[] arr = num.split("");
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += Math.pow(Integer.parseInt(arr[i]), arr.length);
		}
		
		if(number == sum) {
			return true;
		} else {
			return false;
		}
		
	}
}
