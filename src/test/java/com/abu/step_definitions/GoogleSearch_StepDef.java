package com.abu.step_definitions;

import com.abu.pages.GoogleSearchPage;
import com.abu.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import static org.junit.Assert.*;

public class GoogleSearch_StepDef {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().navigate().to("https://www.google.com");
    }

    @When("user types apple in the google search box and clicks on enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_on_enter() {
        googleSearchPage.searchBox.sendKeys("apple", Keys.ENTER);
    }

    @Then("user sees apple - Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {
        assertEquals("title verification is failed", "apple - Google Search", Driver.getDriver().getTitle());
    }

    @When("user types {string} in the google search box and clicks on enter")
    public void user_types_in_the_google_search_box_and_clicks_on_enter(String string) {
        googleSearchPage.searchBox.sendKeys(string, Keys.ENTER);
    }

    @Then("user sees {string} is in the google title")
    public void user_sees_is_in_the_google_title(String string) {
        assertEquals("title verification is failed", string, Driver.getDriver().getTitle());
    }
}