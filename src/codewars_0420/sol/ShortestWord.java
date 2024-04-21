package codewars_0420.sol;

public class ShortestWord {
	public static int findShort(String s) {
		String[] arr = s.split(" ");
		String result = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i].length()< result.length()) {
				result = arr[i];
			}
		}
		return result.length();
	}
}
