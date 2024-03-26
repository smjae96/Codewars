package codewars_0326.sol;

public class ConvertStringToCamelCase {
	public static String toCamelCase(String s) {
		if(!(s.contains("-")|| s.contains("_"))) {
			return s;
		}
		String[] arr = s.split("-|_");
		for(int i=0; i<arr.length; i++) {
			if(i>0) {
				arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
			}
		}
		
		return String.join("", arr);
	}
}
