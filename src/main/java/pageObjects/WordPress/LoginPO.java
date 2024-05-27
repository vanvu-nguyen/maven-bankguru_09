package pageObjects.WordPress;

import AdminPageUIs.LoginPUI;
import AdminPageUIs.WordPressLoginPUI;
import commons.BaseAction;
import commons.GlobalConstants;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.GenericLogEntry;

public class LoginPO extends BaseAction {
    WebDriver driver;

    public LoginPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public DashboardPO loginToWordPress() {
        waitForElementVisible(driver, WordPressLoginPUI.USERNAME_LOGIN_INPUT);
        senkeyToElement(driver, WordPressLoginPUI.USERNAME_LOGIN_INPUT, GlobalConstants.getGlobalConstants().getUsername());
        waitForElementVisible(driver, WordPressLoginPUI.PASSWORD_LOGIN_INPUT);
        senkeyToElement(driver, WordPressLoginPUI.PASSWORD_LOGIN_INPUT, GlobalConstants.getGlobalConstants().getPassword());
        waitForElementClickable(driver, WordPressLoginPUI.LOGIN_BUTTON);
        clickToElement(driver, WordPressLoginPUI.LOGIN_BUTTON);
        return PageGeneratorManager.getWordPressDashboardPage(driver);
    }
}
