package com.delta.kalpana.seleniumconcepts.assignments.assignment13.testscripts;

import com.delta.kalpana.seleniumconcepts.assignments.assignment13.pages.TrainListPage;
import com.delta.kalpana.seleniumconcepts.assignments.assignment13.pages.TrainSearchPage;
import org.testng.annotations.Test;

public class IRCTCTrainSearch extends BaseClass {

    @Test
    public void IndianRailwayTrainSearch() throws InterruptedException {
        TrainSearchPage trainSearchPage = new TrainSearchPage(driver);
        trainSearchPage.searchTrain("sur", "pune");
        TrainListPage trainListPage = new TrainListPage(driver);
        trainListPage.trainInfo();
    }
}
