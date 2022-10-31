package com.abu.step_definitions;

import com.abu.pages.OrderPage;
import com.abu.pages.WebTableLoginPage;
import com.abu.utilities.ConfigurationReader;
import com.abu.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OrderFeature_StepDef {
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    OrderPage orderPage = new OrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("web"));
        webTableLoginPage.login(ConfigurationReader.getProperty("username"),
                                ConfigurationReader.getProperty("password"));

        orderPage.orderPageButton.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select productTypes = new Select(orderPage.selectProductType);
        productTypes.selectByValue(string);
    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(int int1) {
        orderPage.quantityButton.sendKeys(String.valueOf(int1));
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        orderPage.customerName.sendKeys(string);
    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {
        orderPage.streetInput.sendKeys(string);
    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPage.cityInput.sendKeys(string);
    }

    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderPage.stateInput.sendKeys(string);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        orderPage.zipInput.sendKeys(string);
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
        for (WebElement visaType : orderPage.visaTypes) {
            if (visaType.getText().equalsIgnoreCase(string)) {
                visaType.click(); break;
            }
        }
    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        orderPage.cardNo.sendKeys(string);
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date_and_user_enters_process_order_button(String string) {
          orderPage.cardExp.sendKeys(string);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        orderPage.processOrderButton.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {
        Assert.assertEquals(string, orderPage.firstRow.getText());
    }
}
