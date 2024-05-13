package pageObjects.SauceDemo;

import AdminPageUIs.SauceDemoLoginPUI;
import commons.BaseAction;
import commons.GlobalConstants;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;

public class SauceDemoLoginPO extends BaseAction {
    WebDriver driver;
    public SauceDemoLoginPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public SauceDemoPO loginToSite() {
        waitForElementVisible(driver, SauceDemoLoginPUI.USERNAME_INPUT);
        senkeyToElement(driver, SauceDemoLoginPUI.USERNAME_INPUT, GlobalConstants.USERNAME_SAUCEDEMO);
        waitForElementVisible(driver, SauceDemoLoginPUI.PASSWORD_INPUT);
        senkeyToElement(driver, SauceDemoLoginPUI.PASSWORD_INPUT, GlobalConstants.PASSWORD_SAUCEDEMO);
        waitForElementClickable(driver, SauceDemoLoginPUI.LOGIN_BUTTON);
        clickToElement(driver, SauceDemoLoginPUI.LOGIN_BUTTON);
        return PageGeneratorManager.getSauceDemoPage(driver);
    }
}

