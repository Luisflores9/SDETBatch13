package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("http://www.amazon.com");
        driver.manage().window().maximize(); //TO MAXIME WEBSITE
        driver.manage().window().maximize(); //TO FULL SCREEN

    }
}
