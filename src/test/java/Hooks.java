import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utils.Driver;

public class Hooks {

	@Parameters("browser")
	@BeforeMethod
	public static void SetUpTestEnvironment(String browserType) {
		Driver.getDriver(browserType);
	}

	@AfterMethod
	public static void tearDownEnvironment() {
		Driver.closeDriver();

	}

}
