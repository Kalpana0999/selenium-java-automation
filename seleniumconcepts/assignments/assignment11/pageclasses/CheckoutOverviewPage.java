package com.delta.kalpana.seleniumconcepts.assignments.assignment11.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
    WebDriver driver;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkoutOverview() throws InterruptedException {

        driver.findElement(By.id("finish")).click();
    }
}
