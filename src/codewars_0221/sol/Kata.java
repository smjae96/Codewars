package codewars_0221.sol;

public class Kata {
	public static String evenOrOdd(int number) {
		String answer = null;
		if(number % 2 == 1) {
			answer = "Odd";
		} else if(number % 2 ==0) {
			answer = "even";
		}
		 return answer;
		
	}
}
