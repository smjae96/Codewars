package codewars_0427.sol;

import java.util.ArrayList;

public class ReverseWords {
	public static String reverseWords(final String original) {
		String[] array = original.split(" ");
		if (array.length == 0)
			return original;

		int i = 0;
		for (String string : array) {
			array[i] = new StringBuilder(string).reverse().toString();
			i++;
		}

		return String.join(" ", array);
	}
}
