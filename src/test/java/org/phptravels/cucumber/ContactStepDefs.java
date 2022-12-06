package org.phptravels.cucumber;

import io.cucumber.java.en.Then;

public class ContactStepDefs extends AbstractStepDefs {

    @Then("Click the facebook icon")
    public void click_the_facebook_icon() {
        itemPage.getFacebook().click();
    }

    @Then("Click the linkedin icon")
    public void click_the_linkedin_icon() {
    itemPage.getLinkedin().click();
    }

    @Then("Click twitch icon")
    public void click_twitch_icon() {
    itemPage.getTwitch().click();
    }

    @Then("Click aboutUs icon")
    public void click_about_us_icon() {
    itemPage.getAboutUs().click();
    }
}
