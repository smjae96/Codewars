package codewars_0303.sol;

public class HighAndLow {
	public static String highAndLow(String numbers) {
	    
		String[] array = numbers.split(" ");
		int max = Integer.parseInt(array[0]);
		int min = Integer.parseInt(array[0]);
		
		for(int i=0; i<array.length; i++) {
			if(max<Integer.parseInt(array[i])) {
				max = Integer.parseInt(array[i]);
			}
			
			if(min>Integer.parseInt(array[i])) {
				min = Integer.parseInt(array[i]);
			}
		}
		return String.valueOf(max) + " " + String.valueOf(min);
	}
}
