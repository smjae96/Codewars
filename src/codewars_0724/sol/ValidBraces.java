package codewars_0724.sol;

public class ValidBraces {
	public static boolean isValid(String braces) {
		
		 char[] arr = braces.toCharArray();
	        int add = 0;
	        int prev = 0;
	        int res = 0;
	        char check = ' ';
	        for(int i = 0; i < arr.length; i++){
	            check = arr[i];
	            switch(check){
	                case '(': add = 1; break;
	                case ')': add = -1; break;
	                case '[': add = 2; break;
	                case ']': add = -2; break;
	                case '{': add = 3; break;
	                case '}': add = -3; break;
	                default: return false;
	            }   
	            if(prev > 0 && add < 0 && prev != Math.abs(add)) return false;
	            res+=add;
	            prev = add;
	            if(res < 0) return false;
	        }
	        if(res == 0) return true;
	        else return false;
	}
}
