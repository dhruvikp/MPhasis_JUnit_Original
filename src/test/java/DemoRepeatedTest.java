import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class DemoRepeatedTest {

	@Test
	@RepeatedTest(1000)
	public void test() {
		System.out.println("Test called..");
	}
}
