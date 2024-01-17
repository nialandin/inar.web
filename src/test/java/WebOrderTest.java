import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.OrderPage;
import pages.WebOrderHomePage;
import pages.WeborderLoginPage;
import utils.BrowserUtils;
import utils.Driver;

public class WebOrderTest extends Hooks {

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
		WebOrderHomePage webOrderHomePage = new WebOrderHomePage();
		webOrderHomePage.navigateToOrder();
		OrderPage orderPage = new OrderPage();
		orderPage.enterProduct("Books", "10", "10");

		BrowserUtils.scrollDown();

		orderPage.enterCustomerInfo("Francois", " Main", "NewYork", "Nw", "1004");
		orderPage.enterPaymentInformation("visa", "4938281746192845", "11/32");
		Thread.sleep(1000);

		orderPage.clickOnProcessButton();

	}

}
