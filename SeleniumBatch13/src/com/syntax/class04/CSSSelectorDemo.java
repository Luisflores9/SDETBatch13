package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        WebElement startPracticingButton=driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPracticingButton.click();
        Thread.sleep(5000);
        WebElement simpleFormDemo=driver.findElement(By.xpath("//a[text()='Check Box Demo']/preceding-sibling::a"));
        simpleFormDemo.click();
        Thread.sleep(5000);
        WebElement textBox=driver.findElement(By.cssSelector("input[placeholder ^= 'Please enter']"));
        textBox.sendKeys("Luis loves Chelsea Football Club");
        WebElement showMessageButton=driver.findElement(By.cssSelector("button[onclick *='show']"));
        showMessageButton.click();


        Thread.sleep(5000);
        driver.quit();
    }
}
