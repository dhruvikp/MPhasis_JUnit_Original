import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class B_AssersionsTest {

	// Assertions API allows you to match your expected with actual
	//
	@Test
	public void assertTest() {
		boolean actual = true;
		Assertions.assertTrue(actual);

		String str = null;
		String str2 = "Some value";
		String str3 = "Some value";

		Assertions.assertEquals(str3, str2);
		Assertions.assertNotNull(str2);
		Assertions.assertNull(str);

		String[] a1 = { "A", "B" };
		String[] a2 = { "A", "B" };

		Assertions.assertArrayEquals(a1, a2);

		Assertions.assertThrows(RuntimeException.class, () -> {
			throw new RuntimeException();
		});
	}

}
