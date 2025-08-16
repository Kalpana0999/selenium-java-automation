package com.delta.kalpana.seleniumconcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestMakeMyTripTitle {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\chrome_driver\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");

        String actualTitle = driver.getTitle();
        System.out.println("The Actual Title of Make My Trip Website is : " + actualTitle);

        String expectedTitle = "MakeMyTrip";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test Case is Pass");
        } else {
            System.out.println("Test Case is Fail");
        }
        driver.close();
    }
}
