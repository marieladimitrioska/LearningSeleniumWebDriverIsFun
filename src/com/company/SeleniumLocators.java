package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.drive", "C://Users//A//Desktop//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();

        driver.get("http://login.yahoo.com");

        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("marieladimitrioska@gmail.com");

        WebElement next = driver.findElement(By.name("signin"));
        //next.click();

        WebElement forgotUsername = driver.findElement(By.linkText("Forgotten username?"));
        boolean a = forgotUsername.isDisplayed();
        System.out.println(a);

       driver.findElement(By.partialLinkText("username?")).click();

       //driver.findElement(By.cssSelector(#id))
        //driver.findElement(By.cssSelector(#name))

        driver.findElement(By.cssSelector("#login-username"));

        //Xpath locator
        driver.findElement(By.xpath ("//*[@id=\"login-username\"]"));

       // Class name locator

        driver.findElement(By.cssSelector("phone-no"));

    }


}
