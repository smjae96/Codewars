package codewars_0628.sol;

import java.util.ArrayList;
import java.util.List;

public class BestTravel {
	public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
		int maxSum = -1;
        int n = ls.size();
        if (n < k) {
            return null;
        }
        List<Integer> currentCombination = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            currentCombination.add(0);
        }
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = i;
        }
        while (true) {
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += ls.get(arr[i]);
            }
            if (sum <= t && sum > maxSum) {
                maxSum = sum;
            }
            int i;
            for (i = k - 1; i >= 0; i--) {
                if (arr[i] < n - k + i) {
                    arr[i]++;
                    for (int j = i + 1; j < k; j++) {
                        arr[j] = arr[j - 1] + 1;
                    }
                    break;
                }
            }
            if (i < 0) {
                break;
            }
        }
        return maxSum == -1 ? null : maxSum;
    }
	
}
