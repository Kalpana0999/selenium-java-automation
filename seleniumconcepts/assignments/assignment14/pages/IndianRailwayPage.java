package com.delta.kalpana.seleniumconcepts.assignments.assignment14.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IndianRailwayPage {

    WebDriver driver;
    PageActions pageActions = new PageActions();

    By lnkZonalRailways = By.xpath("//a[text()='Zonal Railways']");
    By lnkCentralRailway = By.xpath("//a[@title='Central Railway']");

    public IndianRailwayPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToCentralRailwayZone() throws InterruptedException {
        WebElement mo = driver.findElement(lnkZonalRailways);
        Actions action = new Actions(driver);
        action.moveToElement(mo).perform();

        pageActions.handleMultipleWindows(driver);
        pageActions.clickOnElement(driver,lnkCentralRailway);
    }
}
