package codewars_0629.sol;

public class VowelCount {
	public static int getCount(String str) {
		int result = 0;
		for(int i=0; i<str.length(); i++) {
			result += (str.charAt(i) == 'a' ||
					str.charAt(i) == 'e' ||
					str.charAt(i) == 'i' ||
					str.charAt(i) == 'o' ||
					str.charAt(i) == 'u') ? 1 : 0;
		}
		return result;
	}
}
