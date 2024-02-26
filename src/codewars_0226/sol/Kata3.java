package codewars_0226.sol;

public class Kata3 {

	  public static String createPhoneNumber(int[] numbers) {
		  String phoneNumber = new String("(xxx) xxx-xxxx");
		  
		  for(int i : numbers) {
			  phoneNumber = phoneNumber.replaceFirst("x", String.valueOf(i));
		  }
		  return phoneNumber;
		  
//		  return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6]
//				  , numbers[7], numbers[8], numbers[9]);
		  
		  
	  }	
}
