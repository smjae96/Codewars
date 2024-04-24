package codewars_0424.sol;

public class FirstNonRepeatingCharacter {
	public static String firstNonRepeatingLetter(String s) {
		
		String s2 = s.toUpperCase();
		String result = "";
		for(int i=0; i<s2.length(); i++) {
			if(s2.indexOf(String.valueOf(s2.charAt(i))) == s2.lastIndexOf(String.valueOf(s2.charAt(i)))) {
				result = String.valueOf(s2.charAt(i));
				if(s.charAt(i) != s2.charAt(i)) {
					result = String.valueOf(s.charAt(i));
				}
				return result;
			}
		}
		return "";
	}
}
