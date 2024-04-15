package codewars_0415.sol;

public class SmallestIntegerFinder {
	public static int findSmallestInt(int[] args) {

		int result = args[0];
		for(int i=0; i<args.length; i++) {
			if(result> args[i]) {
				result = args[i];
			}
		}
		return result;
	}
}
