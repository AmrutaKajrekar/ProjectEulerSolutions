package com.java.practice;

/**
 * @author Amruta Kajrekar
 *
 */
public class Problem2_EvenFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int first = 1, second = 2, next = first + second, sum = second, fibonacci = 4000000;
		System.out.print(first + ", " + second + ", " );
		
		while (next <= fibonacci){
			System.out.print(next + ", ");
			first = second;
			second = next;
			next = first + second;
			if(next%2 == 0){
				System.err.println(next+ "+ " +sum);
				if(next < fibonacci)
				sum += next;
			}
		}
		System.out.println("\n Final answer = " + sum);
	}

}
