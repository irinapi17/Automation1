package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
//.create();
        WebDriver driver = new ChromeDriver();

        //
        driver.get("https://www.google.com");

      // driver.manage().window().maximize();

        //locate the element
        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
        //value
        WebElement searchBoxWithName = driver.findElement(By.name("q"));
        //text
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        //clicks the buttom
      //  aboutLink.click();
               searchBoxWithID.sendKeys("Feyruz");
               searchBoxWithID.clear();
        // create a string what you want to search
        String textToSearch = "Loop Academy";
        searchBoxWithID.sendKeys("Loop Academy" + Keys.ENTER );

//Get current URL and check that it contains "Loop"
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("Loop")) {
            System.out.println("Actual URL contains \"Loop\"");
        } else {
            System.err.println("Actual URL DOES NOT contain \"Loop\"");
        }

        //Get actual title and compare it with expected title "Loop Academy - Google Search"
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Loop Academy - Google Search")) {
            System.out.println("Actual Title contains \"Loop\"");
        } else {
            System.err.println("Actual Title DOES NOT contain \"Loop\"");
        }
    }
}
