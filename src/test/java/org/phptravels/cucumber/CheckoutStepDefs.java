package org.phptravels.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CheckoutStepDefs extends AbstractStepDefs{

    @Given("the Checkout page is opened")
    public void the_checkout_page_is_opened() {
        checkoutPage.openPage();
    }
    @And("fill in the {string} ,{string},{string}")
    public void fillInTheFirstNameLastnamePostalCode(String firstName, String lastName,String postalCode) {
        checkoutPage.getFirstName().sendKeys(firstName);
        checkoutPage.getLastName().sendKeys(lastName);
        checkoutPage.getPostalCode().sendKeys(postalCode);

    }

    @Then("Click checkout Button")
    public void clickCheckoutButton() {
        checkoutPage.getCheckout().click();
    }

    @Then("Click Continue Button")
    public void click_continue_button() {
        checkoutPage.getContinue().click();
    }

    @Given("the checkout Step2 page is opened")
    public void the_checkout_step2_page_is_opened() {
    checkoutStep2Page.openPage();
    }
    @Then("Click Finish button")
    public void click_finish_button() {
    checkoutStep2Page.getFinish().click();
    }
}
