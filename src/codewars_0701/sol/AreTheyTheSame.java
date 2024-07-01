package codewars_0701.sol;

import java.util.ArrayList;
import java.util.Collections;

public class AreTheyTheSame {
	public static boolean comp(int[] a, int[] b) {
		if (a == null || b == null || a.length != b.length) {
            return false;
        }
        ArrayList<Integer> listA = new ArrayList<>();
        for (int num : a) {
            listA.add(num * num);
        }
        ArrayList<Integer> listB = new ArrayList<>();
        for (int num : b) {
            listB.add(num);
        }
        Collections.sort(listA);
        Collections.sort(listB);
        return listA.equals(listB);
	}
}
