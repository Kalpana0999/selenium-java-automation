package com.delta.kalpana.seleniumconcepts.assignments.assignment20.testscripts;

import com.delta.kalpana.seleniumconcepts.assignments.assignment20.pages.GoogleSearchEngine;
import org.testng.annotations.Test;

public class GoogleShowSearchResults extends BaseClass {

    @Test
    public void showResults() {
        GoogleSearchEngine googleSearchEngine = new GoogleSearchEngine(driver);
        googleSearchEngine.browseInGoogle("Selenium");
    }
}
