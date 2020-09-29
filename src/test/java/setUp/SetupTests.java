package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LoginPage;

public class SetupTests {
    //create a WebDriver object
    private WebDriver driver;
    //create login page object
    protected LoginPage loginPage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //Instantiate webDriver object
        driver= new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //launch application
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Instantiate login page
        loginPage= new LoginPage(driver);

    }
    @AfterTest
    public void closeBrowser(){
        //exit the session
        driver.quit();
    }
}
