package codewars_0709.sol;

public class IsThisATriangle {
	public static boolean isTriangle(int a, int b, int c) {
		if(a<0 || b<0 || c<0) {
			return false;
		}
		if(a+b<= c || b+c<= a || a+c<= b) {
			return false;
		}
		return true;
	}
}
