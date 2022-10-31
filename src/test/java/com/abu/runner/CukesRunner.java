package com.abu.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun-tests.txt"
        },
        features = "src/test/resources/Features", // features mean -> location of 'Features' folder
        glue = "com/abu/step_definitions", // glue means -> step definitions
        dryRun = false,
        tags = "@templateVersion"
)


public class CukesRunner {
}
