package com.delta.kalpana.seleniumconcepts.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*
       Assignment 10:
       Steps to Automate:
                Open https://www.facebook.com/
                Click on Create New Account
                Select 27-March-2000 from 3 dropdowns
                Also, get all months(Jan-Dec) from the month dropdown and verify it has the correct months or not.
 */

public class Assignment10 {
    WebDriver driver;

    @BeforeMethod
    public void initBrowser() {
        //Browser Initialization

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @AfterMethod
    public void tearDown() {

        //Closing Browser after Scenario Completed
        driver.close();
    }

    @Test
    public void testDropDown() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(1000);

        WebElement ddlDay = driver.findElement(By.xpath("//select[@id='day']"));  //Day DropDown Tool
        Select day = new Select(ddlDay);
        day.selectByValue("27");

        WebElement ddlMonth = driver.findElement(By.xpath("//select[@id='month']")); //Month DropDown Tool
        Select month = new Select(ddlMonth);
        month.selectByValue("3");

        WebElement ddlYear = driver.findElement(By.xpath("//select[@id='year']")); //Year DropDown Tool
        Select year = new Select(ddlYear);
        year.selectByValue("2000");
        Thread.sleep(1000);

        List<WebElement> actualMonthElements = month.getOptions();
        List<String> actualMonthList = new ArrayList<>();
        List<String> expectedMonthList = new ArrayList<>();
        //List<String> retrievedMonthList = new ArrayList<>();

        expectedMonthList.add("Jan");
        expectedMonthList.add("Feb");
        expectedMonthList.add("Mar");
        expectedMonthList.add("Apr");
        expectedMonthList.add("May");
        expectedMonthList.add("Jun");
        expectedMonthList.add("Jul");
        expectedMonthList.add("Aug");
        expectedMonthList.add("Sep");
        expectedMonthList.add("Oct");
        expectedMonthList.add("Nov");
        expectedMonthList.add("Dec");

        for (WebElement months : actualMonthElements) {
            String m = months.getText();
            actualMonthList.add(m);    // Retriving individual month and add it in actual list.
            System.out.println(m);
        }

        Assert.assertEquals(actualMonthList, expectedMonthList);
    }
}
