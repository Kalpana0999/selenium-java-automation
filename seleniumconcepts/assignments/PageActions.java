package com.delta.kalpana.seleniumconcepts.assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class PageActions {

    public void GoToWebsite(WebDriver driver, String url) throws IOException {
        String projectPath = System.getProperty("user.dir");
        File file = new File(projectPath+"/src/main/java/com/delta/kalpana/seleniumconcepts/assignments/resources/projecturls.properties");
        FileInputStream fin = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fin);
        url = prop.getProperty(url);
        driver.get(url);
    }

    public void clickOnElement(WebDriver driver, By linkOrButton) {
        WebElement element = driver.findElement(linkOrButton);
        element.click();
    }

    public void clickOnElementUsingJSExecutor(WebDriver driver, By clickableLocator) {
        WebElement element = driver.findElement(clickableLocator);
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].click()",element);
    }

    public void elementToBeClickableState(WebDriver driver, By clickableLocator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(clickableLocator));

    }

    public void handleAlertBox(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void handleChildWindow(WebDriver driver) {
        String parentWindowId = driver.getWindowHandle();

        Set<String> windows = driver.getWindowHandles();
        for(String window : windows) {
            if(!parentWindowId.equals(window)) {
                driver.switchTo().window(window);
            }
        }
    }
    public void handleMultipleWindows(WebDriver driver) {
        String parent = driver.getWindowHandle();
        Set<String> child = driver.getWindowHandles();
        for(String win : child) {
            if(!parent.equalsIgnoreCase(win)) {
                driver.switchTo().window(win);
            }
            driver.switchTo().window(win);
        }
    }

    public String getLblValue(WebDriver driver, By lblLocator) {
        WebElement element = driver.findElement(lblLocator);
        return element.getText();
    }

    public List<WebElement> getListWebElements(WebDriver driver, By listOfElements) {
        return driver.findElements(listOfElements);
    }

    public void enterTxtValue(WebDriver driver, By txtLocator, String value) {
        WebElement txtElement = driver.findElement(txtLocator);
        txtElement.clear();
        txtElement.sendKeys(value);
    }

    public void setDateValues(WebDriver driver, By fromToDate, String value) {
        WebElement dateElement = driver.findElement(fromToDate);
        dateElement.clear();
        dateElement.sendKeys(value);
        dateElement.sendKeys(Keys.ENTER);
    }

    public void scrollDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Object o = js.executeScript("window.scrollTo(0,500)");
    }
}
