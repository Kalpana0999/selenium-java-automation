package com.delta.kalpana.seleniumconcepts.assignments.assignment22.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAddedBook {

    WebDriver driver;

    PageActions pageActions = new PageActions();

    By btnDeleteBook = By.xpath("//button[text()='Delete All Books']");
    By btnOk = By.xpath("//button[text()='OK']");

    public DeleteAddedBook(WebDriver driver) {
        this.driver = driver;
    }

    public void deleteBook() {
        pageActions.elementToBeClickableState(driver,btnDeleteBook);
        pageActions.clickOnElementUsingJSExecutor(driver,btnDeleteBook);

        pageActions.elementToBeClickableState(driver,btnOk);
        pageActions.clickOnElementUsingJSExecutor(driver,btnOk);

        pageActions.handleAlertBox(driver);
    }
}
