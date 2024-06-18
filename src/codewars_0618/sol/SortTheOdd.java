package codewars_0618.sol;

import java.util.ArrayList;
import java.util.Collections;

public class SortTheOdd {
	public static int[] sortArray(int[] array) {
		ArrayList<Integer> oddList = new ArrayList<>(array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                oddList.add(array[i]);
            }
        }
        Collections.sort(oddList);

        for (int i = 0, j = 0; i < oddList.size(); i++, j++) {
            while (array[j] % 2 == 0) {
                j++;
            }
            array[j] = oddList.get(i);
        }
        return array;
	}
}
