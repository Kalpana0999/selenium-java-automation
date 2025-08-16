package com.delta.kalpana.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumScripGetURL {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\chrome_driver\\chromedriver.exe");

        // 1) Open Chrome Browser
        ChromeDriver driver = new ChromeDriver();

        // 2) Enter URL
        driver.get("https://www.google.com/");

        // To maximize window
        driver.manage().window().maximize();

        // 3) Get the current website URL
        String actualUrl = driver.getCurrentUrl();
        System.out.println("URL of the Webpage : " + actualUrl);

        String expectedUrl = "https://www.google.com/";

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Test Case is Pass");
        } else {
            System.out.println("Test Case is Fail");
        }
        driver.close();
    }
}
