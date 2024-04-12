package codewars_0412.sol;

import java.util.ArrayList;

public class DirReduction {

	public static String[] dirReduc(String[] arr) {
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(i==0) {
				list.add(arr[i]);
				continue;
			}
			
			if(arr[i].equals("NORTH") && list.size()>0 && list.get(list.size()-1).equals("SOUTH") ||
				arr[i].equals("SOUTH") && list.size()>0 && list.get(list.size()-1).equals("NORTH") ||
				arr[i].equals("EAST") && list.size()>0 && list.get(list.size()-1).equals("WEST") ||
				arr[i].equals("WEST") && list.size()>0 && list.get(list.size()-1).equals("EAST")) {
				
				list.remove(list.size()-1);
			} else {
				list.add(arr[i]);
			}
		
		}
		String[] result =  list.toArray(new String[list.size()]);
		int size = 0;
		for(String temp: list) {
			result[size++] = temp;
		}
		
		return result;
	}
	
	
}
