package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommands {

    public static void main (String [] args){

        System.setProperty("webdriver.chrome.drive", "C://Users//A//Desktop//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");
        String URL = driver.getCurrentUrl();
        System.out.println(URL);

       driver.navigate().to("http://login.yahoo.com");
       URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.navigate().back();
        URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.navigate().forward();
        URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.navigate().refresh();
        URL = driver.getCurrentUrl();
        System.out.println(URL);

        // Closing browser

        //driver.close();
        driver.quit();


    }


}


