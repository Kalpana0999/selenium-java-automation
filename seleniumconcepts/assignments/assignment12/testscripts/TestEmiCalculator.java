package com.delta.kalpana.seleniumconcepts.assignments.assignment12.testscripts;

import com.delta.kalpana.seleniumconcepts.assignments.assignment12.pages.EmiCalculatorPage;
import org.testng.annotations.Test;

public class TestEmiCalculator extends BaseClass {

    @Test
    public void emiCalculator() {
        EmiCalculatorPage emiCalculatorPage = new EmiCalculatorPage(driver);
        emiCalculatorPage.emiCalculation(6000000, 8.5, 25);
    }
}
