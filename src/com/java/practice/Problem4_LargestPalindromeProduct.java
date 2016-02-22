package com.java.practice;


/**
 * @author Amruta Kajrekar.
 * Problem: A palindromic number reads the same both ways. 
 * 	    The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *          Find the largest palindrome made from the product of two 3-digit numbers.
 * MySolution: 906609
 */
public class Problem4_LargestPalindromeProduct {

	public static void main(String[] args) {
		System.err.println(findLargestPalindrome(999));
	}
	
	
	private static int findLargestPalindrome(int limit) {
		int largestProduct = 0;
		for (int i = limit; i >=0 ; i--) {
			for (int j = limit; j >= 0; j--) {
				if(isPalindrome(new Long(i*j).toString())){
					if ( i*j > largestProduct ){
	                    largestProduct = i*j;
	                }
				}
			}
		}
		return largestProduct;
	}

	private static boolean isPalindrome(String string) {
		StringBuffer str = new StringBuffer("");
		if(string.length()%2!=0){
			str.append(string.substring(0, string.length()/2) + string.substring((string.length()/2) + 1, string.length()));
		} else{
		str.append(string);
		}
		
		return (new StringBuffer(str.substring(0, str.length()/2)).reverse().toString().equals(str.substring(str.length()/2)) );
	}
}
