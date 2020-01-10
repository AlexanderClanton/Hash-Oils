

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JUnit {
	@Test
	public void testJUnit() {
		JUnitTest jTest = new JUnitTest();
		int i = jTest.test(1);
		assertEquals(2, i);
	}
}


