package pageObjects.admin;

import AdminPageUIs.LoginPUI;
import commons.BaseAction;
import commons.GlobalConstants;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;

public class LoginPO extends BaseAction {
    private WebDriver driver;

    public LoginPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void senkeyToUsernameTextbox() {
        waitForElementVisible(driver, LoginPUI.USERNAME_TEXTBOX);
        senkeyToElement(driver, LoginPUI.USERNAME_TEXTBOX, GlobalConstants.getGlobalConstants().getUsernameAdminAccount());
    }

    public void senkeyToPasswordTextbox() {
        waitForElementVisible(driver, LoginPUI.PASSWORD_TEXTBOX);
        senkeyToElement(driver, LoginPUI.PASSWORD_TEXTBOX, GlobalConstants.getGlobalConstants().getPasswordAdminAccount());
    }

    public DashboardPO clickToLoginButton() {
        waitForElementClickable(driver, LoginPUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPUI.LOGIN_BUTTON);
        return PageGeneratorManager.getDashboardPage(driver);
    }

    public DashboardPO loginToAdminSite() {
        senkeyToUsernameTextbox();
        senkeyToPasswordTextbox();
        return clickToLoginButton();
    }
}