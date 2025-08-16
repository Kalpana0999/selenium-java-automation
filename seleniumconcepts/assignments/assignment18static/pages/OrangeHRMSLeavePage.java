package com.delta.kalpana.seleniumconcepts.assignments.assignment18static.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrangeHRMSLeavePage {
    WebDriver driver;

    By lnkLeave = By.xpath("//span[text()='Leave']");
    By txtFromDate = By.xpath("//label[text()='From Date']/following::input[1]");
    By txtToDate = By.xpath("//label[text()='From Date']/following::input[2]");
    By ddlLeaveStatus = By.xpath("//div[text()='Select']");
    By optLeaveStatus = By.xpath("//div[text()='Select']/following::div[2]/div/span[text()='Pending Approval']");
    By txtEmpName = By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div/div/child::div/input");
    By ddlEmpName = By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div/div/child::div/following::div/div/span[1]");
    By btnSearch = By.xpath("//button[@type='submit']");
    By header = By.xpath("//div[@id=\"app\"]/child::div[1]/child::div[2]/child::div[2]/child::div/child::div/following::div/child::div[1]/div[1]/div[1]");

    PageActions pageActions = new PageActions();

    public OrangeHRMSLeavePage(WebDriver driver) {
        this.driver = driver;
    }

    public void leaveScenario() throws InterruptedException {
        pageActions.clickOnElement(driver,lnkLeave);

        WebElement fromDate = driver.findElement(txtFromDate);
        fromDate.clear();
        fromDate.sendKeys("2022-01-01");
        fromDate.sendKeys(Keys.ENTER);

        WebElement toDate = driver.findElement(txtToDate);
        toDate.clear();
        toDate.sendKeys("2023-10-31");
        toDate.sendKeys(Keys.ENTER);

        pageActions.clickOnElement(driver,ddlLeaveStatus);
        pageActions.clickOnElement(driver,optLeaveStatus);

        //pageActions.enterTxtValue(driver,txtEmpName,"Anthony Nolan");

        Thread.sleep(2000);
        WebElement elementEmpName = driver.findElement(txtEmpName);
        //WebElement elementDdlEmpName = driver.findElement(ddlEmpName);
        //WebDriverWait wait = new WebDriverWait(driver,15);
        elementEmpName.sendKeys("Charlie  Carter");
        //wait.until(ExpectedConditions.visibilityOf(elementDdlEmpName));
        Thread.sleep(1500);
        elementEmpName.sendKeys(Keys.ARROW_DOWN);
        elementEmpName.sendKeys(Keys.ENTER);

       // Actions action = new Actions(driver);

        //wait.until(ExpectedConditions.textToBePresentInElement(elementDdlEmpName,"Charlie Carter"));
        //wait.until(ExpectedConditions.textToBePresentInElementValue(ddlEmpName,"Charlie Carter"));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(ddlEmpName));
        //wait.until(ExpectedConditions.elementToBeClickable(ddlEmpName));
        //action.moveToElement(elementDdlEmpName).perform();
        //pageActions.clickOnElement(driver,ddlEmpName);
        //elementDdlEmpName.click();

        
        pageActions.clickOnElement(driver,btnSearch);
    }

    public void displayRecords() {
        List<WebElement> listOfRecords = pageActions.getListWebElements(driver,header);
        for (WebElement ele : listOfRecords) {
            System.out.print(ele.getText());
        }

    }
}
