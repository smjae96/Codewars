package codewars_0416.sol;

public class PersistentBugger {

	public static int persistence(long n) {
		String num = String.valueOf(n);
		if (String.valueOf(n).length() == 1) {
			return 0;
		}
		String[] arr = num.split("");
	
		int result = 1;
		int count = 0;
		while (arr.length > 1) {
			for (int i = 0; i < arr.length; i++) {
				result *= Integer.parseInt(arr[i]);
			}
			arr = String.valueOf(result).split("");
			result = 1;
			count++;
		}
		return count;
	}
}
