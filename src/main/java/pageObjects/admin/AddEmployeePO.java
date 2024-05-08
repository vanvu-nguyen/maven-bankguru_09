package pageObjects.admin;

import AdminPageUIs.AddEmployeePUI;
import commons.BaseAction;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import pojoData.EmployeeInfo;

public class AddEmployeePO extends BaseAction {
    private WebDriver driver;

    public AddEmployeePO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public void senkeyToFirstnameTextbox(EmployeeInfo employeeInfo) {
        waitForElementVisible(driver, AddEmployeePUI.FIRSTNAME_TEXTBOX);
        senkeyToElement(driver, AddEmployeePUI.FIRSTNAME_TEXTBOX, employeeInfo.getFirstName());
    }

    public void senkeyToLastnameTextbox(EmployeeInfo employeeInfo) {
        waitForElementVisible(driver, AddEmployeePUI.LASTNAME_TEXTBOX);
        senkeyToElement(driver, AddEmployeePUI.LASTNAME_TEXTBOX, employeeInfo.getLastName());
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

    public PersonalDetailsPO updateEmployeeFirstnameAndLastname(EmployeeInfo employeeInfo) {
        senkeyToFirstnameTextbox(employeeInfo);
        senkeyToLastnameTextbox(employeeInfo);
        return clickToSaveButton();
    }
}
