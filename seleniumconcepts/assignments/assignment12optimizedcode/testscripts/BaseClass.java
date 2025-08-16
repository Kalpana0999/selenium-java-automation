package com.delta.kalpana.seleniumconcepts.assignments.assignment12optimizedcode.testscripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    WebDriver driver;

    @BeforeMethod
    public void initBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://emicalculator.net/");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
