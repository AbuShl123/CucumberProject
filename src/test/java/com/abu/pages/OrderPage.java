package com.abu.pages;

import com.abu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage {

    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[.='Order']")
    public WebElement orderPageButton;

    @FindBy (css = "select[name='product']")
    public WebElement selectProductType;

    @FindBy (css = "input[name='quantity']")
    public WebElement quantityButton;

    @FindBy (css = "input[name='name']")
    public WebElement customerName;

    @FindBy (css = "input[name='street']")
    public WebElement streetInput;

    @FindBy (css = "input[name='city']")
    public WebElement cityInput;

    @FindBy (css = "input[name='state']")
    public WebElement stateInput;

    @FindBy (css = "input[name='zip']")
    public WebElement zipInput;

    @FindBy (css = "label[class='radio']")
    public List<WebElement> visaTypes;

    @FindBy (css = "input[name='cardNo']")
    public WebElement cardNo;

    @FindBy (css = "input[name='cardExp']")
    public WebElement cardExp;

    @FindBy (css = "button[type='submit']")
    public WebElement processOrderButton;

    @FindBy (xpath = "//table//tr[1]/td[1]")
    public WebElement firstRow;
}

