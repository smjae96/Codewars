package codewars_0330.sol;

public class Maskify {
	public static String maskify(String str) {
        if(str.length()<= 4) {
        	return str;
        }
        String[] arr = str.split("");
        for(int i=0; i<arr.length - 4; i++) {
        	arr[i] = "#";
        }
        return String.join("", arr);
    }
}
