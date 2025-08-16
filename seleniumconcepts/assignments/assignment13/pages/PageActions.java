package com.delta.kalpana.seleniumconcepts.assignments.assignment13.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageActions {

    public void enterSourceDestination(WebDriver driver, By locator, String value) throws InterruptedException {
        WebElement element = driver.findElement(locator);
        element.sendKeys(value);
        element.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        element.sendKeys(Keys.ENTER);
    }

    public void clickOnButton(WebDriver driver, By locator) throws InterruptedException {
        WebElement element = driver.findElement(locator);
        Thread.sleep(1000);
        element.click();
    }
}

