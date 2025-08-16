package com.delta.kalpana.seleniumconcepts.assignments.assignment14.testscripts;

import com.delta.kalpana.seleniumconcepts.assignments.assignment14.pages.*;
import org.testng.annotations.Test;

public class HolidayPackage extends BaseClass {

    @Test
    public void getInfoOfSelectedHolidayPackage() throws InterruptedException {
        IndianRailwayPage indianRailwayPage = new IndianRailwayPage(driver);
        indianRailwayPage.goToCentralRailwayZone();

        CentralRailwayPage centralRailwayPage = new CentralRailwayPage(driver);
        centralRailwayPage.goToHolidayPackagesPage();

        IRCTCTourismPage irctcTourismPage = new IRCTCTourismPage(driver);
        irctcTourismPage.goToTour("tirupati");

        TourPackageInfoPage tourPackageInfoPage = new TourPackageInfoPage(driver);
        tourPackageInfoPage.showPackageDetails();
    }
}
