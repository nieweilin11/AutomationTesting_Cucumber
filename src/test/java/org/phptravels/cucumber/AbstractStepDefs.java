package org.phptravels.cucumber;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public abstract class AbstractStepDefs {

    private static final int WAIT_TIME = 10;

    static WebDriver driver;

    protected static HomePage homePage;
    protected static ItemPage itemPage;
    protected static CheckoutPage checkoutPage;
    protected static CheckoutStep2Page checkoutStep2Page;

    static {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
        itemPage = new ItemPage(driver);
        checkoutPage =new CheckoutPage(driver);
        checkoutStep2Page = new CheckoutStep2Page(driver);

    }

}
