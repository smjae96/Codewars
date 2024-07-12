package codewars_0712.sol;

public class AbbreviateATwoWordName {
	public static String abbrevName(String name) {
		String[] arr = name.split(" ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = String.valueOf(arr[i].toUpperCase().charAt(0));
		}
		return String.join(".", arr);
	}
}
