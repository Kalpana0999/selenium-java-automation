package com.delta.kalpana.seleniumconcepts.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

/*
    Assignment No 3:
           Write a script to verify the URL of the application using Firefox browser
           Website: Makemytrip
 */

public class Assignment3 {

    public static void main(String[] args) throws InterruptedException {

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path : " + projectPath);
        System.setProperty("webdriver.gecko.driver", projectPath + "\\src\\main\\resources\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        String actualUrl = driver.getCurrentUrl();
        System.out.println("The URL of Website is : " + actualUrl);

        String expectedUrl = "makemytrip";

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Test Case is Pass");
        } else {
            System.out.println("Test Case is Fail");
        }
        driver.close();
    }
}
