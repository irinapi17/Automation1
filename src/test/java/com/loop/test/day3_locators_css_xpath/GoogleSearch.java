package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
     * Navigate to Google search
     * maximize the page
     * get title of the page
     * get url of the page
     * validate the title, expected title is "Google"
     * validate the url of the page, expected url is "https://www.google.com/"
     * close the brower
     */

public class GoogleSearch {
    public static void main(String[] args) {
        //setup the driver
        WebDriverManager.chromedriver().setup();

        //create driver object
        WebDriver driver = new ChromeDriver();

        //navigate to google
        driver.get("https://www.google.com");
        //maximaze
        driver.manage().window().maximize();

        String expectedTitle= "Google";
        //title
        String actualTitle =  driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: " + actualTitle + ", matches expected title: "+ expectedTitle +
                    ", => TEST PASS");

        }else {
            System.err.println("Actual title: " + actualTitle + ",does not match expected title" + expectedTitle +
                    ",=> TEST FAILED");
        }

        String expectedURL = "https://www.google.com";
        //gets current URL
        String actualURL  =  driver.getCurrentUrl();


        if(actualURL.equals(expectedURL)){
            System.out.println("Actual title: " + actualURL + ", matches expected title: "+ expectedURL +
                    ", => TEST PASS");

        }else {
            System.err.println("Actual url: " + actualURL + ",does not match expected title" + expectedURL +
                    ",=> TEST FAILED");
        }
        driver.close();



    }
}
