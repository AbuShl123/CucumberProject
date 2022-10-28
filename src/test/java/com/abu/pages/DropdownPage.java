package com.abu.pages;

import com.abu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    public DropdownPage(){
        PageFactory.initElements(Driver.getDriver(),  this);
    }

    @FindBy (css = "select#month")
    public WebElement month_select;
}
