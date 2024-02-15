package com.demoWebShop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingHelper extends BaseHelper {
    public ShoppingHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnShoppingCartButton() {
        click(By.xpath("//span[.='Shopping cart']"));
    }

    public void clickOnAddToCartButton() {
        click(By.cssSelector(".item-box:nth-child(3) .button-2"));
    }

    public boolean addProduct(String text) {
        List<WebElement> product = ApplicationManager.driver.findElements(By.cssSelector(".product-name"));
        for (WebElement element : product) {
            if (element.getText().contains(text))
                return true;
        }
        return false;
    }
}
