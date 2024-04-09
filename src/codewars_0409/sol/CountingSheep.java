package codewars_0409.sol;

public class CountingSheep {

	public static int countSheeps(Boolean[] arrayOfSheeps) {
		int count = 0;

		for (int i = 0; i < arrayOfSheeps.length; i++) {
			if (arrayOfSheeps[i] != null && arrayOfSheeps[i] == true) {
				count++;
			}
		}
		return count;
	}

}
