package com.ait.qa30.demoWebShopTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountTests extends TestBase {

    @BeforeMethod
      public void ensurePrecondition() {
        if (!isElementPresent(By.cssSelector("[href='/register']"))){
            click(By.cssSelector("[href='/logout']"));
            //click(By.cssSelector(".header [href='/customer/info']"));
        }
    }
    @Test
    public void newAccountPositiveTest() {
        //click on Register
        click(By.cssSelector("[href='/register']"));

        //enter Gender:
        //click(By.cssSelector("div:nth-child(5)"));

        //enter First name:
        type(By.name("FirstName"), "Natalie");

        //enter Last name:
        type(By.name("LastName"), "Demin");

        //enter Email:
        type(By.name("Email"), "talia76@gmail.com");

        //enter Password:
        type(By.name("Password"), "Qwert-12345");

        //enter Confirm password:
        type(By.name("ConfirmPassword"), "Qwert-12345");

        //enter Register button
        click(By.xpath("//input[@id='register-button']"));

        //assert
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/register']")));
    }

}















