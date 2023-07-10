package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.drive", "C://Users//A//Desktop//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();

        //driver.get("http://www.google.com");

       // WebElement search = driver.findElement(By.name("q"));
     //   boolean search1= search.isDisplayed();
      //  System.out.println(search1);

        driver.get("http://nop40.different.com.mk/register");

       boolean male = driver.findElement(By.id("gender-male")).isSelected();
        System.out.println(male);

        driver.findElement(By.id("gender-male")).click();
        male = driver.findElement(By.id("gender-male")).isSelected();
        System.out.println(male);

    }


}
