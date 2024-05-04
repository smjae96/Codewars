package codewars_0504.sol;

import java.util.List;

public class Testing123 {
	public static List<String> number(List<String> lines) {
		if(lines.size() == 0) return lines;
		
		for(int i=0; i<lines.size(); i++) {
			lines.set(i, (i+1)+": "+(lines.get(i)));
		}
		return lines;
	}
}
