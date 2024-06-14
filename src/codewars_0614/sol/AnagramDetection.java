package codewars_0614.sol;

import java.util.Arrays;

public class AnagramDetection {
	public static boolean isAnagram(String test, String original) {
		test = test.toLowerCase();
		original = original.toLowerCase();
		String[] arr1 = test.split("");
		String[] arr2 = original.split("");
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(String.join("", arr1).equals(String.join("", arr2))) {
			return true;
		}
		return false;
	}
}
