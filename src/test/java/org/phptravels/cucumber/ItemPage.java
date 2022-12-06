package org.phptravels.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage {
    private final WebDriver driver;
    private static final String PAGE_URL = "https://www.saucedemo.com/inventory.html";

    @FindBy(id ="add-to-cart-sauce-labs-backpack")
    private WebElement addSauceLabsBackpack;
    @FindBy(id ="remove-sauce-labs-backpack")
    private WebElement removeSauceLabsBackpack;
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div")
    private WebElement priceSauceLabsBackpack;
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")
    private WebElement detailSauceLabsBackpack;


    @FindBy(id ="add-to-cart-sauce-labs-bike-light")
    private WebElement addSauceLabsBikeLight;
    @FindBy(id ="remove-sauce-labs-bike-light")
    private WebElement removeSauceLabsBikeLight;
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div")
    private WebElement priceSauceLabsBikeLight;
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/a/div")
    private WebElement detailSauceLabsBikeLight;


    @FindBy(id ="add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement addSauceLabsBoltT_Shirt;
    @FindBy(id ="remove-sauce-labs-bolt-t-shirt")
    private WebElement removeSauceLabsBoltT_Shirt;
    @FindBy(xpath ="/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/div")
    private WebElement priceSauceLabsBoltT_Shirt;
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[1]/a/div")
    private WebElement detailSauceLabsBoltT_Shirt;


    @FindBy(id ="add-to-cart-sauce-labs-fleece-jacket")
    private WebElement addSauceLabsFleeceJacket;
    @FindBy(id ="remove-sauce-labs-fleece-jacket")
    private WebElement removeSauceLabsFleeceJacket;
    @FindBy(xpath ="/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[2]/div")
    private WebElement priceSauceLabsFleeceJacket;
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[1]/a/div")
    private WebElement detailSauceLabsFleeceJacket;


    @FindBy(id ="add-to-cart-sauce-labs-onesie")
    private WebElement addSauceLabsOnesie ;
    @FindBy(id ="remove-sauce-labs-onesie")
    private WebElement removeSauceLabsOnesie ;
    @FindBy(xpath ="/html/body/div/div/div/div[2]/div/div/div/div[5]/div[2]/div[2]/div")
    private WebElement priceSauceLabsOnesie ;
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[5]/div[2]/div[1]/a/div")
    private WebElement detailSauceLabsOnesie;


    @FindBy(id ="add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement addT_ShirtRed;
    @FindBy(id ="remove-test.allthethings()-t-shirt-(red)")
    private WebElement removeT_ShirtRed;
    @FindBy(xpath ="/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[2]/div")
    private WebElement priceT_ShirtRed;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[1]/a/div")
    private WebElement detailT_ShirtRed;


    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    private WebElement cartIcon;

    @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
    private WebElement sideMenu;

    @FindBy(xpath = "/html/body/div/div/footer/ul/li[3]/a")
    private WebElement linkedin;

    @FindBy(xpath = "/html/body/div/div/footer/ul/li[1]/a")
    private WebElement twitch;

    @FindBy(xpath ="/html/body/div/div/footer/ul/li[2]/a")
    private WebElement facebook;

    @FindBy(xpath = "//*[@id=\"about_sidebar_link\"]")
    private WebElement aboutUs;


    @FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
    private WebElement logout;

    @FindBy(xpath = "//*[@id=\"back-to-products\"]")
    private WebElement itemDetailBack;


    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }


    public WebElement getAddSauceLabsBackpack() {
        return addSauceLabsBackpack;
    }

    public WebElement getRemoveSauceLabsBackpack() {
        return removeSauceLabsBackpack;
    }

    public WebElement getPriceSauceLabsBackpack() {
        return priceSauceLabsBackpack;
    }

    public WebElement getAddSauceLabsBikeLight() {
        return addSauceLabsBikeLight;
    }

    public WebElement getRemoveSauceLabsBikeLight() {
        return removeSauceLabsBikeLight;
    }

    public WebElement getPriceSauceLabsBikeLight() {
        return priceSauceLabsBikeLight;
    }

    public WebElement getAddSauceLabsBoltT_Shirt() {
        return addSauceLabsBoltT_Shirt;
    }

    public WebElement getRemoveSauceLabsBoltT_Shirt() {
        return removeSauceLabsBoltT_Shirt;
    }

    public WebElement getPriceSauceLabsBoltT_Shirt() {
        return priceSauceLabsBoltT_Shirt;
    }

    public WebElement getAddSauceLabsFleeceJacket() {
        return addSauceLabsFleeceJacket;
    }

    public WebElement getRemoveSauceLabsFleeceJacket() {
        return removeSauceLabsFleeceJacket;
    }

    public WebElement getPriceSauceLabsFleeceJacket() {
        return priceSauceLabsFleeceJacket;
    }

    public WebElement getAddSauceLabsOnesie() {
        return addSauceLabsOnesie;
    }

    public WebElement getRemoveSauceLabsOnesie() {
        return removeSauceLabsOnesie;
    }

    public WebElement getPriceSauceLabsOnesie() {
        return priceSauceLabsOnesie;
    }

    public WebElement getAddT_ShirtRed() {
        return addT_ShirtRed;
    }

    public WebElement getRemoveT_ShirtRed() {
        return removeT_ShirtRed;
    }

    public WebElement getPriceT_ShirtRed() {
        return priceT_ShirtRed;
    }

    public WebElement getCartIcon() {
        return cartIcon;
    }

    public WebElement getSideMenu() {
        return sideMenu;
    }

    public WebElement getLogout() {
        return logout;
    }

    public WebElement getLinkedin() {
        return linkedin;
    }

    public WebElement getTwitch() {
        return twitch;
    }

    public WebElement getFacebook() {
        return facebook;
    }

    public WebElement getAboutUs() {
        return aboutUs;
    }

    public WebElement getDetailSauceLabsBackpack() {
        return detailSauceLabsBackpack;
    }

    public WebElement getDetailSauceLabsBikeLight() {
        return detailSauceLabsBikeLight;
    }

    public WebElement getDetailSauceLabsBoltT_Shirt() {
        return detailSauceLabsBoltT_Shirt;
    }

    public WebElement getDetailSauceLabsFleeceJacket() {
        return detailSauceLabsFleeceJacket;
    }

    public WebElement getDetailSauceLabsOnesie() {
        return detailSauceLabsOnesie;
    }

    public WebElement getDetailT_ShirtRed() {
        return detailT_ShirtRed;
    }

    public WebElement getItemDetailBack() {
        return itemDetailBack;
    }


}
