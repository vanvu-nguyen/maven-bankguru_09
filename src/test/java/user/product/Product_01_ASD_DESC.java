package user.product;

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
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

public class Product_01_ASD_DESC extends BaseTest {
    private WebDriver driver;
    private SauceDemoPO sauceDemoPage;
    private SauceDemoLoginPO sauceDemoLoginPage;
    private String browserName;
    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeClass (String browser, String url) {
        driver = getBrowserDriver(browser, url);
        browserName = browser;
        sauceDemoLoginPage = PageGeneratorManager.getSauceDemoLoginPage(driver);
        sauceDemoPage = sauceDemoLoginPage.loginToSite();
    }

    @Test
    public void Sort_Ascending(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_01_Add_New");

        sauceDemoPage.clickToSortAtoZ();
        Assert.assertTrue(sauceDemoPage.isProductListSortAtoZ());
    }

    @Test
    public void Sort_Descending(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_01_Add_New");

        sauceDemoPage.clickToSortZtoA();
        Assert.assertTrue(sauceDemoPage.isProductListSortZtoA());
    }

    @Test
    public void Sort_Price_Low_To_High(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_01_Add_New");

        sauceDemoPage.clickToSortLowToHigh();
        Assert.assertTrue(sauceDemoPage.isProductListSortLowtoHigh());
    }

    @AfterClass
    public void afterClass() {
        closeBrowser(driver);
    }
}
