package com.delta.kalpana.seleniumconcepts.assignments.assignment22.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddBookFromBookStore {
    WebDriver driver;
    PageActions pageActions = new PageActions();

    By btnGoToBookStore = By.xpath("//button[text()='Go To Book Store']");
    By lnkSpeakingJSBook = By.xpath("//a[text()='Speaking JavaScript']");
    By btnAddToYourCollection = By.xpath("//button[text()='Add To Your Collection']");
    By lnkProfile = By.xpath("//span[text()='Profile']");
    By lnkAddedBook = By.xpath("//span/a[text()='Speaking JavaScript']");
    public String actualBook, expectedBook;

    public AddBookFromBookStore(WebDriver driver) {
        this.driver = driver;
    }

    public void addBooksToCollection() {
        pageActions.elementToBeClickableState(driver,btnGoToBookStore);
        pageActions.clickOnElementUsingJSExecutor(driver,btnGoToBookStore);

        pageActions.elementToBeClickableState(driver,lnkSpeakingJSBook);
        pageActions.clickOnElementUsingJSExecutor(driver,lnkSpeakingJSBook);

        pageActions.elementToBeClickableState(driver,btnAddToYourCollection);
        pageActions.clickOnElementUsingJSExecutor(driver,btnAddToYourCollection);
        pageActions.handleAlertBox(driver);

        pageActions.elementToBeClickableState(driver,lnkProfile);
        pageActions.clickOnElementUsingJSExecutor(driver,lnkProfile);

        pageActions.elementToBeClickableState(driver,lnkAddedBook);
        WebElement lnkBook = driver.findElement(lnkAddedBook);
        actualBook = lnkBook.getText();
        System.out.println("Actually Added Book Is : "+actualBook);

        expectedBook = "Speaking JavaScript";
    }
}
