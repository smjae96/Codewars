package codewars_0722.sol;

public class FindTheMissingLetter {
	public static char findMissingLetter(char[] array) {
		for(int i=0; i<array.length-1; i++) {
			if(array[i+1] != array[i]+1) {
				return (char) (array[i]+1);
			}
		}
		return ' ';
	}
}
