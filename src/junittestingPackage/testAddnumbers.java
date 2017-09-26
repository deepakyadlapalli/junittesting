package junittestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddnumbers {

	

	public void test() {
		junitFunction junit = new junitFunction();
		int result = junit.addNumbers(100, 200);
		assertEquals (300,result);
		
	}

}
