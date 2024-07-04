package codewars_0704.sol;

public class PrinterErrors {
	public static String printerError(String s) {
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>'m') {
				count++;
			}
		}
		return count+ "/"+s.length();
	}
}
