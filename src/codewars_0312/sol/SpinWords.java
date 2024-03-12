package codewars_0312.sol;

public class SpinWords {
	public static String spinWords(String sentence) {
		String[] words = sentence.split(" ");
		for(int i=0; i<words.length; i++) {
			if(words[i].length()>=5) {
				StringBuffer sb = new StringBuffer(words[i]);
				words[i] = sb.reverse().toString();
			}
		}
		return String.join(" ", words);
		
	}
}
