package org.problem.solving.all;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SquareSorted {

	public static List<Integer> squareAndSort(List<Integer> nums) {
		nums = nums.stream().map(obj -> (int)Math.pow(obj,2))
				.collect(Collectors.toList());
		Collections.sort(nums);
		return nums;
	}

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(-9, -2, 0, 2, 3);
		List<Integer> squaredSorted = squareAndSort(nums);
		System.out.println(squaredSorted);
//		[0, 4, 4, 9, 81]
	}
}
