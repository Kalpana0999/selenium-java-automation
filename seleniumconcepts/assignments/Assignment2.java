package com.delta.kalpana.seleniumconcepts.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
    Assignment - 2
        Write a script to verify the URL of the application
        Website: Makemytrip
 */
public class Assignment2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();

        String actualUrl = driver.getCurrentUrl();
        System.out.println("The URL of WebSit is : " + actualUrl);

        String expectedUrl = "makemytrip.com";

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Test Case is Pass");
        } else {
            System.out.println("Test Case is Fail");
        }

        Thread.sleep(1000);
        driver.close();
    }
}
