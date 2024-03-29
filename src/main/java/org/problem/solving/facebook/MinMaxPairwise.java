package org.problem.solving.facebook;

/*This problem was asked by Facebook.

Given an array of numbers of length N, find both the minimum and maximum
using less than 2 * (N - 2) comparisons.*/

//technique for solve problem

//can use a technique called "Tournament Method" or "Pairwise Comparison" to find
//both the minimum and maximum elements of an array with fewer than 2*(N-2) comparisons.

public class MinMaxPairwise {

	public static MinMax findMinMax(int arr[]) {
		MinMax minMax = new MinMax();
		int length = arr.length;
		int start;
		if (length == 1) {
			minMax.min = arr[0];
			minMax.max = arr[0];
			return minMax;
		}

		if (length % 2 == 0) {
			if (arr[0] < arr[1]) {
				minMax.min = arr[0];
				minMax.max = arr[1];

			} else {
				minMax.min = arr[1];
				minMax.max = arr[0];
			}
			start = 2;
		} else {
			minMax.min = minMax.max = arr[0];
			start = 1;
		}

		while (start < length - 1) {
			if (arr[start] < arr[start + 1]) {
				minMax.min = Math.min(minMax.min, arr[start]);
				minMax.max = Math.max(minMax.max, arr[start + 1]);
			} else {
				minMax.min = Math.min(minMax.min, arr[start + 1]);
				minMax.max = Math.max(minMax.max, arr[start]);
			}


			start += 2;
		}
		return minMax;

	}

	public static void main(String[] args) {
		int[] arr = {33, 54, 1, 4433, 534, 12, 90};

		MinMax resutl = findMinMax(arr);
		System.out.println("Minimum result is " + resutl.min);
		System.out.println("Maximum result is " + resutl.max);

	}

	static class MinMax {
		int min;
		int max;
	}
}
