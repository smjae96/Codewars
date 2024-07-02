package codewars_0702.sol;

import java.util.Arrays;
import java.util.Comparator;

public class WeightForWeight {
	public static String orderWeight(String strng) {
		// 문자열을 공백으로 분리
        String[] weights = strng.split(" ");

        // 삽입 정렬 알고리즘을 사용하여 정렬
        for (int i = 1; i < weights.length; i++) {
            String key = weights[i];
            int j = i - 1;

            // key 값의 자릿수 합 계산
            int keySum = 0;
            for (char c : key.toCharArray()) {
                keySum += Character.getNumericValue(c);
            }

            // key 값을 정렬된 부분과 비교하여 올바른 위치에 삽입
            while (j >= 0) {
                String current = weights[j];
                int currentSum = 0;
                for (char c : current.toCharArray()) {
                    currentSum += Character.getNumericValue(c);
                }

                // 자릿수 합이 같으면 문자열 사전 순으로 비교
                if (keySum < currentSum || (keySum == currentSum && key.compareTo(current) < 0)) {
                    weights[j + 1] = current;
                    j--;
                } else {
                    break;
                }
            }
            weights[j + 1] = key;
        }

        // 정렬된 목록을 공백으로 결합하여 반환
        return String.join(" ", weights);
	}
}
