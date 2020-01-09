import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class JUnit {
	JUnitTest jTest = new JUnitTest();
	JUnitTest kTest = jTest;
	int int1 = jTest.test(1);
	int int2 = jTest.test(2);
	@Test
	public void test() {
		assertEquals(int1,int2); 
		assertSame(jTest,kTest);
	}

}
