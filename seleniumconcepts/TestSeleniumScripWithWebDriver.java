package com.delta.kalpana.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumScripWithWebDriver {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\chrome_driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        String actualUrl = driver.getCurrentUrl();
        System.out.println("The URL of Web Page is : " + actualUrl);

        String expectedUrl = "google.com/";

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Test Case is Pass");
        } else {
            System.out.println("Test Case is Fail");
        }
        driver.close();
    }
}
