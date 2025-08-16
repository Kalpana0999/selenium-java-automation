package com.delta.kalpana.seleniumconcepts.assignments.assignment22.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStoreApplicationLoginPage {

    WebDriver driver;
    PageActions pageActions = new PageActions();

    By lnkLogin = By.xpath("//span[text()='Login']");
    By txtUserName = By.id("userName");
    By txtPassword = By.id("password");
    By btnLogin = By.id("login");

    public BookStoreApplicationLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToBookStoreApp(String user, String pass) {
        pageActions.clickOnElementUsingJSExecutor(driver,lnkLogin);
        pageActions.enterTxtValue(driver,txtUserName,user);
        pageActions.enterTxtValue(driver,txtPassword,pass);
        pageActions.clickOnElement(driver,btnLogin);

    }
}
