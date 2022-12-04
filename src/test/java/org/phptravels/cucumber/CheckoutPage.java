package org.phptravels.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private static final String PAGE_URL = "https://www.saucedemo.com/cart.html";


    private final WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;

    }

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id ="postal-code")
    private WebElement PostalCode;

    @FindBy(id = "continue")
    private WebElement Continue;

    @FindBy(id = "checkout")
    private WebElement checkout;

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getPostalCode() {
        return PostalCode;
    }

    public WebElement getContinue() {
        return Continue;
    }

    public WebElement getCheckout() {
        return checkout;
    }
}
