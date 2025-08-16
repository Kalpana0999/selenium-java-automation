package com.delta.kalpana.seleniumconcepts.assignments.assignment11.pageclasses;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToApplication(String userName, String password) {

        //Login related
        WebElement txtUserName = driver.findElement(By.id("user-name"));
        txtUserName.sendKeys(userName);

        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click();
    }
}
