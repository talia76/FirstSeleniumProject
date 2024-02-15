package com.demoWebShopTests;

import com.demoWebShop.models.Contact;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountTests extends TestBase {

    @BeforeMethod
      public void ensurePrecondition() {
        if (!app.getContact().isRegisterLinkPresent()){
            app.getUser().clickOnSignOutButton();
        }
    }
    @Test
    public void newAccountTest() {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegisterForm(new Contact()
                .setEmail("talia76@gmail.com")
                .setFirstname("Natalie")
                .setLastname("Demin")
                .setPassword("Qwert-12345")
                .setConfirmpassword("Qwert-12345"));
        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getContact().isRegisterLinkPresent());
    }
}














