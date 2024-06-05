package codewars_0605.sol;

public class CamelCaseMethod {
	public static String camelCase(String str) {
		String[] arr = str.split(" ");

		StringBuilder sb = new StringBuilder();

		for (String word : arr) {
			if (word.length() > 0) {
				sb.append(Character.toUpperCase(word.charAt(0)));
				sb.append(word.substring(1).toLowerCase());
			}
		}

		return sb.toString();

	}
}
