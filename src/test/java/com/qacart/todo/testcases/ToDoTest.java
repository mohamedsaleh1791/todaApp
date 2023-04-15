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

public class ToDoTest extends BaseTest {

    @Test
    public void shouldBeAbleToAddNewToDo(){


        driver.get("http://qacart-todo.herokuapp.com/login");
        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("hatem@example.com");
        driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Test1234");
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();

        driver.findElement(By.cssSelector("[data-testid=\"add\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"new-todo\"]")).sendKeys("Learn Selenium");
        driver.findElement(By.cssSelector("[data-testid=\"submit-newTask\"]")).click();
        String actualResult=driver.findElement(By.cssSelector("[data-testid=\"todo-item\"]")).getText();
        Assert.assertEquals(actualResult,"Learn Selenium");


    }
    @Test
    public void shouldBeAbleToBeDelete(){



        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("hatem@example.com");
        driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Test1234");
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();

        driver.findElement(By.cssSelector("[data-testid=\"add\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"new-todo\"]")).sendKeys("Learn Selenium");
        driver.findElement(By.cssSelector("[data-testid=\"submit-newTask\"]")).click();

        driver.findElement(By.cssSelector("[data-testid=\"delete\"]")).click();
        boolean noToDoDisplayed=driver.findElement(By.cssSelector("[data-testid=\"no-todos\"]")).isDisplayed();
        Assert.assertTrue(noToDoDisplayed);
    }
}
