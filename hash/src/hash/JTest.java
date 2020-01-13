package hash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JTest {
	JUnit jUnit = new JUnit();
	@Test
	void test() {
		String expectedOutput = "loltyler1dotcom-discount-code-alpha";
		String input = "loltyler1dotcom-discount-code-alpha";
		
		assertEquals(expectedOutput, jUnit.print(input));
	}

}
