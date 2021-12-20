package stqaproj1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivTest {

	@Test
	public void testDiv() {
		JUnitClass junit=new JUnitClass();
		int result =junit.div(400,200);
		assertEquals(2,result);
	}

}
