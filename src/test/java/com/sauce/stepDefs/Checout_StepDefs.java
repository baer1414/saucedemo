package com.sauce.stepDefs;

import com.sauce.pages.ChecoutPage;
import com.sauce.utilities.BrowserUtilies;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class Checout_StepDefs {
ChecoutPage checoutPage=new ChecoutPage();
    @When("checout sayfasında first name {string}, last name {string} and postal code {string} yaz")
    public void checout_sayfasında_first_name_last_name_and_postal_code_yaz(String firstnameinfo, String lastnameinfo, String postalcode) {
     checoutPage.firstname.sendKeys(firstnameinfo);
     checoutPage.lastname.sendKeys(lastnameinfo);
     checoutPage.postalCode.sendKeys(postalcode);
     checoutPage.continueBtn.click();
    }
    @Then("alışverisi tamamla")
    public void alışverisi_tamamla() {
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) Driver.get();
        javascriptExecutor.executeScript("window.scrollBy(0,500)");
        BrowserUtilies.waitFor(2);
        checoutPage.finishBtn.click();
        BrowserUtilies.waitFor(3);
        javascriptExecutor.executeScript("window.scrollBy(0,-500)");
        BrowserUtilies.waitFor(3);

    }

    @Then("{string} doğrula")
    public void doğrula(String excepted) {
        String actual=checoutPage.CheckoutCompletemsn.getText();
        Assert.assertEquals(actual,excepted);
    }
}
