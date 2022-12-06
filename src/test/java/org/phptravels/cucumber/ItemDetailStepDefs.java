package org.phptravels.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ItemDetailStepDefs extends AbstractStepDefs{

    @Given("Click {string}")
    public void click(String string) {
        switch (string) {
            case "SauceLabsBackpack":
                itemPage.getDetailSauceLabsBackpack().click();
                break;
            case "SauceLabsBoltT_Shirt":
                itemPage.getDetailSauceLabsBoltT_Shirt().click();
                break;
            case "SauceLabsBikeLight":
                itemPage.getDetailSauceLabsBikeLight().click();
                break;
            case "SauceLabsFleeceJacket":
                itemPage.getDetailSauceLabsFleeceJacket().click();
                break;
            case "SauceLabsOnesie":
                itemPage.getDetailSauceLabsOnesie().click();
                break;
            case "T_ShirtRed":
                itemPage.getDetailT_ShirtRed().click();
        }
    }
    @Then("Click Back button")
    public void click_back_button() {
    itemPage.getItemDetailBack().click();
    }

    @Given("Click add button")
    public void click_add_button() {
    itemPage.getAddSauceLabsBackpack().click();
    }

    @Then("Click remove button")
    public  void click_remove_button(){
        itemPage.getRemoveSauceLabsBackpack().click();
    }
}
