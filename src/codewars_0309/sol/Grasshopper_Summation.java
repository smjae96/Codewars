package codewars_0309.sol;

public class Grasshopper_Summation {
	public static int summation(int n) {

		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}
}
