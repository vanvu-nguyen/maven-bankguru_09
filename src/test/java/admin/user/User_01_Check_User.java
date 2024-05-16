package admin.user;

import commons.BaseTest;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.SauceDemo.SauceDemoLoginPO;
import pageObjects.SauceDemo.SauceDemoPO;
import pageObjects.WordPress.DashboardPO;
import pageObjects.WordPress.LoginPO;
import pageObjects.WordPress.UserPO;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;
import java.sql.SQLException;

public class User_01_Check_User extends BaseTest {
    private WebDriver driver;
    private String browserName;
    private LoginPO loginPage;
    private DashboardPO dashboardPage;
    private UserPO userPage;


    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeClass (String browser, String url) {
        driver = getBrowserDriver(browser, url);
        browserName = browser;
        loginPage = PageGeneratorManager.getWordPressLoginPage(driver);
    }

    @Test
    public void User_01_Compare_User_Number(Method method) throws SQLException {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "User_01_Compare_User_Number");
        dashboardPage = loginPage.loginToWordPress();
        userPage = dashboardPage.clickToUsersMenu();
        Assert.assertTrue(userPage.isUserNumberCorrect());
    }

    @AfterClass
    public void afterClass() {
        closeBrowser(driver);
    }
}
