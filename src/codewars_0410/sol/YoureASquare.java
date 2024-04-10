package codewars_0410.sol;

public class YoureASquare {
	public static boolean isSquare(int n) {
		if(n<0) {
			return false;
		}
		if((int)(Math.sqrt(n))*(int)(Math.sqrt(n)) != n) {
			return false;
		}
		return true;
	}
}
