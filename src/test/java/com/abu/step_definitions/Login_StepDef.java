package com.abu.step_definitions;

import com.abu.pages.LibraryLoginPage;
import com.abu.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDef {

    private final LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        Driver.getDriver().navigate().to("https://library1.cydeo.com/login.html");
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        libraryLoginPage.emailInput.sendKeys("hr2@gmail.com");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        libraryLoginPage.passInput.sendKeys("UserUser");
    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        libraryLoginPage.loginSubmitButton.click();
    }

    @When("user enters student's username")
    public void userEntersStudentSUsername() {
        libraryLoginPage.emailInput.sendKeys("student@gmail.com");
    }

    @And("user enters student's password")
    public void userEntersStudentSPassword() {
        libraryLoginPage.passInput.sendKeys("studentPassword123");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        libraryLoginPage.emailInput.sendKeys("adminUser@gmail.com");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        libraryLoginPage.passInput.sendKeys("admin01Password**");
    }
}
