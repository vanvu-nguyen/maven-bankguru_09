package pageObjects.admin;

import AdminPageUIs.BaseElement;
import AdminPageUIs.DashboardPUI;
import commons.BaseAction;
import commons.BasePage;
import commons.BaseTest;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;

public class DashboardPO extends BaseAction {
    private WebDriver driver;

    public DashboardPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public EmployeeListPO clickToPimModule() {
        waitForElementClickable(driver, DashboardPUI.PIM_MODULE);
        clickToElement(driver, DashboardPUI.PIM_MODULE);
        waitLoadingSpinnerInvisible();
        return PageGeneratorManager.getEmployeeListPage(driver);
    }
}
