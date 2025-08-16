package com.delta.kalpana.seleniumconcepts.assignments.assignment11.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {
    WebDriver driver;

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() throws InterruptedException {
        driver.findElement(By.id("checkout")).click();
    }
}
