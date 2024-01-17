package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	// Locators
	@FindBy(linkText = "Weborder")
	private WebElement webOrderLink;

	@FindBy(linkText = "WebautomationLink")
	private WebElement webAutomationLink;

	@FindBy(linkText = "targetMarketLink")
	private WebElement targetMarketLink;

	@FindBy(linkText = "bookingLink")
	private WebElement bookingLink;

	@FindBy(linkText = "handlingCertificationLink")
	private WebElement handlingCertificationLink;

	@FindBy(linkText = "fileUploadingLink")
	private WebElement fileUploadingLink;

	@FindBy(css = "h1.display-1.text-fifth")
	private WebElement exploreInarTestingWorldTitletext;

	// <h1 class="display-1 text-fifth">Explore Inar's Testing World</h1>ü
	// css yazmak için --> etiket.sınıf.adı --> h1.display-1.text-fifth

	// constructor
	public HomePage() {
		super();
	}

	public void clickOnWeborderLink() {
		webOrderLink.click();
	}

	public void clickWebAutomationLink() {
		webAutomationLink.click();
	}

	public void clickTargetMarketLink() {
		targetMarketLink.click();
	}

	public void clickBookingLink() {
		bookingLink.click();
	}

	public void clickHandlingCertificationLink() {
		handlingCertificationLink.click();
	}

	public void clickFileUploadingLink() {
		fileUploadingLink.click();
	}

	public String getWelcomeText() {
		return exploreInarTestingWorldTitletext.getText();

	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

}
