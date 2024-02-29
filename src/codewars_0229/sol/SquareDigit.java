package codewars_0229.sol;

public class SquareDigit {
	
	public static int squareDigits(int n) {
		
		String a = Integer.toString(n);
		String result = "";
		for(int i=0; i<a.length(); i++) {
			
			result += (a.charAt(i)-48)*(a.charAt(i)-48);
		}
		return Integer.parseInt(result);
		
		/* 참고 답안
		if (n < 10) return n * n;
	      else {
	        int h = squareDigits(n / 10);
	        int l = n % 10;
	        return Integer.parseInt(h + "" + l * l);
		*/
		
	}
}
