package com.ashim.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {

	Shapes shape = new Shapes();
	
	@Test
	void testComputeSquareArea() {
		assertNotEquals(5757575, shape.computeSquareArea(24));
	}
	
	@Test 
	void testComputeSquareArea_WithMessage() {
		assertNotEquals(576, shape.computeSquareArea(24), "Message to dev if testcase fail");
	}
	
	@Test 
	void testComputeSquareArea_Supplier() {
		assertNotEquals(576, shape.computeSquareArea(24), ()->"Message to dev if testcase fail");
	}

}
