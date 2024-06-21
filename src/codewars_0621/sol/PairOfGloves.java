package codewars_0621.sol;

import java.util.Arrays;

public class PairOfGloves {
	public static int numberOfPairs(String[] gloves) {
		Arrays.sort(gloves);
		int result = 0;
		for(int i=0; i<gloves.length-1;) {
			if(gloves[i].equals(gloves[i+1])) {
				i= i+2;
				result ++;
			} else {
				i++;
			}
		}
	    return result;
	  }
}
