package codewars_0708.sol;

public class Clock {
	public static int Past(int h, int m, int s) {
		return h*60*60*1000 + m*60*1000 + s*1000;
	}
}
