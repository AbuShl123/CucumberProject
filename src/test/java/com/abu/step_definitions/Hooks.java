package com.abu.step_definitions;

import com.abu.utilities.Driver;
import com.abu.utilities.BrowserUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUpScenario(){
        System.out.println("Setting up browser using cucumber before");
    }

    @After
    public void tearDownScenario(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        BrowserUtils.sleep(1);
        Driver.closeDriver();
    }
}
