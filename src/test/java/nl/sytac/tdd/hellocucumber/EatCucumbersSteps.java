package nl.sytac.tdd.hellocucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EatCucumbersSteps {
    @Given("^I have (\\d+) cukes$")
    public void i_have_cukes(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I am hungry$")
    public void i_am_hungry() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I eat (\\d+) cucumbers$")
    public void i_eat_cucumbers(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should have (\\d+) cukes left$")
    public void i_should_have_cukes_left(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should not be hungry anymore$")
    public void i_should_not_be_hungry_anymore() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
