package com.abu.pages;

import com.abu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    public WebTableLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@name='username']")
    public WebElement usernameInput;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy (tagName = "button")
    public WebElement submitButton;


    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }
}

