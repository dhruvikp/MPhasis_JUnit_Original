import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@DisplayName("Calculator Testcases")
public class C_CalculatorTest {
	Calculator c;

	@BeforeEach
	public void init() {
		c = new Calculator();
	}

	@Test
	@DisplayName("Test Calculator when both arguments are positives ")
	public void testCalculator_When_BothArgs_Positive() {
		// STEP 1: Gets Calculator Object
		// Using before each initialized object

		// STEP 2: Prepare input
		int a = 1, b = 1;

		// STEP 3: Gets actual value
		int actual = c.calculate(a, b);

		// STEP 4 : Define expectations
		int expected = 2;

		// STEP 5: Assert expected with actual
		Assertions.assertEquals(expected, actual);
	}

	@Test
	public void testCalculator_When_BothArgs_Negative() {
		// STEP 1: Gets Calculator Object
		// Using before each initialized object

		// STEP 2: Prepare input
		int a = -1, b = -1;

		// STEP 3: Gets actual value
		int actual = c.calculate(a, b);

		// STEP 4 : Define expectations
		int expected = -2;

		// STEP 5: Assert expected with actual
		Assertions.assertEquals(expected, actual);
	}

	@Test
	public void testCalculator_When_Both_Different_Sign() {
		// STEP 1: Gets Calculator Object
			//Using before each initialized object

		// STEP 2: Prepare input
		int a = -1,b= 1;
		
		// STEP 3: Gets actual value
		int actual = c.calculate(a, b);
		
		// STEP 4 : Define expectations
		int expected = 0;
		
		// STEP 5: Assert expected with actual
		Assertions.assertEquals(expected, actual);
	}
}
