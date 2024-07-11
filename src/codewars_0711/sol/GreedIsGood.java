package codewars_0711.sol;

import java.util.Arrays;

public class GreedIsGood {
	public static int greedy(int[] dice) {
        Arrays.sort(dice);

        int score = 0;
        int[] counts = new int[6]; 

        for (int value : dice) {
            counts[value - 1]++;
        }

        for (int i = 0; i < 6; i++) {
            int count = counts[i];
            int value = i + 1; 

            switch (value) {
                case 1:
                    score += (count / 3) * 1000 + (count % 3) * 100;
                    break;
                case 5:
                    score += (count / 3) * 500 + (count % 3) * 50;
                    break;
                default:
                    if (count >= 3) {
                        score += value * 100;
                    }
                    break;
            }
        }

        return score;
	}
}
