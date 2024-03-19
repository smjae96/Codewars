package codewars_0319.sol;

public class FindOutlier {
	public static int find(int[] integers) {
		int countOdd = 0;
		int countEven = 0;
		for(int i=0; i<integers.length; i++) {
			if(integers[i] % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}
		int result = 0;
		if(countEven == 1) {
			for(int i=0; i<integers.length; i++) {
				if(integers[i] % 2 == 0) {
					result = integers[i];
				}
			}
		}
		if(countOdd == 1) {
			for(int i=0; i<integers.length; i++) {
				if(integers[i] % 2 != 0) {
					result = integers[i];
				}
			}
		}
		return result;
	}
}
