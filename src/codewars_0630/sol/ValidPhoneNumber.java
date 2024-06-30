package codewars_0630.sol;

public class ValidPhoneNumber {
	public static boolean validPhoneNumber(String phoneNumber) {
		String result = "(xxx) xxx-xxxx";
		return result.equals(phoneNumber.replaceAll("[0-9]", "x"));

	}
}
