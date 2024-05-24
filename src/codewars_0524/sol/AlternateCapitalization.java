package codewars_0524.sol;

public class AlternateCapitalization {
	public static String[] capitalize(String s) {
		String string = "";
		String string2 = "";
		for(int i=0; i<s.length(); i++) {
			if(i==0 || i%2 == 0) {
				string += Character.toUpperCase(s.charAt(i));
			} else {
				string += Character.toLowerCase(s.charAt(i));
			}
		}
		for(int i=0; i<s.length(); i++) {
			if(i==0 || i%2 == 0) {
				string2 += Character.toLowerCase(s.charAt(i));
			} else {
				string2 += Character.toUpperCase(s.charAt(i));
			}
		}
		
		return new String[] {string, string2};
	}

}
