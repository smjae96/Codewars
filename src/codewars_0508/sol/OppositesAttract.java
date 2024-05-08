package codewars_0508.sol;

public class OppositesAttract {
	public static boolean isLove(final int flower1, final int flower2) {
		if (flower1 %2 == flower2 %2) {
			return false;
		} else {
			return true;
		}
	}
}
