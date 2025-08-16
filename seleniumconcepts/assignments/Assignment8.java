package com.delta.kalpana.seleniumconcepts.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/*
    Assignment No 8:
        Steps:
            1) Open application https://www.makemytrip.com/
            2) Print the count and texts of total links for the GIVEN TITLE
                Eg: if I give the title, that title link texts and count should be displayed,
                 I don’t need to write the xpath for each an every title
            Output:
            ABOUT THE SITE:
            Total Links Count: 9
            Link Texts :
            Customer Support, Payment Security, Privacy Policy, User Agreement, Terms of Service,
             More Offices, Make A Payment, Work From Home,Report Security Issues
 */
public class Assignment8 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();

        // Static xpath for titles.
        //List<WebElement> links = driver.findElements(By.xpath("//p[text()=\"About the Site\"]/following-sibling::ul[1]/li/a"));

        String title = "MakeMyTrip"; // About the Site, Product Offering, Top Hotels in India, Top International hotels, Quick Links, Important Links, Corporate Travel
        System.out.println("Title : " + title);

        List<WebElement> linkTextP = driver.findElements(By.xpath("//p[text()='" + title + "']/following-sibling::ul[1]/li/a"));
        // System.out.println("Total No. of Links : "+linkTextP.size());
        int actualLinksCount = linkTextP.size();
        int expectedLinksCount = 13;
        System.out.println("Size :: " + actualLinksCount);  //13


        List<String> actualLinksText = new ArrayList<>();
        List<String> expectedLinksText = new ArrayList<>();
        expectedLinksText.add("About Us");
        expectedLinksText.add("Investor Relations");
        expectedLinksText.add("Careers");
        expectedLinksText.add("MMT Foundation");
        expectedLinksText.add("CSR Policy");
        expectedLinksText.add("myPartner - Travel Agent Portal");
        expectedLinksText.add("Foreign Exchange");
        expectedLinksText.add("List your hotel");
        expectedLinksText.add("Partners- Redbus");
        expectedLinksText.add("Partners- Goibibo");
        expectedLinksText.add("Advertise with Us");
        expectedLinksText.add("RedBus Ferry Malaysia");
        expectedLinksText.add("RedBus Ferry Singapore");

        // Verification
        for (WebElement link : linkTextP) {
            String txtLink = link.getText();
            actualLinksText.add(txtLink);  //Adding linkText to the actualLinksText list
            System.out.println(txtLink);
        }

        Assert.assertEquals(actualLinksCount, expectedLinksCount, "Test Scenario is Failed");
//        for ( int i = 0; i <= linkTextP.size(); i++) {
//            WebElement text = linkTextP.get(i);
//            System.out.println(i + ":  " +text.getText());
//        }
        driver.close();
    }
}
