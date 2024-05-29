package codewars_0529.sol;

public class HowGoodAreYouReally {
	public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
		int sum = 0;
		for(int i=0; i<classPoints.length; i++) {
			sum += classPoints[i];
		}
		return yourPoints > sum/classPoints.length;
	}
}
