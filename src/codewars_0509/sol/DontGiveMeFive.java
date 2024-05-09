package codewars_0509.sol;

public class DontGiveMeFive {
	public static int dontGiveMeFive(int start, int end) {
		int count = 0;
		for (int i = start; i <= end; i++) {
			count += String.valueOf(i).contains("5")?0:1;
		}
		return count;
	}

}
