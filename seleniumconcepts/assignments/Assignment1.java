package com.delta.kalpana.seleniumconcepts.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
    Assignment No 1:
        Write a script to verify the title of the application
        Steps to Automate:
                Open Browser
                Enter URL : https://www.makemytrip.com/
                Get the title and verify
 */

public class Assignment1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        // System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\chrome_driver\\chromedriver.exe");

        // OR

        /* String projectPath = System.getProperty("user.dir");
           System.out.println("Project Path : " +projectPath);
           System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\main\\resources\\chromedriver.exe");
         */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        String expectedTitle = "MakeMyTrip";

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test Case is Pass");
        } else {
            System.out.println("Test Case is Fail");
        }

        Thread.sleep(1000);
        driver.close();
    }
}
