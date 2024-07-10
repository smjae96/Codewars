package codewars_0710.sol;

public class TribonacciSequence {
	public static double[] tribonacci(double[] s, int n) {
		
		if (n == 0) {
	        return new double[0];
	    }
	    
	    double[] arr = new double[n];
	    arr[0] = s[0];
	    if (n > 1) {
	        arr[1] = s[1];
	    }
	    if (n > 2) {
	        arr[2] = s[2];
	    }
	    
	    for (int i = 3; i < n; i++) {
	        arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
	    }
	    
	    return arr;
	}
	
}
