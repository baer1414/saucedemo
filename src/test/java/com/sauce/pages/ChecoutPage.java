package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChecoutPage extends BasePage{

    @FindBy(css = "#first-name")
    public WebElement firstname;

    @FindBy(css = "#last-name")
    public WebElement lastname;

    @FindBy(css = "#postal-code")
    public WebElement postalCode;

    @FindBy(css = "#continue")
    public WebElement continueBtn;

    @FindBy(css = "#finish")
    public WebElement finishBtn;

    @FindBy(css = ".header_secondary_container")
    public WebElement CheckoutCompletemsn;
}
