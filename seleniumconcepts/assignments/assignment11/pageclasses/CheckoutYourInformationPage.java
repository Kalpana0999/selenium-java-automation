package com.delta.kalpana.seleniumconcepts.assignments.assignment11.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutYourInformationPage {
    WebDriver driver;

    public CheckoutYourInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkoutYourInformation(String firstName, String lastName, String postalCode) throws InterruptedException {

        WebElement txtFirstName = driver.findElement(By.id("first-name"));
        txtFirstName.sendKeys(firstName);

        WebElement txtLastName = driver.findElement(By.id("last-name"));
        txtLastName.sendKeys(lastName);

        WebElement txtPostalCode = driver.findElement(By.id("postal-code"));
        txtPostalCode.sendKeys(postalCode);

        WebElement btnContinue = driver.findElement(By.id("continue"));
        btnContinue.click();
    }
}
