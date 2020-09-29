package login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setUp.SetupTests;

public class LoginTests extends SetupTests {
    @Test
    public void testLogin() throws InterruptedException{

        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");

        DashboardPage dashboardPage=loginPage.clickLoginBtn();
        dashboardPage.clickWelcomeAdmin();
        loginPage= dashboardPage.clickLogout();

    }
}

