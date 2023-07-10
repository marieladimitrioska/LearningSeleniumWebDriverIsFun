package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommand {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.drive", "C://Users//A//Desktop//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");

       String title= driver.getTitle();
        System.out.println(title);

        String source = driver.getPageSource();
        System.out.println(source);

        String URL = driver.getCurrentUrl();
        System.out.println(URL);



    }
}