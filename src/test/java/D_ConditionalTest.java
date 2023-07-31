import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class D_ConditionalTest {

	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows() {
		System.out.println("This runs on windows..");
	}
	
	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLinux() {
		System.out.println("This runs on linux..");
	}
}
