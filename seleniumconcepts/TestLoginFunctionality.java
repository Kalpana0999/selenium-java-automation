package com.delta.kalpana.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginFunctionality {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        Thread.sleep(1000);
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        Thread.sleep(1000);
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Swag Labs";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Case is Pass");
        } else {
            System.out.println("Test Case id Fail");
        }
        driver.close();
    }
}
