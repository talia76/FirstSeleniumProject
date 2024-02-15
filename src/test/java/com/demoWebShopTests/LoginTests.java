package com.demoWebShopTests;

import com.demoWebShop.models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        if (app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLoginButton();
        }
    }
    @Test
    public void loginPositiveTest() {
        app.getContact().clickOnLoginLink();
        app.getContact().fillReturningCustomerForm(new User()
                .setEmail("talia76@gmail.com")
                .setPassword("Qwert-12345"));
        app.getContact().clickOnLoginLinkReturningCustomerForm();
        Assert.assertTrue(app.getContact().isElementPresent(By.cssSelector(".header [href='/customer/info']")));
    }
    /*@Test
    public void loginNegativeTestWithoutEmail() {
        clickOnLoginLink();
        fillReturningCustomerForm(new User().setPassword("Qwert-12345"));
        clickOnLoginLinkReturningCustomerForm();
        Assert.assertTrue(isAlertPresent());
        //Assert.assertTrue(isAlertPresent(By.cssSelector(".header [href='/customer/info']")));
         }*/
}











