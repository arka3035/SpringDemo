package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm sa;
	public SortAlgorithm getSa() {
		return sa;
	}

	public void setSa(SortAlgorithm sa) {
		this.sa = sa;
	}
	
	/*
	 * public BinarySearchImpl(SortAlgorithm sa) { this.sa = sa; }
	 */
	public int binarySearch(int[] numbers, int n) {
		//sorting an array
		//search the array
		//return the result
		int []num=sa.sort(numbers);
		System.out.println(sa);
		return 3;
	}

	
}
