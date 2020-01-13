package hash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JTest {
	JUnit jUnit = new JUnit();
	JUnit j2 = jUnit;
	JUnit j3 = new JUnit();
	@Test
	void test() {
		String expectedOutput = "loltyler1dotcom-discount-code-alpha";
		String input = "loltyler1dotcom-discount-code-alpha";
		
		assertEquals(expectedOutput, jUnit.print(input)); //pass
		assertSame(jUnit, j2); //pass
		assertSame(expectedOutput, jUnit.print(input));//pass
		assertNotSame(jUnit, j3); 
		assertNotEquals(jUnit.print(input), j2.print(input + "lol"));
		//... other tests too 
	}

}
