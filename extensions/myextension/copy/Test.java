package myextension.copy;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		Factorial f = new Factorial();
		assertEquals(6, f.factorial(3));
	}

}
