package com.qacart.todo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTodoPage extends BasePage {
    public NewTodoPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="[data-testid=\"new-todo\"]")
    WebElement newTodoInput;
    @FindBy(css="[data-testid=\"submit-newTask\"]")
    WebElement newTodoSubmit;



    public void addNewTodo(String todoName){
        newTodoInput.sendKeys(todoName);
        newTodoSubmit.click();
    }

}
