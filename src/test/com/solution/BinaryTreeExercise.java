package test.com.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;

public class BinaryTreeExercise {

	public List<String> getNodesWithMatchWithTheKey(TreeMap<Integer, String> treeMap, String key) {
		
		Collection<String> collectionOfValues = treeMap.values();
		List<String> results = new ArrayList<String>();
		
		for (String value : collectionOfValues){
			
			if (value.contains(key)){
				
				results.add(value);
			}
		}
		
		return results;
	}


}
