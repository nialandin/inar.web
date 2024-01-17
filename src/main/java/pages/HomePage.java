package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    //Locators
    private By weborderLink = By.linkText("Weborder");
    private By webAutomationLink = By.linkText("Webautomation");
    private By targetMarketLink = By.linkText("Target Market");
    private By bookingLink = By.linkText("Booking");
    private By handlingCertificationLink = By.linkText("Handling Certifications");
    private By fileUploadingLink = By.linkText("File Uploading");

    //<h1 class="display-1  text-fifth">Explore Inar's Testing World</h1>ü
    //css yazmak için  --> etiket.sınıf.adı
    private By exploreInarTestingWorldTitletext = By.cssSelector("h1.display-1.text-fifth");


    //constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //page actions with hava methods

    public WeborderLoginPage clickOnWeborderLink(){
        driver.findElement(weborderLink).click();
        return new WeborderLoginPage(driver);
    }
    public void clickWebAutomationLink(){
        driver.findElement(webAutomationLink).click();
    }
    public void clickTargetMarketLink (){
        driver.findElement(targetMarketLink).click();
    }
    public void clickBookingLink(){
        driver.findElement(bookingLink).click();
    }
    public void clickHandlingCertificationLink(){
        driver.findElement(handlingCertificationLink).click();
    }
    public void clickFileUploadingLink(){
        driver.findElement(fileUploadingLink).click();
    }

    public String getWelcomeText () {
      return  driver.findElement(exploreInarTestingWorldTitletext).getText();

    }

    public void refreshPage (){
        driver.navigate().refresh();
    }

}

