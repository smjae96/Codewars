package codewars_0313.sol;

public class IsoGram {
	public static boolean isIsogram(String str) {
		int count = 0;
		str = str.toLowerCase();
		for(int i=0; i<str.length(); ++i) {
			for(int j=i+1; j<str.length(); ++j) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				} 
			}
		}
		
		if(count != 0) {
			return false;
		} else {
			return true;
		}
	} 
}
