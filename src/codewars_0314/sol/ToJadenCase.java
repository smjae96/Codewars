package codewars_0314.sol;

public class ToJadenCase {
	public static String toJadenCase(String phrase) {
		
		if( phrase == null || "".equals(phrase) || phrase.isEmpty()  ) {
			return null;
		}
		String[] array = phrase.split(" ");
		String result = "";
		for(int i=0; i<array.length; i++) {
			
			result += toCapital(array[i]) + " ";
		}
		
		return result.substring(0, result.length()-1);
	}
	
	public static String toCapital(String str) {
		return Character.toUpperCase(str.charAt(0)) + str.substring(1);
	}
}
