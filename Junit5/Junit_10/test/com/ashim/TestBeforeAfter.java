package com.ashim;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestBeforeAfter {
	
	    TestBeforeAfter() {
	    	System.out.println("Test obj is created before test method");
	    }
        
	    @BeforeAll
	    void beforeAll() {
	    	System.out.println("Before all test");
	    }
	    
	    @AfterAll
	    void afterAll() {
	    	System.out.println("After all test");
	    }
	    
	    Shapes shape;
	    
	    @BeforeEach
	    void init() {
	    	shape = new Shapes();
	    	System.out.println("Before test");
	    }
		
		@Test
		void testcomputeSquareArea() {
			
			assertEquals(576, shape.computeSquareArea(24));
			System.out.println("Actual test running");
		}
		
		@Test
		@Disabled
		void testcomputeRectangaleArea() {
			
			assertEquals(576, shape.computeRectangleArea(24));
			System.out.println("Actual test running");
		}
		
		@Test
		@DisplayName("testing area of circle method")
		void testcomputeCircleArea() {
			
			assertEquals(78.5, shape.computeCircleArea(5), "Area of circle calculation is wrong!");
			System.out.println("Actual test running");
		}
		
		@AfterEach
		void destroy() {
			System.out.println("After test clean up");
		}
}
