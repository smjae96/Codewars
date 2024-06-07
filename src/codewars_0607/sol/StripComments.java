package codewars_0607.sol;

import java.util.ArrayList;

public class StripComments {
	public static String stripComments(String text, String[] commentSymbols) {
		String[] lines = text.split("\n");
		ArrayList<String> resultLines = new ArrayList<>();	
		for(String line : lines) {
			int commentIndex = line.length();
			for(String commentSymbol : commentSymbols) {
				int index = line.indexOf(commentSymbol);
				if(index != -1 && index < commentIndex) {
					commentIndex = index;
				}
			}
			String cleanLine = line.substring(0, commentIndex).trim();
			resultLines.add(cleanLine);
		}
		
		return String.join("\n", resultLines);
	}
}
