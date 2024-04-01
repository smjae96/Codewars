package codewars_0401.sol;

public class Sum {
	public static int GetSum(int a, int b) {
		if(a == b) {
			return a;
		}
		int max = 0;
		int min = 0;
		int sum = 0;
		if(a>b) {
			max = a;
			min = b;
		} else if(b>a) {
			max = b;
			min = a;
		}
		
		for(int i= min; i<= max; i++) {
			sum += i;
		}
		return sum;

		
	
		
	}
}
