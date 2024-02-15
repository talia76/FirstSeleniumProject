package com.demoWebShopTests;

import com.demoWebShop.models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        if (app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnLoginButton();
        }
        app.getContact().clickOnLoginLink();
        app.getContact().fillReturningCustomerForm(new User()
                .setEmail("talia76@gmail.com")
                .setPassword("Qwert-12345"));
        app.getContact().clickOnLoginLinkReturningCustomerForm();
    }
    @Test
    public void newShoppingCartTests() {
        app.getShopping().clickOnAddToCartButton();
        app.getShopping().clickOnShoppingCartButton();
    }
}


