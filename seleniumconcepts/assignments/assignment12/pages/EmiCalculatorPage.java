package com.delta.kalpana.seleniumconcepts.assignments.assignment12.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmiCalculatorPage {

    WebDriver driver;

    //Locators
    By txtHomeLoanAmt = By.id("loanamount");
    By txtInterestRate = By.id("loaninterest");
    By txtLoanTenure = By.id("loanterm");

    public EmiCalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void emiCalculation(long homeLoanAmt, double interestRate, int loanTenure) {
        PageActions pageAction = new PageActions();
        pageAction.enterHomeLoanAmt(driver, txtHomeLoanAmt, homeLoanAmt);
        pageAction.enterInterestRate(driver, txtInterestRate, interestRate);
        pageAction.enterLoanTenure(driver, txtLoanTenure, loanTenure);

        pageAction.getEmiValues(driver);
        pageAction.getYearlyValues(driver);
    }

}
