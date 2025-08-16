package com.delta.kalpana.seleniumconcepts.assignments.assignment11.testclass;

import com.delta.kalpana.seleniumconcepts.assignments.assignment11.pageclasses.*;
import com.delta.kalpana.seleniumconcepts.assignments.assignment11.pageclasses.SelectProductPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSwagLabsCheckoutOrder {
    WebDriver driver;

    @BeforeMethod
    public void initBrowser() {
        // Browser Initialization
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void checkoutOrder() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication("standard_user", "secret_sauce");

        SelectProductPage selectProduct = new SelectProductPage(driver);
        selectProduct.selectProduct("Sauce Labs Backpack");

        YourCartPage yourCart = new YourCartPage(driver);
        yourCart.addToCart();

        CheckoutYourInformationPage checkoutInfo = new CheckoutYourInformationPage(driver);
        checkoutInfo.checkoutYourInformation("Kalpana", "Aadki", "413005");

        CheckoutOverviewPage checkOverview = new CheckoutOverviewPage(driver);
        checkOverview.checkoutOverview();

        FinishPage finishPage = new FinishPage(driver);
        finishPage.checkoutFinish();

        String expectedMsg = "Thank you for your order!";

        // Testing Part
        Assert.assertEquals(FinishPage.lblActualMsg.getText(), expectedMsg, "Test Scenario is Failed");
    }
}
