package edu.uprm.cse.datastructures.problems;

import edu.uprm.cse.datastructures.set.ArraySet;
import edu.uprm.cse.datastructures.set.Set;

public class SingletonSet {

	// DO NOT MODIFY THIS CLASS
	public static void main(String[] args) {
		Set<String> S1 = new ArraySet<String>();
		
		S1.add("Kim");
		S1.add("Ned");
		S1.add("Ron");
		S1.add("Bon");
		
		for (Object s: S1.toArray()) {
			System.out.println(s);
		}

		Object[] singletonSets = S1.singletonSets();
		System.out.printf("Expected: 4, obtained: %d\n",  singletonSets.length);

	}

}
