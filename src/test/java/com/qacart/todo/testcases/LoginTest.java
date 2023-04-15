package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void shouldBeِAbleToLoginWithEmailAndPassword(){


        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("hatem@example.com");
        driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Test1234");
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        boolean isWelcomeDisplayed=driver.findElement(By.cssSelector("[data-testid=\"welcome\"]")).isDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);
        driver.quit();

    }
}
