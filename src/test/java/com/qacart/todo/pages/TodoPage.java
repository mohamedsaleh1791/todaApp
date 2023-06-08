package com.qacart.todo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodoPage extends BasePage {

    public TodoPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="[data-testid=\"welcome\"]")
    WebElement welcomeMessage;

    @FindBy(css="[data-testid=\"add\"]")
    WebElement addButton;
    @FindBy(css="[data-testid=\"todo-item\"]")
    WebElement todoItem;
    @FindBy(css="[data-testid=\"delete\"]")
    WebElement deleteButton;

    @FindBy(css="[data-testid=\"no-todos\"]")
    WebElement noTodo;


    public boolean isWelcomeMessageDisplayed(){
        return welcomeMessage.isDisplayed();
    }
    public void clickOnAddButton(){
        addButton.click();
    }
    public void clickOnDeleteButton(){
        deleteButton.click();
    }
    public String checkTodoItem(){
        return todoItem.getText();
    }
    public boolean isTodoDisplayed(){
        return noTodo.isDisplayed();
    }

}
