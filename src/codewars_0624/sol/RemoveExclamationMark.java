package codewars_0624.sol;

public class RemoveExclamationMark {
	public static String removeExclamationMarks(String s) {
		s = s.replaceAll("!", "");
        return s;
    }
}
