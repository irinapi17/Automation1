package com.loop.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 navigate to amazon
 maximize
 navigate back
 navigate forward
 refresh
  */
public class NavigateToAmazon {
    public static void main(String[] args) {

        // setting up the web driver
        WebDriverManager.chromedriver().setup();

        //create the instance of web driver
        WebDriver driver = new ChromeDriver();
        //navigate to web page
        driver.get("https://www.amazon.com");
        //maximaze the window after opening
        driver.manage().window().maximize();
        //navigate back
        driver.navigate().back();
        //navigate back
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}
