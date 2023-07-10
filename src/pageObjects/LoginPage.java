package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


        WebDriver driver;
        By username = By.name("Email");
        By password = By.name ("Password");
        By loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input");

        public void LoginTest(WebDriver driver) {
            this.driver = driver;
        }

        public void loginToDifferent(String email, String pass){
            driver.findElement(username).sendKeys(email);
            driver.findElement(password).sendKeys(pass);
            driver.findElement(loginButton).click();
        }

        public void typeUsername(){
            driver.findElement(username).sendKeys("marieladimitrioska@gmail.com");
        }

        public void typePassword(){
            driver.findElement(password).sendKeys("ivaBOKIII11.04");
        }

        public void clickLoginButton(){
            driver.findElement(loginButton).click();

        }
    }


