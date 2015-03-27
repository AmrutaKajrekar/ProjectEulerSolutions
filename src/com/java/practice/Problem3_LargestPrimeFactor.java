package com.java.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amruta Kajrekar
 *
 */
public class Problem3_LargestPrimeFactor {

	public static void main(String[] args) {
		findPrimeFactors();
	}
	
	private static void findPrimeFactors() {
		long limit = 600851475143L; // 13195 ; //600851475143
		List<Long> array = new ArrayList<Long>(); //5, 7, 13 and 29
		
			for (long j = 2; j <= Math.sqrt(limit)/2; j++) {
				if(limit%j == 0 && isPrime(j)){
					System.out.println(j);
					array.add(j);
				}
			}
			System.err.println(array.get(array.size()-1));
	}

	private static boolean isPrime(long n){
		for (long i = 2; i <= n/2; i++) {
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
}
