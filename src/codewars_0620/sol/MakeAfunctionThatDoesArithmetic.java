package codewars_0620.sol;

public class MakeAfunctionThatDoesArithmetic {
	public static int arithmetic(int a, int b, String operator) {
		if(operator.equals("add")) {
			return a+b;
		} else if(operator.equals("subtract")) {
			return a-b;
		} else if(operator.equals("multiply")) {
			return a*b;
		} else if(operator.equals("divide")) {
			return a/b;
		}
		return 0;
		// your code here
	}
}
