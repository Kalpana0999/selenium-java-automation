package com.delta.kalpana.seleniumconcepts.assignments.assignment13.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrainSearchPage {

    WebDriver driver;

    By txtFrom = By.xpath("//*[@id='origin']/span/input");
    By txtTo = By.xpath("//*[@id='destination']/span/input");
    By ddlClass = By.xpath("//*[@id='journeyClass']/div/div[2]/span");
    By ddlOption = By.xpath("//li[@role='option'] / span[text()=\"Sleeper (SL)\"]");

    //By ddlClass = By.xpath("//span[text()='Sleeper (SL)']");
    By btnSearch = By.xpath("//button[@type='submit']");

    PageActions pageActions = new PageActions();

    public TrainSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchTrain(String from, String to) throws InterruptedException {

        pageActions.enterSourceDestination(driver, txtFrom, from);
        Thread.sleep(1000);
        pageActions.enterSourceDestination(driver, txtTo, to);
        Thread.sleep(1000);
        selectClass(driver, ddlClass);
        Thread.sleep(1000);
        System.out.println("From : " + from + "\nTo : " + to);
        submit();
    }

    public void selectClass(WebDriver driver, By locator) throws InterruptedException {
        WebElement element = driver.findElement(locator);
        Thread.sleep(1000);
        element.click();
        Thread.sleep(1000);
        WebElement element1 = driver.findElement(ddlOption);
        element1.click();
    }

    public void submit() throws InterruptedException {
        pageActions.clickOnButton(driver, btnSearch);
        Thread.sleep(1000);
    }
}
