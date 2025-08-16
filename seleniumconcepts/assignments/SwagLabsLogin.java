package com.delta.kalpana.seleniumconcepts.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwagLabsLogin {

    public void loginToSwagLabs(WebDriver driver) {

        // Login related
        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    }
}
