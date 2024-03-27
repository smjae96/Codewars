package codewars_0327.sol;

public class HighestScoringWord {
	public static String high(String s) {
		s = s.toLowerCase();
		if(!s.contains(" ")) {
			return s;
		}
		String[] arr = s.split(" ");
		
		int[] sum = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length(); j++) {
				sum[i] += arr[i].charAt(j) - 96;
			}
		}
		int max = sum[0];
		String result = arr[0];
		for(int i=1; i<sum.length; i++) {
			if(max < sum[i]) {
				max = sum[i];
				result = arr[i];
			}
		}
		
		
		return result;
	}

}
