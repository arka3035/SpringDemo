package com.spring.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class QuickSort implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
