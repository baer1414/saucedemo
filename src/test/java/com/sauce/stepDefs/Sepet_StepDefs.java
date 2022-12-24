package com.sauce.stepDefs;

import com.sauce.pages.SepetPage;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Sepet_StepDefs {
SepetPage sepetPage=new SepetPage();
    @When("{string} görünüyormu")
    public void görünüyormu(String expected) {
        String actual=sepetPage.yourCard.getText();
        Assert.assertEquals(expected,actual);
    }
    @When("checkout tıkla")
    public void checkout_tıkla() {
        sepetPage.checkoutBtn.click();

    }
}
