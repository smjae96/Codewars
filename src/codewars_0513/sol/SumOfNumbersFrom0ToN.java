package codewars_0513.sol;

public class SumOfNumbersFrom0ToN {
	public static String showSequence(int value){
	    if(value<0) {
	      return value+"<0";
	    }
	    if(value==0) {
	      return "0=0";
	    }
	    String result = "";
	    int sum = 0;
	    for(int i=0; i<=value; i++) {
	    	sum += i;
	    }
	    for(int i=0; i<=value; i++) {
	    	if(i==0) {
	    		result = "0";
	    	} else {
	    		result = result+"+"+i;
	    	}
	    }
	    return result + " = "+sum;
	  }
}
