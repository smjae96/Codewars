package codewars_0602.sol;

import java.util.Arrays;

public class SortTheGiftCode {
	public static String sortGiftCode(String code) {
		char[] arr = code.toCharArray();
		Arrays.sort(arr);
		String result = new String(arr);
		return result;
	}
}
