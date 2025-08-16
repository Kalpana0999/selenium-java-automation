package com.delta.kalpana.seleniumconcepts.assignments.assignment19.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumInterfacesInfo {

    WebDriver driver;
    PageActions pageActions = new PageActions();

    By lnkPackage = By.xpath("//a[text()='org.openqa.selenium']");
    By tabInterface = By.xpath("//button[@id='class-summary-tab1']");
    By lblMethodInfo = By.xpath("//div[text()='Method']/following-sibling::div/child::code");

    public SeleniumInterfacesInfo(WebDriver driver) {
        this.driver = driver;
    }
    public void displaySelectedInterfaceMethodInfo(String interfaceName) {
        pageActions.clickOnElement(driver,lnkPackage);
        pageActions.clickOnElement(driver,tabInterface);

        int i = 0;
        By lnkSelectedInterface = By.xpath("//a[text()='"+interfaceName+"']");
        pageActions.clickOnElement(driver, lnkSelectedInterface);

        List<WebElement> lstMethodInfo = pageActions.getListWebElements(driver, lblMethodInfo);
        System.out.println("  " +"ReturnType"+ "      Method");
        while (i < lstMethodInfo.size()) {
            System.out.print("  " + lstMethodInfo.get(i).getText() + " <");
            i++;
            System.out.print("--------- : " + lstMethodInfo.get(i).getText());
            i++;
            System.out.println();
        }
    }
}
