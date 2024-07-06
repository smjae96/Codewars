package codewars_0706.sol;

public class ProductOfConsecutiveFibNumbers {
	public static long[] productFib(long prod) {
		long a = 0;
		long b = 1;

		while (a * b < prod) {
			long temp = a;
			a = b;
			b = temp + b;
		}

		return new long[] { a, b, a * b == prod ? 1 : 0 };
	}
}
