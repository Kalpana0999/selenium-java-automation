package com.delta.kalpana.seleniumconcepts.assignments.assignment18static.testscripts;

import com.delta.kalpana.seleniumconcepts.assignments.assignment18static.pages.OrangeHRMSLeavePage;
import com.delta.kalpana.seleniumconcepts.assignments.assignment18static.pages.OrangeHRMSLoginPage;
import org.testng.annotations.Test;

public class OrangeHRMSEmployeeLeaveScenario extends BaseClass {

    @Test
    public void getLeaveInfo() throws InterruptedException {
        OrangeHRMSLoginPage orangeHRMSLoginPage = new OrangeHRMSLoginPage(driver);
        orangeHRMSLoginPage.loginToApplication("Admin", "admin123");

        OrangeHRMSLeavePage orangeHRMSLeavePage = new OrangeHRMSLeavePage(driver);
        orangeHRMSLeavePage.leaveScenario();
        orangeHRMSLeavePage.displayRecords();
    }
}
