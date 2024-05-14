import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ashim.dao.JavaCourse;
import com.ashim.service.PurchaseCourse;

class TestPurchaseCourse {

	@Test
	void testproceedWithCourse() {
		
		PurchaseCourse pc = new PurchaseCourse();
		boolean status = pc.proceedWithCourse(new JavaCourse());
//		assertTrue(status);
//		assertFalse(status);
		assertFalse(status, "It is failed because unit is resulting true");
	}

}
