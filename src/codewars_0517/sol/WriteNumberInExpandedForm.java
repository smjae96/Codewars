package codewars_0517.sol;

public class WriteNumberInExpandedForm {
	public static String expandedForm(int num) {
		String rs = String.valueOf(num);
		String result2 = "";
		for(int i=0; i<rs.length(); i++) {
			if(rs.charAt(i) != '0') {
				if(i==0) {
					result2 = String.valueOf(rs.charAt(0))+"0".repeat(rs.length()-1);
				} else {
					result2 += " + " + String.valueOf(rs.charAt(i))+"0".repeat(rs.substring(i).length()-1);
				}
			}
		}
		return result2;
	}
}
