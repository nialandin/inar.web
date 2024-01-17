package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeborderLoginPage {

    private WebDriver driver;

    private By userNameInputField = By.id("login-username-input");
    private By passwordInputField = By.id("login-password-input");
    private By loginButton = By.id("login-button");


    //constructor
    public WeborderLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String userName) {
        driver.findElement(userNameInputField).sendKeys(userName);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInputField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public WebOrderHomePage login (String userName, String password) {
        enterUserName(userName);
        enterPassword(password);
        clickLoginButton();

        return new WebOrderHomePage(driver);
    }
}
