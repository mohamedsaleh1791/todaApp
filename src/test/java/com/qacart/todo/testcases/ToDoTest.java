package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.NewTodoPage;
import com.qacart.todo.pages.TodoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToDoTest extends BaseTest {

    @Test
    public void shouldBeAbleToAddNewToDo(){



        LoginPage loginPage=new LoginPage(driver);
        TodoPage todoPage=new TodoPage(driver);
        loginPage.login("hatem@example.com","Test1234");
        todoPage.clickOnAddButton();

//        new todo page
        NewTodoPage newTodoPage=new NewTodoPage(driver);

        newTodoPage.addNewTodo("Learn Selenium");


        String actualResult=todoPage.checkTodoItem();
        Assert.assertEquals(actualResult,"Learn Selenium");


    }
    @Test(enabled = false)
    public void shouldBeAbleToBeDelete(){



        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("hatem@example.com","Test1234");
        TodoPage todoPage=new TodoPage(driver);
        todoPage.clickOnAddButton();
//        new todo page
        NewTodoPage newTodoPage=new NewTodoPage(driver);

        newTodoPage.addNewTodo("Learn Selenium");



        todoPage.clickOnDeleteButton();
        boolean noToDoDisplayed=todoPage.isTodoDisplayed();
        Assert.assertTrue(noToDoDisplayed);
    }
}
