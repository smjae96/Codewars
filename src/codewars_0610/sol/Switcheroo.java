package codewars_0610.sol;

public class Switcheroo {
	public static String switcheroo(String x) {
		String[] arr = x.split("");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("a")) {
				arr[i] = "b";
			} else if(arr[i].equals("b")) {
				arr[i] = "a";
			}
		}
		
		return String.join("", arr);
	}
}
