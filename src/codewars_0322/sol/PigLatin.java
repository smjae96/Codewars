package codewars_0322.sol;

import java.util.regex.Pattern;

public class PigLatin {
	public static String pigIt(String str) {
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].length() >= 1 && Pattern.matches("^[a-zA-Z]*$", arr[i])) {
				arr[i] = arr[i].substring(1).concat(String.valueOf(arr[i].charAt(0)))+"ay";
			}
		}
		return String.join(" ", arr);
	}
}
