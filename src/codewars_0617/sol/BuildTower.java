package codewars_0617.sol;

public class BuildTower {
	public static String[] towerBuilder(int nFloors) {
		if(nFloors == 1) {
			return new String[]{"*"};
		}
		String[] arr = new String[nFloors];
		for(int i= 1; i<=nFloors; i++) {
			arr[i-1] = " ".repeat(nFloors - i) + "*".repeat(i*2 - 1)+ " ".repeat(nFloors - i);
		}
		return arr;
	}
}
