package com.ait.qa30.demoWebShopTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {
    static WebDriver driver;

    public static void type(By locator, String text) {
        TestBase.click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public static void click(By locator) {
        driver.findElement(locator).click();
    }

    //@BeforeMethod
    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;
    }
    public boolean isAlertPresent() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            return false;
        }else {
            alert.accept();
            return true;
        }
    }


    //@AfterMethod(enabled = true)
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}

















