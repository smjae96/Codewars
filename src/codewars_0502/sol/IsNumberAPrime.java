package codewars_0502.sol;

public class IsNumberAPrime {
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		if(num == 2) {
			return true;
		}
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
