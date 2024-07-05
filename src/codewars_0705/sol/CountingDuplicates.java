package codewars_0705.sol;

import java.util.Arrays;

public class CountingDuplicates {
	public static int duplicateCount(String text) {
		if(text.equals("")) {
			return 0;
		}
		text = text.toLowerCase();
		String[] arr = text.split("");
		Arrays.sort(arr);
		int num = 0;
		if(arr[0].equals(arr[1])) {
			num++;
		}
		for(int i=2; i<arr.length; i++) {
			if(arr[i].equals(arr[i-1])) {
				num++;
				if(arr[i].equals(arr[i-2])) {
					num--;
				}
			}
		}
		return num;
	}
}
