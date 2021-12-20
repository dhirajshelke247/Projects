package stqaproj1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MulTest {

	@Test
	public void testMul() {
		JUnitClass junit=new JUnitClass();
		int result =junit.mul(30,20);
		assertEquals(600,result);
	}

}
