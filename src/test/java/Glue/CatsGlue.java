package Glue;

import cucumber.api.java8.En;

public class CatsGlue implements En {

    public CatsGlue() {

        Given("^I have a cat$", () -> {
            System.out.println("I have a cat !");
        });
        When("^My cat havn't name$", () -> {
            System.out.println("Me cat havn't name");
        });
        Then("^I create the name for my cat$", () -> {
            System.out.println("My name is Tima !");
        });
        And("^bla bla$", () -> {
            System.out.println("=======================");
        });
    }
}
