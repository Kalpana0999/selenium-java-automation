package com.delta.kalpana.seleniumconcepts.assignments.assignment11.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FinishPage {
    WebDriver driver;
    public static WebElement lblActualMsg;

    public FinishPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkoutFinish() throws InterruptedException {
        lblActualMsg = driver.findElement(By.xpath("//h2[@class='complete-header']"));
    }
}
