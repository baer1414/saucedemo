package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//span[text()='Products']")
    public WebElement product;

    @FindBy (xpath = "//button[starts-with(@name,'add-to-cart')]")
    public List<WebElement> addToChartItems;

    @FindBy(xpath = "(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")
    public WebElement Enpahalıbtn;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    public WebElement Enucuzbtn;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public  WebElement sepetbtn;







}
