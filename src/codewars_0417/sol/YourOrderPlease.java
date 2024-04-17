package codewars_0417.sol;

public class YourOrderPlease {
	public static String order(String words) {
		if(words.equals("")) {
			return "";
		}
		String[] arr = words.split(" ");
		int count = 1;
		while (count <= arr.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].contains(String.valueOf(count))) {
					arr[count-1] = arr[i];
					System.out.println(arr[count-1]);
					count++;
				}
				System.out.println(count);
			}
		}
		return String.join(" ", arr);
	}
}
