import org.testng.annotations.Test;
import pages.HomePage;
import pages.OrderPage;
import pages.WebOrderHomePage;
import pages.WeborderLoginPage;
import utils.BrowserUtils;
import utils.Driver;

public class WebOrderTest2 extends Hooks {

	// @BeforeEach
	// void setUpTestEnvironment() {
	// driver = new ChromeDriver();
	// driver.manage().window().maximize();
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// }

	@Test
	void testSeleniumWebDriver() throws InterruptedException {
		Driver.getDriver().get("https://InarAcademy:Fk160621.@test.inar-academy.com");
		HomePage homePage = new HomePage();
		homePage.clickOnWeborderLink();
		WeborderLoginPage weborderLoginPage = new WeborderLoginPage();
		weborderLoginPage.login("Inar", "Academy");

	}

}
