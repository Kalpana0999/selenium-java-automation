package com.delta.kalpana.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExplainMaximizeMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\chrome_driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebDriver.Options opt = driver.manage();
        WebDriver.Window win = opt.window();
        win.maximize();

        /*
        Explanation of Above 3 Lines
        1) First we have created object of ChromeDriver by using reference of WebDriver Interface
           - Here ChromeDriver class extended from RemoteWebDriver Class which implements WebDriver Interface
        2) manage() is static abstract method of Options inner interface- Options is inner Interface of WebDriver Interface
           - manage method returns WebDriver.Options thats why we store it in opt variable of type WebDriver.Options
        3) window() is static abstract method of Window inner interface - Window is again inner Interface of WebDriver Interface
          - window method returns WebDriver.Window thats why we store it in win variable of type WebDriver.Window
        4) maximize() - this static abstract method contained in Window inner interface..
        5) All these method i.e manage() window() and maximize() definitions are available in RemoteWebDriver Class.
           - Because RemoteWebDriver implements WebDriver Interface
         */

        // Above 3 lines = Below commented 1 Line

        // driver.manage().window().maximize();
        driver.close();
    }
}
