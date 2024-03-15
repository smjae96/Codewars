package codewars_0315.sol;

public class getXO {
	public static boolean getXO(String str) {
//		str = str.toLowerCase();
//		int countO = 0;
//		int countX = 0;
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) == 'o') {
//				countO++;
//			}
//			if(str.charAt(i) == 'x') {
//				countX++;
//			}
//		}
//		
//		if(countO == countX) {
//			return true;
//		} else {
//			return false;
//		}
		
		// 다른 풀이
		str = str.toLowerCase();
	    return str.replace("o","").length() == str.replace("x","").length();
		
	}
}
