package com.loop.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniniumTest {
    public static void main(String[] args)  {
        // setting up the web driver
        WebDriverManager.chromedriver().setup();

        //create the instance of web driver
        WebDriver driver = new ChromeDriver();
       // Thread.sleep(5000);


        //navigate to web page
        driver.get("https://www.google.com");
       // driver.navigate().to("https://www.google.com");

        //maximaze the window after opening
        driver.manage().window().maximize();

        //full screen almost the same
        //driver.manage().window().fullscreen();
         // goes to another web site
        driver.navigate().to("https://www.etsy.com");

        //navigate back
        driver.navigate().back();

        //navigate forward
        driver.navigate().forward();

        //navidate refresh
        driver.navigate().refresh();

        //quit close
        driver.quit();
        // closing
        //driver.close();

    }
}
