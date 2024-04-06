package codewars_0406.sol;

public class FindTheNextPerfectSquare {
	public static long findNextSquare(long sq) {
		if(sq % Math.sqrt(sq) == 0) {
		return (long) ((Math.sqrt(sq) + 1)* (Math.sqrt(sq) + 1));
		} else {
			return -1;
		}
	}
}
