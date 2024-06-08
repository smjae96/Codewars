package codewars_0608.sol;

public class MeanSquareError {
	public static double solution(int[] arr1, int[] arr2) {
		double sum = 0.0;
		for(int i=0; i<arr1.length; i++) {
			sum += Math.pow((Math.abs(arr1[i]) - Math.abs(arr2[i])),2);
		}
		return sum / arr1.length;
		
	}
}
