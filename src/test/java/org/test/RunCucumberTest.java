package org.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/cucumber",
        glue = "src/test/java/org/test/FeedCatStepDefs.java" )
public class RunCucumberTest {


}
