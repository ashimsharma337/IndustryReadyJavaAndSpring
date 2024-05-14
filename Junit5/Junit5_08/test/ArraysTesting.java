import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTesting {

	@Test
	void testArrays() {
		
		int []expected = {2,4,6,8};
		int []actual = {4,8,6,2};
		
		//if arrays is sorted then order is same, so test will pass
		Arrays.sort(actual);
		
		// assertArrayEquals(expected, actual);
		//if assertEquals is used test will fail
		assertEquals(expected, actual);
	}

}
