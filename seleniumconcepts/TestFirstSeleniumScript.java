package com.delta.kalpana.seleniumconcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstSeleniumScript {

    public static void main(String[] args) {

        // webdriver.chrome.driver - is a key have to specify it in setProperty static method
        System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\chrome_driver\\chromedriver.exe");

        // 1) Open Chrome Browser
        ChromeDriver driver = new ChromeDriver();

        // 2) Enter URL of website
        driver.get("https://www.saucedemo.com/");

        // 3) get title
        String actualTitle = driver.getTitle();   // Swag Labs
        String expectedTitle = "Swag Labs";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Case is Pass");
        } else {
            System.out.println("Test Case is Fail");
        }
        driver.close();
    }
}
