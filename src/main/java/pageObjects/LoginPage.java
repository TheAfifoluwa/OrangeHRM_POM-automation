package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    private By username= By.id("txtUsername");
    public void enterUsername(String uName){
        //find username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }
    private By password= By.id("txtPassword");
    public void enterPassword(String pwd){
        //find password element and enter password
        driver.findElement(password).sendKeys(pwd);
    }

    public DashboardPage clickLoginBtn(){
        //click login button
        driver.findElement(By.id("btnLogin")).click();
        return new DashboardPage(driver);

}
}

