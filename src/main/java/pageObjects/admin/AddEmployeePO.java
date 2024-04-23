package pageObjects.admin;

import AdminPageUIs.AddEmployeePUI;
import commons.BaseAction;
import commons.BasePage;
import commons.GlobalConstants;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;

public class AddEmployeePO extends BaseAction {
    private WebDriver driver;

    public AddEmployeePO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void senkeyToFirstnameTextbox() {
        waitForElementVisible(driver, AddEmployeePUI.FIRSTNAME_TEXTBOX);
        senkeyToElement(driver, AddEmployeePUI.FIRSTNAME_TEXTBOX, GlobalConstants.ORANGEHRM_DATATEST_FIRSTNAME);
    }

    public void senkeyToLastnameTextbox() {
        waitForElementVisible(driver, AddEmployeePUI.LASTNAME_TEXTBOX);
        senkeyToElement(driver, AddEmployeePUI.LASTNAME_TEXTBOX, GlobalConstants.ORANGEHRM_DATATEST_LASTNAME);
    }

    public PersonalDetailsPO clickToSaveButton() {
        waitForElementClickable(driver, AddEmployeePUI.SAVE_BUTTON);
        clickToElement(driver, AddEmployeePUI.SAVE_BUTTON);
        waitLoadingSpinnerInvisible();
        return PageGeneratorManager.getPersonalDetailsPage(driver);
    }

    public String getEmployeeId() {
        waitForElementVisible(driver, AddEmployeePUI.EMPLOYEE_ID_TEXTBOX);
        return getDefaultAttributeValue(driver, AddEmployeePUI.EMPLOYEE_ID_TEXTBOX, "value");
    }
}
