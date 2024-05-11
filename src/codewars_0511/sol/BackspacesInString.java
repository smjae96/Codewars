package codewars_0511.sol;

public class BackspacesInString {
	public static String cleanString(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '#') {
				if(sb.length() > 0) {
					sb.deleteCharAt(sb.length() -1);
				}
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
}
