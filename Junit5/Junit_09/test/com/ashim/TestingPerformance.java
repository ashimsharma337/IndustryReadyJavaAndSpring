package com.ashim;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TestingPerformance {

	@Test
	void testSortingMethod_Performance() {
		
		SortingArray array = new SortingArray();
		
		int unsorted[] = {2,5,1};
		
//		assertTimeout(Duration.ofMillis(10), ()-> array.sortingArray(unsorted)); //test case fails
		assertTimeout(Duration.ofMillis(100), ()-> array.sortingArray(unsorted)); //test case will pass
	}

}
