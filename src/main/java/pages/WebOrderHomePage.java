package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebOrderHomePage {

    private static WebDriver driver;

    private By viewAllOrdersLink = By.linkText("View all orders");
    private By viewAllProductsLink = By.linkText("View all products");
    private static By orderLink = By.linkText("Order");


    public WebOrderHomePage(WebDriver driver) {
        this.driver = driver;

    }

    public ViewAllOrdersPage navigateToViewAllOrders() {
        driver.findElement(viewAllOrdersLink).click();
        return new ViewAllOrdersPage(driver);
    }

    public static OrderPage navigateToOrder() {
        driver.findElement(orderLink).click();
        return new OrderPage(driver);
    }

    public OrderPage navigateToAllProducts() {
        driver.findElement(viewAllProductsLink).click();

        return new OrderPage(driver);
    }


}
