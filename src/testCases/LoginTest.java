package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class LoginTest{
@Test
    public void verifyValidLogin(){


        System.setProperty("webdriver.chrome.drive", "C://Users//A//Desktop//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://nop40.different.com.mk/login");

        LoginPage login = new LoginPage();
        login.typeUsername();
        login.typePassword();
        login.clickLoginButton();

        login.loginToDifferent("marieladimitrioska@gmail.com", "123456");

        driver.quit();

    }

}