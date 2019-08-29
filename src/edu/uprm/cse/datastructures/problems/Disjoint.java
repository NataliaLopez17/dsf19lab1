package edu.uprm.cse.datastructures.problems;

import javax.naming.spi.DirStateFactory.Result;

import edu.uprm.cse.datastructures.set.ArraySet;
import edu.uprm.cse.datastructures.set.Set;

public class Disjoint {
	
private static boolean checkDisjoint(Object[] sets) {
		
		for(int i=0; i<sets.length; i++) {
			Set<Integer> target = (Set<Integer>) sets[i];
			
			for(int j=i+1; j<sets.length; j++) {
				Set<Integer> temp = (Set<Integer>) sets[j];
				
				if(!target.intersection(temp).isEmpty())
					return false;
				
			}
		}
		return true;
	}

	
	public static void main(String[] args) {
		Set<Integer> S1 = new  ArraySet<Integer>();
		Set<Integer> S2 = new  ArraySet<Integer>();
		Set<Integer> S3 = new  ArraySet<Integer>();
		Set<Integer> S4 = new  ArraySet<Integer>();
		
		S1.add(1);
		S1.add(2);
		
		S2.add(0);
		
		S3.add(5);
		S3.add(8);
		S3.add(9);
		
		S4.add(5);

		@SuppressWarnings("unchecked")
		Object[] A1 =   new Object[3];
		A1[0] = S1;
		A1[1] = S2;
		A1[2] = S3;

		System.out.println("S1, S2, and S3 disjoint: " + checkDisjoint(A1));
		Object[] A2 =   new Object[4];
		A2[0] = S1;
		A2[1] = S2;
		A2[2] = S3;
		A2[3] = S4;

		System.out.println("S1, S2, S3, and S4 disjoint: " + checkDisjoint(A2));


	}

}
