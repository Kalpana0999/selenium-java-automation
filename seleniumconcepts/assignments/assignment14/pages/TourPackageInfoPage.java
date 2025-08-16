package com.delta.kalpana.seleniumconcepts.assignments.assignment14.pages;

import com.delta.kalpana.seleniumconcepts.assignments.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TourPackageInfoPage {

    WebDriver driver;
    PageActions pageActions = new PageActions();
    By lblTitle = By.xpath("//h5[text()='BLISSFUL TIRUPATI']");
    By lblAmount = By.xpath("//strong[text()='₹ 14800 ']");

    By lblHeadings = By.xpath("//div[@class='mid-searchpack']/h5[text()='BLISSFUL TIRUPATI']/following::div/strong");
    By lblDetails = By.xpath("//div[@class='mid-searchpack']/h5[text()='BLISSFUL TIRUPATI']/following::div/strong/following-sibling::span");

    public TourPackageInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void showPackageDetails() {
        System.out.println(" Title : "+pageActions.getLblValue(driver,lblTitle));
        System.out.println(" Package Amount : "+pageActions.getLblValue(driver,lblAmount));

        List<WebElement> headings = pageActions.getListWebElements(driver, lblHeadings);
        List<WebElement> details = pageActions.getListWebElements(driver, lblDetails);

        for (int i = 0; i <= 5; i++) {
            System.out.println(" " + headings.get(i).getText() + " : " + details.get(i).getText());
        }
    }
}
