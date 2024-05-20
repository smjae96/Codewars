package codewars_0520.sol;

public class BasicMathematicalOperations {
	public static Integer basicMath(String op, int v1, int v2) {
		if(op.equals("+")) {
			return v1+v2;
		} else if(op.equals("-")) {
			return v1-v2;
		} else if(op.equals("*")) {
			return v1*v2;
		} else {
			return v1/v2;
		}
	}
}
