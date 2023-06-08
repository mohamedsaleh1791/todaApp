package com.qacart.todo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="[data-testid=\"email\"]")
    WebElement emailInput;
    @FindBy(css="[data-testid=\"password\"]")
    WebElement passwordInput;
    @FindBy(css="[data-testid=\"submit\"]")
    WebElement submitButton;



    public void login(String email,String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submitButton.click();
    }

}
