package pageObjects.admin;

import AdminPageUIs.LoginPUI;
import commons.BaseAction;
import commons.BasePage;
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
        senkeyToElement(driver, LoginPUI.USERNAME_TEXTBOX, GlobalConstants.ORANGEHRM_ADMIN_USERNAME);
    }

    public void senkeyToPasswordTextbox() {
        waitForElementVisible(driver, LoginPUI.PASSWORD_TEXTBOX);
        senkeyToElement(driver, LoginPUI.PASSWORD_TEXTBOX, GlobalConstants.ORANGEHRM_ADMIN_PASSWORD);
    }

    public DashboardPO clickToLoginButton() {
        waitForElementClickable(driver, LoginPUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPUI.LOGIN_BUTTON);
        return PageGeneratorManager.getDashboardPage(driver);
    }
}