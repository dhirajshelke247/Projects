package stqaproj1;

import static org.junit.Assert.*;

import org.junit.Test;

import stqaproj1.JUnitClass;

public class AddTest {

	@Test
	public void testAdd() {
		JUnitClass junit=new JUnitClass();
		int result =junit.add(300,200);
		assertEquals(500,result);
	}

}
