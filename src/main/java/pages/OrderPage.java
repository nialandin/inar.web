package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrderPage {
    private WebDriver driver;


    //Product Information
    private By productDropdownElement = By.id("productSelect");
    private By quantityInputField = By.id("quantityInput");
    private By discountInputField = By.id("discountInput");
    private By totalPriceField = By.id("totalInput");
    private By calculateButton = By.xpath("//button[text()='Calculate']");


    //Customer Information
    private By nameField = By.id("name");
    private By streetField = By.id("street");
    private By cityField = By.id("city");
    private By stateField = By.id("state");
    private By zipField = By.id("zip");


    //Payment Information

      //card
    private By visaCheckbox = By.id("visa");
    private By masterCardCheckbox = By.id("Mastercard");
    private By americanExpressCheckbox = By.id("American Express");

      //card number
    private By cardNumberField = By.id("cardNumber");


      //expiry date
    private By expiryDateField = By.id("expiryDate");

      //proceed

    private By processButton = By.xpath("//button[text()='Process']");



    public OrderPage(WebDriver driver) {

        this.driver = driver;
    }

    public void selectProduct(String productName) {
        WebElement dropdownElement = driver.findElement(productDropdownElement);
        Select productDropDown = new Select(dropdownElement);
        productDropDown.selectByVisibleText(productName);
    }

    public void enterQuantity(String quantity) {
        WebElement quantityElement = driver.findElement(quantityInputField);
        quantityElement.clear();
        quantityElement.sendKeys(quantity);
    }

    public void enterDiscount(String discount) {
        WebElement discountElement = driver.findElement(discountInputField);
        discountElement.clear();
        discountElement.sendKeys(discount);
    }

    public void clickOnCalculateButton() {
        driver.findElement(calculateButton).click();
    }

    public String calculatePrice(String productName, String quantity, String discount) {
        selectProduct(productName);
        enterQuantity(quantity);
        enterDiscount(discount);
        clickOnCalculateButton();
        WebElement totalPriceElement = driver.findElement(totalPriceField);
        return totalPriceElement.getAttribute("value");
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
        WebElement nameElement = driver.findElement(nameField);
        nameElement.clear();
        nameElement.sendKeys(name);
    }

    public void enterStreet(String street) {
        WebElement streetElement = driver.findElement(streetField);
        streetElement.clear();
        streetElement.sendKeys(street);
    }

    public void enterCity(String city) {
        WebElement cityElement = driver.findElement(cityField);
        cityElement.clear();
        cityElement.sendKeys(city);
    }

    public void enterState(String state) {
        WebElement stateElement = driver.findElement(stateField);
        stateElement.clear();
        stateElement.sendKeys(state);
    }

    public void enterZip(String zip) {
        WebElement zipElement = driver.findElement(zipField);
        zipElement.clear();
        zipElement.sendKeys(zip);
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

    private void clickCheckBox(By checkboxLocator) {
        WebElement checkbox = driver.findElement(checkboxLocator);
        if (checkbox.isSelected()) {
            checkbox.click();
        }
    }
    public void enterCardNumber (String cardNumber ){
        WebElement cardNumberElement = driver.findElement(cardNumberField);
        cardNumberElement.clear();
        cardNumberElement.sendKeys(cardNumber);
    }
    public void enterExpiryDate (String expiryDate ){
        WebElement expiryDateElement = driver.findElement(expiryDateField);
        expiryDateElement.clear();
        expiryDateElement.sendKeys(expiryDate);
    }

    public void enterPaymentInformation(String paymentMethod, String cardNumber, String expiryDate ){
        selectPaymentMethod(paymentMethod);
        enterCardNumber(cardNumber);
        enterExpiryDate(expiryDate);
    }

    public void clickOnProcessButton () {
        driver.findElement(processButton).click();
    }
}

