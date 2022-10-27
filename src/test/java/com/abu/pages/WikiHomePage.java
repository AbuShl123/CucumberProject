package com.abu.pages;

import com.abu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiHomePage {
    public WikiHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "input#searchInput")
    public WebElement searchBox;

    @FindBy(css = "button[class='pure-button pure-button-primary-progressive']")
    public WebElement searchButton;
}
