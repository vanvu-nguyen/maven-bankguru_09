package pageObjects.WordPress;

import AdminPageUIs.WordPressDashboardPUI;
import commons.BaseAction;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;

public class DashboardPO extends BaseAction {
    WebDriver driver;
    public DashboardPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public UserPO clickToUsersMenu() {
        waitForElementClickable(driver, WordPressDashboardPUI.USERS_MENU);
        clickToElement(driver, WordPressDashboardPUI.USERS_MENU);
        return PageGeneratorManager.getWordPressUserPage(driver);
    }
}
