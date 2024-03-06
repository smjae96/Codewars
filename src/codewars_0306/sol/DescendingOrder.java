package codewars_0306.sol;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
	public static int sortDesc(final int num) {
//		String[] numbers = (String.valueOf(num).split(""));
//		Arrays.sort(numbers);
//		
//		
//		String result = "";
//		
//		for(int i=numbers.length-1; i>=0; i--) {
//			result += numbers[i]; 
//		}
//		return Integer.parseInt(result);
		
		// * 다른 해결방식 
		
		String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder()); // Collections.reverseOrder()를 쓰면 내림차순으로 정렬 가능!
        return Integer.valueOf(String.join("", array));
	}
}
