package com.ait.qa30.demoWebShopTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        if (!isElementPresent(By.cssSelector("[href='/login']"))){
            click(By.cssSelector(".header [href='/customer/info']"));
        }
        click(By.cssSelector("[href='/register']"));
        type(By.name("FirstName"), "Natalie");
        type(By.name("LastName"), "Demin");
        type(By.name("Email"), "talia76@gmail.com");
        type(By.name("Password"), "Qwert-12345");
        type(By.name("ConfirmPassword"), "Qwert-12345");

        click(By.cssSelector("[href='/login']"));
        type(By.name("Email"), "talia76@gmail.com");
        type(By.name("Password"), "Qwert-12345");
        click(By.xpath("//input[@value='Log in']"));
    }

    @Test
    public void newShoppingCartTests() {
        //click Add to cart button
        click(By.cssSelector(".item-box:nth-child(3) .button-2"));

        //click Shopping cart button
        click(By.xpath("//span[.='Shopping cart']"));

        Assert.assertTrue(isElementPresent(By.cssSelector("[class='product-name']")));



    }
}
