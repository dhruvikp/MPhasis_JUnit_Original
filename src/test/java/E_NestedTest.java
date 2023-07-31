import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class E_NestedTest {

	@BeforeEach
	void init() {
		System.out.println("Before each from outer");
	}

	@Nested
	class Inner {
		@BeforeEach
		void init() {
			System.out.println("Before each from inner");
		}

		@Test
		void test() {
			System.out.println("Nested test executed..");
		}
		
		@Test
		void test2() {
			System.out.println("Nested test2 executed..");
		}
	}
}
