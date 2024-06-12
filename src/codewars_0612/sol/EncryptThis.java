package codewars_0612.sol;

public class EncryptThis {
	public static String encryptThis(String text) {
		if(text.equals("")) {
			return "";
		}
		String[] arr = text.split(" ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].length()>=3) {
				arr[i] = (int)arr[i].charAt(0) + String.valueOf(arr[i].charAt(arr[i].length()-1)) 
						+ String.valueOf(arr[i].substring(2, arr[i].length()-1)) + String.valueOf(arr[i].charAt(1));
			} else if(arr[i].length() == 2) {
				arr[i] = (int)arr[i].charAt(0) + String.valueOf(arr[i].charAt(1));
			} else if(arr[i].length() == 1) {
				arr[i] = String.valueOf((int)arr[i].charAt(0));
			}
			
		}
		return String.join(" ", arr);
	}
}
