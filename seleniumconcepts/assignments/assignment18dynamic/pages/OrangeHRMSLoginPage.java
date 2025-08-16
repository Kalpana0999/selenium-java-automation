package com.delta.kalpana.seleniumconcepts.assignments.assignment18dynamic.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMSLoginPage {
    WebDriver driver;

    PageActions pageActions = new PageActions();
    By txtUser = By.name("username");
    By txtPass = By.name("password");
    By btnLogin = By.xpath("//button[@type='submit']");

    public OrangeHRMSLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToApplication(String user, String pass) {
            pageActions.enterTxtValue(driver,txtUser,user);
            pageActions.enterTxtValue(driver,txtPass,pass);
            pageActions.clickOnElement(driver,btnLogin);
    }
}
