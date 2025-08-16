package com.delta.kalpana.seleniumconcepts.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
    Assignment No 6:
        Write a script to verify the Order is successful or not..
        Website Link: https://www.saucedemo.com/

            Steps:
                1) Login using given credentials
                2) Add “Sauce Labs Backpack“ to the cart
                3) Click Checkout
                4) Fill up the required information
                5) Click Finish

            Expectation: “Thank you for your order!” message should be visible
            Note: Please consider using xpath locator
 */

public class Assignment6 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();

        // 1) Login using given credentials
        driver.findElement(By.xpath("//input[@id = \"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id = \"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id = \"login-button\"]")).click();

        //List<WebElement> button = driver.findElements(By.xpath("//button[text()=\"Add to cart\"]"));
        //WebElement b1 = button.get(0);
        //b1.click();

        // 2) Add “Sauce Labs Backpack“ to the cart
        driver.findElements(By.xpath("//button[text()=\"Add to cart\"]")).get(0).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();

        // 3) Click Checkout
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

        // 4) Fill up the required information
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Kalpana");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Aadki");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("413005");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

        // 5) Click Finish
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
        WebElement actualMsg = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
        String expectedMsg = "Thank you for your order!";
        //System.out.println(actualMsg.getText());

        // Testing Part
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/checkout-complete.html";
        Thread.sleep(2000);

        if (expectedUrl.equals(actualUrl) || expectedMsg.equals(actualMsg)) {
            System.out.println("Test Scenario is Passed");
        } else {
            System.out.println("Test Scenario is Failed");
        }
        driver.close();
    }
}
