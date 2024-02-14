package com.ait.qa30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DemoWebShopTest {

    WebDriver driver;

    @BeforeMethod
    public void setUP(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTagName() {
        // find list of element
        List<WebElement> elements = driver.findElements(By.tagName("h3"));
        System.out.println(elements.size());
        List<WebElement> elements1 = driver.findElements(By.tagName("font"));
        System.out.println(elements1.size());
    }

    @Test
    public void startLocatorsTest() {
        //id
        driver.findElement(By.id("bar-notification"));
        driver.findElement(By.className("bar-notification"));
    }

    @Test
    public void demoWebShopByCss(){
        driver.findElement(By.cssSelector("h3"));
        driver.findElement(By.cssSelector("a"));
        driver.findElement(By.cssSelector("li"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector(".bar-notification"));
        driver.findElement(By.cssSelector("[style='display: none']"));
        driver.findElement(By.cssSelector("[class='master-wrapper-page']"));
        //driver.findElement(By.cssSelector("[title='schließen']"));
    }

    @Test
    public void demoWebShopByXpath() {
        driver.findElement(By.xpath("//div[@id='bar-notification']"));
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']"));
        driver.findElement(By.xpath("//*[@class='bar-notification']"));
        driver.findElement(By.xpath("//h2[contains(.,'Welcome to our store')]"));
        driver.findElement(By.xpath("//*[contains(.,'to our store')]"));
        driver.findElement(By.xpath("//*[text()='Do you like nopCommerce?']"));
        driver.findElement(By.xpath("//*[.='Welcome to the new Tricentis store!']"));
    }
    
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}











