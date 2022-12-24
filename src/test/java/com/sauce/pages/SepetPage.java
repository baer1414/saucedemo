package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SepetPage extends BasePage {


    @FindBy(css = ".header_secondary_container")
    public WebElement yourCard;

    @FindBy(css = "#checkout")
    public WebElement checkoutBtn;
}
