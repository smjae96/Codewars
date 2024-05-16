package codewars_0516.sol;

public class CalculateAverage {
	public static double find_average(int[] array) {
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		
		return (double)sum/array.length;
	}

}
