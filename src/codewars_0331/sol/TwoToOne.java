package codewars_0331.sol;

public class TwoToOne {
	public static String longest (String s1, String s2) {
       String result = "";
       String s = s1 + s2;
       
       for(char ch = 'a'; ch <= 'z'; ch++) {
    	   if(s.contains(String.valueOf(ch))) {
    		   result += ch;
    	   }
       }
       return result;
    }
}
