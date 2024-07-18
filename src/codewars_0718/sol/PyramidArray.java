package codewars_0718.sol;

import java.util.ArrayList;
import java.util.List;

public class PyramidArray {
	public static int[][] pyramid(int n) {
		List<int[]> list = new ArrayList<>();
		for(int i=1; i<= n; i++) {
			int[] secondArray = new int[i];
			for(int j=0; j<i; j++) {
				secondArray[j] = 1;
			}
			list.add(secondArray);
		}
		int[][] array = new int[list.size()][];
		for(int i=0; i<list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
}
