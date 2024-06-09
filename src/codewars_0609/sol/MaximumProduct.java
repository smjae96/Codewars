package codewars_0609.sol;

public class MaximumProduct {
	public static int adjacentElementsProduct(int[] array) {
		int result = array[0]*array[1];
		for(int i=0; i<array.length-1; i++) {
			if(result < array[i]*array[i+1]) {
				result = array[i]*array[i+1];
			}
		}
		return result;
		
	}
}
