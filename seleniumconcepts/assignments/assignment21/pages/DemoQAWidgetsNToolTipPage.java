package com.delta.kalpana.seleniumconcepts.assignments.assignment21.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAWidgetsNToolTipPage {
    WebDriver driver;
    PageActions pageActions = new PageActions();
    public String actualText,expectedText;

    By lnkWidgets = By.xpath("//*[@id='app']/div/div/div[2]/div/div[4]/div/div[3]/h5");
    By lnkToolTips = By.xpath("//div[normalize-space(@class)='element-list collapse show']/ul/li[7]");
    By btnHover = By.id("toolTipButton");
    By btnHoverTxt = By.xpath("//button[text()='Hover me to see']");

    public DemoQAWidgetsNToolTipPage(WebDriver driver) {
        this.driver = driver;
    }

    public void testMouseHoverEvent() {
        pageActions.clickOnElementUsingJSExecutor(driver,lnkWidgets);
        pageActions.handleChildWindow(driver);
        pageActions.clickOnElementUsingJSExecutor(driver,lnkToolTips);
        pageActions.clickOnElement(driver,btnHover);

        //Testing Part
        WebElement btnHoverTxtElement = driver.findElement(btnHoverTxt);
        actualText = btnHoverTxtElement.getText();
        System.out.println("Text Displayed : "+actualText);
        expectedText = "Hover me to see";
    }
}
