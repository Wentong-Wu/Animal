package org.test;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import gherkin.ast.Feature;
import org.junit.runner.RunWith;
import java.awt.*;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/cucumber",
        glue = "src/test/java/org/test/FeedCatStepDefs.java" )
public class RunCucumberTest {
    
}
