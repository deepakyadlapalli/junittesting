package junittestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	

	@Test
	public void test() {
		junitFunction junitstring = new junitFunction();
		String result = junitstring.addString("capstones","project");
		assertEquals ("capstonesproject",result);
		
	}

}
