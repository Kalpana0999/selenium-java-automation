package com.delta.kalpana.seleniumconcepts.assignments.assignment13.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TrainListPage {

    WebDriver driver;
    By locTrainList = By.xpath("//div[@class=\"col-sm-5 col-xs-11 train-heading\"]/strong");

    public TrainListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void trainInfo() {
        List<WebElement> tl = driver.findElements(locTrainList);
        System.out.println("Total Number of Trains Available : " + tl.size());
        for (WebElement train : tl) {
            String trainName = train.getText();
            System.out.println(trainName);
        }
    }
}
