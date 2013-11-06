package test.com.solution;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import javax.naming.BinaryRefAddr;

import org.junit.Before;
import org.junit.Test;

public class TestBynaryTreeExercise {
	TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
	List<String> expected = new ArrayList<String>();
	@Before
	public void setUp() throws Exception {
		
		
	
		treeMap.put(1, "CAT");
		treeMap.put(2, "BAT");
		treeMap.put(3, "DOG");
		treeMap.put(4, "KAT");
		treeMap.put(5, "STORE");
		treeMap.put(6, "GNAT");
		
	
		expected.add("CAT");
		expected.add("BAT");
		expected.add("KAT");
		expected.add("GNAT");
	
		
	}

	@Test
	public void test() {
		
		BinaryTreeExercise binaryTreeExercise = new BinaryTreeExercise();
		String key="AT";
		
	List<String>	list = binaryTreeExercise.getNodesWithMatchWithTheKey(treeMap,key);
		assertEquals(expected, list);
	}

}
