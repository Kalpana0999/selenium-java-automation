package com.delta.kalpana.seleniumconcepts.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
    Assignment No 5:
        Write a script to verify the Login functionality
            Website Link: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
            Enter Username
            Enter Password
            Click on Login
            Verify if the user is logged in or not
 */

public class Assignment5 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(1000);
        WebElement user = driver.findElement(By.name("username"));
        user.sendKeys("Admin");

        Thread.sleep(1000);
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("admin123");

        Thread.sleep((1000));
        WebElement login = driver.findElement(By.xpath("//button"));
        login.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "OrangeHRM";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Case is Pass");
        } else {
            System.out.println("Test Case is Fail");
        }

        Thread.sleep(2000);
        driver.close();
    }
}
