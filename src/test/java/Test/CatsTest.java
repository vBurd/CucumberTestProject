package Test;

import config.BaseAbstract;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CatsTest extends BaseAbstract {

    @Given("I have a cat")
    public void iHaveACat() {
       BaseAbstract.logger.info("I have a cat");
    }

    @And("bla bla")
    public void blaBla() {
        BaseAbstract.logger.info("=============");
    }

    @When("^My cat havn't name$")
    public void myCatHavnTName() {
        BaseAbstract.logger.info("Me cat havn't name");
    }

    @Then("^I create the name for my cat$")
    public void iCreateTheNameForMyCat() {
        BaseAbstract.logger.info("Cat got name Tima !");
    }
}
