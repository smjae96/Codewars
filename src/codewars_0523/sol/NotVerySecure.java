package codewars_0523.sol;

public class NotVerySecure {
	public static boolean alphanumeric(String s) {
		if (s.equals("")) {
			return false;
		}
		String regx = "^[a-zA-Z0-9]*$";
		return s.matches(regx);

	}
}
