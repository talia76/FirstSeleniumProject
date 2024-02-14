package com.ait.qa30.demoWebShopTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

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
    }

    @Test
    public void newLoginTest() {
        //click on login
        click(By.cssSelector("[href='/login']"));

        //enter Email
        type(By.name("Email"), "talia76@gmail.com");

        //enter Password
        type(By.name("Password"), "Qwert-12345");

        //enter Log in
        click(By.xpath("//input[@value='Log in']"));

        Assert.assertTrue(isElementPresent(By.cssSelector(".header [href='/customer/info']")));
    }
}











