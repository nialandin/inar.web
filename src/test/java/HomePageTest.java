import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.WebOrderHomePage;
import pages.WeborderLoginPage;

import java.time.Duration;

public class HomePageTest {
    WebDriver driver;

    @BeforeEach
    void setUpTestEnvironment() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    void testSeleniumWebDriver() throws InterruptedException {
        driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com");
        HomePage homePage = new HomePage(driver);
        WeborderLoginPage weborderLoginPage = homePage.clickOnWeborderLink();
        WebOrderHomePage webOrderHomePage = weborderLoginPage.login("Inar", "Academy");
   //     OrderPage orderPage = Weborder.navigateToOrder();
        Thread.sleep(10000);
    }

    @AfterEach
    void tearDownTestEnvironment() {
        if (driver != null)
            driver.quit();
    }

}
