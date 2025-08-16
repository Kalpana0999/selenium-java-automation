package com.delta.kalpana.seleniumconcepts.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
    Assignment No 7:
            Write a script to verify the login and logout functionalities
            Website Link: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
                Steps:
                    1) Login using given credentials
                    2) Check if user is logged in or not
                    3) Click on User profile from top right corner
                    4) Click on Logout button
    Expected Result: User should be logged out from the application and redirect to the login page again.
 */
public class Assignment7 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();  // setup chromedriver independently

        WebDriver driver = new ChromeDriver();  // Created instance of ChromeDriver using WebDriver Interface reference

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
        driver.manage().window().maximize();

        // 1) Login using given credentials

        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        // 2) Check if user is logged in or not
        // Testing Part
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Thread.sleep(2000);

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("User is Logged In");
        } else {
            System.out.println("User is not Logged In");
        }

        // 3) Click on User profile from top right corner
        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")).click();

        // 4) Click on Logout button
        driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();

        // Testing Part
        String actualUrl1 = driver.getCurrentUrl();
        String expectedUrl1 = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        Thread.sleep(2000);

        if (expectedUrl1.equals(actualUrl1)) {
            System.out.println("Test Scenario is Passed");
        } else {
            System.out.println("Test Scenario is Failed");
        }
        driver.close();
    }
}
