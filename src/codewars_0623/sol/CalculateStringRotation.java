package codewars_0623.sol;

public class CalculateStringRotation {
	public static int shiftedDiff(String first, String second){
		
		if (first.length() != second.length()) {
            return -1;
        }

        String concatenated = first + first;
        int index = concatenated.indexOf(second);

        return index == -1 ? -1 : index;
		
	  }
}
