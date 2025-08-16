package com.delta.kalpana.seleniumconcepts.assignments.assignment22.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStoreApplicationPage {
    WebDriver driver;

    PageActions pageActions = new PageActions();
    By lnkBookStoreApplication = By.xpath("//h5[text()='Book Store Application']");


    public BookStoreApplicationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToBookStoreApplication() {
        pageActions.clickOnElementUsingJSExecutor(driver,lnkBookStoreApplication);
    }
}
