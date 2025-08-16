package com.delta.kalpana.seleniumconcepts.assignments.assignment14.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CentralRailwayPage {

    WebDriver driver;

    PageActions pageActions = new PageActions();

    By lnkHolidayPackages = By.xpath("//a[@title='Holiday Packages']");

    public CentralRailwayPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHolidayPackagesPage() {
        pageActions.handleMultipleWindows(driver);

        pageActions.clickOnElement(driver,lnkHolidayPackages);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
