package com.java.practice;

/**
 * @author Amruta Kajrekar
 *
 */
public class Problem1_MultiplesOf3Or5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum=0;
		for (int i = 0; i < 1000; i++) {
			if((i%3==0) || (i%5==0)){
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
