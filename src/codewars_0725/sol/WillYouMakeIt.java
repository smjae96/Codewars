package codewars_0725.sol;

public class WillYouMakeIt {
	public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
		return distanceToPump <= mpg * fuelLeft;
	}
}
