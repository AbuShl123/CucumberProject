package com.abu.step_definitions;

import com.abu.pages.WebTableLoginPage;
import com.abu.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDef {
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the Web Table login page")
    public void user_is_on_the_web_table_login_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().navigate().to("https://web-table-2.cydeo.com/login");
    }

    @When("user enters the username {string}")
    public void user_enters_the_username(String string) {
        // Write code here that turns the phrase above into concrete actions
        webTableLoginPage.usernameInput.sendKeys(string);

    }

    @When("user enter password {string}")
    public void user_enter_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        webTableLoginPage.passwordInput.sendKeys(string);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions
        webTableLoginPage.submitButton.click();
    }

    @Then("user should see url contains {string}")
    public void user_should_see_url_contains(String string) {
        // Write code here that turns the phrase above into concrete actions
        String url = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(url.contains(string));
    }

    @When("user inputs username {string} and password {string} and logins")
    public void userInputsUsernameAndPasswordAndLogins(String username, String password) {
//        webTableLoginPage.usernameInput.sendKeys(username);
//        webTableLoginPage.passwordInput.sendKeys(password);
//        webTableLoginPage.submitButton.click();

        webTableLoginPage.login(username, password);
    }
}
