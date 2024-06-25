package codewars_0625.sol;

import java.util.ArrayList;

public class ContinuedFraction {
	public static int[] continuedFraction(int numerator, int denominator) {
		 if (numerator == 0) {
	            return new int[0];
	        }

	        ArrayList<Integer> result = new ArrayList<>();
	        
	        while (denominator != 0) {
	            int share = numerator / denominator;
	            result.add(share);
	            
	            int remainder = denominator;
	            denominator = numerator % denominator;
	            numerator = remainder;
	        }
	        
	        int[] resultArray = new int[result.size()];
	        for (int i = 0; i < result.size(); i++) {
	            resultArray[i] = result.get(i);
	        }
	        
	        return resultArray;
	}
}
