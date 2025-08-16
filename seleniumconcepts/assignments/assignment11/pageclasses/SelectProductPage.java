package com.delta.kalpana.seleniumconcepts.assignments.assignment11.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectProductPage {
    WebDriver driver;

    public SelectProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectProduct(String productName) throws InterruptedException {
        WebElement btnAddToCart = driver.findElement(By.xpath("//div[text()='" + productName + "']/following::button[1]"));
        btnAddToCart.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a/span")).click();
    }
}
