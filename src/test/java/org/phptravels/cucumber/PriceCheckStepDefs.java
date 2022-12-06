package org.phptravels.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.HashMap;

public class PriceCheckStepDefs extends AbstractStepDefs {
    private HashMap<String, String> priceTable = new HashMap<>();

    @Given("Click {string} button add item and record the price")
    public void click_button_add_item_and_record_the_price(String string) {
        switch (string) {
            case "SauceLabsBackpack":
                itemPage.getAddSauceLabsBackpack().click();
                priceTable.put("SauceLabsBackpack",
                        itemPage.getPriceSauceLabsBackpack().getText());
                break;
            case "SauceLabsBoltT_Shirt":
                itemPage.getAddSauceLabsBoltT_Shirt().click();
                priceTable.put("SauceLabsBoltT_Shirt",
                        itemPage.getPriceSauceLabsBoltT_Shirt().getText());
                break;
            case "SauceLabsBikeLight":
                itemPage.getAddSauceLabsBikeLight().click();
                priceTable.put("SauceLabsBikeLight",
                        itemPage.getPriceSauceLabsBikeLight().getText());
                break;
            case "SauceLabsFleeceJacket":
                itemPage.getAddSauceLabsFleeceJacket().click();
                priceTable.put("SauceLabsFleeceJacket",
                        itemPage.getPriceSauceLabsFleeceJacket().getText());
                break;
            case "SauceLabsOnesie":
                itemPage.getAddSauceLabsOnesie().click();
                priceTable.put("SauceLabsOnesie",
                        itemPage.getPriceSauceLabsOnesie().getText());
                break;
            case "T_ShirtRed":
                itemPage.getAddT_ShirtRed().click();
                priceTable.put("T_ShirtRed",
                        itemPage.getPriceT_ShirtRed().getText());
        }
    }

    @Given("Check the {string} of {string}")
    public void check_the_of(String price, String item) {
        double itemPrice = Double.parseDouble(price);
        String ItemP = priceTable.get(item);
        ItemP = ItemP.substring(1);
        double checkedPrice = Double.parseDouble(ItemP);
        try {

            throw new Exception(String.valueOf(item));

        } catch (Exception e) {
            if (checkedPrice != itemPrice)
                System.out.println(e.getMessage() + "'s price is not correct");
        }
    }

    @Then("Calculate tax rate")
    public void calculateTaxRate() {
        try {
            String temp = checkoutStep2Page.getItemPrice().getText();
            double itemPrice = Double.parseDouble(temp.substring(13));

            temp = checkoutStep2Page.getTax().getText();
            double tax = Double.parseDouble(temp.substring(6));

            temp = checkoutStep2Page.getTotalPrice().getText();
            double totalPrice = Double.parseDouble(temp.substring(8));

            double taxRate = 1 - itemPrice/totalPrice;
            throw new Exception(String.valueOf(taxRate));
        }
        catch (Exception e){
            System.out.println("tax rate= " + e.getMessage());
        }
    }
}
