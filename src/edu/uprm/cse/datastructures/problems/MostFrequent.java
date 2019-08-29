package edu.uprm.cse.datastructures.problems;

import edu.uprm.cse.datastructures.bag.Bag;
import edu.uprm.cse.datastructures.bag.DynamicBag;

public class MostFrequent {

	public static void main(String[] args) {
		Bag<Integer> B1 = new DynamicBag<Integer>();
		
		B1.add(1);
		B1.add(1);
		B1.add(2);
		B1.add(2);
		B1.add(2);
		B1.add(4);
		B1.add(3);
		B1.add(3);
		B1.add(3);
		B1.add(2);

		
		Bag<Integer> B2 = B1.moreFrequentThan(1);
		System.out.println("B1.moreFrequentThan(1): ");
		for (Object e : B2.toArray()) {
			System.out.println(e);
		}
		B2 = B1.moreFrequentThan(3);
		System.out.println("\nB1.moreFrequentThan(3): ");
		for (Object e : B2.toArray()) {
			System.out.println(e);
		}

	}

}
