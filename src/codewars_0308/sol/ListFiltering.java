package codewars_0308.sol;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
	public static List<Object> filterList(final List<Object> list) {
		List<Object> result = new ArrayList();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) instanceof Integer) {
				result.add(list.get(i));
			}
		}
		return result;
	}
}
