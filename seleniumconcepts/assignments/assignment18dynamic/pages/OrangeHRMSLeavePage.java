package com.delta.kalpana.seleniumconcepts.assignments.assignment18dynamic.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrangeHRMSLeavePage {
    WebDriver driver;

    By lnkLeave = By.xpath("//span[text()='Leave']");
    By txtFromDate = By.xpath("//label[text()='From Date']/following::input[1]");
    By txtToDate = By.xpath("//label[text()='From Date']/following::input[2]");
    By ddlLeaveStatus = By.xpath("//div[text()='Select']");
    By clearPreviousOpt = By.xpath("//span[text()='Pending Approval ']/i");
    By txtEmpName = By.xpath("//input[@placeholder='Type for hints...']");
    By btnSearch = By.xpath("//button[@type='submit']");
   // By thHeader = By.xpath("//div[@id=\"app\"]/child::div[1]/child::div[2]/child::div[2]/child::div/child::div/following::div/child::div[1]/div[1]/div[1]");
    By thHeader = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]");
    By trLeaveResult = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]");

    PageActions pageActions = new PageActions();

    public OrangeHRMSLeavePage(WebDriver driver) {
        this.driver = driver;
    }

    public void leaveScenario(String fromDate, String toDate, String leaveStatus, String empName) throws InterruptedException {
        pageActions.clickOnElement(driver,lnkLeave);

        pageActions.setDateValues(driver,txtFromDate,fromDate);
        pageActions.setDateValues(driver,txtToDate,toDate);

        pageActions.clickOnElement(driver,clearPreviousOpt);

        pageActions.clickOnElement(driver,ddlLeaveStatus);

        By optLeaveStatus = By.xpath("//div[text()='Select']/following::div[2]/div/span[text()='"+leaveStatus+"']");
        pageActions.clickOnElement(driver, optLeaveStatus);

        Thread.sleep(1000);
        WebElement eleEmpName = driver.findElement(txtEmpName);
        eleEmpName.sendKeys(empName);
        Thread.sleep(2000);
        eleEmpName.sendKeys(Keys.ARROW_DOWN);
        eleEmpName.sendKeys(Keys.ENTER);
        
        pageActions.clickOnElement(driver,btnSearch);
    }
    public void displayRecords() {  //Problem to display records in Table Format
        List<WebElement> listOfHeaders = pageActions.getListWebElements(driver, thHeader);
        for (WebElement ele : listOfHeaders) {
            System.out.print(" "+ele.getText());
        }
        List<WebElement> listOfRecords = pageActions.getListWebElements(driver, trLeaveResult);
        for (WebElement ele1 : listOfRecords) {
            System.out.print(ele1.getText());
        }
    }
}
