package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends BasePage {

	// Product Information
	@FindBy(id = "productSelect")
	private WebElement productDropdownElement;

	@FindBy(id = "discountInput")
	private WebElement discountInputField;

	@FindBy(id = "totalInput")
	private WebElement totalPriceField;

	@FindBy(id = "quantityInput")
	private WebElement quantityInputField;

	@FindBy(xpath = "//button[text()='Calculate']")
	private WebElement calculateButton;

	// Customer Information

	@FindBy(id = "name")
	private WebElement nameField;

	@FindBy(id = "street")
	private WebElement streetField;

	@FindBy(id = "city")
	private WebElement cityField;

	@FindBy(id = "state")
	private WebElement stateField;

	@FindBy(id = "zip")
	private WebElement zipField;

	// Payment Information

	// card
	@FindBy(id = "visa")
	private WebElement visaCheckbox;

	@FindBy(id = "Mastercard")
	private WebElement masterCardCheckbox;

	@FindBy(id = "American Express")
	private WebElement americanExpressCheckbox;

	// card number
	@FindBy(id = "cardNumber")
	private WebElement cardNumberField;

	// expiry date
	@FindBy(id = "expiryDate")
	private WebElement expiryDateField;

	// proceed
	@FindBy(xpath = "//button[text()='Process']")
	private WebElement processButton;

	public OrderPage() {
		super();
	}

	public void selectProduct(String productName) {
		Select productDropDown = new Select(productDropdownElement);
		productDropDown.selectByVisibleText(productName);
	}

	public void enterQuantity(String quantity) {
		quantityInputField.clear();
		quantityInputField.sendKeys(quantity);
	}

	public void enterDiscount(String discount) {
		discountInputField.clear();
		discountInputField.sendKeys(discount);
	}

	public void clickOnCalculateButton() {
		calculateButton.click();
	}

	public String calculatePrice(String productName, String quantity, String discount) {
		selectProduct(productName);
		enterQuantity(quantity);
		enterDiscount(discount);
		clickOnCalculateButton();
		return totalPriceField.getAttribute("value");
	}

	public void enterProduct(String productName, String quantity, String discount) {
		selectProduct(productName);
		enterQuantity(quantity);
		enterDiscount(discount);
		clickOnCalculateButton();

	}

	public void enterCustomerInfo(String name, String street, String city, String state, String zip) {
		enterName(name);
		enterStreet(street);
		enterCity(city);
		enterState(state);
		enterZip(zip);
	}

	public void enterName(String name) {
		nameField.clear();
		nameField.sendKeys(name);
	}

	public void enterStreet(String street) {
		streetField.clear();
		streetField.sendKeys(street);
	}

	public void enterCity(String city) {
		cityField.clear();
		cityField.sendKeys(city);
	}

	public void enterState(String state) {
		stateField.clear();
		stateField.sendKeys(state);
	}

	public void enterZip(String zip) {
		zipField.clear();
		zipField.sendKeys(zip);
	}

	public void selectPaymentMethod(String paymentMethod) {
		switch (paymentMethod.toLowerCase()) {
			case "visa":
				clickCheckBox(visaCheckbox);
				break;
			case "mastercard":
				clickCheckBox(masterCardCheckbox);
				break;
			case "american express":
				clickCheckBox(americanExpressCheckbox);
				break;
			default:
				System.out.println("Payment method doesn't exist.");
		}
	}

	private void clickCheckBox(WebElement checkbox) {
		// if (checkbox.isSelected()) {
		checkbox.click();
	}

	public void enterCardNumber(String cardNumber) {
		cardNumberField.clear();
		cardNumberField.sendKeys(cardNumber);
	}

	public void enterExpiryDate(String expiryDate) {
		expiryDateField.clear();
		expiryDateField.sendKeys(expiryDate);
	}

	public void enterPaymentInformation(String paymentMethod, String cardNumber, String expiryDate) {
		selectPaymentMethod(paymentMethod);
		enterCardNumber(cardNumber);
		enterExpiryDate(expiryDate);
	}

	public void clickOnProcessButton() {
		processButton.click();
	}

}
