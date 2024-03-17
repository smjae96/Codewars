package codewars_0317.sol;

public class DuplicateEncoder {
	public static String encode(String word) {
		word = word.toLowerCase();
		String result = "";
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if(word.indexOf(ch) == word.lastIndexOf(ch)) {
				ch = '(';
			} else {
				ch = ')';
			}
			result += ch;
		}
		return result;
	}
}
