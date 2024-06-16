package codewars_0616.sol;

public class MaximumLengthDifference {
	public static int mxdiflg(String[] a1, String[] a2) {
		if(a1.length == 0 || a2.length == 0) {
			return -1;
		}
		int min1 = a1[0].length();
		int max1 = a1[0].length();
		int min2 = a2[0].length();
		int max2 = a2[0].length();
		for(int i=0; i<a1.length; i++) {
			if(a1[i].length()< min1) {
				min1 = a1[i].length();
			}
			if(a1[i].length()> max1) {
				max1 = a1[i].length();
			}
		}
		for(int i=0; i<a2.length; i++) {
			if(a2[i].length()> max2) {
				max2 = a2[i].length();
			}
			if(a2[i].length() < min2) {
				min2 = a2[i].length();
			}
		}
		if(Math.abs(max2- min1) > Math.abs(min2 - max1)) {
			return Math.abs(max2- min1);
		} else {
			return Math.abs(min2 - max1);
		}
	}
}
