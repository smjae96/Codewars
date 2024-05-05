package codewars_0505.sol;

import java.util.ArrayList;
import java.util.Collections;

public class WhichAreIn {
	public static String[] inArray(String[] array1, String[] array2) {
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array2.length; j++) {
				if(array2[j].contains(array1[i])) {
					
					list.add(array1[i]);
				}
			}
		}
		
		ArrayList<String> newList = new ArrayList<String>();
		for(int i=0; i<list.size(); i++) {
			if(!newList.contains(list.get(i))) {
				newList.add(list.get(i));
			}
		}
		Collections.sort(newList);
		String[] result = new String[newList.size()];
		int size = 0;
		for(String i : newList) {
			result[size++] = i;
		}
		return result;
	}
}
