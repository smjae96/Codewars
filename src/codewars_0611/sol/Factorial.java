package codewars_0611.sol;

public class Factorial {
	public static long factorial(int n) {
		long result = 1L;
		for(int i=n; i>0; i--) {
			result *= i;
		}
		return result;
	}
}
