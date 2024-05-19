package codewars_0519.sol;

public class BumpsIntheRoad {
	public static String bumps(final String road) {
		String result = road.replace("_", "");
		int r = result.length();
		if(r<= 15) {
			return "Woohoo!";
		} else {
			return "Car Dead";
		}
	    
	}
}
