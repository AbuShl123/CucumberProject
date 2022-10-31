package com.abu.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "@target/rerun-tests.txt",
        glue = "com/abu/step_definitions"
)
public class FailedTestRunner {
}
