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
        senkeyToElement(driver, SauceDemoLoginPUI.USERNAME_INPUT, GlobalConstants.getGlobalConstants().getUsernameSaucedemo());
        waitForElementVisible(driver, SauceDemoLoginPUI.PASSWORD_INPUT);
        senkeyToElement(driver, SauceDemoLoginPUI.PASSWORD_INPUT, GlobalConstants.getGlobalConstants().getPasswordSaucedemo());
        waitForElementClickable(driver, SauceDemoLoginPUI.LOGIN_BUTTON);
        clickToElement(driver, SauceDemoLoginPUI.LOGIN_BUTTON);
        return PageGeneratorManager.getSauceDemoPage(driver);
    }
}

