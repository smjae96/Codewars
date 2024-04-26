package codewars_0426.sol;

public class Scramblies {
	public static boolean scramble(String str1, String str2) {
		if(str2.length() > str1.length()) return false;
		String[] arr = str2.split("");
		for(String s: arr) {
			if(!str1.contains(s)) {
				return false;
			}
			str1 = str1.replaceFirst(s, "");
		}
		return true;
		
	}
}
