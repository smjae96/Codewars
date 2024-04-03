package codewars_0403.sol;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PangramChecker {
	public static boolean check(String sentence) {
		Pattern alphabet = Pattern.compile("[a-zA-Z]");
		Matcher matcher = alphabet.matcher(sentence.toLowerCase());
		String result = "";
		while(matcher.find()) {
			result += matcher.group();
		}
		ArrayList<Character> list = new ArrayList<>();
		if(result.length() < 26) {
			return false;
		}
		for(int i=0; i<result.length(); i++) {
			if(! list.contains(result.charAt(i))) {
				list.add(result.charAt(i));
			}
		}
		if(list.size() == 26) {
			return true;
		} else {
			return false;
		}
	}
}
