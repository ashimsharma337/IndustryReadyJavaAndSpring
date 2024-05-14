package com.ashim;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {

	@Test
	void testSortingArray_Exception() {
		
		SortingArray array = new SortingArray();
//		int unsorted[] = {2,1,4};
//		int sortedArray[] = array.sortingArray(unsorted);
//		for(int elem:sortedArray) {
//			System.out.print(elem);
//		}
//		try {
//			// if array is null array =
//			//int unsorted[] = null;
//			int unsorted[] = {2,1,4};
//			int sortedArray[] = array.sortingArray(unsorted);
//			System.out.println("Statements below exception will not be executed if there is exception");
//			fail();
//		} 
//		catch(NullPointerException e) {
//			System.out.println("Exception generated");
//		}
		// proper array will fail because nullpointer exception is not thrown
		//int unsorted[] = {2,5,3};
		int unsorted[] = null;
		assertThrows(NullPointerException.class, ()-> array.sortingArray(unsorted));
	}

}
