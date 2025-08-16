package com.delta.kalpana.seleniumconcepts.multiplebrowsersconcept.pom1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/*
        In this passing browser name as parameter to method verifyLogin() and run in TestClass
 */

public class TestMultipleBrowsers {
    WebDriver driver;

    @Test
    public void runOnMultipleBrowsers() {
        MultipleBrowsersPage mb = new MultipleBrowsersPage(driver);
        mb.verifyLogin("chrome");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
