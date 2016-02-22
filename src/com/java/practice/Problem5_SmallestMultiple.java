/**
 * 
 */
package com.java.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amruta Kajrekar
 * Problem: 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. 
 * 	    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * MySolution: 232792560
 */
public class Problem5_SmallestMultiple {
	static List<Integer> array = new ArrayList<Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int limit = 10;
		System.out.println(findSmallestMultiple(limit));		
	}
	private static int findSmallestMultiple(int limit) {
			int i = 20;
			while (true)
			{
				if ((i % 1 == 0) && (i % 2 == 0) && (i % 3 == 0) && (i % 4 == 0) && (i % 5 == 0) &&
					(i % 6 == 0) &&	(i % 7 == 0) &&	(i % 8 == 0) &&	(i % 9 == 0) &&	(i % 10 == 0) &&
					(i % 11 == 0) && (i % 12 == 0) && (i % 13 == 0) && (i % 14 == 0) &&	(i % 15 == 0) &&
					(i % 16 == 0) && (i % 17 == 0) && (i % 18 == 0) && (i % 19 == 0) &&	(i % 20 == 0) )
				{
					break;
				}
				i += 20;
			}
			return i;
	}
	
	private static int findSmallestMultiple2(int limit) {
		array.add(1);
		for (int i = 2; i < limit; i++) {
			if(!isMultipleExistInArray(i)){
				array.add(i);
				System.out.println(i);
			}
		}
		return multiplyAll(array);
	}
	
	private static int multiplyAll(List<Integer> array2) {
		int answer = 1;
		System.err.println(array);
		for (Integer integer : array2) {
			answer = answer * integer;
		}
		return answer;
	}
	private static boolean isMultipleExistInArray(int i) {
		for (int j = 1; j < array.size(); j++) {
			for (int k = 2; k < array.size(); k++) {
				if ((array.get(j) * array.get(k)) == i){
					return true;
				}
			}
		}
		return false;
	}

}
