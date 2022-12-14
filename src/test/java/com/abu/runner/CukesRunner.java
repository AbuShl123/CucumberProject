package com.abu.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun-tests.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber/cucumber.json"
        },
        features = "src/test/resources/Features", // features mean -> location of 'Features' folder
        glue = "com/abu/step_definitions", // glue means -> step definitions
        dryRun = false,
        tags = "@regression",
        publish = true
)


public class CukesRunner {
}



