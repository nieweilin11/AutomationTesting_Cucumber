package org.phptravels.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStep2Page {
    private static final String PAGE_URL = "https://www.saucedemo.com/checkout-step-two.html";
    private final WebDriver driver;
    public CheckoutStep2Page(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(id = "finish")
    private WebElement finish;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/div[7]")
    private WebElement totalPrice;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/div[6]")
    private WebElement tax;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/div[5]")
    private WebElement itemPrice;



    public WebElement getFinish() {
        return finish;
    }

    public WebElement getTotalPrice() {
        return totalPrice;
    }

    public WebElement getTax() {
        return tax;
    }

    public WebElement getItemPrice() {
        return itemPrice;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }
}
