package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.TodoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void shouldBeِAbleToLoginWithEmailAndPassword(){

        LoginPage loginPage=new LoginPage(driver);
        TodoPage todoPage=new TodoPage(driver);

        loginPage.login("hatem@example.com","Test1234");
        boolean isWelcomeDisplayed=todoPage.isWelcomeMessageDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);


    }
}
