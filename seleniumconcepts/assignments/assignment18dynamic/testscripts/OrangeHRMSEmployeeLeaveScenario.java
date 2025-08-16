package com.delta.kalpana.seleniumconcepts.assignments.assignment18dynamic.testscripts;

import com.delta.kalpana.seleniumconcepts.assignments.assignment18dynamic.pages.OrangeHRMSLeavePage;
import com.delta.kalpana.seleniumconcepts.assignments.assignment18dynamic.pages.OrangeHRMSLoginPage;
import org.testng.annotations.Test;

public class OrangeHRMSEmployeeLeaveScenario extends BaseClass {

    @Test
    public void getLeaveInfo() throws InterruptedException {
        OrangeHRMSLoginPage orangeHRMSLoginPage = new OrangeHRMSLoginPage(driver);
        orangeHRMSLoginPage.loginToApplication("Admin", "admin123");

        OrangeHRMSLeavePage orangeHRMSLeavePage = new OrangeHRMSLeavePage(driver);
        orangeHRMSLeavePage.leaveScenario("2022-01-01", "2023-12-31","Pending Approval", "Anthony Nolan");
        orangeHRMSLeavePage.displayRecords();
    }
}
