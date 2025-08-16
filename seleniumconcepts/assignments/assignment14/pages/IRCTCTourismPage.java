package com.delta.kalpana.seleniumconcepts.assignments.assignment14.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IRCTCTourismPage {

    WebDriver driver;

    PageActions pageActions = new PageActions();

    By txtDestinationCity = By.xpath("//input[@placeholder='Enter Origin/Destination City']");
    By lnkBlissfulTirupati = By.xpath("//div[@class='destination-autocomplete']/ul/li[4]/a/span");

    public IRCTCTourismPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToTour(String value) throws InterruptedException {
        pageActions.handleMultipleWindows(driver);
        pageActions.enterTxtValue(driver,txtDestinationCity, value);

        pageActions.handleMultipleWindows(driver);
        pageActions.clickOnElement(driver,lnkBlissfulTirupati);
    }
}
