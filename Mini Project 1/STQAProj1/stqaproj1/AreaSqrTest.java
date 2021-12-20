package stqaproj1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaSqrTest {

	@Test
	public void testAreasqr() {
		JUnitClass junit=new JUnitClass();
		int result =junit.areasqr(4);
		assertEquals(16,result);
	}

}
