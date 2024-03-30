package org.problem.solving.all;

public class Factorial {

	static int result = 0;

	static int calculateFactorial(int val) {
		while (val > 0) {
		  return val * calculateFactorial(val-1);
		}
		return 1;
	}
	public static void main(String[] args) {
		var value = calculateFactorial(5);
		System.out.println(value);
	}
}
//120