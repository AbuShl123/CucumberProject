package com.abu.step_definitions;

import com.abu.pages.WikiHomePage;
import com.abu.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiSearch_StepDef {
    WikiHomePage wikiHomePage = new WikiHomePage();

    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().navigate().to("https://www.wikipedia.org/");
    }

    @When("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        wikiHomePage.searchBox.sendKeys(string);
    }

    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        // Write code here that turns the phrase above into concrete actions
        wikiHomePage.searchButton.click();
    }

    @Then("user sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String string) {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title, title.startsWith(string));
    }
}
