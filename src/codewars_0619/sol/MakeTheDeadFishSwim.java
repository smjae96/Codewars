package codewars_0619.sol;

public class MakeTheDeadFishSwim {
	public static int[] parse(String data) {
		int result = 0;
		int length = 0;
		for(int i=0 ; i<data.length(); i++) {
			if(data.charAt(i) == 'o') {
				length ++;
			}
		}
		int[] arr = new int[length];
		int index = 0;
		for(int i=0; i<data.length(); i++) {
			if(data.charAt(i) == 'i') {
				result++;
			} else if(data.charAt(i) == 'd') {
				result --;
			} else if(data.charAt(i) == 's') {
				result = result*result;
			} else if(data.charAt(i) == 'o') {
				arr[index] = result;
				index++;
			}
		}
		return arr;
		// Implement me! :)
	}
}
