package stqaproj1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubTest {

	@Test
	public void testSub() {
		JUnitClass junit=new JUnitClass();
		int result =junit.sub(300,200);
		assertEquals(100,result);
	}

}
