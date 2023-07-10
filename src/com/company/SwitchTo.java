package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchTo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.drive", "C://Users//A//Desktop//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com/gmail/about");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait (5000, TimeUnit.MILLISECONDS);


        driver.findElement(By.xpath("/html/body/main/div[1]/div/div/div/div/div[1]/div[3]/div[1]/a/span[2]")).click();

        System.out.println(driver.getCurrentUrl());

        Set<String> s =driver.getWindowHandles();
        for (String i : s ){
            String title = driver.switchTo().window(i).getTitle();
            System.out.println(title);
        }
        driver.quit();
    }
}