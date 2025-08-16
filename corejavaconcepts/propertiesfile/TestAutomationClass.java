package com.delta.kalpana.corejavaconcepts.propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestAutomationClass {

    public void goToWebsite(String url) {
        System.out.println(url);
    }

    public static void main(String[] args) throws IOException {
        TestAutomationClass obj = new TestAutomationClass();

        String path = System.getProperty("user.dir");

        File file = new File(path + "\\src\\main\\java\\com\\delta\\kalpana\\corejavaconcepts\\propertiesfile\\config.properties");
        //File file = new File("D:\\Cloned Projects\\Automation Class Project\\corejava-selenium-june23\\src\\main\\java\\com\\delta\\kalpana\\corejavaconcepts\\propertiesfile\\config.properties");

        FileInputStream fin = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fin);

        //Fetching Properties values by using their Keys
        String url = prop.getProperty("url");
        String user = prop.getProperty("username");

        System.out.println(user);
        System.out.println(url);

        obj.goToWebsite(url);
    }
}
