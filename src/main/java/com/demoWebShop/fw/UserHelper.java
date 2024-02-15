package com.demoWebShop.fw;

import com.demoWebShop.models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnSignOutButton() {
        click(By.cssSelector("[href='/logout']"));
    }

    public void clickOnRegisterButton() {
        click(By.xpath("//input[@id='register-button']"));
    }

    public void fillRegisterForm(Contact contact) {
        type(By.name("FirstName"), contact.getFirstname());
        type(By.name("LastName"), contact.getLastname());
        type(By.name("Email"), contact.getEmail());
        type(By.name("Password"), contact.getPassword());
        type(By.name("ConfirmPassword"), contact.getConfirmpassword());
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }

    public void clickOnLoginButton() {
        click(By.cssSelector("[class='button-1 login-button']"));
    }

    public boolean isLoginLinkPresent() {
        return !isElementPresent(By.cssSelector("[href='/login']"));
    }
}
