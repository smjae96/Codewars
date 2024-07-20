package codewars_0720.sol;

public class AreYouPlayingBanjo {
	public static String areYouPlayingBanjo(String name) {
	    if(name.toUpperCase().charAt(0) == 'R') {
	      return name + " plays banjo";
	    } else {
	      return name + "does not play banjo";
	    }
	  }
}
