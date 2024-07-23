package codewars_0723.sol;

import java.math.BigInteger;

public class LastDigitOfALargeNumber {
	public static int lastDigit(BigInteger n1, BigInteger n2) {
		return n1.modPow(n2, BigInteger.TEN).intValue();
	}
}
