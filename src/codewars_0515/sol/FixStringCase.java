package codewars_0515.sol;

public class FixStringCase {
	public static String solve(final String str) {
		int up = 0;
		int low = 0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				up++;
			} else {
				low++;
			}
		}
		if(up>low) {
			return str.toUpperCase();
		} else {
			return str.toLowerCase();
		}
	}
}
