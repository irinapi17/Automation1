package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
//.create();
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
       driver.get("https://loopcamp.vercel.app/registration_form.html");

        WebElement fN = driver.findElement(By.name("firstname"));
        fN.sendKeys("Loop");

        WebElement lastN = driver.findElement(By.name("lastname"));
        lastN.sendKeys("Academy");
         // this fids 3 elements and cliks first one always
        //pay attention tolocate unique elements
        WebElement gender = driver.findElement(By.name("gender"));
        gender.click();
    }
}
