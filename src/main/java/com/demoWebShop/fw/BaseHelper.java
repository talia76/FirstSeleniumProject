package com.demoWebShop.fw;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseHelper {
    WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void type(By locator, String text) {
        if (text != null) {
            click(locator);
            ApplicationManager.driver.findElement(locator).clear();
            ApplicationManager.driver.findElement(locator).sendKeys(text);
        }
    }

    public void click(By locator) {
        ApplicationManager.driver.findElement(locator).click();
    }

    public boolean isElementPresent(By locator) {
        return ApplicationManager.driver.findElements(locator).size()>0;
    }

    public boolean isAlertPresent(By by) {
        Alert alert = new WebDriverWait(ApplicationManager.driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            return false;
        }else {
            alert.accept();
            return true;
        }
    }
}
