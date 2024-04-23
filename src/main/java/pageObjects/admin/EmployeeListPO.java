package pageObjects.admin;

import AdminPageUIs.EmployeeListPUI;
import commons.BaseAction;
import commons.BasePage;
import commons.GlobalConstants;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class EmployeeListPO extends BaseAction {
    private WebDriver driver;

    public EmployeeListPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public AddEmployeePO clickToAddEmployeeButton() {
        waitForElementClickable(driver, EmployeeListPUI.ADD_EMPLOYEE_BUTTON);
        clickToElement(driver, EmployeeListPUI.ADD_EMPLOYEE_BUTTON);
        waitLoadingSpinnerInvisible();
        return PageGeneratorManager.getAddEmployeePage(driver);
    }

    public void senkeyToEmployeeIdSearchbox(String keyToSend) {
        waitForElementVisible(driver, EmployeeListPUI.EMPLOYEE_ID_SEARCHBOX);
        senkeyToElement(driver, EmployeeListPUI.EMPLOYEE_ID_SEARCHBOX, keyToSend);
    }

    public void clickToSearchButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        waitForElementClickable(driver, EmployeeListPUI.EMPLOYEE_SEARCH_BUTTON);
        clickToElement(driver, EmployeeListPUI.EMPLOYEE_SEARCH_BUTTON);
        waitLoadingSpinnerInvisible();
    }

    public String getRecordDataByColumnName(String columnName) {
        int intIndexOfColumn = getListElementSize(driver, EmployeeListPUI.PRECEDING_SIBLING_OF_COLUMN, columnName) + 1;
        String stringIndexOfColumn = Integer.toString(intIndexOfColumn);
        return getElementText(driver, EmployeeListPUI.RECORD_DATA_LOCATOR, stringIndexOfColumn);
    }

    public PersonalDetailsPO clickToEditButtonById(String providedId) {
        waitForElementClickable(driver, EmployeeListPUI.EDIT_BUTTON_BY_ID, providedId);
        clickToElement(driver, EmployeeListPUI.EDIT_BUTTON_BY_ID, providedId);
        waitLoadingSpinnerInvisible();
        return PageGeneratorManager.getPersonalDetailsPage(driver);
    }
}