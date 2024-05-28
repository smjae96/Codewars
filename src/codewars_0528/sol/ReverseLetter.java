package codewars_0528.sol;

public class ReverseLetter {

	public static String reverseLetter(final String str) {
		String result = str;
		result = result.replaceAll("[^a-z]", "");
		StringBuilder sb = new StringBuilder(result);
		
        return sb.reverse().toString(); 
    }
}
