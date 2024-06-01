package codewars_0601.sol;

public class TriangularTreasure {
	public static long triangular(long n) {
		if(n<= 0) {
			return 0;
		}
		long result = 0;
		for(long i=n; i>=1; i--) {
			result += i;
		}
		return result;
	}
}
