package codewars;

public class Test {
	public static String sometingMethod(int number) {
		String answer = null;
		if(number % 2 == 1) {
			answer = "Odd";
		} else if(number % 2 ==0) {
			answer = "even";
		}
		 return answer;
	}
}
