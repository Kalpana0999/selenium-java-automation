package com.delta.kalpana.seleniumconcepts.assignments.assignment15.testscripts;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseClass {
    WebDriver driver;

    @BeforeMethod
    public void initBrowser() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
       // driver.get("https://magento.softwaretestingboard.com/");

        PageActions pageActions = new PageActions();
        pageActions.GoToWebsite(driver,"ass15.url");
    }

   // @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
