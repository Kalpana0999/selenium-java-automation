package com.delta.kalpana.seleniumconcepts.assignments.assignment20.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleSearchEngine {
    WebDriver driver;
    PageActions pageActions = new PageActions();
    By txtArea = By.xpath("//textarea[@id=\"APjFqb\"]");
    By listSearchOfElements = By.xpath("//div//ul//li");

    public GoogleSearchEngine(WebDriver driver) {
        this.driver = driver;
    }

    public void browseInGoogle(String searchingTxt) {
        pageActions.enterTxtValue(driver,txtArea,searchingTxt);
        List<WebElement> searchResult = pageActions.getListWebElements(driver,listSearchOfElements);
        for (WebElement element : searchResult) {
            System.out.println(element.getText());
        }
    }
}
