package codewars_0402.sol;

public class GrowthOfAPopulation {
	public static int nbYear(int p0, double percent, int aug, int p) {
		int count = 0;
		
			percent = percent / 100;
		
		while(p0<p) {
			p0 = (int)(p0+p0*percent+aug);
			count++;
		}
		return count;
		
	}

}
