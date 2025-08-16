package com.delta.kalpana.seleniumconcepts.assignments.assignment12optimizedcode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageActions {
    By locLoanEmi = By.xpath("//div[@id='emiamount']/p/span");
    By locTotalInterestPayable = By.xpath("//div[@id='emitotalinterest']/p/span");
    By locTotalPayment = By.xpath("//div[@id='emitotalamount']/p/span");

    By locYear = By.xpath("//td[@id='year2023']");
    By locPrincipal = By.xpath("//td[@id='year2023']/following-sibling::td[1]");
    By locInterest = By.xpath("//td[@id='year2023']/following-sibling::td[2]");
    By locBalance = By.xpath("//td[@id='year2023']/following-sibling::td[4]");
    By locLoanPaid = By.xpath("//td[@id='year2023']/following-sibling::td[5]");

    public void enterHomeLoanAmt(WebDriver driver, By locator, long value) {
        WebElement txtHomeLoanAmt = driver.findElement(locator);
        txtHomeLoanAmt.clear();
        txtHomeLoanAmt.sendKeys(Keys.BACK_SPACE);
        String strHomeLoanAmt = Long.toString(value);
        txtHomeLoanAmt.sendKeys(strHomeLoanAmt);
    }

    public void enterInterestRate(WebDriver driver, By locator, double value) {
        WebElement txtInterestRate = driver.findElement(locator);
        txtInterestRate.clear();
        txtInterestRate.sendKeys(Keys.BACK_SPACE);
        String strInterestRate = Double.toString(value);
        txtInterestRate.sendKeys(strInterestRate);
    }

    public void enterLoanTenure(WebDriver driver, By locator, int value) {
        WebElement txtLoanTenure = driver.findElement(locator);
        txtLoanTenure.clear();
        txtLoanTenure.sendKeys(Keys.BACK_SPACE);
        String strLoanTenure = Integer.toString(value);
        txtLoanTenure.sendKeys(strLoanTenure);
        txtLoanTenure.sendKeys(Keys.ENTER);
    }

    public void getEmiValues(WebDriver driver) {
        System.out.println("---------- Breakup of Total Payment ----------");
        System.out.println(" Loan EMI = " +getLabelValue(driver,locLoanEmi)+"\n Total Interest Payable = "+getLabelValue(driver,locTotalInterestPayable)+"\n Total Payment(Principal + Interest) = "+getLabelValue(driver,locTotalPayment)+"\n");
    }

    public void getYearlyValues(WebDriver driver) {
        System.out.println("--------------- Payments for the year 2023 ----------");
        System.out.println(" Year = "+getLabelValue(driver,locYear)+"\n Principal (A) = "+getLabelValue(driver,locPrincipal)+"\n Interest (B) = "+getLabelValue(driver,locInterest)+"\n Total Payment (A + B) = "+getLabelValue(driver,locTotalPayment)+"\n Balance = "+getLabelValue(driver,locBalance)+"\n Loan Paid To Date = "+getLabelValue(driver,locLoanPaid));
    }

    public String getLabelValue(WebDriver driver, By lblLoc) {
        WebElement element = driver.findElement(lblLoc);
        return element.getText();
    }
}
