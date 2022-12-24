package com.sauce.stepDefs;

import com.sauce.pages.ProductPage;
import com.sauce.utilities.BrowserUtilies;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Purchase_StepDefs {
    ProductPage productPage=new ProductPage();
    @When("The user should be able to sort the product {string}")
    public void the_user_should_be_able_to_sort_the_product(String string) {
        System.out.println("productPage.product.getText() = " + productPage.product.getText());
    }


    @And("en pahalı sepete at")
    public void enPahalıSepeteAt() {
        productPage.Enpahalıbtn.click();
    }

    @And("ec ucuz ürünü sepete at")
    public void ecUcuzÜrünüSepeteAt() {
       // JavascriptExecutor javascriptExecutor=(JavascriptExecutor) Driver.get();
        //javascriptExecutor.executeScript("window.scrollBy(0,500)");
        BrowserUtilies.waitFor(2);
         productPage.Enucuzbtn.click();

      //  javascriptExecutor.executeScript("window.scrollBy(0,-500)");
        BrowserUtilies.waitFor(2);
    }

    @And("sepete tıkla")
    public void sepeteTıkla() {
        productPage.sepetbtn.click();
        BrowserUtilies.waitFor(3);
    }
}
