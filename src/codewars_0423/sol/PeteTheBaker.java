package codewars_0423.sol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class PeteTheBaker {
	public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
		ArrayList<String> recipeList = new ArrayList<>();
		ArrayList<String> availableList = new ArrayList<>();
		for (String key : recipe.keySet()) {
			recipeList.add(key);
		}

		for (String key : available.keySet()) {
			availableList.add(key);
		}
		
		if(!availableList.containsAll(recipeList)) {
			return 0;
		}
		
		
		Collections.sort(recipeList);
		Collections.sort(availableList);
		ArrayList<String> resultList = new ArrayList<>();
		for(int i=0; i<recipeList.size(); i++) {
			if(availableList.contains(recipeList.get(i))) {
				availableList.remove(recipeList.get(i));
			}
		}
		for(int i=0; i<recipeList.size(); i++) {
			resultList.add(i, recipeList.get(i));
		}
		for(int i=0; i<availableList.size(); i++) {
			resultList.add(availableList.get(i));
		}
		int result = available.get(resultList.get(0)) / recipe.get(recipeList.get(0));
		if(available.size() == resultList.size()) {
		for(int i=0; i<recipe.size(); i++) {
			if(available.get(resultList.get(i)) / recipe.get(recipeList.get(i))<result) {
				result = available.get(resultList.get(i)) / recipe.get(recipeList.get(i));
			}
		}
		return result;
		} else {
			return 0;
		}
	}
}
