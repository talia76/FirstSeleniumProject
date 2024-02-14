package com.ait.qa30.demoWebShopTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isHomeComponentPresent()) {
            click(By.cssSelector("[class='header']"));
        }
    }

    @Test
    public void isHomeComponentPresentTest(){
        //System.out.println("Home component is " + isHomeComponentPresent());
        Assert.assertTrue(isHomeComponentPresent());
    }
    public boolean isHomeComponentPresent(){
        return driver.findElements(By.cssSelector("div.header")).size()>0;
    }

}





























