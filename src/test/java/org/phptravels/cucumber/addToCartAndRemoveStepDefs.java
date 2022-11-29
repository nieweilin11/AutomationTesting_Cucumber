package org.phptravels.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class addToCartAndRemoveStepDefs extends AbstractStepDefs {

    @Given("Click {string} button add item")
    public void click_button(String string) {

            switch (string) {
                case "SauceLabsBackpack":
                    homePage.getAddSauceLabsBackpack().click();
                    break;
                case "SauceLabsBoltT_Shirt":
                    homePage.getAddSauceLabsBoltT_Shirt().click();
                    break;
                case "SauceLabsBikeLight":
                    homePage.getAddSauceLabsBikeLight().click();
                    break;
                case "SauceLabsFleeceJacket":
                    homePage.getAddSauceLabsFleeceJacket().click();
                    break;
                case "SauceLabsOnesie":
                    homePage.getAddSauceLabsOnesie().click();
                    break;
                case "T_ShirtRed":
                    homePage.getAddT_ShirtRed().click();
            }
    }

    @Given("Click {string} button remove item")
    public void click_button_remove_item_times(String string) {

            switch (string) {
                case "SauceLabsBackpack":
                    homePage.getRemoveSauceLabsBackpack().click();
                    break;
                case "SauceLabsBoltT_Shirt":
                    homePage.getRemoveSauceLabsBoltT_Shirt().click();
                    break;
                case "SauceLabsBikeLight":
                    homePage.getRemoveSauceLabsBikeLight().click();
                    break;
                case "SauceLabsFleeceJacket":
                    homePage.getRemoveSauceLabsFleeceJacket().click();
                    break;
                case "SauceLabsOnesie":
                    homePage.getRemoveSauceLabsOnesie().click();
                    break;
                case "T_ShirtRed":
                    homePage.getRemoveT_ShirtRed().click();

             }
    }

    @Then("Click cart icon")
    public void click_cart_icon() {
        homePage.getCartIcon().click();

    }

    @Given("Click all product's add button")
    public void click_all_product_s_add_button() {
        homePage.getAddSauceLabsBackpack().click();
        homePage.getAddSauceLabsBikeLight().click();
        homePage.getAddT_ShirtRed().click();
        homePage.getAddSauceLabsBoltT_Shirt().click();
        homePage.getAddSauceLabsOnesie().click();
        homePage.getAddSauceLabsFleeceJacket().click();

    }

    @Given("Click all product's remove button")
    public void click_all_product_s_remove_button() {
        homePage.getRemoveSauceLabsBackpack().click();
        homePage.getRemoveT_ShirtRed().click();
        homePage.getRemoveSauceLabsBoltT_Shirt().click();
        homePage.getRemoveSauceLabsBikeLight().click();
        homePage.getRemoveSauceLabsFleeceJacket().click();
        homePage.getRemoveSauceLabsOnesie().click();

    }

}
