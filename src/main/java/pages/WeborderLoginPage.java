package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeborderLoginPage extends BasePage {

	private WebDriver driver;

	@FindBy(id = "login-username-input")
	private WebElement userNameInputField;

	@FindBy(id = "login-password-input")
	private WebElement passwordInputField;

	@FindBy(id = "login-button")
	private WebElement loginButton;

	// constructor
	public WeborderLoginPage() {
		super();
	}

	public void enterUserName(String userName) {
		userNameInputField.sendKeys(userName);
	}

	public void enterPassword(String password) {
		passwordInputField.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public void login(String userName, String password) {
		enterUserName(userName);
		enterPassword(password);
		clickLoginButton();

	}

}
