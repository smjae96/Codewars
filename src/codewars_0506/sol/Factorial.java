package codewars_0506.sol;

public class Factorial {
	public static int factorial(int n) {
		if (n<0 || n>12) {
            throw new IllegalArgumentException("Input parameter out of range: " + n);
        } 
		if(n==0) {
			return 1;
		}
		int num = 1;
		for(int i = n; i>0; i--) {
			num *= i;
		}
		return num;
	}
}
