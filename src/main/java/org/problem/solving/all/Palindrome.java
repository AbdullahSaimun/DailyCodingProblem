package org.problem.solving.all;

//Palindrome number in java: A palindrome number is a number that is same after reverse.
// For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
// It can also be a string like LOL, MADAM etc.
public class Palindrome {
	public static void main(String[] args) {
		int r, sum = 0, temp;

		int n = 454;
		temp = n;

		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n/10;
		}

		if (sum == temp) {
			System.out.println(temp + " is palindrome number");
		} else {
			System.out.println(temp + " is not a palindrome number");
		}
	}
}
