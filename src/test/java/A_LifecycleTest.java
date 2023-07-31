import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class A_LifecycleTest {

	@BeforeAll
	public static void initAll() {
		System.out.println("Before All method invoked1");
	}

	@BeforeEach
	public void init() {
		System.out.println("Before Each");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1 is running");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 is running");
	}
	
	@AfterEach
	public void destroy() {
		System.out.println("After Each");
	}
	
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All method invoked1");
	}

}
