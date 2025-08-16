package com.delta.kalpana.seleniumconcepts.assignments.assignment14.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class IRCTCTourPackage {

    WebDriver driver;
    String parent;
    PageActions pageActions = new PageActions();


    By linkZonalRailways = By.xpath("//a[text()='Zonal Railways']");
    By linkCentralRailway = By.xpath("//a[@title='Central Railway']");
    By linkHolidayPackages = By.xpath("//a[@title='Holiday Packages']");
    By txtDestinationCity = By.xpath("//input[@placeholder='Enter Origin/Destination City']");
    By lnkBlissfulTirupati = By.xpath("//div[@class='destination-autocomplete']/ul/li[4]/a/span");

    public IRCTCTourPackage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToCentralRailwayZone(String value) throws InterruptedException {

        parent = driver.getWindowHandle();
        WebElement mo = driver.findElement(linkZonalRailways);
        Actions action = new Actions(driver);
        action.moveToElement(mo).perform();

        driver.findElement(linkCentralRailway).click();

        Set<String> windows = driver.getWindowHandles();
        for(String window : windows) {
            if(!parent.equals(window)) {
                driver.switchTo().window(window);
            }
        }

        Thread.sleep(2000);
        pageActions.clickOnLink(driver,linkHolidayPackages);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        Set<String> window1 = driver.getWindowHandles();
        for(String window : window1) {
            if(!parent.equals(window)) {
                driver.switchTo().window(window);
            }
        }
        Thread.sleep(2000);
        pageActions.enterTxtValue(driver,txtDestinationCity,value);

        Set<String> window2 = driver.getWindowHandles();
        for(String window : window2) {
            if(!parent.equals(window)) {
                driver.switchTo().window(window);
            }
        }
        Thread.sleep(3000);
        pageActions.clickOnLink(driver,lnkBlissfulTirupati);

        Thread.sleep(3000);
    }


}
