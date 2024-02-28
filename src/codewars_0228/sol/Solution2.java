package codewars_0228.sol;

public class Solution2 {
	public static String whoLikesIt(String... names) {
		String likes = null;
        int count = names.length;
        if(count==0) {
        	likes = "no one likes this";
        } else if(count==1) {
        	likes = names[0]+ " likes this";
        } else if(count==2) {
        	likes = names[0]+ " and " + names[1]+ " like this";
        } else if(count==3) {
        	likes = names[0]+", "+names[1]+ " and "+names[2]+ " like this";
        } else {
        	likes = names[0]+ ", " + names[1]+ " and " +(count-2)+ " others like this";
        }
        return likes;
    }
}
