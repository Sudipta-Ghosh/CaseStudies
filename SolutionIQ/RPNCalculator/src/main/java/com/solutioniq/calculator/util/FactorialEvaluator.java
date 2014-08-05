package com.solutioniq.calculator.util;

// TODO: Auto-generated Javadoc
/**
 * The Class FactorialEvaluator.
 */
public class FactorialEvaluator {
	
	 /**
 	 * Factorial.
 	 *
 	 * @param n the n
 	 * @return A long calculated result
 	 */
 	public static long factorial(long n) {
	       int result = 1;
	       for (int i = 1; i <= n; i++) {
	           result = result * i;
	       }
	       return result;
	   }

}
