package com.delta.kalpana.seleniumconcepts.assignments.assignment21.testscripts;

import com.delta.kalpana.seleniumconcepts.assignments.assignment21.pages.DemoQAWidgetsNToolTipPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMouseHover extends BaseClass {

    @Test
    public void testMouseHover() {
        DemoQAWidgetsNToolTipPage demoqa = new DemoQAWidgetsNToolTipPage(driver);
        demoqa.testMouseHoverEvent();

        Assert.assertEquals(demoqa.actualText, demoqa.expectedText);
    }
}
