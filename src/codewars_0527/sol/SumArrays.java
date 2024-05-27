package codewars_0527.sol;

public class SumArrays {
	public static double sum(double[] numbers) {
		if(numbers.length ==0) {
			return 0;
		}
		double result = 0;
		for(int i=0; i<numbers.length; i++) {
			result += numbers[i];
		}
		return result;
	}
}
