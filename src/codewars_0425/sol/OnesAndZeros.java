package codewars_0425.sol;

import java.util.List;

public class OnesAndZeros {
	public static int ConvertBinaryArrayToInt(List<Integer> binary) {
		
		String res = "";
		for(int i=0; i<binary.size(); i++) {
			res += binary.get(i);
		}
		int result = Integer.parseInt(res, 2);
		return result;
	}
}
