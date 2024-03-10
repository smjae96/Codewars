package codewars_0310.sol;

public class MiddleCharacter {
	public static String getMiddle(String word) {
		if(word.length() % 2 == 0) {
			return String.valueOf(word.charAt(word.length()/2-1)) + String.valueOf(word.charAt(word.length()/2));
		} else {
			return String.valueOf(word.charAt(word.length()/2));
		}
	}
}
