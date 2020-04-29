package uk.co.barclays.cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.barclays.pages.HomePage;

public class MyStepdefs {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {

    }

    @When("^I Click on Bank tab$")
    public void iClickOnBankTab() {
        new HomePage().clickonBankBtn();

    }

    @And("^I click on switch to bank account$")
    public void iClickOnSwitchToBankAccount() {
        new HomePage().clickonSwithAccountLink();
    }

}
