package com.delta.kalpana.seleniumconcepts.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
    Assignment 9
    Steps:
        Login to application https://www.saucedemo.com
        Click on the Add To Cart button of any product as per User’s input.
        Checkout the item and place the order
 */

public class Assignment9 {

    WebDriver driver;

    @BeforeMethod
    public void initBrowser() {
        //Browser Initialization

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
    public void dynamicOrder() throws InterruptedException {
        SwagLabsLogin loginPage = new SwagLabsLogin();
        loginPage.loginToSwagLabs(driver); // Login Successful

        Thread.sleep(1000);

        //driver.findElements(By.xpath("//button[text()=\"Add to cart\"]")).get(0).click(); //Static One

        String lblItemOrdered = "Sauce Labs Bolt T-Shirt";
        WebElement btnAddToCart = driver.findElement(By.xpath("//div[text()='" + lblItemOrdered + "']/following::button[1]"));
        btnAddToCart.click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();

        // 3) Click Checkout
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

        // 4) Fill up the required information
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Kalpana");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Aadki");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("413005");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

        // 5) Click Finish
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
        WebElement actualMsg = driver.findElement(By.xpath("//h2[@class='complete-header']"));
        String expectedMsg = "Thank you for your order!";
        System.out.println("Actual Message : " + actualMsg.getText());

        // Testing Part
        Assert.assertEquals(actualMsg.getText(), expectedMsg, "Test Scenario is Failed");
    }

}
