package codewars_0320.sol;

public class TenMinWalk {
	public static boolean isValid(char[] walk) {
		   int countE = 0;
			int countW = 0;
			int countS = 0;
			int countN = 0;
			boolean count = false;
			for(int i = 0; i<walk.length; i++) {
				if(walk[i] == 'e') {
					countE++;
				} else if(walk[i] == 'w') {
					countW++;
				} else if(walk[i] == 's') {
					countS++;
				} else if(walk[i] == 'n') {
					countN++;
				}
			}
	    
			return count = (countE==countW && countS==countN && walk.length==10);
			
			
		    
	  }
}
