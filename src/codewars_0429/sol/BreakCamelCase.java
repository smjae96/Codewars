package codewars_0429.sol;

public class BreakCamelCase {
	public static String camelCase(String input) {
		if(input.equals("")) {
			return "";
		}
		String[] arr = input.split("");
		for(int i=0; i<arr.length; i++) {
			if(Character.isUpperCase(arr[i].charAt(0))) {
				arr[i] = " "+arr[i];
			}
		}
		
		return String.join("", arr);
	}
}
