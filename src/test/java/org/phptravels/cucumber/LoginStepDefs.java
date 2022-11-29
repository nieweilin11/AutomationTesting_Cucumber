package org.phptravels.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class LoginStepDefs extends AbstractStepDefs {


    @Given("the home page is opened")
    public void the_home_page_is_opened() {
        homePage.openPage();
    }

    @Given("fill in the {string} and {string} address")
    public void fill_in_the_and_address(String username, String password) {
        homePage.getUserNameField().sendKeys(username);
        homePage.getPasswordField().sendKeys(password);
    }

    @When("click the Login button")
    public void clickTheLoginButton(){
        homePage.getLoginButton().click();
    }

    @Then("the {string} error message is shown out")
    public void theErrorMassageShows(String feedBack){
        Optional<String> errorMessage = homePage.getLoginError();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(feedBack, errorMessage.get());
        } else {
            fail();
        }
    }


}
