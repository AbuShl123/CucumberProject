package com.abu.step_definitions;

import com.abu.pages.DropdownPage;
import com.abu.utilities.BrowserUtils;
import com.abu.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dropdown_StepDef {
    DropdownPage dropdownPage = new DropdownPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().navigate().to("https://practice.cydeo.com/dropdown");
    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> months) {
        Select select = new Select(dropdownPage.month_select);
        List<String> actualMonths = BrowserUtils.getTextsOf(select);
        Assert.assertEquals(months, actualMonths);
    }
}
