package com.delta.kalpana.seleniumconcepts.assignments.assignment19.testscripts;

import com.delta.kalpana.seleniumconcepts.assignments.assignment19.pages.SeleniumInterfacesInfo;
import org.testng.annotations.Test;

public class InterfaceMethodsInfo extends BaseClass {

    @Test
    public void displayMethodsInfo() {
        SeleniumInterfacesInfo seleniumInterfacesInfo = new SeleniumInterfacesInfo(driver);
        seleniumInterfacesInfo.displaySelectedInterfaceMethodInfo("WebElement");
    }
}
