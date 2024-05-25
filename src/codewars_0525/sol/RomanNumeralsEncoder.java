package codewars_0525.sol;

public class RomanNumeralsEncoder {
	public static String solution(int n) {
		String result = "";
		if(n/1000 >= 1) {
			result = "M".repeat(n/1000);
			n = n- 1000*(n/1000);
		}
		if(n/500 >= 1 && n/100 <9) {
			result += "D".repeat(n/500);
			n = n- 500*(n/500);
		}
		if(n/100 == 9) {
			result += "CM";
			n = n- 900;
		}
		if(n/100 >= 1 && n/100 <4) {
			result += "C".repeat(n/100);
			n= n- 100*(n/100);
		}
		if(n/100 == 4) {
			result += "CD";
			n= n- 400;
		}
		if(n/10 == 9) {
			result += "XC";
			n = n- 90;
		}
		if(n/10 == 4) {
			result +="XL";
			n = n-40;
		}
		if(n/50 >= 1 && n/50 <9) {
			result += "L".repeat(n/50);
			n= n- 50*(n/50);
		}
		if(n/10 >= 1 && n/10 <9) {
			result += "X".repeat(n/10);
			n= n- 10*(n/10);
		}
		if(n/5 >= 1 && n/1<9) {
			result += "V".repeat(n/5);
			n= n- 5*(n/5);
		}
		if(n==9) {
			result += "IX";
			n= n-9;
		}
		if(n==4) {
			result += "IV";
		} else {
			result +="I".repeat(n);
		}
        return result;
    }
}
