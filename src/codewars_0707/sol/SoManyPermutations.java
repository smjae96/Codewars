package codewars_0707.sol;

import java.util.ArrayList;
import java.util.List;

public class SoManyPermutations {
	public static List<String> singlePermutations(String input) {
        List<String> permutationsList = new ArrayList<>();
        permute(input.toCharArray(), 0, permutationsList);
        return permutationsList;
    }

    private static void permute(char[] chars, int index, List<String> permutationsList) {
        if (index == chars.length - 1) {
            String permutation = new String(chars);
            if (!permutationsList.contains(permutation)) {
                permutationsList.add(permutation);
            }
            return;
        }

        for (int i = index; i < chars.length; i++) {
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
            
            permute(chars, index + 1, permutationsList);
            
            temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
        }
    }
}
