package com.abu.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUpScenario(){
        System.out.println("Setting up browser using cucumber before");
    }

    @After
    public void tearDownScenario(){
        System.out.println("It will close browser using cucumber after");
    }
}
