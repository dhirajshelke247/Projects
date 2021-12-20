package stqaproj1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PythagorasTest {

	@Test
	public void testPythagoras() {
		JUnitClass junit=new JUnitClass();
		int result =junit.pythagoras(4,3);
		assertEquals(5,result);
	}

}
