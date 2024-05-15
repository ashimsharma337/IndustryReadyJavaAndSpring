package com.ashim;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;


class RepeatingTestCase {

		@RepeatedTest(3)
		void testSortingMethod_Performance(RepetitionInfo info) {
			
			SortingArray array = new SortingArray();
			
			int unsorted[] = {2,5,1};
			if(info.getCurrentRepetition()==1)
			   assertTimeout(Duration.ofMillis(100), ()-> array.sortingArray(unsorted));
			if(info.getCurrentRepetition()==2)
			   assertTimeout(Duration.ofMillis(50), ()-> array.sortingArray(unsorted));
			if(info.getCurrentRepetition()==3)
			   assertTimeout(Duration.ofMillis(10), ()-> array.sortingArray(unsorted));
		}

}
