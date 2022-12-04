package org.phptravels.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class addToCartAndRemoveStepDefs extends AbstractStepDefs {

    @Given("the Item page is opened")
    public void the_item_page_is_opened() {
        itemPage.openPage();
    }
    @Given("Click {string} button add item")
    public void click_button(String string) {

            switch (string) {
                case "SauceLabsBackpack":
                    itemPage.getAddSauceLabsBackpack().click();
                    break;
                case "SauceLabsBoltT_Shirt":
                    itemPage.getAddSauceLabsBoltT_Shirt().click();
                    break;
                case "SauceLabsBikeLight":
                    itemPage.getAddSauceLabsBikeLight().click();
                    break;
                case "SauceLabsFleeceJacket":
                    itemPage.getAddSauceLabsFleeceJacket().click();
                    break;
                case "SauceLabsOnesie":
                    itemPage.getAddSauceLabsOnesie().click();
                    break;
                case "T_ShirtRed":
                    itemPage.getAddT_ShirtRed().click();
            }
    }

    @Given("Click {string} button remove item")
    public void click_button_remove_item_times(String string) {

            switch (string) {
                case "SauceLabsBackpack":
                    itemPage.getRemoveSauceLabsBackpack().click();
                    break;
                case "SauceLabsBoltT_Shirt":
                    itemPage.getRemoveSauceLabsBoltT_Shirt().click();
                    break;
                case "SauceLabsBikeLight":
                    itemPage.getRemoveSauceLabsBikeLight().click();
                    break;
                case "SauceLabsFleeceJacket":
                    itemPage.getRemoveSauceLabsFleeceJacket().click();
                    break;
                case "SauceLabsOnesie":
                    itemPage.getRemoveSauceLabsOnesie().click();
                    break;
                case "T_ShirtRed":
                    itemPage.getRemoveT_ShirtRed().click();

             }
    }

    @Then("Click cart icon")
    public void click_cart_icon() {
        itemPage.getCartIcon().click();

    }

    @Given("Click all product's add button")
    public void click_all_product_s_add_button() {
        itemPage.getAddSauceLabsBackpack().click();
        itemPage.getAddSauceLabsBikeLight().click();
        itemPage.getAddT_ShirtRed().click();
        itemPage.getAddSauceLabsBoltT_Shirt().click();
        itemPage.getAddSauceLabsOnesie().click();
        itemPage.getAddSauceLabsFleeceJacket().click();

    }

    @Given("Click all product's remove button")
    public void click_all_product_s_remove_button() {
        itemPage.getRemoveSauceLabsBackpack().click();
        itemPage.getRemoveT_ShirtRed().click();
        itemPage.getRemoveSauceLabsBoltT_Shirt().click();
        itemPage.getRemoveSauceLabsBikeLight().click();
        itemPage.getRemoveSauceLabsFleeceJacket().click();
        itemPage.getRemoveSauceLabsOnesie().click();

    }

}
