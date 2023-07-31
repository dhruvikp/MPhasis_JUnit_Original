import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class F_DependencyInjeTest {

	@Test
	@Tag("my-tag")
	public void test(TestInfo testInfo, TestReporter testReporter) {

		testReporter.publishEntry("TestName", testInfo.getDisplayName());
		testReporter.publishEntry("Tags", testInfo.getTags().iterator().next());
	}
}
