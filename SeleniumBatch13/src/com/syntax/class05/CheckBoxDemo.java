package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {

    public static String url;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("url");
        List<WebElement> optionCheckBox = driver.findElements(By.xpath("//input[@class = 'cb1-element']"));
        int size = optionCheckBox.size();
        System.out.println(size);

        for (WebElement option : optionCheckBox) {
            option.click();
            String checkBoxValue=option.getAttribute("value");
            if (checkBoxValue.equals("option 2")) {
                option.click();
                break;
            }

        }
    }
}
