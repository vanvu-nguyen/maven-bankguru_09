package pageObjects.admin;

import AdminPageUIs.PersonalDetailsPUI;
import commons.BaseAction;
import commons.GlobalConstants;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;

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

    public void inputMiddleName() {
        waitForElementVisible(driver, PersonalDetailsPUI.DETAILS_MIDDLENAME_TEXTBOX);
        senkeyToElement(driver, PersonalDetailsPUI.DETAILS_MIDDLENAME_TEXTBOX, GlobalConstants.ORANGEHRM_DATATEST_MIDDLENAME);
    }

    public void inputOtherId() {
        waitForElementVisible(driver, PersonalDetailsPUI.DETAILS_OTHERID_TEXTBOX);
        senkeyToElement(driver, PersonalDetailsPUI.DETAILS_OTHERID_TEXTBOX, GlobalConstants.ORANGEHRM_DATATEST_OTHERID);
    }

    public void inputDriverLicenseNumber() {
        waitForElementVisible(driver, PersonalDetailsPUI.DETAILS_DRIVER_LICENSE_TEXTBOX);
        senkeyToElement(driver, PersonalDetailsPUI.DETAILS_DRIVER_LICENSE_TEXTBOX, GlobalConstants.ORANGEHRM_DATATEST_DRIVER_LICENSE);
    }

    public void inputLicenseExpiryDate() {
        waitForElementVisible(driver, PersonalDetailsPUI.DETAILS_LICENSE_EXPIRY_DATE_DROPDOWN);
        senkeyToElement(driver, PersonalDetailsPUI.DETAILS_LICENSE_EXPIRY_DATE_DROPDOWN, GlobalConstants.ORANGEHRM_DATATEST_LICENSE_EXPIRY_DATE);
    }

    public void selectNationality() {
        waitForElementClickable(driver, PersonalDetailsPUI.DETAILS_PARENT_NATIONALITY);
        selectItemInCustomDropdown(driver, PersonalDetailsPUI.DETAILS_PARENT_NATIONALITY, PersonalDetailsPUI.DETAILS_CHILD_NATIONALITY, "Japanese");
    }

    public void selectMaritalStatus() {
        waitForElementClickable(driver, PersonalDetailsPUI.DETAILS_PARENT_MARITAL);
        selectItemInCustomDropdown(driver, PersonalDetailsPUI.DETAILS_PARENT_MARITAL, PersonalDetailsPUI.DETAILS_CHILD_MARITAL, "Married");
    }

    public void inputDateOfBirth() {
        waitForElementVisible(driver, PersonalDetailsPUI.DETAILS_DOB_DROPDOWN);
        senkeyToElement(driver, PersonalDetailsPUI.DETAILS_DOB_DROPDOWN, GlobalConstants.ORANGEHRM_DATATEST_DOB);
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
}