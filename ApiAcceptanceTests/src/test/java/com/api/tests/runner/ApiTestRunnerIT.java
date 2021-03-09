package com.api.tests.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@feature",
        glue = "com.api.tests.stepdefs",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class ApiTestRunnerIT {
}
