import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class DemoDynamicTest {

	Calculator c ;
	
	@BeforeEach
	public void initEach() {
		c= new Calculator();
	}
	
	
	@TestFactory
	public Collection<DynamicTest> dynamicTests() {
		Collection<DynamicTest> testcases = new ArrayList<>(); 
		testcases.add(DynamicTest.dynamicTest("Calculator when both args positive", () -> Assertions.assertEquals(2, c.calculate(1, 1)) ));
		testcases.add(DynamicTest.dynamicTest("Calculator when both args negative", () -> Assertions.assertEquals(-2, c.calculate(-1, -1)) ));
		testcases.add(DynamicTest.dynamicTest("Calculator when one is pos and another neg", () -> Assertions.assertEquals(0, c.calculate(1, -1)) ));
		return testcases;
	}
}
