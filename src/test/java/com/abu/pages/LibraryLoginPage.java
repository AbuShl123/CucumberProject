package com.abu.pages;

import com.abu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "input#inputEmail")
    WebElement emailInput;

    @FindBy (css = "input#inputPassword")
    WebElement passInput;

    @FindBy (xpath = "//button")
    WebElement loginSubmitButton;
}
