package codewars_0408.sol;

public class StringSplit {
	public static String[] solution(String s) {
		if(s.length() % 2 == 1) {
			s = s+ "_";
		}
		String[] arr = new String[s.length()/2];
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.substring(0,2);
			
			s= s.substring(2);
			
		}
		return arr;
	}
}
