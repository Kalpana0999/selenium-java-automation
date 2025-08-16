package com.delta.kalpana.seleniumconcepts.multiplebrowsersconcept.pom2;

import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
        1) In this passing browser name as parameter in assignment12.xml file I don't want to pass in TestClass
        2) Use @Parameters annotation of TestNG and Pass browserName as parameter to that annotation.
        3) Note : Parameter tag - name attribute value - and Parameters annotation value - will be same then and then only
        it would be worked.
        4) In this case every time you have to run script from .xml file only
        5) If you want to run script from TestClass then it will show error because parameter name is not get in
        script @Parameters annotation.. this will be sucessfully run only & only when .xml file is executed.after execution
        of .xml file parameter value passed to @Parameters annotation.
        6) If you want to run script from both TestClass as well as .xml file without interruption then you have to use one
        more attribute in method i.e @Optinal.
        7) When you use both @Parameters annotation and @Optional attribute in method then you may execute script from
        anywhere without interruption.
 */

public class TestMultipleBrowsers {

    WebDriver driver;

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Parameters({"browserName"})
    @Test
    public void verifyLogin(@Optional("chrome") String browserName) {

        System.out.println("Browser Name : " + browserName);
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement txtUserName = driver.findElement(By.id("user-name"));
        txtUserName.sendKeys("standard_user");

        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys("secret_sauce");

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click();
    }
}

