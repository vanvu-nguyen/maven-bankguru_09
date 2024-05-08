package pageObjects.admin;

import AdminPageUIs.PersonalDetailsPUI;
import commons.BaseAction;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import pojoData.EmployeeInfo;

public class PersonalDetailsPO extends BaseAction {
    private WebDriver driver;

    public PersonalDetailsPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getMaritalStatus() {
        return getElementText(driver, PersonalDetailsPUI.DETAILS_SELECTED_MARITAL);
    }

    public String getNationalityInfor() {
        return getElementText(driver, PersonalDetailsPUI.DETAILS_SELECTED_NATIONALITY);
    }

    public String getFirstnameValue() {
        return getDefaultAttributeValue(driver, PersonalDetailsPUI.FIRSTNAME_TEXTBOX, "value");
    }

    public String getLastnameValue() {
        return getDefaultAttributeValue(driver, PersonalDetailsPUI.LASTNAME_TEXTBOX, "value");
    }

    public String getEmployeeIdValue() {
        return getDefaultAttributeValue(driver, PersonalDetailsPUI.EMPLOYEE_ID_TEXTBOX, "value");
    }

    public EmployeeListPO clickToEmployeeListButton() {
        waitForElementClickable(driver, PersonalDetailsPUI.EMPLOYEE_LIST_BUTTON);
        clickToElement(driver, PersonalDetailsPUI.EMPLOYEE_LIST_BUTTON);
        waitLoadingSpinnerInvisible();
        return PageGeneratorManager.getEmployeeListPage(driver);
    }

    public void inputMiddleName(EmployeeInfo employeeInfo) {
        waitForElementVisible(driver, PersonalDetailsPUI.DETAILS_MIDDLENAME_TEXTBOX);
        senkeyToElement(driver, PersonalDetailsPUI.DETAILS_MIDDLENAME_TEXTBOX, employeeInfo.getMiddleName());
    }

    public void inputOtherId(EmployeeInfo employeeInfo) {
        waitForElementVisible(driver, PersonalDetailsPUI.DETAILS_OTHERID_TEXTBOX);
        senkeyToElement(driver, PersonalDetailsPUI.DETAILS_OTHERID_TEXTBOX, employeeInfo.getOtherId());    }

    public void inputDriverLicenseNumber(EmployeeInfo employeeInfo) {
        waitForElementVisible(driver, PersonalDetailsPUI.DETAILS_DRIVER_LICENSE_TEXTBOX);
        senkeyToElement(driver, PersonalDetailsPUI.DETAILS_DRIVER_LICENSE_TEXTBOX, employeeInfo.getDriverLicense());
    }

    public void inputLicenseExpiryDate(EmployeeInfo employeeInfo) {
        waitForElementVisible(driver, PersonalDetailsPUI.DETAILS_LICENSE_EXPIRY_DATE_DROPDOWN);
        senkeyToElement(driver, PersonalDetailsPUI.DETAILS_LICENSE_EXPIRY_DATE_DROPDOWN, employeeInfo.getLicenseExpiryDate());
    }

    public void selectNationality(EmployeeInfo employeeInfo) {
        waitForElementClickable(driver, PersonalDetailsPUI.DETAILS_PARENT_NATIONALITY);
        selectItemInCustomDropdown(driver, PersonalDetailsPUI.DETAILS_PARENT_NATIONALITY, PersonalDetailsPUI.DETAILS_CHILD_NATIONALITY, employeeInfo.getNationality());
    }

    public void selectMaritalStatus(EmployeeInfo employeeInfo) {
        waitForElementClickable(driver, PersonalDetailsPUI.DETAILS_PARENT_MARITAL);
        selectItemInCustomDropdown(driver, PersonalDetailsPUI.DETAILS_PARENT_MARITAL, PersonalDetailsPUI.DETAILS_CHILD_MARITAL, employeeInfo.getMaritalStatus());
    }

    public void inputDateOfBirth(EmployeeInfo employeeInfo) {
        waitForElementVisible(driver, PersonalDetailsPUI.DETAILS_DOB_DROPDOWN);
        senkeyToElement(driver, PersonalDetailsPUI.DETAILS_DOB_DROPDOWN, employeeInfo.getDateOfBirth());
    }

    public void selectMaleGender() {
        waitForElementClickable(driver, PersonalDetailsPUI.DETAILS_MALE_GENDER);
        checkTheCheckboxOrRadio(driver, PersonalDetailsPUI.DETAILS_MALE_GENDER);
    }

    public void clickToSaveButtonOfDetails() {
        waitForElementClickable(driver, PersonalDetailsPUI.MAIN_INFOR_SAVE_BUTTON);
        clickToElement(driver, PersonalDetailsPUI.MAIN_INFOR_SAVE_BUTTON);
        waitLoadingSpinnerInvisible();
    }

    public void updateEmployeeInfo(EmployeeInfo employeeInfo) {
        inputMiddleName(employeeInfo);
        inputOtherId(employeeInfo);
        inputDriverLicenseNumber(employeeInfo);
        inputLicenseExpiryDate(employeeInfo);
        selectNationality(employeeInfo);
        selectMaritalStatus(employeeInfo);
        inputDateOfBirth(employeeInfo);
        selectMaleGender();
        clickToSaveButtonOfDetails();
    }
}