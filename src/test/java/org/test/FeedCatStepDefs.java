package org.test;
import com.tsi.wu.wentong.animal.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsTomHealth100{
    static String IsTomHealth100(int health){
        return health == 100 ? "Yes" : "No";
    }
}
public class FeedCatStepDefs {
    private int health;
    private String actualAnswer;
    Cat Tom = new Cat("Tom",100,true,true,10);

    @Given("Tom's health is 100")
    public void Tom_health_100(){
        health = Tom.getHealth();
    }
    @Given("Tom's health is not 100")
    public void Tom_health_not_100(){
        Tom.setHealth(50);
        health = Tom.getHealth();
    }
    @When("I ask if Tom has 100 health")
    public void i_ask_if_Tom_has_100_health(){
        actualAnswer = IsTomHealth100.IsTomHealth100(health);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer){
        assertEquals(expectedAnswer, actualAnswer);
    }
}
